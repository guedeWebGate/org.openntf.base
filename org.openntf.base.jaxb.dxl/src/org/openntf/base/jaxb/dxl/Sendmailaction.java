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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sendmailaction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sendmailaction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sendto" type="{http://www.lotus.com/dxl}send.type"/>
 *         &lt;element name="sendcc" type="{http://www.lotus.com/dxl}send.type" minOccurs="0"/>
 *         &lt;element name="sendbcc" type="{http://www.lotus.com/dxl}send.type" minOccurs="0"/>
 *         &lt;element name="sendsubject" type="{http://www.lotus.com/dxl}send.type" minOccurs="0"/>
 *         &lt;element name="text" type="{http://www.lotus.com/dxl}text" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="includedocument" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="includelink" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sendmailaction", namespace = "http://www.lotus.com/dxl", propOrder = {
    "sendto",
    "sendcc",
    "sendbcc",
    "sendsubject",
    "text"
})
public class Sendmailaction {

    @XmlElement(required = true)
    protected SendType sendto;
    protected SendType sendcc;
    protected SendType sendbcc;
    protected SendType sendsubject;
    protected Text text;
    @XmlAttribute
    protected Boolean includedocument;
    @XmlAttribute
    protected Boolean includelink;

    /**
     * Gets the value of the sendto property.
     * 
     * @return
     *     possible object is
     *     {@link SendType }
     *     
     */
    public SendType getSendto() {
        return sendto;
    }

    /**
     * Sets the value of the sendto property.
     * 
     * @param value
     *     allowed object is
     *     {@link SendType }
     *     
     */
    public void setSendto(SendType value) {
        this.sendto = value;
    }

    /**
     * Gets the value of the sendcc property.
     * 
     * @return
     *     possible object is
     *     {@link SendType }
     *     
     */
    public SendType getSendcc() {
        return sendcc;
    }

    /**
     * Sets the value of the sendcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SendType }
     *     
     */
    public void setSendcc(SendType value) {
        this.sendcc = value;
    }

    /**
     * Gets the value of the sendbcc property.
     * 
     * @return
     *     possible object is
     *     {@link SendType }
     *     
     */
    public SendType getSendbcc() {
        return sendbcc;
    }

    /**
     * Sets the value of the sendbcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SendType }
     *     
     */
    public void setSendbcc(SendType value) {
        this.sendbcc = value;
    }

    /**
     * Gets the value of the sendsubject property.
     * 
     * @return
     *     possible object is
     *     {@link SendType }
     *     
     */
    public SendType getSendsubject() {
        return sendsubject;
    }

    /**
     * Sets the value of the sendsubject property.
     * 
     * @param value
     *     allowed object is
     *     {@link SendType }
     *     
     */
    public void setSendsubject(SendType value) {
        this.sendsubject = value;
    }

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
     * Gets the value of the includedocument property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIncludedocument() {
        if (includedocument == null) {
            return false;
        } else {
            return includedocument;
        }
    }

    /**
     * Sets the value of the includedocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludedocument(Boolean value) {
        this.includedocument = value;
    }

    /**
     * Gets the value of the includelink property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIncludelink() {
        if (includelink == null) {
            return false;
        } else {
            return includelink;
        }
    }

    /**
     * Sets the value of the includelink property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludelink(Boolean value) {
        this.includelink = value;
    }

}
