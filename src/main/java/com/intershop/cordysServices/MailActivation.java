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
 * <p>Java class for MailActivation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MailActivation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:fiber.kpn.com:crm:frontdesk:data:v0}ServiceActivation"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SpamFilter" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="VirusScan" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Credentials" type="{urn:fiber.kpn.com:crm:frontdesk:data:v0}Credentials" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MailActivation", propOrder = {
    "spamFilter",
    "virusScan",
    "credentials"
})
public class MailActivation
    extends ServiceActivation
{

    @XmlElement(name = "SpamFilter")
    protected boolean spamFilter;
    @XmlElement(name = "VirusScan")
    protected boolean virusScan;
    @XmlElement(name = "Credentials")
    protected Credentials credentials;

    /**
     * Gets the value of the spamFilter property.
     * 
     */
    public boolean isSpamFilter() {
        return spamFilter;
    }

    /**
     * Sets the value of the spamFilter property.
     * 
     */
    public void setSpamFilter(boolean value) {
        this.spamFilter = value;
    }

    /**
     * Gets the value of the virusScan property.
     * 
     */
    public boolean isVirusScan() {
        return virusScan;
    }

    /**
     * Sets the value of the virusScan property.
     * 
     */
    public void setVirusScan(boolean value) {
        this.virusScan = value;
    }

    /**
     * Gets the value of the credentials property.
     * 
     * @return
     *     possible object is
     *     {@link Credentials }
     *     
     */
    public Credentials getCredentials() {
        return credentials;
    }

    /**
     * Sets the value of the credentials property.
     * 
     * @param value
     *     allowed object is
     *     {@link Credentials }
     *     
     */
    public void setCredentials(Credentials value) {
        this.credentials = value;
    }

}
