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
 * <p>Java class for CallForwarding complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CallForwarding"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="Disabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Voicemail" type="{urn:fiber.kpn.com:crm:frontdesk:data:v0}VoiceMail"/&gt;
 *         &lt;element name="NumberDestination" type="{urn:fiber.kpn.com:crm:frontdesk:data:v0}NumberDestination"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CallForwarding", propOrder = {
    "disabled",
    "voicemail",
    "numberDestination"
})
public class CallForwarding {

    @XmlElement(name = "Disabled")
    protected Boolean disabled;
    @XmlElement(name = "Voicemail")
    protected VoiceMail voicemail;
    @XmlElement(name = "NumberDestination")
    protected NumberDestination numberDestination;

    /**
     * Gets the value of the disabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisabled() {
        return disabled;
    }

    /**
     * Sets the value of the disabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisabled(Boolean value) {
        this.disabled = value;
    }

    /**
     * Gets the value of the voicemail property.
     * 
     * @return
     *     possible object is
     *     {@link VoiceMail }
     *     
     */
    public VoiceMail getVoicemail() {
        return voicemail;
    }

    /**
     * Sets the value of the voicemail property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoiceMail }
     *     
     */
    public void setVoicemail(VoiceMail value) {
        this.voicemail = value;
    }

    /**
     * Gets the value of the numberDestination property.
     * 
     * @return
     *     possible object is
     *     {@link NumberDestination }
     *     
     */
    public NumberDestination getNumberDestination() {
        return numberDestination;
    }

    /**
     * Sets the value of the numberDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberDestination }
     *     
     */
    public void setNumberDestination(NumberDestination value) {
        this.numberDestination = value;
    }

}
