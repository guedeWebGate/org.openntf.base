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
 * <p>Java class for form.inheritdocs.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="form.inheritdocs">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="link"/>
 *     &lt;enumeration value="richtext"/>
 *     &lt;enumeration value="collapsed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "form.inheritdocs", namespace = "http://www.lotus.com/dxl")
@XmlEnum
public enum FormInheritdocs {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("link")
    LINK("link"),
    @XmlEnumValue("richtext")
    RICHTEXT("richtext"),
    @XmlEnumValue("collapsed")
    COLLAPSED("collapsed");
    private final String value;

    FormInheritdocs(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FormInheritdocs fromValue(String v) {
        for (FormInheritdocs c: FormInheritdocs.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}