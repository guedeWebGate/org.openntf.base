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


/**
 * <p>Java class for nativeimage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="nativeimage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="imagetype" type="{http://www.lotus.com/dxl}image.type" />
 *       &lt;attribute name="imagename" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nativeimage", namespace = "http://www.lotus.com/dxl")
public class Nativeimage {

    @XmlAttribute
    protected ImageType imagetype;
    @XmlAttribute
    protected String imagename;

    /**
     * Gets the value of the imagetype property.
     * 
     * @return
     *     possible object is
     *     {@link ImageType }
     *     
     */
    public ImageType getImagetype() {
        return imagetype;
    }

    /**
     * Sets the value of the imagetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageType }
     *     
     */
    public void setImagetype(ImageType value) {
        this.imagetype = value;
    }

    /**
     * Gets the value of the imagename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImagename() {
        return imagename;
    }

    /**
     * Sets the value of the imagename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImagename(String value) {
        this.imagename = value;
    }

}