package com.trodin.beerfindr.jaxb;

import com.trodin.beerfindr.jaxb.articles.Artikel;
import com.trodin.beerfindr.jaxb.articles.Artiklar;
import com.trodin.beerfindr.jaxb.stores.ButikOmbud;
import com.trodin.beerfindr.jaxb.stores.ButikerOmbud;
import com.trodin.beerfindr.persistence.Store;
import com.trodin.beerfindr.persistence.Beer;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class XmlParser {

    private static final String ARTICLES_URL = "http://www.systembolaget.se/api/assortment/products/xml";
    private static final String ARTICLE_TYPE_BEER = "Öl";
    private static final String STORES_URL = "http://www.systembolaget.se/api/assortment/stores/xml";
    private static final String STOCK_URL = "http://www.systembolaget.se/api/assortment/stock/xml";
    private static final String EMPTY_STRING = "";


    public List<Store> parseStores() {
        List<ButikOmbud> butikOmbuds = null;
        try {
            URL url = new URL(STORES_URL);
            JAXBContext jaxbContext = JAXBContext.newInstance(ButikerOmbud.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            ButikerOmbud root = (ButikerOmbud) unmarshaller.unmarshal(url);
            butikOmbuds = root.getButikOmbud();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        List<Store> stores = new ArrayList<Store>();
        for (ButikOmbud agent : butikOmbuds) {
            stores.add(parseStoreParameters(agent));
        }
        return stores;
    }

    private Store parseStoreParameters(ButikOmbud agent) {
        String number = agent.getNr();
        String type = agent.getButiksTyp();
        String name = agent.getNamn();
        String streetAdress = agent.getAddress1();
        String zip = agent.getAddress3();
        String city = agent.getAddress4().substring(0, 1) + agent.getAddress4().substring(1).toLowerCase();
        String county = agent.getAddress5();
        String phoneNumber = agent.getTelefon();
        String searchWord = agent.getSokOrd();
        String[] openHours = agent.getOppettider().split(";;;0;_*|\\;;;-;_*");
        for(int i = 0; i < openHours.length; i++) {
            openHours[i] = openHours[i].replaceAll("\\*", "");
        }
        List<String> openHoursList = Arrays.asList(openHours);
        String rt90x = agent.getRT90X();
        String rt90y = agent.getRT90Y();
        return new Store(number, type, name, streetAdress, zip, city, county, phoneNumber, searchWord, openHoursList, rt90x, rt90y);
    }

    public List<Beer> parseBeers() {
        List<Artikel> articles = null;
        try {
            URL url = new URL(ARTICLES_URL);
            JAXBContext jaxbContext = JAXBContext.newInstance(Artiklar.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            Artiklar root = (Artiklar) unmarshaller.unmarshal(url);
            articles = root.getArtikel();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return filterBeersFromArticles(articles);
    }

    private List<Beer> filterBeersFromArticles(List<Artikel> articles) {
        List<Beer> beers = new ArrayList<Beer>();
        for (Artikel article : articles) {
            if (article.getVarugrupp().contains(ARTICLE_TYPE_BEER)) {
                beers.add(parseBeerParameters(article));
            }
        }
        return beers;
    }

    private Beer parseBeerParameters(Artikel article) {
        Integer id = article.getVarnummer();
        String name = (article.getNamn2() == null || article.getNamn2().equals(EMPTY_STRING)) ? article.getNamn() : article.getNamn() + " " + article.getNamn2();
        Float price = article.getPrisinklmoms();
        Float alcoholPercentage = Float.valueOf(article.getAlkoholhalt().substring(0, article.getAlkoholhalt().length() - 1));
        Float volume = article.getVolymiml();
        Date dateOfIntroduction = article.getSaljstart().toGregorianCalendar().getTime();
        String style = (article.getStil().equals(EMPTY_STRING)) ? null : article.getStil();
        String packaging = (article.getForpackning().equals(EMPTY_STRING)) ? null : article.getForpackning();
        String sealing = (article.getForslutning().equals(EMPTY_STRING)) ? null : article.getForslutning();
        String origin = (article.getUrsprung().equals(EMPTY_STRING)) ? null : article.getUrsprung();
        String originCountry = (article.getUrsprunglandnamn().equals(EMPTY_STRING)) ? null : article.getUrsprunglandnamn();
        String producer = (article.getProducent() == null || article.getProducent().equals(EMPTY_STRING)) ? null : article.getProducent();
        String supplier = (article.getLeverantor().equals(EMPTY_STRING)) ? null : article.getLeverantor();
        Integer year = (article.getArgang().equals(EMPTY_STRING)) ? null : Integer.valueOf(article.getArgang());

        return new Beer(id, name, price, alcoholPercentage, volume, dateOfIntroduction, style, packaging, sealing, origin, originCountry, producer, supplier, year);
    }
}
