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
 * <p>Java class for field.limitinput.kinds.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="field.limitinput.kinds">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="picture"/>
 *     &lt;enumeration value="sharedimage"/>
 *     &lt;enumeration value="attachment"/>
 *     &lt;enumeration value="view"/>
 *     &lt;enumeration value="datepicker"/>
 *     &lt;enumeration value="sharedapplet"/>
 *     &lt;enumeration value="text"/>
 *     &lt;enumeration value="object"/>
 *     &lt;enumeration value="calendar"/>
 *     &lt;enumeration value="inbox"/>
 *     &lt;enumeration value="graphic"/>
 *     &lt;enumeration value="link"/>
 *     &lt;enumeration value="thumbnail"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "field.limitinput.kinds", namespace = "http://www.lotus.com/dxl")
@XmlEnum
public enum FieldLimitinputKinds {

    @XmlEnumValue("picture")
    PICTURE("picture"),
    @XmlEnumValue("sharedimage")
    SHAREDIMAGE("sharedimage"),
    @XmlEnumValue("attachment")
    ATTACHMENT("attachment"),
    @XmlEnumValue("view")
    VIEW("view"),
    @XmlEnumValue("datepicker")
    DATEPICKER("datepicker"),
    @XmlEnumValue("sharedapplet")
    SHAREDAPPLET("sharedapplet"),
    @XmlEnumValue("text")
    TEXT("text"),
    @XmlEnumValue("object")
    OBJECT("object"),
    @XmlEnumValue("calendar")
    CALENDAR("calendar"),
    @XmlEnumValue("inbox")
    INBOX("inbox"),
    @XmlEnumValue("graphic")
    GRAPHIC("graphic"),
    @XmlEnumValue("link")
    LINK("link"),
    @XmlEnumValue("thumbnail")
    THUMBNAIL("thumbnail");
    private final String value;

    FieldLimitinputKinds(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FieldLimitinputKinds fromValue(String v) {
        for (FieldLimitinputKinds c: FieldLimitinputKinds.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
