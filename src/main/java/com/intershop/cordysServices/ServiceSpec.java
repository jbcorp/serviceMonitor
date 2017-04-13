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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceSpec complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceSpec"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:fiber.kpn.com:crm:frontdesk:data:v0}ServiceBare"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Product" type="{urn:fiber.kpn.com:crm:frontdesk:data:v0}InstalledBaseProduct" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceSpec", propOrder = {
    "product"
})
@XmlSeeAlso({
    InternetService.class,
    InternetService2 .class,
    VoiceService.class,
    DigitenneService.class,
    MailService.class,
    ItvService.class
})
public class ServiceSpec
    extends ServiceBare
{

    @XmlElement(name = "Product")
    protected List<InstalledBaseProduct> product;

    /**
     * Gets the value of the product property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the product property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstalledBaseProduct }
     * 
     * 
     */
    public List<InstalledBaseProduct> getProduct() {
        if (product == null) {
            product = new ArrayList<InstalledBaseProduct>();
        }
        return this.product;
    }

}
