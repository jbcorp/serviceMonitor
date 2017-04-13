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
 * <p>Java class for ProductCategory.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProductCategory"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AccessHardware"/&gt;
 *     &lt;enumeration value="ATVAccount"/&gt;
 *     &lt;enumeration value="ATVChannels"/&gt;
 *     &lt;enumeration value="Administrative"/&gt;
 *     &lt;enumeration value="BillingService"/&gt;
 *     &lt;enumeration value="Category"/&gt;
 *     &lt;enumeration value="Delivery"/&gt;
 *     &lt;enumeration value="DigitenneAccount"/&gt;
 *     &lt;enumeration value="DigitenneChannels"/&gt;
 *     &lt;enumeration value="DigitenneHardware"/&gt;
 *     &lt;enumeration value="DigitenneSlot"/&gt;
 *     &lt;enumeration value="EmailAccount"/&gt;
 *     &lt;enumeration value="Engineer"/&gt;
 *     &lt;enumeration value="IPAlarmering"/&gt;
 *     &lt;enumeration value="ITVAccount"/&gt;
 *     &lt;enumeration value="ITVChannels"/&gt;
 *     &lt;enumeration value="ITVHarddiskRecorder"/&gt;
 *     &lt;enumeration value="ITVSwitch"/&gt;
 *     &lt;enumeration value="ITVHomePlug"/&gt;
 *     &lt;enumeration value="ITVLeaflet"/&gt;
 *     &lt;enumeration value="ITVUsage"/&gt;
 *     &lt;enumeration value="ITVVideos"/&gt;
 *     &lt;enumeration value="Internet"/&gt;
 *     &lt;enumeration value="PCSecureAccount"/&gt;
 *     &lt;enumeration value="PCSecureLicence"/&gt;
 *     &lt;enumeration value="PackageDiscount"/&gt;
 *     &lt;enumeration value="Post"/&gt;
 *     &lt;enumeration value="Postplus"/&gt;
 *     &lt;enumeration value="Promo"/&gt;
 *     &lt;enumeration value="SpecialPriceOneTime"/&gt;
 *     &lt;enumeration value="SpecialPriceRecurring"/&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *     &lt;enumeration value="VoiceAccount"/&gt;
 *     &lt;enumeration value="VoiceUsage"/&gt;
 *     &lt;enumeration value="Promotion"/&gt;
 *     &lt;enumeration value="Package"/&gt;
 *     &lt;enumeration value="AdditionalCost"/&gt;
 *     &lt;enumeration value="Add-on"/&gt;
 *     &lt;enumeration value="Service"/&gt;
 *     &lt;enumeration value="Discount"/&gt;
 *     &lt;enumeration value="Alarm"/&gt;
 *     &lt;enumeration value="Billing"/&gt;
 *     &lt;enumeration value="DVB-T"/&gt;
 *     &lt;enumeration value="I-TV"/&gt;
 *     &lt;enumeration value="Mobiel"/&gt;
 *     &lt;enumeration value="PC Veilig"/&gt;
 *     &lt;enumeration value="Service Thuis"/&gt;
 *     &lt;enumeration value="VOIP"/&gt;
 *     &lt;enumeration value="LACCESS"/&gt;
 *     &lt;enumeration value="ENGINEERFULL"/&gt;
 *     &lt;enumeration value="LMOBILE"/&gt;
 *     &lt;enumeration value="LMAP"/&gt;
 *     &lt;enumeration value="LITVADDITIONAL"/&gt;
 *     &lt;enumeration value="EquipmentManagement"/&gt;
 *     &lt;enumeration value="LINTERNET"/&gt;
 *     &lt;enumeration value="FACCESS"/&gt;
 *     &lt;enumeration value="VACCESS"/&gt;
 *     &lt;enumeration value="N.a."/&gt;
 *     &lt;enumeration value="ACCESS"/&gt;
 *     &lt;enumeration value="ACCESSCUSTOMER"/&gt;
 *     &lt;enumeration value="Connection"/&gt;
 *     &lt;enumeration value="InstallationManual"/&gt;
 *     &lt;enumeration value="InternetAccess"/&gt;
 *     &lt;enumeration value="InternetInstallationPackage"/&gt;
 *     &lt;enumeration value="Intranet"/&gt;
 *     &lt;enumeration value="Modem"/&gt;
 *     &lt;enumeration value="NetworkTerminationUnit"/&gt;
 *     &lt;enumeration value="Internet - Overig"/&gt;
 *     &lt;enumeration value="KPN Veilig"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ProductCategory")
@XmlEnum
public enum ProductCategory {

    @XmlEnumValue("AccessHardware")
    ACCESS_HARDWARE("AccessHardware"),
    @XmlEnumValue("ATVAccount")
    ATV_ACCOUNT("ATVAccount"),
    @XmlEnumValue("ATVChannels")
    ATV_CHANNELS("ATVChannels"),
    @XmlEnumValue("Administrative")
    ADMINISTRATIVE("Administrative"),
    @XmlEnumValue("BillingService")
    BILLING_SERVICE("BillingService"),
    @XmlEnumValue("Category")
    CATEGORY("Category"),
    @XmlEnumValue("Delivery")
    DELIVERY("Delivery"),
    @XmlEnumValue("DigitenneAccount")
    DIGITENNE_ACCOUNT("DigitenneAccount"),
    @XmlEnumValue("DigitenneChannels")
    DIGITENNE_CHANNELS("DigitenneChannels"),
    @XmlEnumValue("DigitenneHardware")
    DIGITENNE_HARDWARE("DigitenneHardware"),
    @XmlEnumValue("DigitenneSlot")
    DIGITENNE_SLOT("DigitenneSlot"),
    @XmlEnumValue("EmailAccount")
    EMAIL_ACCOUNT("EmailAccount"),
    @XmlEnumValue("Engineer")
    ENGINEER("Engineer"),
    @XmlEnumValue("IPAlarmering")
    IP_ALARMERING("IPAlarmering"),
    @XmlEnumValue("ITVAccount")
    ITV_ACCOUNT("ITVAccount"),
    @XmlEnumValue("ITVChannels")
    ITV_CHANNELS("ITVChannels"),
    @XmlEnumValue("ITVHarddiskRecorder")
    ITV_HARDDISK_RECORDER("ITVHarddiskRecorder"),
    @XmlEnumValue("ITVSwitch")
    ITV_SWITCH("ITVSwitch"),
    @XmlEnumValue("ITVHomePlug")
    ITV_HOME_PLUG("ITVHomePlug"),
    @XmlEnumValue("ITVLeaflet")
    ITV_LEAFLET("ITVLeaflet"),
    @XmlEnumValue("ITVUsage")
    ITV_USAGE("ITVUsage"),
    @XmlEnumValue("ITVVideos")
    ITV_VIDEOS("ITVVideos"),
    @XmlEnumValue("Internet")
    INTERNET("Internet"),
    @XmlEnumValue("PCSecureAccount")
    PC_SECURE_ACCOUNT("PCSecureAccount"),
    @XmlEnumValue("PCSecureLicence")
    PC_SECURE_LICENCE("PCSecureLicence"),
    @XmlEnumValue("PackageDiscount")
    PACKAGE_DISCOUNT("PackageDiscount"),
    @XmlEnumValue("Post")
    POST("Post"),
    @XmlEnumValue("Postplus")
    POSTPLUS("Postplus"),
    @XmlEnumValue("Promo")
    PROMO("Promo"),
    @XmlEnumValue("SpecialPriceOneTime")
    SPECIAL_PRICE_ONE_TIME("SpecialPriceOneTime"),
    @XmlEnumValue("SpecialPriceRecurring")
    SPECIAL_PRICE_RECURRING("SpecialPriceRecurring"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("VoiceAccount")
    VOICE_ACCOUNT("VoiceAccount"),
    @XmlEnumValue("VoiceUsage")
    VOICE_USAGE("VoiceUsage"),
    @XmlEnumValue("Promotion")
    PROMOTION("Promotion"),
    @XmlEnumValue("Package")
    PACKAGE("Package"),
    @XmlEnumValue("AdditionalCost")
    ADDITIONAL_COST("AdditionalCost"),
    @XmlEnumValue("Add-on")
    ADD_ON("Add-on"),
    @XmlEnumValue("Service")
    SERVICE("Service"),
    @XmlEnumValue("Discount")
    DISCOUNT("Discount"),
    @XmlEnumValue("Alarm")
    ALARM("Alarm"),
    @XmlEnumValue("Billing")
    BILLING("Billing"),
    @XmlEnumValue("DVB-T")
    DVB_T("DVB-T"),
    @XmlEnumValue("I-TV")
    I_TV("I-TV"),
    @XmlEnumValue("Mobiel")
    MOBIEL("Mobiel"),
    @XmlEnumValue("PC Veilig")
    PC_VEILIG("PC Veilig"),
    @XmlEnumValue("Service Thuis")
    SERVICE_THUIS("Service Thuis"),
    VOIP("VOIP"),
    LACCESS("LACCESS"),
    ENGINEERFULL("ENGINEERFULL"),
    LMOBILE("LMOBILE"),
    LMAP("LMAP"),
    LITVADDITIONAL("LITVADDITIONAL"),
    @XmlEnumValue("EquipmentManagement")
    EQUIPMENT_MANAGEMENT("EquipmentManagement"),
    LINTERNET("LINTERNET"),
    FACCESS("FACCESS"),
    VACCESS("VACCESS"),
    @XmlEnumValue("N.a.")
    N_A("N.a."),
    ACCESS("ACCESS"),
    ACCESSCUSTOMER("ACCESSCUSTOMER"),
    @XmlEnumValue("Connection")
    CONNECTION("Connection"),
    @XmlEnumValue("InstallationManual")
    INSTALLATION_MANUAL("InstallationManual"),
    @XmlEnumValue("InternetAccess")
    INTERNET_ACCESS("InternetAccess"),
    @XmlEnumValue("InternetInstallationPackage")
    INTERNET_INSTALLATION_PACKAGE("InternetInstallationPackage"),
    @XmlEnumValue("Intranet")
    INTRANET("Intranet"),
    @XmlEnumValue("Modem")
    MODEM("Modem"),
    @XmlEnumValue("NetworkTerminationUnit")
    NETWORK_TERMINATION_UNIT("NetworkTerminationUnit"),
    @XmlEnumValue("Internet - Overig")
    INTERNET_OVERIG("Internet - Overig"),
    @XmlEnumValue("KPN Veilig")
    KPN_VEILIG("KPN Veilig");
    private final String value;

    ProductCategory(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProductCategory fromValue(String v) {
        for (ProductCategory c: ProductCategory.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}