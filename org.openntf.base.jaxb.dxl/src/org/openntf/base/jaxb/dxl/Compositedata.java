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
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for compositedata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="compositedata">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>base64Binary">
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="prevtype" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="nexttype" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="containertype" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="aftercontainercount" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="afterbegincount" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="afterparcount" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "compositedata", namespace = "http://www.lotus.com/dxl", propOrder = {
    "value"
})
public class Compositedata {

    @XmlValue
    protected byte[] value;
    @XmlAttribute
    protected BigInteger type;
    @XmlAttribute
    protected BigInteger prevtype;
    @XmlAttribute
    protected BigInteger nexttype;
    @XmlAttribute
    protected BigInteger containertype;
    @XmlAttribute
    protected BigInteger aftercontainercount;
    @XmlAttribute
    protected BigInteger afterbegincount;
    @XmlAttribute
    protected BigInteger afterparcount;

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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setType(BigInteger value) {
        this.type = value;
    }

    /**
     * Gets the value of the prevtype property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPrevtype() {
        return prevtype;
    }

    /**
     * Sets the value of the prevtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPrevtype(BigInteger value) {
        this.prevtype = value;
    }

    /**
     * Gets the value of the nexttype property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNexttype() {
        return nexttype;
    }

    /**
     * Sets the value of the nexttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNexttype(BigInteger value) {
        this.nexttype = value;
    }

    /**
     * Gets the value of the containertype property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getContainertype() {
        return containertype;
    }

    /**
     * Sets the value of the containertype property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setContainertype(BigInteger value) {
        this.containertype = value;
    }

    /**
     * Gets the value of the aftercontainercount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAftercontainercount() {
        return aftercontainercount;
    }

    /**
     * Sets the value of the aftercontainercount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAftercontainercount(BigInteger value) {
        this.aftercontainercount = value;
    }

    /**
     * Gets the value of the afterbegincount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAfterbegincount() {
        return afterbegincount;
    }

    /**
     * Sets the value of the afterbegincount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAfterbegincount(BigInteger value) {
        this.afterbegincount = value;
    }

    /**
     * Gets the value of the afterparcount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAfterparcount() {
        return afterparcount;
    }

    /**
     * Sets the value of the afterparcount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAfterparcount(BigInteger value) {
        this.afterparcount = value;
    }

}
