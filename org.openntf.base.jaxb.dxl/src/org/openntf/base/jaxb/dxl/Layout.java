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
 * <p>Java class for layout complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="layout">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="heighttype" type="{http://www.lotus.com/dxl}eoutline.height.types" default="fitcontent" />
 *       &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="entryhoffset" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="entryvoffset" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="imagehoffset" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="imagevoffset" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="imagealign" type="{http://www.lotus.com/dxl}complex.aligns" default="topleft" />
 *       &lt;attribute name="labelhoffset" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="labelvoffset" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="labelalign" type="{http://www.lotus.com/dxl}complex.aligns" default="topleft" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "layout", namespace = "http://www.lotus.com/dxl")
public class Layout {

    @XmlAttribute
    protected EoutlineHeightTypes heighttype;
    @XmlAttribute
    protected String height;
    @XmlAttribute
    protected String entryhoffset;
    @XmlAttribute
    protected String entryvoffset;
    @XmlAttribute
    protected String imagehoffset;
    @XmlAttribute
    protected String imagevoffset;
    @XmlAttribute
    protected ComplexAligns imagealign;
    @XmlAttribute
    protected String labelhoffset;
    @XmlAttribute
    protected String labelvoffset;
    @XmlAttribute
    protected ComplexAligns labelalign;

    /**
     * Gets the value of the heighttype property.
     * 
     * @return
     *     possible object is
     *     {@link EoutlineHeightTypes }
     *     
     */
    public EoutlineHeightTypes getHeighttype() {
        if (heighttype == null) {
            return EoutlineHeightTypes.FITCONTENT;
        } else {
            return heighttype;
        }
    }

    /**
     * Sets the value of the heighttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link EoutlineHeightTypes }
     *     
     */
    public void setHeighttype(EoutlineHeightTypes value) {
        this.heighttype = value;
    }

    /**
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeight(String value) {
        this.height = value;
    }

    /**
     * Gets the value of the entryhoffset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntryhoffset() {
        return entryhoffset;
    }

    /**
     * Sets the value of the entryhoffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntryhoffset(String value) {
        this.entryhoffset = value;
    }

    /**
     * Gets the value of the entryvoffset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntryvoffset() {
        return entryvoffset;
    }

    /**
     * Sets the value of the entryvoffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntryvoffset(String value) {
        this.entryvoffset = value;
    }

    /**
     * Gets the value of the imagehoffset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImagehoffset() {
        return imagehoffset;
    }

    /**
     * Sets the value of the imagehoffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImagehoffset(String value) {
        this.imagehoffset = value;
    }

    /**
     * Gets the value of the imagevoffset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImagevoffset() {
        return imagevoffset;
    }

    /**
     * Sets the value of the imagevoffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImagevoffset(String value) {
        this.imagevoffset = value;
    }

    /**
     * Gets the value of the imagealign property.
     * 
     * @return
     *     possible object is
     *     {@link ComplexAligns }
     *     
     */
    public ComplexAligns getImagealign() {
        if (imagealign == null) {
            return ComplexAligns.TOPLEFT;
        } else {
            return imagealign;
        }
    }

    /**
     * Sets the value of the imagealign property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplexAligns }
     *     
     */
    public void setImagealign(ComplexAligns value) {
        this.imagealign = value;
    }

    /**
     * Gets the value of the labelhoffset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabelhoffset() {
        return labelhoffset;
    }

    /**
     * Sets the value of the labelhoffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabelhoffset(String value) {
        this.labelhoffset = value;
    }

    /**
     * Gets the value of the labelvoffset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabelvoffset() {
        return labelvoffset;
    }

    /**
     * Sets the value of the labelvoffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabelvoffset(String value) {
        this.labelvoffset = value;
    }

    /**
     * Gets the value of the labelalign property.
     * 
     * @return
     *     possible object is
     *     {@link ComplexAligns }
     *     
     */
    public ComplexAligns getLabelalign() {
        if (labelalign == null) {
            return ComplexAligns.TOPLEFT;
        } else {
            return labelalign;
        }
    }

    /**
     * Sets the value of the labelalign property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplexAligns }
     *     
     */
    public void setLabelalign(ComplexAligns value) {
        this.labelalign = value;
    }

}