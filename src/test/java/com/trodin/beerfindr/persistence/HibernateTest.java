package com.trodin.beerfindr.persistence;

import com.trodin.beerfindr.jaxb.XmlParser;
import org.junit.Before;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

    public class HibernateTest {

    private EntityManager entityManager;

    @Before
    public void setUp() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("beerfindr-unit-test");
        entityManager = entityManagerFactory.createEntityManager();
    }

    @Test
    public void testDatabasePopulation() {
        XmlParser xmlParser = new XmlParser();

        entityManager.getTransaction().begin();

        List<Store> stores = xmlParser.parseStores();
        for (Store store : stores) {
            entityManager.persist(store);
        }

        List<Beer> beers = xmlParser.parseBeers();
        for (Beer beer : beers) {
            entityManager.persist(beer);
        }
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
