package com.trodin.beerfindr.tasks;

import com.trodin.beerfindr.jaxb.XmlParser;
import com.trodin.beerfindr.persistence.dao.BeerfindrDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;
import java.util.TimerTask;

public class DatabasePopulationTask extends TimerTask {

    private static final Logger logger = LoggerFactory.getLogger(DatabasePopulationTask.class);

    private BeerfindrDAO beerfindrDAO;

    public DatabasePopulationTask(BeerfindrDAO beerfindrDAO) {
        this.beerfindrDAO = beerfindrDAO;
    }

    @Override
    public void run() {
        XmlParser xmlParser = new XmlParser();
        Date date = new Date();
        if(beerfindrDAO != null){
            beerfindrDAO.deleteAllBeers();
            logger.info("Populating database at " + date);
            beerfindrDAO.populateDatabase(xmlParser.parseBeers());
        } else {
            logger.info("beerfindrDAO object is null");
        }
    }
}