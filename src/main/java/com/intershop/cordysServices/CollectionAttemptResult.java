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
 * <p>Java class for CollectionAttemptResult.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CollectionAttemptResult"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Failed"/&gt;
 *     &lt;enumeration value="Succesfull"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CollectionAttemptResult")
@XmlEnum
public enum CollectionAttemptResult {

    @XmlEnumValue("Failed")
    FAILED("Failed"),
    @XmlEnumValue("Succesfull")
    SUCCESFULL("Succesfull");
    private final String value;

    CollectionAttemptResult(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CollectionAttemptResult fromValue(String v) {
        for (CollectionAttemptResult c: CollectionAttemptResult.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
