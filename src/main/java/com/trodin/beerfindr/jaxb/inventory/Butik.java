
package com.trodin.beerfindr.jaxb.inventory;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element ref="{}ArtikelNr" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ButikNr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "artikelNr"
})
@XmlRootElement(name = "Butik")
public class Butik {

    @XmlElement(name = "ArtikelNr")
    protected List<String> artikelNr;
    @XmlAttribute(name = "ButikNr")
    protected String butikNr;

    /**
     * Gets the value of the artikelNr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the artikelNr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArtikelNr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getArtikelNr() {
        if (artikelNr == null) {
            artikelNr = new ArrayList<String>();
        }
        return this.artikelNr;
    }

    /**
     * Gets the value of the butikNr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getButikNr() {
        return butikNr;
    }

    /**
     * Sets the value of the butikNr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setButikNr(String value) {
        this.butikNr = value;
    }

}
