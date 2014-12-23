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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for font complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="font">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="color" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="size" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="style" type="{http://www.w3.org/2001/XMLSchema}NMTOKENS" />
 *       &lt;attribute name="pitch" type="{http://www.lotus.com/dxl}font.pitches" />
 *       &lt;attribute name="truetype" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="familyid" type="{http://www.lotus.com/dxl}noteshex" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "font", namespace = "http://www.lotus.com/dxl")
public class Font {

    @XmlAttribute
    protected String name;
    @XmlAttribute
    protected String color;
    @XmlAttribute
    protected String size;
    @XmlAttribute
    @XmlSchemaType(name = "NMTOKENS")
    protected List<String> style;
    @XmlAttribute
    protected FontPitches pitch;
    @XmlAttribute
    protected Boolean truetype;
    @XmlAttribute
    protected String familyid;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the color property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the value of the color property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColor(String value) {
        this.color = value;
    }

    /**
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSize(String value) {
        this.size = value;
    }

    /**
     * Gets the value of the style property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the style property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStyle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getStyle() {
        if (style == null) {
            style = new ArrayList<String>();
        }
        return this.style;
    }

    /**
     * Gets the value of the pitch property.
     * 
     * @return
     *     possible object is
     *     {@link FontPitches }
     *     
     */
    public FontPitches getPitch() {
        return pitch;
    }

    /**
     * Sets the value of the pitch property.
     * 
     * @param value
     *     allowed object is
     *     {@link FontPitches }
     *     
     */
    public void setPitch(FontPitches value) {
        this.pitch = value;
    }

    /**
     * Gets the value of the truetype property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTruetype() {
        return truetype;
    }

    /**
     * Sets the value of the truetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTruetype(Boolean value) {
        this.truetype = value;
    }

    /**
     * Gets the value of the familyid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFamilyid() {
        return familyid;
    }

    /**
     * Sets the value of the familyid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamilyid(String value) {
        this.familyid = value;
    }

}