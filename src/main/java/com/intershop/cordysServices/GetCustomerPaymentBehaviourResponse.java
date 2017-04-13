//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.13 at 01:29:05 PM IST 
//


package com.intershop.cordysServices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCustomerPaymentBehaviourResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCustomerPaymentBehaviourResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="CollectionAttempt" type="{urn:fiber.kpn.com:crm:frontdesk:data:v0}CollectionAttempt" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Error" type="{urn:fiber.kpn.com:crm:frontdesk:data:v0}GetCustomerPaymentBehaviourError"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCustomerPaymentBehaviourResponse", propOrder = {
    "collectionAttempt",
    "error"
})
public class GetCustomerPaymentBehaviourResponse {

    @XmlElement(name = "CollectionAttempt")
    protected List<CollectionAttempt> collectionAttempt;
    @XmlElement(name = "Error")
    @XmlSchemaType(name = "string")
    protected GetCustomerPaymentBehaviourError error;

    /**
     * Gets the value of the collectionAttempt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collectionAttempt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCollectionAttempt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CollectionAttempt }
     * 
     * 
     */
    public List<CollectionAttempt> getCollectionAttempt() {
        if (collectionAttempt == null) {
            collectionAttempt = new ArrayList<CollectionAttempt>();
        }
        return this.collectionAttempt;
    }

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link GetCustomerPaymentBehaviourError }
     *     
     */
    public GetCustomerPaymentBehaviourError getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCustomerPaymentBehaviourError }
     *     
     */
    public void setError(GetCustomerPaymentBehaviourError value) {
        this.error = value;
    }

}
