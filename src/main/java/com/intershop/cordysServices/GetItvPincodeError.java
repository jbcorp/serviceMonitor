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
 * <p>Java class for GetItvPincodeError.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GetItvPincodeError"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AuthenticationError"/&gt;
 *     &lt;enumeration value="MandatoryObjectError"/&gt;
 *     &lt;enumeration value="ObjectConstraintError"/&gt;
 *     &lt;enumeration value="ObjectSyntaxError"/&gt;
 *     &lt;enumeration value="ObjectUnknownError"/&gt;
 *     &lt;enumeration value="AccountUnknownError"/&gt;
 *     &lt;enumeration value="AccountStatusError"/&gt;
 *     &lt;enumeration value="ServiceUnknownError"/&gt;
 *     &lt;enumeration value="DatabaseError"/&gt;
 *     &lt;enumeration value="WebServiceError"/&gt;
 *     &lt;enumeration value="FileSystemError"/&gt;
 *     &lt;enumeration value="UnknownError"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GetItvPincodeError")
@XmlEnum
public enum GetItvPincodeError {

    @XmlEnumValue("AuthenticationError")
    AUTHENTICATION_ERROR("AuthenticationError"),
    @XmlEnumValue("MandatoryObjectError")
    MANDATORY_OBJECT_ERROR("MandatoryObjectError"),
    @XmlEnumValue("ObjectConstraintError")
    OBJECT_CONSTRAINT_ERROR("ObjectConstraintError"),
    @XmlEnumValue("ObjectSyntaxError")
    OBJECT_SYNTAX_ERROR("ObjectSyntaxError"),
    @XmlEnumValue("ObjectUnknownError")
    OBJECT_UNKNOWN_ERROR("ObjectUnknownError"),
    @XmlEnumValue("AccountUnknownError")
    ACCOUNT_UNKNOWN_ERROR("AccountUnknownError"),
    @XmlEnumValue("AccountStatusError")
    ACCOUNT_STATUS_ERROR("AccountStatusError"),
    @XmlEnumValue("ServiceUnknownError")
    SERVICE_UNKNOWN_ERROR("ServiceUnknownError"),
    @XmlEnumValue("DatabaseError")
    DATABASE_ERROR("DatabaseError"),
    @XmlEnumValue("WebServiceError")
    WEB_SERVICE_ERROR("WebServiceError"),
    @XmlEnumValue("FileSystemError")
    FILE_SYSTEM_ERROR("FileSystemError"),
    @XmlEnumValue("UnknownError")
    UNKNOWN_ERROR("UnknownError");
    private final String value;

    GetItvPincodeError(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GetItvPincodeError fromValue(String v) {
        for (GetItvPincodeError c: GetItvPincodeError.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
