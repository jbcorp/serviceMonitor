//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.13 at 01:29:05 PM IST 
//


package com.intershop.cordysServices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NumberDestination complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NumberDestination"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PhoneNumber" type="{urn:fiber.kpn.com:crm:frontdesk:data:v0}Digits20"/&gt;
 *         &lt;element name="NumberOfRings" type="{urn:fiber.kpn.com:crm:frontdesk:data:v0}Range1-10"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NumberDestination", propOrder = {
    "phoneNumber",
    "numberOfRings"
})
public class NumberDestination {

    @XmlElement(name = "PhoneNumber", required = true)
    protected String phoneNumber;
    @XmlElement(name = "NumberOfRings")
    protected int numberOfRings;

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the numberOfRings property.
     * 
     */
    public int getNumberOfRings() {
        return numberOfRings;
    }

    /**
     * Sets the value of the numberOfRings property.
     * 
     */
    public void setNumberOfRings(int value) {
        this.numberOfRings = value;
    }

}
