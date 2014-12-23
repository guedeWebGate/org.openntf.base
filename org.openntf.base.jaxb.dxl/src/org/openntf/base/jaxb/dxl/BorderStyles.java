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
 * <p>Java class for border.styles.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="border.styles">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="solid"/>
 *     &lt;enumeration value="double"/>
 *     &lt;enumeration value="dot"/>
 *     &lt;enumeration value="dash"/>
 *     &lt;enumeration value="inset"/>
 *     &lt;enumeration value="outset"/>
 *     &lt;enumeration value="ridge"/>
 *     &lt;enumeration value="groove"/>
 *     &lt;enumeration value="picture"/>
 *     &lt;enumeration value="image"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "border.styles", namespace = "http://www.lotus.com/dxl")
@XmlEnum
public enum BorderStyles {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("solid")
    SOLID("solid"),
    @XmlEnumValue("double")
    DOUBLE("double"),
    @XmlEnumValue("dot")
    DOT("dot"),
    @XmlEnumValue("dash")
    DASH("dash"),
    @XmlEnumValue("inset")
    INSET("inset"),
    @XmlEnumValue("outset")
    OUTSET("outset"),
    @XmlEnumValue("ridge")
    RIDGE("ridge"),
    @XmlEnumValue("groove")
    GROOVE("groove"),
    @XmlEnumValue("picture")
    PICTURE("picture"),
    @XmlEnumValue("image")
    IMAGE("image");
    private final String value;

    BorderStyles(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BorderStyles fromValue(String v) {
        for (BorderStyles c: BorderStyles.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}