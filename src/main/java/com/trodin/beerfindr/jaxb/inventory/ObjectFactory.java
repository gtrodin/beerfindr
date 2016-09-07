
package com.trodin.beerfindr.jaxb.inventory;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.trodin.beerfindr.jaxb.inventory package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Meddelande_QNAME = new QName("", "Meddelande");
    private final static QName _ArtikelNr_QNAME = new QName("", "ArtikelNr");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.trodin.beerfindr.jaxb.inventory
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ButikArtikel }
     * 
     */
    public ButikArtikel createButikArtikel() {
        return new ButikArtikel();
    }

    /**
     * Create an instance of {@link Info }
     * 
     */
    public Info createInfo() {
        return new Info();
    }

    /**
     * Create an instance of {@link Butik }
     * 
     */
    public Butik createButik() {
        return new Butik();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Meddelande")
    public JAXBElement<String> createMeddelande(String value) {
        return new JAXBElement<String>(_Meddelande_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ArtikelNr")
    public JAXBElement<String> createArtikelNr(String value) {
        return new JAXBElement<String>(_ArtikelNr_QNAME, String.class, null, value);
    }

}
