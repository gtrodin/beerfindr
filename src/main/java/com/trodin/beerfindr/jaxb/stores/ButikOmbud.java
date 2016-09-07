
package com.trodin.beerfindr.jaxb.stores;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{}Typ"/>
 *         &lt;element ref="{}Nr"/>
 *         &lt;element ref="{}Namn"/>
 *         &lt;element ref="{}Address1"/>
 *         &lt;element ref="{}Address2"/>
 *         &lt;element ref="{}Address3"/>
 *         &lt;element ref="{}Address4"/>
 *         &lt;element ref="{}Address5" minOccurs="0"/>
 *         &lt;element ref="{}Telefon" minOccurs="0"/>
 *         &lt;element ref="{}ButiksTyp"/>
 *         &lt;element ref="{}Tjanster"/>
 *         &lt;element ref="{}SokOrd" minOccurs="0"/>
 *         &lt;element ref="{}Oppettider"/>
 *         &lt;element ref="{}RT90x"/>
 *         &lt;element ref="{}RT90y"/>
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
    "typ",
    "nr",
    "namn",
    "address1",
    "address2",
    "address3",
    "address4",
    "address5",
    "telefon",
    "butiksTyp",
    "tjanster",
    "sokOrd",
    "oppettider",
    "rt90X",
    "rt90Y"
})
@XmlRootElement(name = "ButikOmbud")
public class ButikOmbud {

    @XmlElement(name = "Typ", required = true)
    protected String typ;
    @XmlElement(name = "Nr", required = true)
    protected String nr;
    @XmlElement(name = "Namn", required = true)
    protected String namn;
    @XmlElement(name = "Address1", required = true)
    protected String address1;
    @XmlElement(name = "Address2", required = true)
    protected String address2;
    @XmlElement(name = "Address3", required = true)
    protected String address3;
    @XmlElement(name = "Address4", required = true)
    protected String address4;
    @XmlElement(name = "Address5")
    protected String address5;
    @XmlElement(name = "Telefon")
    protected String telefon;
    @XmlElement(name = "ButiksTyp", required = true)
    protected String butiksTyp;
    @XmlElement(name = "Tjanster", required = true)
    protected String tjanster;
    @XmlElement(name = "SokOrd")
    protected String sokOrd;
    @XmlElement(name = "Oppettider", required = true)
    protected String oppettider;
    @XmlElement(name = "RT90x", required = true)
    protected String rt90X;
    @XmlElement(name = "RT90y", required = true)
    protected String rt90Y;

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
     * Gets the value of the nr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNr() {
        return nr;
    }

    /**
     * Sets the value of the nr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNr(String value) {
        this.nr = value;
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
     * Gets the value of the address1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress1() {
        return address1;
    }

    /**
     * Sets the value of the address1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress1(String value) {
        this.address1 = value;
    }

    /**
     * Gets the value of the address2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress2() {
        return address2;
    }

    /**
     * Sets the value of the address2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress2(String value) {
        this.address2 = value;
    }

    /**
     * Gets the value of the address3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress3() {
        return address3;
    }

    /**
     * Sets the value of the address3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress3(String value) {
        this.address3 = value;
    }

    /**
     * Gets the value of the address4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress4() {
        return address4;
    }

    /**
     * Sets the value of the address4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress4(String value) {
        this.address4 = value;
    }

    /**
     * Gets the value of the address5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress5() {
        return address5;
    }

    /**
     * Sets the value of the address5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress5(String value) {
        this.address5 = value;
    }

    /**
     * Gets the value of the telefon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefon() {
        return telefon;
    }

    /**
     * Sets the value of the telefon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefon(String value) {
        this.telefon = value;
    }

    /**
     * Gets the value of the butiksTyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getButiksTyp() {
        return butiksTyp;
    }

    /**
     * Sets the value of the butiksTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setButiksTyp(String value) {
        this.butiksTyp = value;
    }

    /**
     * Gets the value of the tjanster property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTjanster() {
        return tjanster;
    }

    /**
     * Sets the value of the tjanster property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTjanster(String value) {
        this.tjanster = value;
    }

    /**
     * Gets the value of the sokOrd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSokOrd() {
        return sokOrd;
    }

    /**
     * Sets the value of the sokOrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSokOrd(String value) {
        this.sokOrd = value;
    }

    /**
     * Gets the value of the oppettider property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOppettider() {
        return oppettider;
    }

    /**
     * Sets the value of the oppettider property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOppettider(String value) {
        this.oppettider = value;
    }

    /**
     * Gets the value of the rt90X property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRT90X() {
        return rt90X;
    }

    /**
     * Sets the value of the rt90X property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRT90X(String value) {
        this.rt90X = value;
    }

    /**
     * Gets the value of the rt90Y property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRT90Y() {
        return rt90Y;
    }

    /**
     * Sets the value of the rt90Y property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRT90Y(String value) {
        this.rt90Y = value;
    }

}
