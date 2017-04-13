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
 * <p>Java class for GetInstalledBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetInstalledBase"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustomerNumber" type="{urn:fiber.kpn.com:crm:frontdesk:data:v0}CustomerNumber"/&gt;
 *         &lt;element name="CommercialProductsOnly" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AccountId" type="{urn:fiber.kpn.com:crm:frontdesk:data:v0}String30" minOccurs="0"/&gt;
 *         &lt;element name="AccountStatus" type="{urn:fiber.kpn.com:crm:frontdesk:data:v0}AccountStatus" minOccurs="0"/&gt;
 *         &lt;element name="LineType" type="{urn:fiber.kpn.com:crm:frontdesk:data:v0}FiberProximity2" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetInstalledBase", propOrder = {
    "customerNumber",
    "commercialProductsOnly",
    "accountId",
    "accountStatus",
    "lineType"
})
public class GetInstalledBase {

    @XmlElement(name = "CustomerNumber", required = true)
    protected String customerNumber;
    @XmlElement(name = "CommercialProductsOnly")
    protected String commercialProductsOnly;
    @XmlElement(name = "AccountId")
    protected String accountId;
    @XmlElement(name = "AccountStatus")
    @XmlSchemaType(name = "string")
    protected AccountStatus accountStatus;
    @XmlElement(name = "LineType")
    protected String lineType;

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
     * Gets the value of the commercialProductsOnly property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommercialProductsOnly() {
        return commercialProductsOnly;
    }

    /**
     * Sets the value of the commercialProductsOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommercialProductsOnly(String value) {
        this.commercialProductsOnly = value;
    }

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
     * Gets the value of the accountStatus property.
     * 
     * @return
     *     possible object is
     *     {@link AccountStatus }
     *     
     */
    public AccountStatus getAccountStatus() {
        return accountStatus;
    }

    /**
     * Sets the value of the accountStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountStatus }
     *     
     */
    public void setAccountStatus(AccountStatus value) {
        this.accountStatus = value;
    }

    /**
     * Gets the value of the lineType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineType() {
        return lineType;
    }

    /**
     * Sets the value of the lineType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineType(String value) {
        this.lineType = value;
    }

}
