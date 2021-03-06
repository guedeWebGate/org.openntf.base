//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.23 at 02:06:11 PM CET 
//


package org.openntf.base.jaxb.dxl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for jpeg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="jpeg">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>base64Binary">
 *       &lt;attribute name="originalformat" type="{http://www.lotus.com/dxl}image.original.formats" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "jpeg", namespace = "http://www.lotus.com/dxl", propOrder = {
    "value"
})
public class Jpeg {

    @XmlValue
    protected byte[] value;
    @XmlAttribute
    protected ImageOriginalFormats originalformat;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setValue(byte[] value) {
        this.value = ((byte[]) value);
    }

    /**
     * Gets the value of the originalformat property.
     * 
     * @return
     *     possible object is
     *     {@link ImageOriginalFormats }
     *     
     */
    public ImageOriginalFormats getOriginalformat() {
        return originalformat;
    }

    /**
     * Sets the value of the originalformat property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageOriginalFormats }
     *     
     */
    public void setOriginalformat(ImageOriginalFormats value) {
        this.originalformat = value;
    }

}
