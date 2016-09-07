package com.trodin.beerfindr.service;

import com.trodin.beerfindr.persistence.dao.BeerfindrDAO;
import com.trodin.beerfindr.tasks.DatabasePopulationTaskManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/api")
public class BeerfindrService {

    private static final Logger logger = LoggerFactory.getLogger(BeerfindrService.class);
    private DatabasePopulationTaskManager databasePopulationTaskManager = new DatabasePopulationTaskManager();

    @Inject
    BeerfindrDAO beerfindrDAO;

    @GET
    @Path("/beers")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getBeers(@BeanParam BeerParameterBean beerParameterBean) {
        logger.info("Fetching beers...");
        return Response.status(Response.Status.OK).entity(beerfindrDAO.getBeers(beerParameterBean)).build();
    }

    @GET
    @Path("/stores")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getStores(@BeanParam StoreParameterBean storeParameterBean) {
        logger.info("Fetching stores...");
        return Response.status(Response.Status.OK).entity(beerfindrDAO.getStores(storeParameterBean)).build();
    }

    @GET
    @Path("/test-beerfindr-service")
    @Produces(MediaType.TEXT_PLAIN)
    public Response testBeerService() {
        logger.info("Testing beerfindr service");
        return Response.status(Response.Status.OK).entity("Beerfindr service is working!").build();
    }

    @GET
    @Path("/trigger-population-job")
    public Response triggerPopulationJob() {
        databasePopulationTaskManager.startDatabasePopulationTask(beerfindrDAO);
        return Response.status(Response.Status.OK).entity("Triggered database population job").build();
    }

    @GET
    @Path("/cancel-population-job")
    public Response cancelPopulationJob() {
        databasePopulationTaskManager.cancelDatabasePopulationTask();
        return Response.status(Response.Status.OK).entity("Cancelled database population job").build();
    }
}
