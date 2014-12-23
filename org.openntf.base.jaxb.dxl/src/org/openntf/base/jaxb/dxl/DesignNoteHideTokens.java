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
 * <p>Java class for design.note.hide.tokens.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="design.note.hide.tokens">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="v3"/>
 *     &lt;enumeration value="v4"/>
 *     &lt;enumeration value="v4strict"/>
 *     &lt;enumeration value="v5"/>
 *     &lt;enumeration value="notes"/>
 *     &lt;enumeration value="web"/>
 *     &lt;enumeration value="mobile"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "design.note.hide.tokens", namespace = "http://www.lotus.com/dxl")
@XmlEnum
public enum DesignNoteHideTokens {

    @XmlEnumValue("v3")
    V_3("v3"),
    @XmlEnumValue("v4")
    V_4("v4"),
    @XmlEnumValue("v4strict")
    V_4_STRICT("v4strict"),
    @XmlEnumValue("v5")
    V_5("v5"),
    @XmlEnumValue("notes")
    NOTES("notes"),
    @XmlEnumValue("web")
    WEB("web"),
    @XmlEnumValue("mobile")
    MOBILE("mobile");
    private final String value;

    DesignNoteHideTokens(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DesignNoteHideTokens fromValue(String v) {
        for (DesignNoteHideTokens c: DesignNoteHideTokens.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}