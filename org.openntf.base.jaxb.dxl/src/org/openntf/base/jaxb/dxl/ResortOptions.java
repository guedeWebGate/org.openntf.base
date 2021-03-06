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
 * <p>Java class for resort.options.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="resort.options">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ascending"/>
 *     &lt;enumeration value="descending"/>
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="both"/>
 *     &lt;enumeration value="toview"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "resort.options", namespace = "http://www.lotus.com/dxl")
@XmlEnum
public enum ResortOptions {

    @XmlEnumValue("ascending")
    ASCENDING("ascending"),
    @XmlEnumValue("descending")
    DESCENDING("descending"),
    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("both")
    BOTH("both"),
    @XmlEnumValue("toview")
    TOVIEW("toview");
    private final String value;

    ResortOptions(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResortOptions fromValue(String v) {
        for (ResortOptions c: ResortOptions.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
