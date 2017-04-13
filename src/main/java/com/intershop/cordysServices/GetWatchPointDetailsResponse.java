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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for GetWatchPointDetailsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetWatchPointDetailsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderType" type="{urn:fiber.kpn.com:crm:frontdesk:data:v0}OrderType"/&gt;
 *         &lt;element name="OrderStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OrderCreationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="ExpectedDeliveryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="TrackTraceCodeList" type="{urn:fiber.kpn.com:crm:frontdesk:data:v0}TrackTraceCodeList" minOccurs="0"/&gt;
 *         &lt;element name="WatchpointList" type="{urn:fiber.kpn.com:crm:frontdesk:data:v0}WatchpointList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetWatchPointDetailsResponse", propOrder = {
    "orderId",
    "orderNumber",
    "orderType",
    "orderStatus",
    "orderCreationDate",
    "expectedDeliveryDate",
    "trackTraceCodeList",
    "watchpointList"
})
public class GetWatchPointDetailsResponse {

    @XmlElement(name = "OrderId")
    protected String orderId;
    @XmlElement(name = "OrderNumber")
    protected String orderNumber;
    @XmlElement(name = "OrderType", required = true)
    @XmlSchemaType(name = "string")
    protected OrderType orderType;
    @XmlElement(name = "OrderStatus", required = true)
    protected String orderStatus;
    @XmlElement(name = "OrderCreationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar orderCreationDate;
    @XmlElement(name = "ExpectedDeliveryDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expectedDeliveryDate;
    @XmlElement(name = "TrackTraceCodeList")
    protected TrackTraceCodeList trackTraceCodeList;
    @XmlElement(name = "WatchpointList")
    protected WatchpointList watchpointList;

    /**
     * Gets the value of the orderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * Sets the value of the orderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderId(String value) {
        this.orderId = value;
    }

    /**
     * Gets the value of the orderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderNumber() {
        return orderNumber;
    }

    /**
     * Sets the value of the orderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderNumber(String value) {
        this.orderNumber = value;
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
     *     {@link String }
     *     
     */
    public String getOrderStatus() {
        return orderStatus;
    }

    /**
     * Sets the value of the orderStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderStatus(String value) {
        this.orderStatus = value;
    }

    /**
     * Gets the value of the orderCreationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrderCreationDate() {
        return orderCreationDate;
    }

    /**
     * Sets the value of the orderCreationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrderCreationDate(XMLGregorianCalendar value) {
        this.orderCreationDate = value;
    }

    /**
     * Gets the value of the expectedDeliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpectedDeliveryDate() {
        return expectedDeliveryDate;
    }

    /**
     * Sets the value of the expectedDeliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpectedDeliveryDate(XMLGregorianCalendar value) {
        this.expectedDeliveryDate = value;
    }

    /**
     * Gets the value of the trackTraceCodeList property.
     * 
     * @return
     *     possible object is
     *     {@link TrackTraceCodeList }
     *     
     */
    public TrackTraceCodeList getTrackTraceCodeList() {
        return trackTraceCodeList;
    }

    /**
     * Sets the value of the trackTraceCodeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackTraceCodeList }
     *     
     */
    public void setTrackTraceCodeList(TrackTraceCodeList value) {
        this.trackTraceCodeList = value;
    }

    /**
     * Gets the value of the watchpointList property.
     * 
     * @return
     *     possible object is
     *     {@link WatchpointList }
     *     
     */
    public WatchpointList getWatchpointList() {
        return watchpointList;
    }

    /**
     * Sets the value of the watchpointList property.
     * 
     * @param value
     *     allowed object is
     *     {@link WatchpointList }
     *     
     */
    public void setWatchpointList(WatchpointList value) {
        this.watchpointList = value;
    }

}
