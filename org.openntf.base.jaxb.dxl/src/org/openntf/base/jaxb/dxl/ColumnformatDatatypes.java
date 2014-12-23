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
 * <p>Java class for columnformat.datatypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="columnformat.datatypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="text"/>
 *     &lt;enumeration value="datetime"/>
 *     &lt;enumeration value="number"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "columnformat.datatypes", namespace = "http://www.lotus.com/dxl")
@XmlEnum
public enum ColumnformatDatatypes {

    @XmlEnumValue("text")
    TEXT("text"),
    @XmlEnumValue("datetime")
    DATETIME("datetime"),
    @XmlEnumValue("number")
    NUMBER("number");
    private final String value;

    ColumnformatDatatypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ColumnformatDatatypes fromValue(String v) {
        for (ColumnformatDatatypes c: ColumnformatDatatypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}