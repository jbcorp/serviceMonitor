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
 * <p>Java class for GlassAvailability.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GlassAvailability"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ZipCodeNotResolved"/&gt;
 *     &lt;enumeration value="GlassNotOrderable"/&gt;
 *     &lt;enumeration value="FTTC"/&gt;
 *     &lt;enumeration value="FTTH"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GlassAvailability")
@XmlEnum
public enum GlassAvailability {

    @XmlEnumValue("ZipCodeNotResolved")
    ZIP_CODE_NOT_RESOLVED("ZipCodeNotResolved"),
    @XmlEnumValue("GlassNotOrderable")
    GLASS_NOT_ORDERABLE("GlassNotOrderable"),
    FTTC("FTTC"),
    FTTH("FTTH");
    private final String value;

    GlassAvailability(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GlassAvailability fromValue(String v) {
        for (GlassAvailability c: GlassAvailability.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
