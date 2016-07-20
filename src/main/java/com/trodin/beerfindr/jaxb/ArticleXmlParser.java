package com.trodin.beerfindr.jaxb;

import com.trodin.beerfindr.persistence.Beer;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ArticleXmlParser {

    private static final String ARTICLES_URL = "http://www.systembolaget.se/api/assortment/products/xml";
    private static final String ARTICLE_TYPE_BEER = "Öl";

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
                String articleName;
                if(article.getNamn2().equals("") || article.getNamn2() == null) {
                    articleName = article.getNamn();
                } else {
                    articleName = article.getNamn() + " " + article.getNamn2();
                }
                beers.add(new Beer(articleName, article.getArtikelid(), article.getPrisinklmoms(), article.getAlkoholhalt(), article.getVolymiml(), article.getSaljstart().toGregorianCalendar().getTime(), article.getStil(), article.getForpackning(), article.getForslutning(), article.getUrsprung(), article.getUrsprunglandnamn(), article.getProducent(), article.getLeverantor(), article.getArgang()));
            }
        }
        return beers;
    }
}
