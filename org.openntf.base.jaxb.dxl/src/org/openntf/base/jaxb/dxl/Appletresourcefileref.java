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
 * <p>Java class for appletresourcefileref complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="appletresourcefileref">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="database" type="{http://www.lotus.com/dxl}noteshex" />
 *       &lt;attribute name="appletresource" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="file" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "appletresourcefileref", namespace = "http://www.lotus.com/dxl")
public class Appletresourcefileref {

    @XmlAttribute
    protected String database;
    @XmlAttribute(required = true)
    protected String appletresource;
    @XmlAttribute(required = true)
    protected String file;

    /**
     * Gets the value of the database property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatabase() {
        return database;
    }

    /**
     * Sets the value of the database property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatabase(String value) {
        this.database = value;
    }

    /**
     * Gets the value of the appletresource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppletresource() {
        return appletresource;
    }

    /**
     * Sets the value of the appletresource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppletresource(String value) {
        this.appletresource = value;
    }

    /**
     * Gets the value of the file property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFile() {
        return file;
    }

    /**
     * Sets the value of the file property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFile(String value) {
        this.file = value;
    }

}