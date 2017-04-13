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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PendingOrderInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PendingOrderInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PendingOrder" type="{urn:fiber.kpn.com:crm:frontdesk:data:v0}PendingOrder"/&gt;
 *         &lt;element name="OrderType" type="{urn:fiber.kpn.com:crm:frontdesk:data:v0}OrderType" minOccurs="0"/&gt;
 *         &lt;element name="OrderStatus" type="{urn:fiber.kpn.com:crm:frontdesk:data:v0}OrderStatus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PendingOrderInfo", propOrder = {
    "pendingOrder",
    "orderType",
    "orderStatus"
})
public class PendingOrderInfo {

    @XmlElement(name = "PendingOrder", required = true)
    protected String pendingOrder;
    @XmlElement(name = "OrderType")
    @XmlSchemaType(name = "string")
    protected OrderType orderType;
    @XmlElement(name = "OrderStatus")
    @XmlSchemaType(name = "string")
    protected OrderStatus orderStatus;

    /**
     * Gets the value of the pendingOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPendingOrder() {
        return pendingOrder;
    }

    /**
     * Sets the value of the pendingOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPendingOrder(String value) {
        this.pendingOrder = value;
    }

    /**
     * Gets the value of the orderType property.
     * 
     * @return
     *     possible object is
     *     {@link OrderType }
     *     
     */
    public OrderType getOrderType() {
        return orderType;
    }

    /**
     * Sets the value of the orderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderType }
     *     
     */
    public void setOrderType(OrderType value) {
        this.orderType = value;
    }

    /**
     * Gets the value of the orderStatus property.
     * 
     * @return
     *     possible object is
     *     {@link OrderStatus }
     *     
     */
    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    /**
     * Sets the value of the orderStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderStatus }
     *     
     */
    public void setOrderStatus(OrderStatus value) {
        this.orderStatus = value;
    }

}
