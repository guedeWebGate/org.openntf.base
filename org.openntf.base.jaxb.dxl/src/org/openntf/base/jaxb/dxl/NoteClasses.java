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
 * <p>Java class for note.classes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="note.classes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="document"/>
 *     &lt;enumeration value="helpaboutdocument"/>
 *     &lt;enumeration value="form"/>
 *     &lt;enumeration value="view"/>
 *     &lt;enumeration value="icon"/>
 *     &lt;enumeration value="helpindex"/>
 *     &lt;enumeration value="helpusingdocument"/>
 *     &lt;enumeration value="filter"/>
 *     &lt;enumeration value="sharedfield"/>
 *     &lt;enumeration value="replicationformula"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "note.classes", namespace = "http://www.lotus.com/dxl")
@XmlEnum
public enum NoteClasses {

    @XmlEnumValue("document")
    DOCUMENT("document"),
    @XmlEnumValue("helpaboutdocument")
    HELPABOUTDOCUMENT("helpaboutdocument"),
    @XmlEnumValue("form")
    FORM("form"),
    @XmlEnumValue("view")
    VIEW("view"),
    @XmlEnumValue("icon")
    ICON("icon"),
    @XmlEnumValue("helpindex")
    HELPINDEX("helpindex"),
    @XmlEnumValue("helpusingdocument")
    HELPUSINGDOCUMENT("helpusingdocument"),
    @XmlEnumValue("filter")
    FILTER("filter"),
    @XmlEnumValue("sharedfield")
    SHAREDFIELD("sharedfield"),
    @XmlEnumValue("replicationformula")
    REPLICATIONFORMULA("replicationformula");
    private final String value;

    NoteClasses(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NoteClasses fromValue(String v) {
        for (NoteClasses c: NoteClasses.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
