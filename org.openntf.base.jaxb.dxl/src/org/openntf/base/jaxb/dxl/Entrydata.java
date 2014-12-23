//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.23 at 02:06:11 PM CET 
//


package org.openntf.base.jaxb.dxl;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for entrydata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="entrydata">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;group ref="{http://www.lotus.com/dxl}simple.types"/>
 *       &lt;/choice>
 *       &lt;attribute name="columnnumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="indent" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="category" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "entrydata", namespace = "http://www.lotus.com/dxl", propOrder = {
    "text",
    "number",
    "datetime",
    "textlist",
    "numberlist",
    "datetimelist",
    "itemdata",
    "rawitemdata"
})
public class Entrydata {

    protected Text text;
    protected String number;
    protected Datetime datetime;
    protected Textlist textlist;
    protected Numberlist numberlist;
    protected Datetimelist datetimelist;
    protected Itemdata itemdata;
    protected Rawitemdata rawitemdata;
    @XmlAttribute
    protected BigInteger columnnumber;
    @XmlAttribute
    protected BigInteger indent;
    @XmlAttribute
    protected String name;
    @XmlAttribute
    protected Boolean category;

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link Text }
     *     
     */
    public Text getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link Text }
     *     
     */
    public void setText(Text value) {
        this.text = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the datetime property.
     * 
     * @return
     *     possible object is
     *     {@link Datetime }
     *     
     */
    public Datetime getDatetime() {
        return datetime;
    }

    /**
     * Sets the value of the datetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Datetime }
     *     
     */
    public void setDatetime(Datetime value) {
        this.datetime = value;
    }

    /**
     * Gets the value of the textlist property.
     * 
     * @return
     *     possible object is
     *     {@link Textlist }
     *     
     */
    public Textlist getTextlist() {
        return textlist;
    }

    /**
     * Sets the value of the textlist property.
     * 
     * @param value
     *     allowed object is
     *     {@link Textlist }
     *     
     */
    public void setTextlist(Textlist value) {
        this.textlist = value;
    }

    /**
     * Gets the value of the numberlist property.
     * 
     * @return
     *     possible object is
     *     {@link Numberlist }
     *     
     */
    public Numberlist getNumberlist() {
        return numberlist;
    }

    /**
     * Sets the value of the numberlist property.
     * 
     * @param value
     *     allowed object is
     *     {@link Numberlist }
     *     
     */
    public void setNumberlist(Numberlist value) {
        this.numberlist = value;
    }

    /**
     * Gets the value of the datetimelist property.
     * 
     * @return
     *     possible object is
     *     {@link Datetimelist }
     *     
     */
    public Datetimelist getDatetimelist() {
        return datetimelist;
    }

    /**
     * Sets the value of the datetimelist property.
     * 
     * @param value
     *     allowed object is
     *     {@link Datetimelist }
     *     
     */
    public void setDatetimelist(Datetimelist value) {
        this.datetimelist = value;
    }

    /**
     * Gets the value of the itemdata property.
     * 
     * @return
     *     possible object is
     *     {@link Itemdata }
     *     
     */
    public Itemdata getItemdata() {
        return itemdata;
    }

    /**
     * Sets the value of the itemdata property.
     * 
     * @param value
     *     allowed object is
     *     {@link Itemdata }
     *     
     */
    public void setItemdata(Itemdata value) {
        this.itemdata = value;
    }

    /**
     * Gets the value of the rawitemdata property.
     * 
     * @return
     *     possible object is
     *     {@link Rawitemdata }
     *     
     */
    public Rawitemdata getRawitemdata() {
        return rawitemdata;
    }

    /**
     * Sets the value of the rawitemdata property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rawitemdata }
     *     
     */
    public void setRawitemdata(Rawitemdata value) {
        this.rawitemdata = value;
    }

    /**
     * Gets the value of the columnnumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getColumnnumber() {
        return columnnumber;
    }

    /**
     * Sets the value of the columnnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setColumnnumber(BigInteger value) {
        this.columnnumber = value;
    }

    /**
     * Gets the value of the indent property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIndent() {
        return indent;
    }

    /**
     * Sets the value of the indent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIndent(BigInteger value) {
        this.indent = value;
    }

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
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCategory(Boolean value) {
        this.category = value;
    }

}
