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
 * <p>Java class for form.contextpanes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="form.contextpanes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="hide"/>
 *     &lt;enumeration value="link"/>
 *     &lt;enumeration value="parent"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "form.contextpanes", namespace = "http://www.lotus.com/dxl")
@XmlEnum
public enum FormContextpanes {

    @XmlEnumValue("hide")
    HIDE("hide"),
    @XmlEnumValue("link")
    LINK("link"),
    @XmlEnumValue("parent")
    PARENT("parent");
    private final String value;

    FormContextpanes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FormContextpanes fromValue(String v) {
        for (FormContextpanes c: FormContextpanes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}