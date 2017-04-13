//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.13 at 01:29:05 PM IST 
//


package com.intershop.cordysServices;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderMethod.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OrderMethod"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RB"/&gt;
 *     &lt;enumeration value="IN"/&gt;
 *     &lt;enumeration value="CH-A"/&gt;
 *     &lt;enumeration value="CH-S"/&gt;
 *     &lt;enumeration value="MO"/&gt;
 *     &lt;enumeration value="AD-A"/&gt;
 *     &lt;enumeration value="AD-S"/&gt;
 *     &lt;enumeration value="NA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OrderMethod")
@XmlEnum
public enum OrderMethod {

    RB("RB"),
    IN("IN"),
    @XmlEnumValue("CH-A")
    CH_A("CH-A"),
    @XmlEnumValue("CH-S")
    CH_S("CH-S"),
    MO("MO"),
    @XmlEnumValue("AD-A")
    AD_A("AD-A"),
    @XmlEnumValue("AD-S")
    AD_S("AD-S"),
    NA("NA");
    private final String value;

    OrderMethod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OrderMethod fromValue(String v) {
        for (OrderMethod c: OrderMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
