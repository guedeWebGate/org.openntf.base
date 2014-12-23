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
 * <p>Java class for highlights.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="highlights">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="yellow"/>
 *     &lt;enumeration value="pink"/>
 *     &lt;enumeration value="blue"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "highlights", namespace = "http://www.lotus.com/dxl")
@XmlEnum
public enum Highlights {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("yellow")
    YELLOW("yellow"),
    @XmlEnumValue("pink")
    PINK("pink"),
    @XmlEnumValue("blue")
    BLUE("blue");
    private final String value;

    Highlights(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Highlights fromValue(String v) {
        for (Highlights c: Highlights.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
