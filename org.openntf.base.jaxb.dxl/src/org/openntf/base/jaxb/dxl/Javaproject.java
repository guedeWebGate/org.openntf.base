//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.23 at 02:06:11 PM CET 
//


package org.openntf.base.jaxb.dxl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for javaproject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="javaproject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="java" type="{http://www.lotus.com/dxl}java"/>
 *         &lt;element name="javaresource" type="{http://www.lotus.com/dxl}javaresource"/>
 *         &lt;element name="javaarchive" type="{http://www.lotus.com/dxl}javaarchive"/>
 *         &lt;element name="sharedlibraryref" type="{http://www.lotus.com/dxl}sharedlibraryref"/>
 *         &lt;element name="appletresourcefileref" type="{http://www.lotus.com/dxl}appletresourcefileref"/>
 *       &lt;/choice>
 *       &lt;attribute name="class" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="codepath" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="imported" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="compiledebug" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "javaproject", namespace = "http://www.lotus.com/dxl", propOrder = {
    "javaOrJavaresourceOrJavaarchive"
})
public class Javaproject {

    @XmlElements({
        @XmlElement(name = "javaarchive", type = Javaarchive.class),
        @XmlElement(name = "javaresource", type = Javaresource.class),
        @XmlElement(name = "java", type = Java.class),
        @XmlElement(name = "appletresourcefileref", type = Appletresourcefileref.class),
        @XmlElement(name = "sharedlibraryref", type = Sharedlibraryref.class)
    })
    protected List<java.lang.Object> javaOrJavaresourceOrJavaarchive;
    @XmlAttribute(name = "class")
    protected String clazz;
    @XmlAttribute
    protected String codepath;
    @XmlAttribute
    protected Boolean imported;
    @XmlAttribute
    protected Boolean compiledebug;

    /**
     * Gets the value of the javaOrJavaresourceOrJavaarchive property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the javaOrJavaresourceOrJavaarchive property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJavaOrJavaresourceOrJavaarchive().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Javaarchive }
     * {@link Javaresource }
     * {@link Java }
     * {@link Appletresourcefileref }
     * {@link Sharedlibraryref }
     * 
     * 
     */
    public List<java.lang.Object> getJavaOrJavaresourceOrJavaarchive() {
        if (javaOrJavaresourceOrJavaarchive == null) {
            javaOrJavaresourceOrJavaarchive = new ArrayList<java.lang.Object>();
        }
        return this.javaOrJavaresourceOrJavaarchive;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClazz(String value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the codepath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodepath() {
        return codepath;
    }

    /**
     * Sets the value of the codepath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodepath(String value) {
        this.codepath = value;
    }

    /**
     * Gets the value of the imported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isImported() {
        if (imported == null) {
            return false;
        } else {
            return imported;
        }
    }

    /**
     * Sets the value of the imported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setImported(Boolean value) {
        this.imported = value;
    }

    /**
     * Gets the value of the compiledebug property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCompiledebug() {
        return compiledebug;
    }

    /**
     * Sets the value of the compiledebug property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCompiledebug(Boolean value) {
        this.compiledebug = value;
    }

}
