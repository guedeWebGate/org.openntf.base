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
 * <p>Java class for dataconnection.ondatamismatch.values.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dataconnection.ondatamismatch.values">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="error"/>
 *     &lt;enumeration value="precisionloss"/>
 *     &lt;enumeration value="datatruncation"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dataconnection.ondatamismatch.values", namespace = "http://www.lotus.com/dxl")
@XmlEnum
public enum DataconnectionOndatamismatchValues {

    @XmlEnumValue("error")
    ERROR("error"),
    @XmlEnumValue("precisionloss")
    PRECISIONLOSS("precisionloss"),
    @XmlEnumValue("datatruncation")
    DATATRUNCATION("datatruncation");
    private final String value;

    DataconnectionOndatamismatchValues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataconnectionOndatamismatchValues fromValue(String v) {
        for (DataconnectionOndatamismatchValues c: DataconnectionOndatamismatchValues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
