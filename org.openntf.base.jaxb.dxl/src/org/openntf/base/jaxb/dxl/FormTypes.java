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
 * <p>Java class for form.types.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="form.types">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="document"/>
 *     &lt;enumeration value="response"/>
 *     &lt;enumeration value="responsetoresponse"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "form.types", namespace = "http://www.lotus.com/dxl")
@XmlEnum
public enum FormTypes {

    @XmlEnumValue("document")
    DOCUMENT("document"),
    @XmlEnumValue("response")
    RESPONSE("response"),
    @XmlEnumValue("responsetoresponse")
    RESPONSETORESPONSE("responsetoresponse");
    private final String value;

    FormTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FormTypes fromValue(String v) {
        for (FormTypes c: FormTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
