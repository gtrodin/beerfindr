package com.trodin.beerfindr.persistence;

import com.trodin.beerfindr.jaxb.ArticleXmlParser;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.sql.Timestamp;
import java.util.Date;
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
        ArticleXmlParser articleXmlParser = new ArticleXmlParser();

        List<Beer> beers = articleXmlParser.parseBeers();
        entityManager.getTransaction().begin();
        for (Beer beer : beers) {
            entityManager.persist(beer);
        }
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
