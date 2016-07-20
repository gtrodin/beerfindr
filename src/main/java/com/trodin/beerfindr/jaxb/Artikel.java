
package com.trodin.beerfindr.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}nr"/>
 *         &lt;element ref="{}Artikelid"/>
 *         &lt;element ref="{}Varnummer"/>
 *         &lt;element ref="{}Namn"/>
 *         &lt;element ref="{}Namn2"/>
 *         &lt;element ref="{}Prisinklmoms"/>
 *         &lt;element ref="{}Pant" minOccurs="0"/>
 *         &lt;element ref="{}Volymiml"/>
 *         &lt;element ref="{}PrisPerLiter"/>
 *         &lt;element ref="{}Saljstart"/>
 *         &lt;element ref="{}Utgått"/>
 *         &lt;element ref="{}Varugrupp"/>
 *         &lt;element ref="{}Typ"/>
 *         &lt;element ref="{}Stil"/>
 *         &lt;element ref="{}Forpackning"/>
 *         &lt;element ref="{}Forslutning"/>
 *         &lt;element ref="{}Ursprung"/>
 *         &lt;element ref="{}Ursprunglandnamn"/>
 *         &lt;element ref="{}Producent" minOccurs="0"/>
 *         &lt;element ref="{}Leverantor"/>
 *         &lt;element ref="{}Argang"/>
 *         &lt;element ref="{}Provadargang"/>
 *         &lt;element ref="{}Alkoholhalt"/>
 *         &lt;element ref="{}Sortiment"/>
 *         &lt;element ref="{}Ekologisk"/>
 *         &lt;element ref="{}Etiskt"/>
 *         &lt;element ref="{}EtisktEtikett" minOccurs="0"/>
 *         &lt;element ref="{}Koscher"/>
 *         &lt;element ref="{}RavarorBeskrivning" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "nr",
    "artikelid",
    "varnummer",
    "namn",
    "namn2",
    "prisinklmoms",
    "pant",
    "volymiml",
    "prisPerLiter",
    "saljstart",
    "utg\u00e5tt",
    "varugrupp",
    "typ",
    "stil",
    "forpackning",
    "forslutning",
    "ursprung",
    "ursprunglandnamn",
    "producent",
    "leverantor",
    "argang",
    "provadargang",
    "alkoholhalt",
    "sortiment",
    "ekologisk",
    "etiskt",
    "etisktEtikett",
    "koscher",
    "ravarorBeskrivning"
})
@XmlRootElement(name = "artikel")
public class Artikel {

    protected int nr;
    @XmlElement(name = "Artikelid")
    protected int artikelid;
    @XmlElement(name = "Varnummer")
    protected int varnummer;
    @XmlElement(name = "Namn", required = true)
    protected String namn;
    @XmlElement(name = "Namn2", required = true)
    protected String namn2;
    @XmlElement(name = "Prisinklmoms")
    protected float prisinklmoms;
    @XmlElement(name = "Pant")
    protected Float pant;
    @XmlElement(name = "Volymiml")
    protected float volymiml;
    @XmlElement(name = "PrisPerLiter")
    protected float prisPerLiter;
    @XmlElement(name = "Saljstart", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar saljstart;
    @XmlElement(name = "Utg\u00e5tt")
    protected byte utgått;
    @XmlElement(name = "Varugrupp", required = true)
    protected String varugrupp;
    @XmlElement(name = "Typ", required = true)
    protected String typ;
    @XmlElement(name = "Stil", required = true)
    protected String stil;
    @XmlElement(name = "Forpackning", required = true)
    protected String forpackning;
    @XmlElement(name = "Forslutning", required = true)
    protected String forslutning;
    @XmlElement(name = "Ursprung", required = true)
    protected String ursprung;
    @XmlElement(name = "Ursprunglandnamn", required = true)
    protected String ursprunglandnamn;
    @XmlElement(name = "Producent")
    protected String producent;
    @XmlElement(name = "Leverantor", required = true)
    protected String leverantor;
    @XmlElement(name = "Argang", required = true)
    protected String argang;
    @XmlElement(name = "Provadargang", required = true)
    protected String provadargang;
    @XmlElement(name = "Alkoholhalt", required = true)
    protected String alkoholhalt;
    @XmlElement(name = "Sortiment", required = true)
    protected String sortiment;
    @XmlElement(name = "Ekologisk")
    protected byte ekologisk;
    @XmlElement(name = "Etiskt")
    protected byte etiskt;
    @XmlElement(name = "EtisktEtikett")
    protected String etisktEtikett;
    @XmlElement(name = "Koscher")
    protected byte koscher;
    @XmlElement(name = "RavarorBeskrivning")
    protected String ravarorBeskrivning;

    /**
     * Gets the value of the nr property.
     * 
     */
    public int getNr() {
        return nr;
    }

    /**
     * Sets the value of the nr property.
     * 
     */
    public void setNr(int value) {
        this.nr = value;
    }

    /**
     * Gets the value of the artikelid property.
     * 
     */
    public int getArtikelid() {
        return artikelid;
    }

    /**
     * Sets the value of the artikelid property.
     * 
     */
    public void setArtikelid(int value) {
        this.artikelid = value;
    }

    /**
     * Gets the value of the varnummer property.
     * 
     */
    public int getVarnummer() {
        return varnummer;
    }

    /**
     * Sets the value of the varnummer property.
     * 
     */
    public void setVarnummer(int value) {
        this.varnummer = value;
    }

    /**
     * Gets the value of the namn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamn() {
        return namn;
    }

    /**
     * Sets the value of the namn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamn(String value) {
        this.namn = value;
    }

    /**
     * Gets the value of the namn2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamn2() {
        return namn2;
    }

    /**
     * Sets the value of the namn2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamn2(String value) {
        this.namn2 = value;
    }

    /**
     * Gets the value of the prisinklmoms property.
     * 
     */
    public float getPrisinklmoms() {
        return prisinklmoms;
    }

    /**
     * Sets the value of the prisinklmoms property.
     * 
     */
    public void setPrisinklmoms(float value) {
        this.prisinklmoms = value;
    }

    /**
     * Gets the value of the pant property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPant() {
        return pant;
    }

    /**
     * Sets the value of the pant property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPant(Float value) {
        this.pant = value;
    }

    /**
     * Gets the value of the volymiml property.
     * 
     */
    public float getVolymiml() {
        return volymiml;
    }

    /**
     * Sets the value of the volymiml property.
     * 
     */
    public void setVolymiml(float value) {
        this.volymiml = value;
    }

    /**
     * Gets the value of the prisPerLiter property.
     * 
     */
    public float getPrisPerLiter() {
        return prisPerLiter;
    }

    /**
     * Sets the value of the prisPerLiter property.
     * 
     */
    public void setPrisPerLiter(float value) {
        this.prisPerLiter = value;
    }

    /**
     * Gets the value of the saljstart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSaljstart() {
        return saljstart;
    }

    /**
     * Sets the value of the saljstart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSaljstart(XMLGregorianCalendar value) {
        this.saljstart = value;
    }

    /**
     * Gets the value of the utgått property.
     * 
     */
    public byte getUtgått() {
        return utgått;
    }

    /**
     * Sets the value of the utgått property.
     * 
     */
    public void setUtgått(byte value) {
        this.utgått = value;
    }

    /**
     * Gets the value of the varugrupp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVarugrupp() {
        return varugrupp;
    }

    /**
     * Sets the value of the varugrupp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVarugrupp(String value) {
        this.varugrupp = value;
    }

    /**
     * Gets the value of the typ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTyp() {
        return typ;
    }

    /**
     * Sets the value of the typ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTyp(String value) {
        this.typ = value;
    }

    /**
     * Gets the value of the stil property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStil() {
        return stil;
    }

    /**
     * Sets the value of the stil property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStil(String value) {
        this.stil = value;
    }

    /**
     * Gets the value of the forpackning property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForpackning() {
        return forpackning;
    }

    /**
     * Sets the value of the forpackning property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForpackning(String value) {
        this.forpackning = value;
    }

    /**
     * Gets the value of the forslutning property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForslutning() {
        return forslutning;
    }

    /**
     * Sets the value of the forslutning property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForslutning(String value) {
        this.forslutning = value;
    }

    /**
     * Gets the value of the ursprung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrsprung() {
        return ursprung;
    }

    /**
     * Sets the value of the ursprung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrsprung(String value) {
        this.ursprung = value;
    }

    /**
     * Gets the value of the ursprunglandnamn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrsprunglandnamn() {
        return ursprunglandnamn;
    }

    /**
     * Sets the value of the ursprunglandnamn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrsprunglandnamn(String value) {
        this.ursprunglandnamn = value;
    }

    /**
     * Gets the value of the producent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProducent() {
        return producent;
    }

    /**
     * Sets the value of the producent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProducent(String value) {
        this.producent = value;
    }

    /**
     * Gets the value of the leverantor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeverantor() {
        return leverantor;
    }

    /**
     * Sets the value of the leverantor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeverantor(String value) {
        this.leverantor = value;
    }

    /**
     * Gets the value of the argang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArgang() {
        return argang;
    }

    /**
     * Sets the value of the argang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArgang(String value) {
        this.argang = value;
    }

    /**
     * Gets the value of the provadargang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvadargang() {
        return provadargang;
    }

    /**
     * Sets the value of the provadargang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvadargang(String value) {
        this.provadargang = value;
    }

    /**
     * Gets the value of the alkoholhalt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlkoholhalt() {
        return alkoholhalt;
    }

    /**
     * Sets the value of the alkoholhalt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlkoholhalt(String value) {
        this.alkoholhalt = value;
    }

    /**
     * Gets the value of the sortiment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSortiment() {
        return sortiment;
    }

    /**
     * Sets the value of the sortiment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSortiment(String value) {
        this.sortiment = value;
    }

    /**
     * Gets the value of the ekologisk property.
     * 
     */
    public byte getEkologisk() {
        return ekologisk;
    }

    /**
     * Sets the value of the ekologisk property.
     * 
     */
    public void setEkologisk(byte value) {
        this.ekologisk = value;
    }

    /**
     * Gets the value of the etiskt property.
     * 
     */
    public byte getEtiskt() {
        return etiskt;
    }

    /**
     * Sets the value of the etiskt property.
     * 
     */
    public void setEtiskt(byte value) {
        this.etiskt = value;
    }

    /**
     * Gets the value of the etisktEtikett property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEtisktEtikett() {
        return etisktEtikett;
    }

    /**
     * Sets the value of the etisktEtikett property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEtisktEtikett(String value) {
        this.etisktEtikett = value;
    }

    /**
     * Gets the value of the koscher property.
     * 
     */
    public byte getKoscher() {
        return koscher;
    }

    /**
     * Sets the value of the koscher property.
     * 
     */
    public void setKoscher(byte value) {
        this.koscher = value;
    }

    /**
     * Gets the value of the ravarorBeskrivning property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRavarorBeskrivning() {
        return ravarorBeskrivning;
    }

    /**
     * Sets the value of the ravarorBeskrivning property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRavarorBeskrivning(String value) {
        this.ravarorBeskrivning = value;
    }

}
