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
 * <p>Java class for sendreplyaction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sendreplyaction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="text" type="{http://www.lotus.com/dxl}text" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="replytoall" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="includedocument" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="replyonce" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sendreplyaction", namespace = "http://www.lotus.com/dxl", propOrder = {
    "text"
})
public class Sendreplyaction {

    protected Text text;
    @XmlAttribute
    protected Boolean replytoall;
    @XmlAttribute
    protected Boolean includedocument;
    @XmlAttribute
    protected Boolean replyonce;

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
     * Gets the value of the replytoall property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isReplytoall() {
        if (replytoall == null) {
            return false;
        } else {
            return replytoall;
        }
    }

    /**
     * Sets the value of the replytoall property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReplytoall(Boolean value) {
        this.replytoall = value;
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
     * Gets the value of the replyonce property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isReplyonce() {
        if (replyonce == null) {
            return false;
        } else {
            return replyonce;
        }
    }

    /**
     * Sets the value of the replyonce property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReplyonce(Boolean value) {
        this.replyonce = value;
    }

}
