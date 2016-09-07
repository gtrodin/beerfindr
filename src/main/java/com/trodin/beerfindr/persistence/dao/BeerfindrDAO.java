package com.trodin.beerfindr.persistence.dao;

import com.trodin.beerfindr.persistence.Beer;
import com.trodin.beerfindr.persistence.Beer_;
import com.trodin.beerfindr.persistence.Store;
import com.trodin.beerfindr.persistence.Store_;
import com.trodin.beerfindr.service.BeerParameterBean;
import com.trodin.beerfindr.service.StoreParameterBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Stateless
public class BeerfindrDAO {

    private static final Logger logger = LoggerFactory.getLogger(BeerfindrDAO.class);

    @PersistenceContext(unitName = "beerfindr-unit")
    private EntityManager entityManager;

    public void populateDatabase(List<Beer> beers) {
        for (Beer beer : beers) {
            entityManager.persist(beer);
        }
    }

    public void deleteAllBeers() {
        entityManager.createQuery("delete from Beer").executeUpdate();
    }

    public List<Beer> getBeers(BeerParameterBean beerParameterBean) {
        logBeerParameters(beerParameterBean);
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Beer> criteriaQuery = criteriaBuilder.createQuery(Beer.class);
        Root<Beer> beer = criteriaQuery.from(Beer.class);
        List<Predicate> predicates = new ArrayList<Predicate>();
        if (beerParameterBean.name != null) {
            predicates.add(criteriaBuilder.like(beer.get(Beer_.name), "%" + beerParameterBean.name + "%"));
        }

        if (beerParameterBean.number != null) {
            predicates.add(criteriaBuilder.equal(beer.get(Beer_.number), beerParameterBean.number));
        }

        if (beerParameterBean.minPrice != null && beerParameterBean.maxPrice != null) {
            predicates.add(criteriaBuilder.between(beer.get(Beer_.price), beerParameterBean.minPrice, beerParameterBean.maxPrice));
        } else if (beerParameterBean.minPrice != null) {
            predicates.add(criteriaBuilder.greaterThanOrEqualTo(beer.get(Beer_.price), beerParameterBean.minPrice));
        } else if (beerParameterBean.maxPrice != null) {
            predicates.add(criteriaBuilder.lessThanOrEqualTo(beer.get(Beer_.price), beerParameterBean.maxPrice));
        }

        if (beerParameterBean.minAlcoholPercentage != null && beerParameterBean.maxAlcoholPercentage != null) {
            predicates.add(criteriaBuilder.between(beer.get(Beer_.alcoholPercentage), beerParameterBean.minAlcoholPercentage, beerParameterBean.maxAlcoholPercentage));
        } else if (beerParameterBean.minAlcoholPercentage != null) {
            predicates.add(criteriaBuilder.greaterThanOrEqualTo(beer.get(Beer_.alcoholPercentage), beerParameterBean.minAlcoholPercentage));
        } else if (beerParameterBean.maxAlcoholPercentage != null) {
            predicates.add(criteriaBuilder.lessThanOrEqualTo(beer.get(Beer_.alcoholPercentage), beerParameterBean.maxAlcoholPercentage));
        }

        if (beerParameterBean.minVolume != null && beerParameterBean.maxVolume != null) {
            predicates.add(criteriaBuilder.between(beer.get(Beer_.volume), beerParameterBean.minVolume, beerParameterBean.maxVolume));
        } else if (beerParameterBean.minVolume != null) {
            predicates.add(criteriaBuilder.greaterThanOrEqualTo(beer.get(Beer_.volume), beerParameterBean.minVolume));
        } else if (beerParameterBean.maxVolume != null) {
            predicates.add(criteriaBuilder.lessThanOrEqualTo(beer.get(Beer_.volume), beerParameterBean.maxVolume));
        }
        if (beerParameterBean.minDateOfIntroduction != null && beerParameterBean.maxDateOfIntroduction != null) {
            predicates.add(criteriaBuilder.between(beer.get(Beer_.dateOfIntroduction), formatDateStringToDate(beerParameterBean.minDateOfIntroduction), formatDateStringToDate(beerParameterBean.maxDateOfIntroduction)));
        } else if (beerParameterBean.minDateOfIntroduction != null) {
            predicates.add(criteriaBuilder.greaterThanOrEqualTo(beer.get(Beer_.dateOfIntroduction), formatDateStringToDate(beerParameterBean.minDateOfIntroduction)));
        } else if (beerParameterBean.maxDateOfIntroduction != null) {
            predicates.add(criteriaBuilder.lessThanOrEqualTo(beer.get(Beer_.dateOfIntroduction), formatDateStringToDate(beerParameterBean.maxDateOfIntroduction)));
        }

        if (beerParameterBean.style != null) {
            predicates.add(criteriaBuilder.like(beer.get(Beer_.style), "%" + beerParameterBean.style + "%"));
        }
        if (beerParameterBean.packaging != null) {
            predicates.add(criteriaBuilder.like(beer.get(Beer_.packaging), "%" + beerParameterBean.packaging + "%"));
        }
        if (beerParameterBean.sealing != null) {
            predicates.add(criteriaBuilder.like(beer.get(Beer_.sealing), "%" + beerParameterBean.sealing + "%"));
        }
        if (beerParameterBean.origin != null) {
            predicates.add(criteriaBuilder.like(beer.get(Beer_.origin), "%" + beerParameterBean.origin + "%"));
        }
        if (beerParameterBean.originCountry != null) {
            predicates.add(criteriaBuilder.like(beer.get(Beer_.originCountry), beerParameterBean.originCountry));
        }
        if (beerParameterBean.producer != null) {
            predicates.add(criteriaBuilder.like(beer.get(Beer_.producer), "%" + beerParameterBean.producer + "%"));
        }
        if (beerParameterBean.supplier != null) {
            predicates.add(criteriaBuilder.like(beer.get(Beer_.supplier), "%" + beerParameterBean.supplier + "%"));
        }
        if (beerParameterBean.year != null) {
            predicates.add(criteriaBuilder.equal(beer.get(Beer_.year), "%" + beerParameterBean.year + "%"));
        }

        criteriaQuery.select(beer).where(predicates.toArray(new Predicate[]{}));

        return entityManager.createQuery(criteriaQuery).getResultList();
    }

    private Date formatDateStringToDate(String dateString) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = simpleDateFormat.parse(dateString);
        } catch (ParseException e) {
            logger.error("Could not format date string!");
            e.printStackTrace();
        }
        return date;
    }

    private void logBeerParameters(BeerParameterBean beerParameterBean) {
        logger.info("Name: " + beerParameterBean.name +
                " Article id: " + beerParameterBean.number +
                " Min price: " + beerParameterBean.minPrice +
                " Max price: " + beerParameterBean.maxPrice +
                " Min alcohol percentage: " + beerParameterBean.minAlcoholPercentage +
                " Max alcohol percentage: " + beerParameterBean.maxAlcoholPercentage +
                " Min volume " + beerParameterBean.minVolume +
                " Max volume: " + beerParameterBean.maxVolume +
                " Min date of introduction: " + beerParameterBean.minDateOfIntroduction +
                " Max date of introduction: " + beerParameterBean.maxDateOfIntroduction +
                " Style: " + beerParameterBean.style +
                " Packaging: " + beerParameterBean.packaging +
                " Sealing: " + beerParameterBean.sealing +
                " Origin: " + beerParameterBean.origin +
                " Origin country: " + beerParameterBean.originCountry +
                " Producer: " + beerParameterBean.producer +
                " Supplier: " + beerParameterBean.supplier +
                " Year: " + beerParameterBean.year
        );
    }

    public List<Store> getStores(StoreParameterBean storeParameterBean) {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Store> criteriaQuery = criteriaBuilder.createQuery(Store.class);
        Root<Store> store = criteriaQuery.from(Store.class);
        List<Predicate> predicates = new ArrayList<Predicate>();
        if (storeParameterBean.number != null) {
            predicates.add(criteriaBuilder.like(store.get(Store_.number), storeParameterBean.number));
        }
        if (storeParameterBean.type != null) {
            predicates.add(criteriaBuilder.like(store.get(Store_.type), storeParameterBean.type));
        }
        if (storeParameterBean.name != null) {
            predicates.add(criteriaBuilder.like(store.get(Store_.name), storeParameterBean.name));
        }
        if (storeParameterBean.streetAddress != null) {
            predicates.add(criteriaBuilder.like(store.get(Store_.streetAddress), storeParameterBean.streetAddress));
        }
        if (storeParameterBean.zip != null) {
            predicates.add(criteriaBuilder.like(store.get(Store_.zip), storeParameterBean.zip));
        }
        if (storeParameterBean.city != null) {
            predicates.add(criteriaBuilder.like(store.get(Store_.city), storeParameterBean.city));
        }
        if (storeParameterBean.county != null) {
            predicates.add(criteriaBuilder.like(store.get(Store_.county), storeParameterBean.county));
        }
        if (storeParameterBean.searchWord != null) {
            predicates.add(criteriaBuilder.like(store.get(Store_.searchWord), "%" + storeParameterBean.type + "%"));
        }

        criteriaQuery.select(store).where(predicates.toArray(new Predicate[]{}));
        return entityManager.createQuery(criteriaQuery).getResultList();
    }
}
