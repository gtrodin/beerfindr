package com.trodin.beerfindr.persistence;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;

@Stateless
public class BeerDAO {

    private static final Logger logger = LoggerFactory.getLogger(BeerDAO.class);

    @PersistenceContext(unitName = "beerfindr-unit")
    private EntityManager entityManager;

    public Beer getBeerByName(String name) {
        logger.info("Trying to fetch beers that contain name " + name);
        Beer beer = null;
        try {
            beer = entityManager.createQuery("select b from Beer b where lower(b.name) like lower(:name)", Beer.class)
                    .setParameter("name", "%" + name + "%")
                    .getSingleResult();

        } catch (NoResultException e) {
            logger.info("Could not find beer with name " + name);
        }
        return beer;
    }

    public List<Beer> getBeersByName(String name) {
        logger.info("Fetching beers that contain name " + name);
        List<Beer> beers = new ArrayList<Beer>();
        try {
            beers = entityManager.createQuery("select b from Beer b where lower(b.name) like lower(:name)", Beer.class)
                    .setParameter("name", "%" + name + "%")
                    .getResultList();

        } catch (NoResultException e) {
            logger.info("No beer with name " + name + " in DB");
        }
        return beers;
    }

    public List<Beer> getAllBeers() {
        logger.info("Fetching all beers");
        List<Beer> beers;
        beers = entityManager.createQuery("select b from Beer b", Beer.class).getResultList();
        return beers;
    }

    public void populateDatabase(List<Beer> beers) {
        for (Beer beer : beers) {
            entityManager.persist(beer);
        }
    }

    public void deleteAllBeers() {
        entityManager.createQuery("delete from Beer").executeUpdate();
    }
}
