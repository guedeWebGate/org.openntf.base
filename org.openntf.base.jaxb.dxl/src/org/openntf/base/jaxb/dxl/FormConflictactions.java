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
 * <p>Java class for form.conflictactions.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="form.conflictactions">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="createconflicts"/>
 *     &lt;enumeration value="donotcreateconflicts"/>
 *     &lt;enumeration value="mergeconflicts"/>
 *     &lt;enumeration value="mergenoconflicts"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "form.conflictactions", namespace = "http://www.lotus.com/dxl")
@XmlEnum
public enum FormConflictactions {

    @XmlEnumValue("createconflicts")
    CREATECONFLICTS("createconflicts"),
    @XmlEnumValue("donotcreateconflicts")
    DONOTCREATECONFLICTS("donotcreateconflicts"),
    @XmlEnumValue("mergeconflicts")
    MERGECONFLICTS("mergeconflicts"),
    @XmlEnumValue("mergenoconflicts")
    MERGENOCONFLICTS("mergenoconflicts");
    private final String value;

    FormConflictactions(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FormConflictactions fromValue(String v) {
        for (FormConflictactions c: FormConflictactions.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
