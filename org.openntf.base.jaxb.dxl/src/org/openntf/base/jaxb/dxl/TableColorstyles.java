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
 * <p>Java class for table.colorstyles.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="table.colorstyles">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="solid"/>
 *     &lt;enumeration value="altrows"/>
 *     &lt;enumeration value="altcolumns"/>
 *     &lt;enumeration value="lefttop"/>
 *     &lt;enumeration value="left"/>
 *     &lt;enumeration value="righttop"/>
 *     &lt;enumeration value="right"/>
 *     &lt;enumeration value="top"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "table.colorstyles", namespace = "http://www.lotus.com/dxl")
@XmlEnum
public enum TableColorstyles {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("solid")
    SOLID("solid"),
    @XmlEnumValue("altrows")
    ALTROWS("altrows"),
    @XmlEnumValue("altcolumns")
    ALTCOLUMNS("altcolumns"),
    @XmlEnumValue("lefttop")
    LEFTTOP("lefttop"),
    @XmlEnumValue("left")
    LEFT("left"),
    @XmlEnumValue("righttop")
    RIGHTTOP("righttop"),
    @XmlEnumValue("right")
    RIGHT("right"),
    @XmlEnumValue("top")
    TOP("top");
    private final String value;

    TableColorstyles(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TableColorstyles fromValue(String v) {
        for (TableColorstyles c: TableColorstyles.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
