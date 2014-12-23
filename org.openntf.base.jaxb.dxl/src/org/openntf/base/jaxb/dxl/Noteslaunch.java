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
 * <p>Java class for noteslaunch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="noteslaunch">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attGroup ref="{http://www.lotus.com/dxl}launch.common.attrs"/>
 *       &lt;attribute name="restorelastview" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="showaboutdocument" type="{http://www.lotus.com/dxl}launch.notes.showaboutdocument" />
 *       &lt;attribute name="previewdefault" type="{http://www.lotus.com/dxl}launch.notes.previewdefault" />
 *       &lt;attribute name="navigatortype" type="{http://www.lotus.com/dxl}launch.navigatortypes" />
 *       &lt;attribute name="compapp" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="compapppage" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "noteslaunch", namespace = "http://www.lotus.com/dxl")
public class Noteslaunch {

    @XmlAttribute
    protected Boolean restorelastview;
    @XmlAttribute
    protected LaunchNotesShowaboutdocument showaboutdocument;
    @XmlAttribute
    protected LaunchNotesPreviewdefault previewdefault;
    @XmlAttribute
    protected LaunchNavigatortypes navigatortype;
    @XmlAttribute
    protected String compapp;
    @XmlAttribute
    protected String compapppage;
    @XmlAttribute
    protected String whenopened;
    @XmlAttribute
    protected String frameset;
    @XmlAttribute
    protected String navigator;
    @XmlAttribute
    protected String xpage;

    /**
     * Gets the value of the restorelastview property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRestorelastview() {
        return restorelastview;
    }

    /**
     * Sets the value of the restorelastview property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRestorelastview(Boolean value) {
        this.restorelastview = value;
    }

    /**
     * Gets the value of the showaboutdocument property.
     * 
     * @return
     *     possible object is
     *     {@link LaunchNotesShowaboutdocument }
     *     
     */
    public LaunchNotesShowaboutdocument getShowaboutdocument() {
        return showaboutdocument;
    }

    /**
     * Sets the value of the showaboutdocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link LaunchNotesShowaboutdocument }
     *     
     */
    public void setShowaboutdocument(LaunchNotesShowaboutdocument value) {
        this.showaboutdocument = value;
    }

    /**
     * Gets the value of the previewdefault property.
     * 
     * @return
     *     possible object is
     *     {@link LaunchNotesPreviewdefault }
     *     
     */
    public LaunchNotesPreviewdefault getPreviewdefault() {
        return previewdefault;
    }

    /**
     * Sets the value of the previewdefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link LaunchNotesPreviewdefault }
     *     
     */
    public void setPreviewdefault(LaunchNotesPreviewdefault value) {
        this.previewdefault = value;
    }

    /**
     * Gets the value of the navigatortype property.
     * 
     * @return
     *     possible object is
     *     {@link LaunchNavigatortypes }
     *     
     */
    public LaunchNavigatortypes getNavigatortype() {
        return navigatortype;
    }

    /**
     * Sets the value of the navigatortype property.
     * 
     * @param value
     *     allowed object is
     *     {@link LaunchNavigatortypes }
     *     
     */
    public void setNavigatortype(LaunchNavigatortypes value) {
        this.navigatortype = value;
    }

    /**
     * Gets the value of the compapp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompapp() {
        return compapp;
    }

    /**
     * Sets the value of the compapp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompapp(String value) {
        this.compapp = value;
    }

    /**
     * Gets the value of the compapppage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompapppage() {
        return compapppage;
    }

    /**
     * Sets the value of the compapppage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompapppage(String value) {
        this.compapppage = value;
    }

    /**
     * Gets the value of the whenopened property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWhenopened() {
        return whenopened;
    }

    /**
     * Sets the value of the whenopened property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWhenopened(String value) {
        this.whenopened = value;
    }

    /**
     * Gets the value of the frameset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrameset() {
        return frameset;
    }

    /**
     * Sets the value of the frameset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrameset(String value) {
        this.frameset = value;
    }

    /**
     * Gets the value of the navigator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNavigator() {
        return navigator;
    }

    /**
     * Sets the value of the navigator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNavigator(String value) {
        this.navigator = value;
    }

    /**
     * Gets the value of the xpage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXpage() {
        return xpage;
    }

    /**
     * Sets the value of the xpage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXpage(String value) {
        this.xpage = value;
    }

}
