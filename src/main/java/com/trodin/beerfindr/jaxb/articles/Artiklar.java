
package com.trodin.beerfindr.jaxb.articles;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element ref="{}skapad-tid"/>
 *         &lt;element ref="{}info"/>
 *         &lt;element ref="{}artikel" maxOccurs="unbounded" minOccurs="0"/>
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
    "skapadTid",
    "info",
    "artikel"
})
@XmlRootElement(name = "artiklar")
public class Artiklar {

    @XmlElement(name = "skapad-tid", required = true)
    protected String skapadTid;
    @XmlElement(required = true)
    protected Info info;
    protected List<Artikel> artikel;

    /**
     * Gets the value of the skapadTid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkapadTid() {
        return skapadTid;
    }

    /**
     * Sets the value of the skapadTid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkapadTid(String value) {
        this.skapadTid = value;
    }

    /**
     * Gets the value of the info property.
     * 
     * @return
     *     possible object is
     *     {@link Info }
     *     
     */
    public Info getInfo() {
        return info;
    }

    /**
     * Sets the value of the info property.
     * 
     * @param value
     *     allowed object is
     *     {@link Info }
     *     
     */
    public void setInfo(Info value) {
        this.info = value;
    }

    /**
     * Gets the value of the artikel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the artikel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArtikel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Artikel }
     * 
     * 
     */
    public List<Artikel> getArtikel() {
        if (artikel == null) {
            artikel = new ArrayList<Artikel>();
        }
        return this.artikel;
    }

}
