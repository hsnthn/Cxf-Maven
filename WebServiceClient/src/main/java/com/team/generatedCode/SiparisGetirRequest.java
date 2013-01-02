
package com.team.generatedCode;

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
 *         &lt;element name="siparis" type="{http://www.example.org/SimpleService/}Siparis"/>
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
    "siparis"
})
@XmlRootElement(name = "siparisGetirRequest")
public class SiparisGetirRequest {

    @XmlElement(required = true)
    protected Siparis siparis;

    /**
     * Gets the value of the siparis property.
     * 
     * @return
     *     possible object is
     *     {@link Siparis }
     *     
     */
    public Siparis getSiparis() {
        return siparis;
    }

    /**
     * Sets the value of the siparis property.
     * 
     * @param value
     *     allowed object is
     *     {@link Siparis }
     *     
     */
    public void setSiparis(Siparis value) {
        this.siparis = value;
    }

}
