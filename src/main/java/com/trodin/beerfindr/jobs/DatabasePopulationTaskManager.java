package com.trodin.beerfindr.jobs;

import com.trodin.beerfindr.persistence.BeerDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Timer;

public class DatabasePopulationTaskManager {

    private static final Logger logger = LoggerFactory.getLogger(DatabasePopulationTaskManager.class);
    private Timer timer;

    public void startDatabasePopulationTask(BeerDAO beerDAO) {
        logger.info("Starting the database population task");
        timer = new Timer();
        DatabasePopulationTask databasePopulationTask = new DatabasePopulationTask(beerDAO);
        timer.schedule(databasePopulationTask, 0, 86400000);
    }

    public void cancelDatabasePopulationTask() {
        logger.info("Canceling the database population task");
        timer.cancel();
    }
}
