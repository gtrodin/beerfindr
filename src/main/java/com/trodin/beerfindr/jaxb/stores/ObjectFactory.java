
package com.trodin.beerfindr.jaxb.stores;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.trodin.beerfindr.jaxb.stores package. 
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

    private final static QName _SokOrd_QNAME = new QName("", "SokOrd");
    private final static QName _Nr_QNAME = new QName("", "Nr");
    private final static QName _Oppettider_QNAME = new QName("", "Oppettider");
    private final static QName _Address2_QNAME = new QName("", "Address2");
    private final static QName _Address3_QNAME = new QName("", "Address3");
    private final static QName _Typ_QNAME = new QName("", "Typ");
    private final static QName _RT90Y_QNAME = new QName("", "RT90y");
    private final static QName _Address1_QNAME = new QName("", "Address1");
    private final static QName _Namn_QNAME = new QName("", "Namn");
    private final static QName _Tjanster_QNAME = new QName("", "Tjanster");
    private final static QName _RT90X_QNAME = new QName("", "RT90x");
    private final static QName _Address4_QNAME = new QName("", "Address4");
    private final static QName _Address5_QNAME = new QName("", "Address5");
    private final static QName _Meddelande_QNAME = new QName("", "Meddelande");
    private final static QName _ButiksTyp_QNAME = new QName("", "ButiksTyp");
    private final static QName _Telefon_QNAME = new QName("", "Telefon");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.trodin.beerfindr.jaxb.stores
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Info }
     * 
     */
    public Info createInfo() {
        return new Info();
    }

    /**
     * Create an instance of {@link ButikerOmbud }
     * 
     */
    public ButikerOmbud createButikerOmbud() {
        return new ButikerOmbud();
    }

    /**
     * Create an instance of {@link ButikOmbud }
     * 
     */
    public ButikOmbud createButikOmbud() {
        return new ButikOmbud();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SokOrd")
    public JAXBElement<String> createSokOrd(String value) {
        return new JAXBElement<String>(_SokOrd_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Nr")
    public JAXBElement<String> createNr(String value) {
        return new JAXBElement<String>(_Nr_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Oppettider")
    public JAXBElement<String> createOppettider(String value) {
        return new JAXBElement<String>(_Oppettider_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Address2")
    public JAXBElement<String> createAddress2(String value) {
        return new JAXBElement<String>(_Address2_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Address3")
    public JAXBElement<String> createAddress3(String value) {
        return new JAXBElement<String>(_Address3_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Typ")
    public JAXBElement<String> createTyp(String value) {
        return new JAXBElement<String>(_Typ_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "RT90y")
    public JAXBElement<String> createRT90Y(String value) {
        return new JAXBElement<String>(_RT90Y_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Address1")
    public JAXBElement<String> createAddress1(String value) {
        return new JAXBElement<String>(_Address1_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Namn")
    public JAXBElement<String> createNamn(String value) {
        return new JAXBElement<String>(_Namn_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Tjanster")
    public JAXBElement<String> createTjanster(String value) {
        return new JAXBElement<String>(_Tjanster_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "RT90x")
    public JAXBElement<String> createRT90X(String value) {
        return new JAXBElement<String>(_RT90X_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Address4")
    public JAXBElement<String> createAddress4(String value) {
        return new JAXBElement<String>(_Address4_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Address5")
    public JAXBElement<String> createAddress5(String value) {
        return new JAXBElement<String>(_Address5_QNAME, String.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "ButiksTyp")
    public JAXBElement<String> createButiksTyp(String value) {
        return new JAXBElement<String>(_ButiksTyp_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Telefon")
    public JAXBElement<String> createTelefon(String value) {
        return new JAXBElement<String>(_Telefon_QNAME, String.class, null, value);
    }

}
