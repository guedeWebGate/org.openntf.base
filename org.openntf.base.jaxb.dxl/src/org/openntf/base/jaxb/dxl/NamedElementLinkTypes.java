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
 * <p>Java class for named.element.link.types.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="named.element.link.types">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="page"/>
 *     &lt;enumeration value="form"/>
 *     &lt;enumeration value="frameset"/>
 *     &lt;enumeration value="view"/>
 *     &lt;enumeration value="folder"/>
 *     &lt;enumeration value="navigator"/>
 *     &lt;enumeration value="unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "named.element.link.types", namespace = "http://www.lotus.com/dxl")
@XmlEnum
public enum NamedElementLinkTypes {

    @XmlEnumValue("page")
    PAGE("page"),
    @XmlEnumValue("form")
    FORM("form"),
    @XmlEnumValue("frameset")
    FRAMESET("frameset"),
    @XmlEnumValue("view")
    VIEW("view"),
    @XmlEnumValue("folder")
    FOLDER("folder"),
    @XmlEnumValue("navigator")
    NAVIGATOR("navigator"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    NamedElementLinkTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NamedElementLinkTypes fromValue(String v) {
        for (NamedElementLinkTypes c: NamedElementLinkTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
