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
 * <p>Java class for GetAvailablePlanDatesError.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GetAvailablePlanDatesError"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="GeneralError"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GetAvailablePlanDatesError")
@XmlEnum
public enum GetAvailablePlanDatesError {

    @XmlEnumValue("GeneralError")
    GENERAL_ERROR("GeneralError");
    private final String value;

    GetAvailablePlanDatesError(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GetAvailablePlanDatesError fromValue(String v) {
        for (GetAvailablePlanDatesError c: GetAvailablePlanDatesError.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}