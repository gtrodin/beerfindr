package com.trodin.beerfindr.jobs;

import com.trodin.beerfindr.jaxb.ArticleXmlParser;
import com.trodin.beerfindr.persistence.BeerDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;
import java.util.TimerTask;

public class DatabasePopulationTask extends TimerTask {

    private static final Logger logger = LoggerFactory.getLogger(DatabasePopulationTask.class);

    private BeerDAO beerDAO;

    public DatabasePopulationTask(BeerDAO beerDAO) {
        this.beerDAO = beerDAO;
    }

    @Override
    public void run() {
        ArticleXmlParser articleXmlParser = new ArticleXmlParser();
        Date date = new Date();
        if(beerDAO != null){
            beerDAO.deleteAllBeers();
            logger.info("Populating database at " + date);
            beerDAO.populateDatabase(articleXmlParser.parseBeers());
        } else {
            logger.info("beerDAO object is null");
        }
    }
}