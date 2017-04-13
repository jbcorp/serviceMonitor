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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TopLevelOrder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TopLevelOrder"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Channel" type="{urn:fiber.kpn.com:crm:frontdesk:data:v0}String100"/&gt;
 *         &lt;element name="SellerId" type="{urn:fiber.kpn.com:crm:frontdesk:data:v0}String100"/&gt;
 *         &lt;element name="OrganizationId" type="{urn:fiber.kpn.com:crm:frontdesk:data:v0}String100"/&gt;
 *         &lt;element name="ChannelReferenceId" type="{urn:fiber.kpn.com:crm:frontdesk:data:v0}String100" minOccurs="0"/&gt;
 *         &lt;element name="Leadtime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TopLevelOrder", propOrder = {
    "channel",
    "sellerId",
    "organizationId",
    "channelReferenceId",
    "leadtime"
})
@XmlSeeAlso({
    BaseOrder.class,
    MoveOrder.class,
    FollowUpOrder.class,
    TerminateOrder.class
})
public class TopLevelOrder {

    @XmlElement(name = "Channel", required = true)
    protected String channel;
    @XmlElement(name = "SellerId", required = true)
    protected String sellerId;
    @XmlElement(name = "OrganizationId", required = true)
    protected String organizationId;
    @XmlElement(name = "ChannelReferenceId")
    protected String channelReferenceId;
    @XmlElement(name = "Leadtime")
    protected Integer leadtime;

    /**
     * Gets the value of the channel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannel() {
        return channel;
    }

    /**
     * Sets the value of the channel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannel(String value) {
        this.channel = value;
    }

    /**
     * Gets the value of the sellerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerId() {
        return sellerId;
    }

    /**
     * Sets the value of the sellerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerId(String value) {
        this.sellerId = value;
    }

    /**
     * Gets the value of the organizationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationId() {
        return organizationId;
    }

    /**
     * Sets the value of the organizationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationId(String value) {
        this.organizationId = value;
    }

    /**
     * Gets the value of the channelReferenceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelReferenceId() {
        return channelReferenceId;
    }

    /**
     * Sets the value of the channelReferenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelReferenceId(String value) {
        this.channelReferenceId = value;
    }

    /**
     * Gets the value of the leadtime property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLeadtime() {
        return leadtime;
    }

    /**
     * Sets the value of the leadtime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLeadtime(Integer value) {
        this.leadtime = value;
    }

}