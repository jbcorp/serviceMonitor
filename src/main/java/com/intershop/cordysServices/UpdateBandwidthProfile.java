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
 * <p>Java class for UpdateBandwidthProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateBandwidthProfile"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="technicalAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="bandwidthProfile" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateBandwidthProfile", propOrder = {
    "technicalAccountNumber",
    "bandwidthProfile"
})
public class UpdateBandwidthProfile {

    @XmlElement(required = true)
    protected String technicalAccountNumber;
    @XmlElement(required = true)
    protected String bandwidthProfile;

    /**
     * Gets the value of the technicalAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechnicalAccountNumber() {
        return technicalAccountNumber;
    }

    /**
     * Sets the value of the technicalAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechnicalAccountNumber(String value) {
        this.technicalAccountNumber = value;
    }

    /**
     * Gets the value of the bandwidthProfile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBandwidthProfile() {
        return bandwidthProfile;
    }

    /**
     * Sets the value of the bandwidthProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBandwidthProfile(String value) {
        this.bandwidthProfile = value;
    }

}
