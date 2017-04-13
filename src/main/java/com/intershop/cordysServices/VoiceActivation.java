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
 * <p>Java class for VoiceActivation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VoiceActivation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:fiber.kpn.com:crm:frontdesk:data:v0}ServiceActivation"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccountId" type="{urn:fiber.kpn.com:crm:frontdesk:data:v0}String30" minOccurs="0"/&gt;
 *         &lt;element name="PortingWishdate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VoiceActivation", propOrder = {
    "accountId",
    "portingWishdate"
})
public class VoiceActivation
    extends ServiceActivation
{

    @XmlElement(name = "AccountId")
    protected String accountId;
    @XmlElement(name = "PortingWishdate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar portingWishdate;

    /**
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountId(String value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the portingWishdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPortingWishdate() {
        return portingWishdate;
    }

    /**
     * Sets the value of the portingWishdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPortingWishdate(XMLGregorianCalendar value) {
        this.portingWishdate = value;
    }

}