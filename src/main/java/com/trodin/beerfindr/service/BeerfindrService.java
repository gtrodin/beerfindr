package com.trodin.beerfindr.service;

import com.trodin.beerfindr.jobs.DatabasePopulationTaskManager;
import com.trodin.beerfindr.persistence.Beer;
import com.trodin.beerfindr.persistence.BeerDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/api")
public class BeerfindrService {

    private static final Logger logger = LoggerFactory.getLogger(BeerfindrService.class);
    private DatabasePopulationTaskManager databasePopulationTaskManager = new DatabasePopulationTaskManager();

    @Inject
    BeerDAO beerDAO;

    @GET
    @Path("/find-beer/{name}")
    @Produces("application/json")
    public Beer getBeer(@PathParam("name") String name) {
        logger.info("Looking for a beer with name " + name);
        return beerDAO.getBeerByName(name);
    }

    @GET
    @Path("/get-beers/{name}")
    @Produces("application/json")
    public Response getBeersByName(@PathParam("name") String name) {
        logger.info("Looking for beers with name " + name);
        List<Beer> beers = beerDAO.getBeersByName(name);
        for (Beer beer : beers) {
            logger.info(beer.getName());
        }
        return Response.status(200).entity(beers).build();
    }

    @GET
    @Path("/get-beers")
    @Produces("application/json")
    public Response getBeers() {
        logger.info("Fetching all beers");
        return Response.status(200).entity(beerDAO.getAllBeers()).build();
    }

    @GET
    @Path("/test-beerfindr-service")
    public Response testBeerService() {
        logger.info("Testing beerfindr service");
        return Response.status(200).entity("Beerfindr service is working!").build();
    }

    @GET
    @Path("/trigger-population-job")
    public Response triggerPopulationJob() {
        databasePopulationTaskManager.startDatabasePopulationTask(beerDAO);
        return Response.status(200).entity("Triggered database population job").build();
    }

    @GET
    @Path("/cancel-population-job")
    public Response cancelPopulationJob() {
        databasePopulationTaskManager.cancelDatabasePopulationTask();
        return Response.status(200).entity("Cancelled database population job").build();
    }
}
