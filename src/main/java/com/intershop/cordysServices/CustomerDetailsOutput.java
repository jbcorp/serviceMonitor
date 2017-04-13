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
 * <p>Java class for CustomerDetailsOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerDetailsOutput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustomerNumber" type="{urn:fiber.kpn.com:crm:frontdesk:data:v0}CustomerNumber" minOccurs="0"/&gt;
 *         &lt;element name="AccountId" type="{urn:fiber.kpn.com:crm:frontdesk:data:v0}String30" minOccurs="0"/&gt;
 *         &lt;element name="NameInfo" type="{urn:fiber.kpn.com:crm:frontdesk:data:v0}NameInfo"/&gt;
 *         &lt;element name="Address" type="{urn:fiber.kpn.com:crm:frontdesk:data:v0}Address"/&gt;
 *         &lt;element name="ContactInfo" type="{urn:fiber.kpn.com:crm:frontdesk:data:v0}ContactInfoDetails"/&gt;
 *         &lt;element name="PaymentInfo" type="{urn:fiber.kpn.com:crm:frontdesk:data:v0}PaymentInfo"/&gt;
 *         &lt;element name="ProductLine" type="{urn:fiber.kpn.com:crm:frontdesk:data:v0}ProductLine" minOccurs="0"/&gt;
 *         &lt;element name="Brand" type="{urn:fiber.kpn.com:crm:frontdesk:data:v0}Brand2"/&gt;
 *         &lt;element name="ContractInfo" type="{urn:fiber.kpn.com:crm:frontdesk:data:v0}ContractInfo" minOccurs="0"/&gt;
 *         &lt;element name="BusinessInfo" type="{urn:fiber.kpn.com:crm:frontdesk:data:v0}BusinessInfo" minOccurs="0"/&gt;
 *         &lt;element name="ConfirmationEmail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AccountStatus" type="{urn:fiber.kpn.com:crm:frontdesk:data:v0}AccountStatus" minOccurs="0"/&gt;
 *         &lt;element name="SuspendInfo" type="{urn:fiber.kpn.com:crm:frontdesk:data:v0}SuspendInfo" minOccurs="0"/&gt;
 *         &lt;element name="AccountType" type="{urn:fiber.kpn.com:crm:frontdesk:data:v0}AccountType" minOccurs="0"/&gt;
 *         &lt;element name="AccountName" type="{urn:fiber.kpn.com:crm:frontdesk:data:v0}String255" minOccurs="0"/&gt;
 *         &lt;element name="FiberFlag" type="{urn:fiber.kpn.com:crm:frontdesk:data:v0}Flag" minOccurs="0"/&gt;
 *         &lt;element name="LineType" type="{urn:fiber.kpn.com:crm:frontdesk:data:v0}FiberProximity2" minOccurs="0"/&gt;
 *         &lt;element name="ProvisionedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerDetailsOutput", propOrder = {
    "customerNumber",
    "accountId",
    "nameInfo",
    "address",
    "contactInfo",
    "paymentInfo",
    "productLine",
    "brand",
    "contractInfo",
    "businessInfo",
    "confirmationEmail",
    "accountStatus",
    "suspendInfo",
    "accountType",
    "accountName",
    "fiberFlag",
    "lineType",
    "provisionedBy"
})
public class CustomerDetailsOutput {

    @XmlElement(name = "CustomerNumber")
    protected String customerNumber;
    @XmlElement(name = "AccountId")
    protected String accountId;
    @XmlElement(name = "NameInfo", required = true)
    protected NameInfo nameInfo;
    @XmlElement(name = "Address", required = true)
    protected Address address;
    @XmlElement(name = "ContactInfo", required = true)
    protected ContactInfoDetails contactInfo;
    @XmlElement(name = "PaymentInfo", required = true)
    protected PaymentInfo paymentInfo;
    @XmlElement(name = "ProductLine")
    @XmlSchemaType(name = "string")
    protected ProductLine productLine;
    @XmlElement(name = "Brand", required = true)
    @XmlSchemaType(name = "string")
    protected Brand2 brand;
    @XmlElement(name = "ContractInfo")
    protected ContractInfo contractInfo;
    @XmlElement(name = "BusinessInfo")
    protected BusinessInfo businessInfo;
    @XmlElement(name = "ConfirmationEmail")
    protected Boolean confirmationEmail;
    @XmlElement(name = "AccountStatus")
    @XmlSchemaType(name = "string")
    protected AccountStatus accountStatus;
    @XmlElement(name = "SuspendInfo")
    protected SuspendInfo suspendInfo;
    @XmlElement(name = "AccountType")
    @XmlSchemaType(name = "string")
    protected AccountType accountType;
    @XmlElement(name = "AccountName")
    protected String accountName;
    @XmlElement(name = "FiberFlag")
    protected String fiberFlag;
    @XmlElement(name = "LineType")
    protected String lineType;
    @XmlElement(name = "ProvisionedBy")
    protected String provisionedBy;

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
     * Gets the value of the nameInfo property.
     * 
     * @return
     *     possible object is
     *     {@link NameInfo }
     *     
     */
    public NameInfo getNameInfo() {
        return nameInfo;
    }

    /**
     * Sets the value of the nameInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameInfo }
     *     
     */
    public void setNameInfo(NameInfo value) {
        this.nameInfo = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * Gets the value of the contactInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ContactInfoDetails }
     *     
     */
    public ContactInfoDetails getContactInfo() {
        return contactInfo;
    }

    /**
     * Sets the value of the contactInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInfoDetails }
     *     
     */
    public void setContactInfo(ContactInfoDetails value) {
        this.contactInfo = value;
    }

    /**
     * Gets the value of the paymentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInfo }
     *     
     */
    public PaymentInfo getPaymentInfo() {
        return paymentInfo;
    }

    /**
     * Sets the value of the paymentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInfo }
     *     
     */
    public void setPaymentInfo(PaymentInfo value) {
        this.paymentInfo = value;
    }

    /**
     * Gets the value of the productLine property.
     * 
     * @return
     *     possible object is
     *     {@link ProductLine }
     *     
     */
    public ProductLine getProductLine() {
        return productLine;
    }

    /**
     * Sets the value of the productLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductLine }
     *     
     */
    public void setProductLine(ProductLine value) {
        this.productLine = value;
    }

    /**
     * Gets the value of the brand property.
     * 
     * @return
     *     possible object is
     *     {@link Brand2 }
     *     
     */
    public Brand2 getBrand() {
        return brand;
    }

    /**
     * Sets the value of the brand property.
     * 
     * @param value
     *     allowed object is
     *     {@link Brand2 }
     *     
     */
    public void setBrand(Brand2 value) {
        this.brand = value;
    }

    /**
     * Gets the value of the contractInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ContractInfo }
     *     
     */
    public ContractInfo getContractInfo() {
        return contractInfo;
    }

    /**
     * Sets the value of the contractInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractInfo }
     *     
     */
    public void setContractInfo(ContractInfo value) {
        this.contractInfo = value;
    }

    /**
     * Gets the value of the businessInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessInfo }
     *     
     */
    public BusinessInfo getBusinessInfo() {
        return businessInfo;
    }

    /**
     * Sets the value of the businessInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessInfo }
     *     
     */
    public void setBusinessInfo(BusinessInfo value) {
        this.businessInfo = value;
    }

    /**
     * Gets the value of the confirmationEmail property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConfirmationEmail() {
        return confirmationEmail;
    }

    /**
     * Sets the value of the confirmationEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConfirmationEmail(Boolean value) {
        this.confirmationEmail = value;
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
     * Gets the value of the suspendInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SuspendInfo }
     *     
     */
    public SuspendInfo getSuspendInfo() {
        return suspendInfo;
    }

    /**
     * Sets the value of the suspendInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SuspendInfo }
     *     
     */
    public void setSuspendInfo(SuspendInfo value) {
        this.suspendInfo = value;
    }

    /**
     * Gets the value of the accountType property.
     * 
     * @return
     *     possible object is
     *     {@link AccountType }
     *     
     */
    public AccountType getAccountType() {
        return accountType;
    }

    /**
     * Sets the value of the accountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountType }
     *     
     */
    public void setAccountType(AccountType value) {
        this.accountType = value;
    }

    /**
     * Gets the value of the accountName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * Sets the value of the accountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountName(String value) {
        this.accountName = value;
    }

    /**
     * Gets the value of the fiberFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiberFlag() {
        return fiberFlag;
    }

    /**
     * Sets the value of the fiberFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiberFlag(String value) {
        this.fiberFlag = value;
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

    /**
     * Gets the value of the provisionedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvisionedBy() {
        return provisionedBy;
    }

    /**
     * Sets the value of the provisionedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvisionedBy(String value) {
        this.provisionedBy = value;
    }

}
