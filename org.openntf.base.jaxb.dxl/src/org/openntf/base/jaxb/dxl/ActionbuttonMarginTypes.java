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
 * <p>Java class for actionbutton.margin.types.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="actionbutton.margin.types">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="default"/>
 *     &lt;enumeration value="fixed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "actionbutton.margin.types", namespace = "http://www.lotus.com/dxl")
@XmlEnum
public enum ActionbuttonMarginTypes {

    @XmlEnumValue("default")
    DEFAULT("default"),
    @XmlEnumValue("fixed")
    FIXED("fixed");
    private final String value;

    ActionbuttonMarginTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ActionbuttonMarginTypes fromValue(String v) {
        for (ActionbuttonMarginTypes c: ActionbuttonMarginTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}