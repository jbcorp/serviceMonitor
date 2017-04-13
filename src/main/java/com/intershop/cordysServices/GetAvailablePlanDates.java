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
 * <p>Java class for GetAvailablePlanDates complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAvailablePlanDates"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RefID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Address" type="{urn:fiber.kpn.com:crm:frontdesk:data:v0}AddressSpec"/&gt;
 *         &lt;element name="PeriodStart" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="Template" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OrderScenario" type="{urn:fiber.kpn.com:crm:frontdesk:data:v0}OrderScenario"/&gt;
 *         &lt;element name="NumberPorting" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAvailablePlanDates", propOrder = {
    "refID",
    "address",
    "periodStart",
    "template",
    "orderScenario",
    "numberPorting"
})
public class GetAvailablePlanDates {

    @XmlElement(name = "RefID", required = true)
    protected String refID;
    @XmlElement(name = "Address", required = true)
    protected AddressSpec address;
    @XmlElement(name = "PeriodStart", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar periodStart;
    @XmlElement(name = "Template", required = true)
    protected String template;
    @XmlElement(name = "OrderScenario", required = true)
    protected String orderScenario;
    @XmlElement(name = "NumberPorting", defaultValue = "false")
    protected boolean numberPorting;

    /**
     * Gets the value of the refID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefID() {
        return refID;
    }

    /**
     * Sets the value of the refID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefID(String value) {
        this.refID = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link AddressSpec }
     *     
     */
    public AddressSpec getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressSpec }
     *     
     */
    public void setAddress(AddressSpec value) {
        this.address = value;
    }

    /**
     * Gets the value of the periodStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPeriodStart() {
        return periodStart;
    }

    /**
     * Sets the value of the periodStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPeriodStart(XMLGregorianCalendar value) {
        this.periodStart = value;
    }

    /**
     * Gets the value of the template property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplate() {
        return template;
    }

    /**
     * Sets the value of the template property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplate(String value) {
        this.template = value;
    }

    /**
     * Gets the value of the orderScenario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderScenario() {
        return orderScenario;
    }

    /**
     * Sets the value of the orderScenario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderScenario(String value) {
        this.orderScenario = value;
    }

    /**
     * Gets the value of the numberPorting property.
     * 
     */
    public boolean isNumberPorting() {
        return numberPorting;
    }

    /**
     * Sets the value of the numberPorting property.
     * 
     */
    public void setNumberPorting(boolean value) {
        this.numberPorting = value;
    }

}
