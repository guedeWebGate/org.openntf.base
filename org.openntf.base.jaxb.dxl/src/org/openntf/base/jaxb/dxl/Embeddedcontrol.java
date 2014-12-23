//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.23 at 02:06:11 PM CET 
//


package org.openntf.base.jaxb.dxl;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for embeddedcontrol complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="embeddedcontrol">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="text" type="{http://www.lotus.com/dxl}text" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="font" type="{http://www.lotus.com/dxl}font" minOccurs="0"/>
 *         &lt;element name="embeddedkeywords" type="{http://www.lotus.com/dxl}embeddedkeywords" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.lotus.com/dxl}reading.order.attrs"/>
 *       &lt;attribute name="type" type="{http://www.lotus.com/dxl}embeddedcontrol.type" />
 *       &lt;attribute name="borderstyle" type="{http://www.lotus.com/dxl}keywords.borders" />
 *       &lt;attribute name="columns" type="{http://www.w3.org/2001/XMLSchema}integer" default="1" />
 *       &lt;attribute name="alignwithbaseline" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="allowmultilines" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="widthtype" type="{http://www.lotus.com/dxl}embedded.fit.types" default="fixed" />
 *       &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bgcolor" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "embeddedcontrol", namespace = "http://www.lotus.com/dxl", propOrder = {
    "text",
    "font",
    "embeddedkeywords"
})
public class Embeddedcontrol {

    protected List<Text> text;
    protected Font font;
    protected Embeddedkeywords embeddedkeywords;
    @XmlAttribute
    protected EmbeddedcontrolType type;
    @XmlAttribute
    protected KeywordsBorders borderstyle;
    @XmlAttribute
    protected BigInteger columns;
    @XmlAttribute
    protected Boolean alignwithbaseline;
    @XmlAttribute
    protected Boolean allowmultilines;
    @XmlAttribute
    protected String width;
    @XmlAttribute
    protected EmbeddedFitTypes widthtype;
    @XmlAttribute
    protected String height;
    @XmlAttribute
    protected String bgcolor;
    @XmlAttribute
    protected String readingorder;

    /**
     * Gets the value of the text property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the text property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Text }
     * 
     * 
     */
    public List<Text> getText() {
        if (text == null) {
            text = new ArrayList<Text>();
        }
        return this.text;
    }

    /**
     * Gets the value of the font property.
     * 
     * @return
     *     possible object is
     *     {@link Font }
     *     
     */
    public Font getFont() {
        return font;
    }

    /**
     * Sets the value of the font property.
     * 
     * @param value
     *     allowed object is
     *     {@link Font }
     *     
     */
    public void setFont(Font value) {
        this.font = value;
    }

    /**
     * Gets the value of the embeddedkeywords property.
     * 
     * @return
     *     possible object is
     *     {@link Embeddedkeywords }
     *     
     */
    public Embeddedkeywords getEmbeddedkeywords() {
        return embeddedkeywords;
    }

    /**
     * Sets the value of the embeddedkeywords property.
     * 
     * @param value
     *     allowed object is
     *     {@link Embeddedkeywords }
     *     
     */
    public void setEmbeddedkeywords(Embeddedkeywords value) {
        this.embeddedkeywords = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link EmbeddedcontrolType }
     *     
     */
    public EmbeddedcontrolType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmbeddedcontrolType }
     *     
     */
    public void setType(EmbeddedcontrolType value) {
        this.type = value;
    }

    /**
     * Gets the value of the borderstyle property.
     * 
     * @return
     *     possible object is
     *     {@link KeywordsBorders }
     *     
     */
    public KeywordsBorders getBorderstyle() {
        return borderstyle;
    }

    /**
     * Sets the value of the borderstyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeywordsBorders }
     *     
     */
    public void setBorderstyle(KeywordsBorders value) {
        this.borderstyle = value;
    }

    /**
     * Gets the value of the columns property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getColumns() {
        if (columns == null) {
            return new BigInteger("1");
        } else {
            return columns;
        }
    }

    /**
     * Sets the value of the columns property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setColumns(BigInteger value) {
        this.columns = value;
    }

    /**
     * Gets the value of the alignwithbaseline property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAlignwithbaseline() {
        if (alignwithbaseline == null) {
            return false;
        } else {
            return alignwithbaseline;
        }
    }

    /**
     * Sets the value of the alignwithbaseline property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAlignwithbaseline(Boolean value) {
        this.alignwithbaseline = value;
    }

    /**
     * Gets the value of the allowmultilines property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowmultilines() {
        return allowmultilines;
    }

    /**
     * Sets the value of the allowmultilines property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowmultilines(Boolean value) {
        this.allowmultilines = value;
    }

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWidth(String value) {
        this.width = value;
    }

    /**
     * Gets the value of the widthtype property.
     * 
     * @return
     *     possible object is
     *     {@link EmbeddedFitTypes }
     *     
     */
    public EmbeddedFitTypes getWidthtype() {
        if (widthtype == null) {
            return EmbeddedFitTypes.FIXED;
        } else {
            return widthtype;
        }
    }

    /**
     * Sets the value of the widthtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmbeddedFitTypes }
     *     
     */
    public void setWidthtype(EmbeddedFitTypes value) {
        this.widthtype = value;
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
     * Gets the value of the bgcolor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBgcolor() {
        return bgcolor;
    }

    /**
     * Sets the value of the bgcolor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBgcolor(String value) {
        this.bgcolor = value;
    }

    /**
     * Gets the value of the readingorder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReadingorder() {
        if (readingorder == null) {
            return "lefttoright";
        } else {
            return readingorder;
        }
    }

    /**
     * Sets the value of the readingorder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReadingorder(String value) {
        this.readingorder = value;
    }

}
