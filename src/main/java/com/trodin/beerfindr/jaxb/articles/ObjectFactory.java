
package com.trodin.beerfindr.jaxb.articles;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.trodin.beerfindr.jaxb package. 
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

    private final static QName _Volymiml_QNAME = new QName("", "Volymiml");
    private final static QName _Varugrupp_QNAME = new QName("", "Varugrupp");
    private final static QName _Stil_QNAME = new QName("", "Stil");
    private final static QName _Nr_QNAME = new QName("", "nr");
    private final static QName _Argang_QNAME = new QName("", "Argang");
    private final static QName _EtisktEtikett_QNAME = new QName("", "EtisktEtikett");
    private final static QName _Namn2_QNAME = new QName("", "Namn2");
    private final static QName _Producent_QNAME = new QName("", "Producent");
    private final static QName _PrisPerLiter_QNAME = new QName("", "PrisPerLiter");
    private final static QName _Forslutning_QNAME = new QName("", "Forslutning");
    private final static QName _Provadargang_QNAME = new QName("", "Provadargang");
    private final static QName _Sortiment_QNAME = new QName("", "Sortiment");
    private final static QName _Meddelande_QNAME = new QName("", "meddelande");
    private final static QName _Namn_QNAME = new QName("", "Namn");
    private final static QName _Forpackning_QNAME = new QName("", "Forpackning");
    private final static QName _Ekologisk_QNAME = new QName("", "Ekologisk");
    private final static QName _Artikelid_QNAME = new QName("", "Artikelid");
    private final static QName _Leverantor_QNAME = new QName("", "Leverantor");
    private final static QName _Koscher_QNAME = new QName("", "Koscher");
    private final static QName _Ursprunglandnamn_QNAME = new QName("", "Ursprunglandnamn");
    private final static QName _Prisinklmoms_QNAME = new QName("", "Prisinklmoms");
    private final static QName _Alkoholhalt_QNAME = new QName("", "Alkoholhalt");
    private final static QName _Typ_QNAME = new QName("", "Typ");
    private final static QName _RavarorBeskrivning_QNAME = new QName("", "RavarorBeskrivning");
    private final static QName _SkapadTid_QNAME = new QName("", "skapad-tid");
    private final static QName _Etiskt_QNAME = new QName("", "Etiskt");
    private final static QName _Ursprung_QNAME = new QName("", "Ursprung");
    private final static QName _Pant_QNAME = new QName("", "Pant");
    private final static QName _Varnummer_QNAME = new QName("", "Varnummer");
    private final static QName _Saljstart_QNAME = new QName("", "Saljstart");
    private final static QName _Utgått_QNAME = new QName("", "Utg\u00e5tt");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.trodin.beerfindr.jaxb
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
     * Create an instance of {@link Artikel }
     * 
     */
    public Artikel createArtikel() {
        return new Artikel();
    }

    /**
     * Create an instance of {@link Artiklar }
     * 
     */
    public Artiklar createArtiklar() {
        return new Artiklar();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Volymiml")
    public JAXBElement<Float> createVolymiml(Float value) {
        return new JAXBElement<Float>(_Volymiml_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Varugrupp")
    public JAXBElement<String> createVarugrupp(String value) {
        return new JAXBElement<String>(_Varugrupp_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Stil")
    public JAXBElement<String> createStil(String value) {
        return new JAXBElement<String>(_Stil_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "nr")
    public JAXBElement<Integer> createNr(Integer value) {
        return new JAXBElement<Integer>(_Nr_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Argang")
    public JAXBElement<String> createArgang(String value) {
        return new JAXBElement<String>(_Argang_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "EtisktEtikett")
    public JAXBElement<String> createEtisktEtikett(String value) {
        return new JAXBElement<String>(_EtisktEtikett_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Namn2")
    public JAXBElement<String> createNamn2(String value) {
        return new JAXBElement<String>(_Namn2_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Producent")
    public JAXBElement<String> createProducent(String value) {
        return new JAXBElement<String>(_Producent_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PrisPerLiter")
    public JAXBElement<Float> createPrisPerLiter(Float value) {
        return new JAXBElement<Float>(_PrisPerLiter_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Forslutning")
    public JAXBElement<String> createForslutning(String value) {
        return new JAXBElement<String>(_Forslutning_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Provadargang")
    public JAXBElement<String> createProvadargang(String value) {
        return new JAXBElement<String>(_Provadargang_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Sortiment")
    public JAXBElement<String> createSortiment(String value) {
        return new JAXBElement<String>(_Sortiment_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "meddelande")
    public JAXBElement<String> createMeddelande(String value) {
        return new JAXBElement<String>(_Meddelande_QNAME, String.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "Forpackning")
    public JAXBElement<String> createForpackning(String value) {
        return new JAXBElement<String>(_Forpackning_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Ekologisk")
    public JAXBElement<Byte> createEkologisk(Byte value) {
        return new JAXBElement<Byte>(_Ekologisk_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Artikelid")
    public JAXBElement<Integer> createArtikelid(Integer value) {
        return new JAXBElement<Integer>(_Artikelid_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Leverantor")
    public JAXBElement<String> createLeverantor(String value) {
        return new JAXBElement<String>(_Leverantor_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Koscher")
    public JAXBElement<Byte> createKoscher(Byte value) {
        return new JAXBElement<Byte>(_Koscher_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Ursprunglandnamn")
    public JAXBElement<String> createUrsprunglandnamn(String value) {
        return new JAXBElement<String>(_Ursprunglandnamn_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Prisinklmoms")
    public JAXBElement<Float> createPrisinklmoms(Float value) {
        return new JAXBElement<Float>(_Prisinklmoms_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Alkoholhalt")
    public JAXBElement<String> createAlkoholhalt(String value) {
        return new JAXBElement<String>(_Alkoholhalt_QNAME, String.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "RavarorBeskrivning")
    public JAXBElement<String> createRavarorBeskrivning(String value) {
        return new JAXBElement<String>(_RavarorBeskrivning_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "skapad-tid")
    public JAXBElement<String> createSkapadTid(String value) {
        return new JAXBElement<String>(_SkapadTid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Etiskt")
    public JAXBElement<Byte> createEtiskt(Byte value) {
        return new JAXBElement<Byte>(_Etiskt_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Ursprung")
    public JAXBElement<String> createUrsprung(String value) {
        return new JAXBElement<String>(_Ursprung_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Pant")
    public JAXBElement<Float> createPant(Float value) {
        return new JAXBElement<Float>(_Pant_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Varnummer")
    public JAXBElement<Integer> createVarnummer(Integer value) {
        return new JAXBElement<Integer>(_Varnummer_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Saljstart")
    public JAXBElement<XMLGregorianCalendar> createSaljstart(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_Saljstart_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Utg\u00e5tt")
    public JAXBElement<Byte> createUtgått(Byte value) {
        return new JAXBElement<Byte>(_Utgått_QNAME, Byte.class, null, value);
    }

}
