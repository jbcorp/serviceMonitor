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
 * <p>Java class for DeactivateDigitenne complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeactivateDigitenne"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ServiceId" type="{urn:fiber.kpn.com:crm:frontdesk:data:v0}String100"/&gt;
 *         &lt;element name="CustomerNumber" type="{urn:fiber.kpn.com:crm:frontdesk:data:v0}CustomerNumber"/&gt;
 *         &lt;element name="Brand" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SmartCardNumber" type="{urn:fiber.kpn.com:crm:frontdesk:data:v0}Digits12"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeactivateDigitenne", propOrder = {
    "serviceId",
    "customerNumber",
    "brand",
    "smartCardNumber"
})
public class DeactivateDigitenne {

    @XmlElement(name = "ServiceId", required = true)
    protected String serviceId;
    @XmlElement(name = "CustomerNumber", required = true)
    protected String customerNumber;
    @XmlElement(name = "Brand", required = true)
    protected String brand;
    @XmlElement(name = "SmartCardNumber", required = true)
    protected String smartCardNumber;

    /**
     * Gets the value of the serviceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceId() {
        return serviceId;
    }

    /**
     * Sets the value of the serviceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceId(String value) {
        this.serviceId = value;
    }

    /**
     * Gets the value of the customerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerNumber() {
        return customerNumber;
    }

    /**
     * Sets the value of the customerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerNumber(String value) {
        this.customerNumber = value;
    }

    /**
     * Gets the value of the brand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Sets the value of the brand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrand(String value) {
        this.brand = value;
    }

    /**
     * Gets the value of the smartCardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmartCardNumber() {
        return smartCardNumber;
    }

    /**
     * Sets the value of the smartCardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmartCardNumber(String value) {
        this.smartCardNumber = value;
    }

}
