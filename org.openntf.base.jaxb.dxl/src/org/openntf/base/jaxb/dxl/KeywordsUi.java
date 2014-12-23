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
 * <p>Java class for keywords.ui.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="keywords.ui">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="dialoglist"/>
 *     &lt;enumeration value="checkbox"/>
 *     &lt;enumeration value="radiobutton"/>
 *     &lt;enumeration value="combobox"/>
 *     &lt;enumeration value="listbox"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "keywords.ui", namespace = "http://www.lotus.com/dxl")
@XmlEnum
public enum KeywordsUi {

    @XmlEnumValue("dialoglist")
    DIALOGLIST("dialoglist"),
    @XmlEnumValue("checkbox")
    CHECKBOX("checkbox"),
    @XmlEnumValue("radiobutton")
    RADIOBUTTON("radiobutton"),
    @XmlEnumValue("combobox")
    COMBOBOX("combobox"),
    @XmlEnumValue("listbox")
    LISTBOX("listbox");
    private final String value;

    KeywordsUi(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static KeywordsUi fromValue(String v) {
        for (KeywordsUi c: KeywordsUi.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
