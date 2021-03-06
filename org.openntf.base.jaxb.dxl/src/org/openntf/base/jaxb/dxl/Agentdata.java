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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for agentdata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="agentdata">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.lotus.com/dxl}design.note.prolog"/>
 *         &lt;group ref="{http://www.lotus.com/dxl}note.epilog"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.lotus.com/dxl}root.attrs"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "agentdata", namespace = "http://www.lotus.com/dxl", propOrder = {
    "noteinfo",
    "updatedby",
    "revisions",
    "wassignedby",
    "textproperties",
    "item"
})
public class Agentdata {

    protected Noteinfo noteinfo;
    protected Updatedby updatedby;
    protected Revisions revisions;
    protected Wassignedby wassignedby;
    protected Textproperties textproperties;
    protected List<Item> item;
    @XmlAttribute
    protected Float version;
    @XmlAttribute
    protected Float maintenanceversion;
    @XmlAttribute
    protected Float milestonebuild;
    @XmlAttribute
    protected String replicaid;

    /**
     * Gets the value of the noteinfo property.
     * 
     * @return
     *     possible object is
     *     {@link Noteinfo }
     *     
     */
    public Noteinfo getNoteinfo() {
        return noteinfo;
    }

    /**
     * Sets the value of the noteinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Noteinfo }
     *     
     */
    public void setNoteinfo(Noteinfo value) {
        this.noteinfo = value;
    }

    /**
     * Gets the value of the updatedby property.
     * 
     * @return
     *     possible object is
     *     {@link Updatedby }
     *     
     */
    public Updatedby getUpdatedby() {
        return updatedby;
    }

    /**
     * Sets the value of the updatedby property.
     * 
     * @param value
     *     allowed object is
     *     {@link Updatedby }
     *     
     */
    public void setUpdatedby(Updatedby value) {
        this.updatedby = value;
    }

    /**
     * Gets the value of the revisions property.
     * 
     * @return
     *     possible object is
     *     {@link Revisions }
     *     
     */
    public Revisions getRevisions() {
        return revisions;
    }

    /**
     * Sets the value of the revisions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Revisions }
     *     
     */
    public void setRevisions(Revisions value) {
        this.revisions = value;
    }

    /**
     * Gets the value of the wassignedby property.
     * 
     * @return
     *     possible object is
     *     {@link Wassignedby }
     *     
     */
    public Wassignedby getWassignedby() {
        return wassignedby;
    }

    /**
     * Sets the value of the wassignedby property.
     * 
     * @param value
     *     allowed object is
     *     {@link Wassignedby }
     *     
     */
    public void setWassignedby(Wassignedby value) {
        this.wassignedby = value;
    }

    /**
     * Gets the value of the textproperties property.
     * 
     * @return
     *     possible object is
     *     {@link Textproperties }
     *     
     */
    public Textproperties getTextproperties() {
        return textproperties;
    }

    /**
     * Sets the value of the textproperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link Textproperties }
     *     
     */
    public void setTextproperties(Textproperties value) {
        this.textproperties = value;
    }

    /**
     * Gets the value of the item property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the item property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Item }
     * 
     * 
     */
    public List<Item> getItem() {
        if (item == null) {
            item = new ArrayList<Item>();
        }
        return this.item;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setVersion(Float value) {
        this.version = value;
    }

    /**
     * Gets the value of the maintenanceversion property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaintenanceversion() {
        return maintenanceversion;
    }

    /**
     * Sets the value of the maintenanceversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaintenanceversion(Float value) {
        this.maintenanceversion = value;
    }

    /**
     * Gets the value of the milestonebuild property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMilestonebuild() {
        return milestonebuild;
    }

    /**
     * Sets the value of the milestonebuild property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMilestonebuild(Float value) {
        this.milestonebuild = value;
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

}
