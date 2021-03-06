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
 * <p>Java class for databaseinfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="databaseinfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="datamodified" type="{http://www.lotus.com/dxl}datamodified" minOccurs="0"/>
 *         &lt;element name="designmodified" type="{http://www.lotus.com/dxl}designmodified" minOccurs="0"/>
 *         &lt;element name="created" type="{http://www.lotus.com/dxl}created" minOccurs="0"/>
 *         &lt;element name="modified" type="{http://www.lotus.com/dxl}modified" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="dbid" type="{http://www.lotus.com/dxl}noteshex" />
 *       &lt;attribute name="replicaid" type="{http://www.lotus.com/dxl}noteshex" />
 *       &lt;attribute name="odsversion" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="diskspace" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="numberofdocuments" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="percentused" type="{http://www.w3.org/2001/XMLSchema}float" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "databaseinfo", namespace = "http://www.lotus.com/dxl", propOrder = {
    "datamodified",
    "designmodified",
    "created",
    "modified"
})
public class Databaseinfo {

    protected Datamodified datamodified;
    protected Designmodified designmodified;
    protected Created created;
    protected Modified modified;
    @XmlAttribute
    protected String dbid;
    @XmlAttribute
    protected String replicaid;
    @XmlAttribute
    protected BigInteger odsversion;
    @XmlAttribute
    protected BigInteger diskspace;
    @XmlAttribute
    protected BigInteger numberofdocuments;
    @XmlAttribute
    protected Float percentused;

    /**
     * Gets the value of the datamodified property.
     * 
     * @return
     *     possible object is
     *     {@link Datamodified }
     *     
     */
    public Datamodified getDatamodified() {
        return datamodified;
    }

    /**
     * Sets the value of the datamodified property.
     * 
     * @param value
     *     allowed object is
     *     {@link Datamodified }
     *     
     */
    public void setDatamodified(Datamodified value) {
        this.datamodified = value;
    }

    /**
     * Gets the value of the designmodified property.
     * 
     * @return
     *     possible object is
     *     {@link Designmodified }
     *     
     */
    public Designmodified getDesignmodified() {
        return designmodified;
    }

    /**
     * Sets the value of the designmodified property.
     * 
     * @param value
     *     allowed object is
     *     {@link Designmodified }
     *     
     */
    public void setDesignmodified(Designmodified value) {
        this.designmodified = value;
    }

    /**
     * Gets the value of the created property.
     * 
     * @return
     *     possible object is
     *     {@link Created }
     *     
     */
    public Created getCreated() {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     * @param value
     *     allowed object is
     *     {@link Created }
     *     
     */
    public void setCreated(Created value) {
        this.created = value;
    }

    /**
     * Gets the value of the modified property.
     * 
     * @return
     *     possible object is
     *     {@link Modified }
     *     
     */
    public Modified getModified() {
        return modified;
    }

    /**
     * Sets the value of the modified property.
     * 
     * @param value
     *     allowed object is
     *     {@link Modified }
     *     
     */
    public void setModified(Modified value) {
        this.modified = value;
    }

    /**
     * Gets the value of the dbid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDbid() {
        return dbid;
    }

    /**
     * Sets the value of the dbid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDbid(String value) {
        this.dbid = value;
    }

    /**
     * Gets the value of the replicaid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplicaid() {
        return replicaid;
    }

    /**
     * Sets the value of the replicaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplicaid(String value) {
        this.replicaid = value;
    }

    /**
     * Gets the value of the odsversion property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOdsversion() {
        return odsversion;
    }

    /**
     * Sets the value of the odsversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOdsversion(BigInteger value) {
        this.odsversion = value;
    }

    /**
     * Gets the value of the diskspace property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDiskspace() {
        return diskspace;
    }

    /**
     * Sets the value of the diskspace property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDiskspace(BigInteger value) {
        this.diskspace = value;
    }

    /**
     * Gets the value of the numberofdocuments property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberofdocuments() {
        return numberofdocuments;
    }

    /**
     * Sets the value of the numberofdocuments property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberofdocuments(BigInteger value) {
        this.numberofdocuments = value;
    }

    /**
     * Gets the value of the percentused property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPercentused() {
        return percentused;
    }

    /**
     * Sets the value of the percentused property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPercentused(Float value) {
        this.percentused = value;
    }

}
