//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.13 at 01:29:13 PM IST 
//


package com.intershop.pegaServices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HardWareStatusResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HardWareStatusResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RGSwapNeeded" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NTSwapNeeded" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RGMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HardWareStatusResponseType", propOrder = {
    "rgSwapNeeded",
    "ntSwapNeeded",
    "rgMode"
})
public class HardWareStatusResponseType {

    @XmlElement(name = "RGSwapNeeded")
    protected String rgSwapNeeded;
    @XmlElement(name = "NTSwapNeeded")
    protected String ntSwapNeeded;
    @XmlElement(name = "RGMode")
    protected String rgMode;

    /**
     * Gets the value of the rgSwapNeeded property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRGSwapNeeded() {
        return rgSwapNeeded;
    }

    /**
     * Sets the value of the rgSwapNeeded property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRGSwapNeeded(String value) {
        this.rgSwapNeeded = value;
    }

    /**
     * Gets the value of the ntSwapNeeded property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNTSwapNeeded() {
        return ntSwapNeeded;
    }

    /**
     * Sets the value of the ntSwapNeeded property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNTSwapNeeded(String value) {
        this.ntSwapNeeded = value;
    }

    /**
     * Gets the value of the rgMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRGMode() {
        return rgMode;
    }

    /**
     * Sets the value of the rgMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRGMode(String value) {
        this.rgMode = value;
    }

}
