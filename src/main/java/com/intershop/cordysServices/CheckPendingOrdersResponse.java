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
 * <p>Java class for CheckPendingOrdersResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckPendingOrdersResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PendingOrderInfo" type="{urn:fiber.kpn.com:crm:frontdesk:data:v0}PendingOrderInfo"/&gt;
 *         &lt;element name="PendingQuoteInfo" type="{urn:fiber.kpn.com:crm:frontdesk:data:v0}PendingQuoteInfo"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckPendingOrdersResponse", propOrder = {
    "pendingOrderInfo",
    "pendingQuoteInfo"
})
public class CheckPendingOrdersResponse {

    @XmlElement(name = "PendingOrderInfo", required = true)
    protected PendingOrderInfo pendingOrderInfo;
    @XmlElement(name = "PendingQuoteInfo", required = true)
    protected PendingQuoteInfo pendingQuoteInfo;

    /**
     * Gets the value of the pendingOrderInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PendingOrderInfo }
     *     
     */
    public PendingOrderInfo getPendingOrderInfo() {
        return pendingOrderInfo;
    }

    /**
     * Sets the value of the pendingOrderInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingOrderInfo }
     *     
     */
    public void setPendingOrderInfo(PendingOrderInfo value) {
        this.pendingOrderInfo = value;
    }

    /**
     * Gets the value of the pendingQuoteInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PendingQuoteInfo }
     *     
     */
    public PendingQuoteInfo getPendingQuoteInfo() {
        return pendingQuoteInfo;
    }

    /**
     * Sets the value of the pendingQuoteInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingQuoteInfo }
     *     
     */
    public void setPendingQuoteInfo(PendingQuoteInfo value) {
        this.pendingQuoteInfo = value;
    }

}