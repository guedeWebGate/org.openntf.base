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
 * <p>Java class for pardef.hide.tokens.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="pardef.hide.tokens">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="read"/>
 *     &lt;enumeration value="edit"/>
 *     &lt;enumeration value="print"/>
 *     &lt;enumeration value="copy"/>
 *     &lt;enumeration value="preview"/>
 *     &lt;enumeration value="previewedit"/>
 *     &lt;enumeration value="notes"/>
 *     &lt;enumeration value="web"/>
 *     &lt;enumeration value="mobile"/>
 *     &lt;enumeration value="embedded"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "pardef.hide.tokens", namespace = "http://www.lotus.com/dxl")
@XmlEnum
public enum PardefHideTokens {

    @XmlEnumValue("read")
    READ("read"),
    @XmlEnumValue("edit")
    EDIT("edit"),
    @XmlEnumValue("print")
    PRINT("print"),
    @XmlEnumValue("copy")
    COPY("copy"),
    @XmlEnumValue("preview")
    PREVIEW("preview"),
    @XmlEnumValue("previewedit")
    PREVIEWEDIT("previewedit"),
    @XmlEnumValue("notes")
    NOTES("notes"),
    @XmlEnumValue("web")
    WEB("web"),
    @XmlEnumValue("mobile")
    MOBILE("mobile"),
    @XmlEnumValue("embedded")
    EMBEDDED("embedded");
    private final String value;

    PardefHideTokens(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PardefHideTokens fromValue(String v) {
        for (PardefHideTokens c: PardefHideTokens.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
