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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for objectref complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="objectref">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="associatedfiles" type="{http://www.lotus.com/dxl}associatedfiles" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;group ref="{http://www.lotus.com/dxl}richtext.nonhot.inline"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.lotus.com/dxl}html.core.attrs"/>
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}integer" default="2" />
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="class" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="type" type="{http://www.lotus.com/dxl}objectref.types" default="embeddedobject" />
 *       &lt;attribute name="savewhenchanged" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="render" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="displayformat" type="{http://www.lotus.com/dxl}objectref.display.formats" default="metafile" />
 *       &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="classid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="storageformat" type="{http://www.lotus.com/dxl}objectref.storage.formats" default="structstorage" />
 *       &lt;attribute name="scripted" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="runreadonly" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="fittowindow" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="control" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="fitbelowfields" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="regionid" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "objectref", namespace = "http://www.lotus.com/dxl", propOrder = {
    "associatedfiles",
    "runOrBreakOrField"
})
public class Objectref {

    protected Associatedfiles associatedfiles;
    @XmlElements({
        @XmlElement(name = "namedelementref", type = Namedelementref.class),
        @XmlElement(name = "embeddedfolderpane", type = Embeddedfolderpane.class),
        @XmlElement(name = "compositedata", type = Compositedata.class),
        @XmlElement(name = "richtextdata", type = Richtextdata.class),
        @XmlElement(name = "break", type = Break.class),
        @XmlElement(name = "embeddednavigator", type = Embeddednavigator.class),
        @XmlElement(name = "picture", type = Picture.class),
        @XmlElement(name = "anchor", type = Anchor.class),
        @XmlElement(name = "span", type = Span.class),
        @XmlElement(name = "nonxmlchar", type = Nonxmlchar.class),
        @XmlElement(name = "field", type = Field.class),
        @XmlElement(name = "embeddedfileuploadcontrol", type = Embeddedfileuploadcontrol.class),
        @XmlElement(name = "layer", type = Layer.class),
        @XmlElement(name = "embeddedoutline", type = Embeddedoutline.class),
        @XmlElement(name = "embeddedcontrol", type = Embeddedcontrol.class),
        @XmlElement(name = "horizrule", type = Horizrule.class),
        @XmlElement(name = "embeddeddatepicker", type = Embeddeddatepicker.class),
        @XmlElement(name = "run", type = Run.class),
        @XmlElement(name = "embeddedview", type = Embeddedview.class),
        @XmlElement(name = "sharedfieldref", type = Sharedfieldref.class),
        @XmlElement(name = "imagemap", type = Imagemap.class)
    })
    protected List<java.lang.Object> runOrBreakOrField;
    @XmlAttribute
    protected BigInteger version;
    @XmlAttribute(required = true)
    protected String name;
    @XmlAttribute(name = "class")
    protected String clazz;
    @XmlAttribute
    protected ObjectrefTypes type;
    @XmlAttribute
    protected Boolean savewhenchanged;
    @XmlAttribute
    protected Boolean render;
    @XmlAttribute
    protected ObjectrefDisplayFormats displayformat;
    @XmlAttribute
    protected String description;
    @XmlAttribute
    protected String classid;
    @XmlAttribute
    protected ObjectrefStorageFormats storageformat;
    @XmlAttribute
    protected Boolean scripted;
    @XmlAttribute
    protected Boolean runreadonly;
    @XmlAttribute
    protected Boolean fittowindow;
    @XmlAttribute
    protected Boolean control;
    @XmlAttribute
    protected Boolean fitbelowfields;
    @XmlAttribute
    protected BigInteger regionid;
    @XmlAttribute
    protected String htmlid;
    @XmlAttribute
    protected String htmlclass;
    @XmlAttribute
    protected String htmlstyle;
    @XmlAttribute
    protected String htmltitle;
    @XmlAttribute
    protected String extrahtmlattrs;

    /**
     * Gets the value of the associatedfiles property.
     * 
     * @return
     *     possible object is
     *     {@link Associatedfiles }
     *     
     */
    public Associatedfiles getAssociatedfiles() {
        return associatedfiles;
    }

    /**
     * Sets the value of the associatedfiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link Associatedfiles }
     *     
     */
    public void setAssociatedfiles(Associatedfiles value) {
        this.associatedfiles = value;
    }

    /**
     * Gets the value of the runOrBreakOrField property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the runOrBreakOrField property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRunOrBreakOrField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Namedelementref }
     * {@link Embeddedfolderpane }
     * {@link Compositedata }
     * {@link Richtextdata }
     * {@link Break }
     * {@link Embeddednavigator }
     * {@link Picture }
     * {@link Anchor }
     * {@link Span }
     * {@link Nonxmlchar }
     * {@link Field }
     * {@link Embeddedfileuploadcontrol }
     * {@link Layer }
     * {@link Embeddedoutline }
     * {@link Embeddedcontrol }
     * {@link Horizrule }
     * {@link Embeddeddatepicker }
     * {@link Run }
     * {@link Embeddedview }
     * {@link Sharedfieldref }
     * {@link Imagemap }
     * 
     * 
     */
    public List<java.lang.Object> getRunOrBreakOrField() {
        if (runOrBreakOrField == null) {
            runOrBreakOrField = new ArrayList<java.lang.Object>();
        }
        return this.runOrBreakOrField;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVersion() {
        if (version == null) {
            return new BigInteger("2");
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVersion(BigInteger value) {
        this.version = value;
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
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClazz(String value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectrefTypes }
     *     
     */
    public ObjectrefTypes getType() {
        if (type == null) {
            return ObjectrefTypes.EMBEDDEDOBJECT;
        } else {
            return type;
        }
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectrefTypes }
     *     
     */
    public void setType(ObjectrefTypes value) {
        this.type = value;
    }

    /**
     * Gets the value of the savewhenchanged property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSavewhenchanged() {
        if (savewhenchanged == null) {
            return false;
        } else {
            return savewhenchanged;
        }
    }

    /**
     * Sets the value of the savewhenchanged property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSavewhenchanged(Boolean value) {
        this.savewhenchanged = value;
    }

    /**
     * Gets the value of the render property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isRender() {
        if (render == null) {
            return true;
        } else {
            return render;
        }
    }

    /**
     * Sets the value of the render property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRender(Boolean value) {
        this.render = value;
    }

    /**
     * Gets the value of the displayformat property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectrefDisplayFormats }
     *     
     */
    public ObjectrefDisplayFormats getDisplayformat() {
        if (displayformat == null) {
            return ObjectrefDisplayFormats.METAFILE;
        } else {
            return displayformat;
        }
    }

    /**
     * Sets the value of the displayformat property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectrefDisplayFormats }
     *     
     */
    public void setDisplayformat(ObjectrefDisplayFormats value) {
        this.displayformat = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the classid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassid() {
        return classid;
    }

    /**
     * Sets the value of the classid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassid(String value) {
        this.classid = value;
    }

    /**
     * Gets the value of the storageformat property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectrefStorageFormats }
     *     
     */
    public ObjectrefStorageFormats getStorageformat() {
        if (storageformat == null) {
            return ObjectrefStorageFormats.STRUCTSTORAGE;
        } else {
            return storageformat;
        }
    }

    /**
     * Sets the value of the storageformat property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectrefStorageFormats }
     *     
     */
    public void setStorageformat(ObjectrefStorageFormats value) {
        this.storageformat = value;
    }

    /**
     * Gets the value of the scripted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isScripted() {
        if (scripted == null) {
            return false;
        } else {
            return scripted;
        }
    }

    /**
     * Sets the value of the scripted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setScripted(Boolean value) {
        this.scripted = value;
    }

    /**
     * Gets the value of the runreadonly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isRunreadonly() {
        if (runreadonly == null) {
            return false;
        } else {
            return runreadonly;
        }
    }

    /**
     * Sets the value of the runreadonly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRunreadonly(Boolean value) {
        this.runreadonly = value;
    }

    /**
     * Gets the value of the fittowindow property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isFittowindow() {
        if (fittowindow == null) {
            return false;
        } else {
            return fittowindow;
        }
    }

    /**
     * Sets the value of the fittowindow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFittowindow(Boolean value) {
        this.fittowindow = value;
    }

    /**
     * Gets the value of the control property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isControl() {
        if (control == null) {
            return false;
        } else {
            return control;
        }
    }

    /**
     * Sets the value of the control property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setControl(Boolean value) {
        this.control = value;
    }

    /**
     * Gets the value of the fitbelowfields property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isFitbelowfields() {
        if (fitbelowfields == null) {
            return false;
        } else {
            return fitbelowfields;
        }
    }

    /**
     * Sets the value of the fitbelowfields property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFitbelowfields(Boolean value) {
        this.fitbelowfields = value;
    }

    /**
     * Gets the value of the regionid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRegionid() {
        return regionid;
    }

    /**
     * Sets the value of the regionid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRegionid(BigInteger value) {
        this.regionid = value;
    }

    /**
     * Gets the value of the htmlid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHtmlid() {
        return htmlid;
    }

    /**
     * Sets the value of the htmlid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHtmlid(String value) {
        this.htmlid = value;
    }

    /**
     * Gets the value of the htmlclass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHtmlclass() {
        return htmlclass;
    }

    /**
     * Sets the value of the htmlclass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHtmlclass(String value) {
        this.htmlclass = value;
    }

    /**
     * Gets the value of the htmlstyle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHtmlstyle() {
        return htmlstyle;
    }

    /**
     * Sets the value of the htmlstyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHtmlstyle(String value) {
        this.htmlstyle = value;
    }

    /**
     * Gets the value of the htmltitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHtmltitle() {
        return htmltitle;
    }

    /**
     * Sets the value of the htmltitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHtmltitle(String value) {
        this.htmltitle = value;
    }

    /**
     * Gets the value of the extrahtmlattrs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtrahtmlattrs() {
        return extrahtmlattrs;
    }

    /**
     * Sets the value of the extrahtmlattrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtrahtmlattrs(String value) {
        this.extrahtmlattrs = value;
    }

}