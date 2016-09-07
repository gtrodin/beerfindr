package com.trodin.beerfindr.persistence;

import com.trodin.beerfindr.jaxb.articles.Artikel;
import com.trodin.beerfindr.jaxb.articles.Artiklar;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class JAXBTest {

    @Test
    @Ignore
    public void testXMLUnmarshalling() {

        try {
            URL url = new URL("http://www.systembolaget.se/api/assortment/products/xml");

            JAXBContext jaxbContext = JAXBContext.newInstance(Artiklar.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            Artiklar root = (Artiklar) unmarshaller.unmarshal(url);
            List<Artikel> artiklar = root.getArtikel();
            Assert.assertNotNull(artiklar);

        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
