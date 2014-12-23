//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.23 at 02:06:11 PM CET 
//


package org.openntf.base.jaxb.dxl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for calendarformat.formats.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="calendarformat.formats">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="twoday"/>
 *     &lt;enumeration value="oneweek"/>
 *     &lt;enumeration value="twoweek"/>
 *     &lt;enumeration value="onemonth"/>
 *     &lt;enumeration value="oneyear"/>
 *     &lt;enumeration value="oneday"/>
 *     &lt;enumeration value="workweek"/>
 *     &lt;enumeration value="all"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "calendarformat.formats", namespace = "http://www.lotus.com/dxl")
@XmlEnum
public enum CalendarformatFormats {

    @XmlEnumValue("twoday")
    TWODAY("twoday"),
    @XmlEnumValue("oneweek")
    ONEWEEK("oneweek"),
    @XmlEnumValue("twoweek")
    TWOWEEK("twoweek"),
    @XmlEnumValue("onemonth")
    ONEMONTH("onemonth"),
    @XmlEnumValue("oneyear")
    ONEYEAR("oneyear"),
    @XmlEnumValue("oneday")
    ONEDAY("oneday"),
    @XmlEnumValue("workweek")
    WORKWEEK("workweek"),
    @XmlEnumValue("all")
    ALL("all");
    private final String value;

    CalendarformatFormats(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CalendarformatFormats fromValue(String v) {
        for (CalendarformatFormats c: CalendarformatFormats.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}