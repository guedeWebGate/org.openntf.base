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
 * <p>Java class for acl.levels.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="acl.levels">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="noaccess"/>
 *     &lt;enumeration value="depositor"/>
 *     &lt;enumeration value="reader"/>
 *     &lt;enumeration value="author"/>
 *     &lt;enumeration value="editor"/>
 *     &lt;enumeration value="designer"/>
 *     &lt;enumeration value="manager"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "acl.levels", namespace = "http://www.lotus.com/dxl")
@XmlEnum
public enum AclLevels {

    @XmlEnumValue("noaccess")
    NOACCESS("noaccess"),
    @XmlEnumValue("depositor")
    DEPOSITOR("depositor"),
    @XmlEnumValue("reader")
    READER("reader"),
    @XmlEnumValue("author")
    AUTHOR("author"),
    @XmlEnumValue("editor")
    EDITOR("editor"),
    @XmlEnumValue("designer")
    DESIGNER("designer"),
    @XmlEnumValue("manager")
    MANAGER("manager");
    private final String value;

    AclLevels(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AclLevels fromValue(String v) {
        for (AclLevels c: AclLevels.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}