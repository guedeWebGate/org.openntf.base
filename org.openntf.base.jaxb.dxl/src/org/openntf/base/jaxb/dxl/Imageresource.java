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
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for imageresource complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="imageresource">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.lotus.com/dxl}named.design.note.prolog"/>
 *         &lt;choice>
 *           &lt;element name="gif" type="{http://www.lotus.com/dxl}gif"/>
 *           &lt;element name="jpeg" type="{http://www.lotus.com/dxl}jpeg"/>
 *           &lt;element name="png" type="{http://www.lotus.com/dxl}png"/>
 *           &lt;element name="notesbitmap" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *           &lt;element name="cgm" type="{http://www.lotus.com/dxl}cgm"/>
 *         &lt;/choice>
 *         &lt;group ref="{http://www.lotus.com/dxl}note.epilog"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.lotus.com/dxl}named.design.note.attrs"/>
 *       &lt;attribute name="across" type="{http://www.w3.org/2001/XMLSchema}integer" default="1" />
 *       &lt;attribute name="down" type="{http://www.w3.org/2001/XMLSchema}integer" default="1" />
 *       &lt;attribute name="colorizegrays" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="browsercompatible" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="imagename" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="refresh" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "imageresource", namespace = "http://www.lotus.com/dxl", propOrder = {
    "noteinfo",
    "updatedby",
    "revisions",
    "wassignedby",
    "textproperties",
    "gif",
    "jpeg",
    "png",
    "notesbitmap",
    "cgm",
    "item"
})
public class Imageresource {

    protected Noteinfo noteinfo;
    protected Updatedby updatedby;
    protected Revisions revisions;
    protected Wassignedby wassignedby;
    protected Textproperties textproperties;
    protected Gif gif;
    protected Jpeg jpeg;
    protected Png png;
    protected byte[] notesbitmap;
    protected Cgm cgm;
    protected List<Item> item;
    @XmlAttribute
    protected BigInteger across;
    @XmlAttribute
    protected BigInteger down;
    @XmlAttribute
    protected Boolean colorizegrays;
    @XmlAttribute
    protected Boolean browsercompatible;
    @XmlAttribute
    protected String imagename;
    @XmlAttribute
    protected Boolean refresh;
    @XmlAttribute
    protected String name;
    @XmlAttribute
    protected String alias;
    @XmlAttribute
    protected String comment;
    @XmlAttribute
    protected List<DesignNoteHideTokens> hide;
    @XmlAttribute
    protected Boolean nocompose;
    @XmlAttribute
    protected Boolean noquery;
    @XmlAttribute
    protected Boolean norenderv3;
    @XmlAttribute
    protected Boolean insertdialog;
    @XmlAttribute
    protected Boolean newinsertdialog;
    @XmlAttribute
    protected Boolean otherdialog;
    @XmlAttribute
    protected Boolean noreplace;
    @XmlAttribute
    protected Boolean readonly;
    @XmlAttribute
    protected Boolean propagatenoreplace;
    @XmlAttribute
    protected Boolean useapplet;
    @XmlAttribute
    protected Boolean treatashtml;
    @XmlAttribute
    protected Boolean htmlallfields;
    @XmlAttribute
    protected Boolean publicaccess;
    @XmlAttribute
    protected String language;
    @XmlAttribute(name = "default")
    protected Boolean _default;
    @XmlAttribute(name = "private")
    protected Boolean _private;
    @XmlAttribute
    protected String designerversion;
    @XmlAttribute
    protected String fromtemplate;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String key;
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
     * Gets the value of the gif property.
     * 
     * @return
     *     possible object is
     *     {@link Gif }
     *     
     */
    public Gif getGif() {
        return gif;
    }

    /**
     * Sets the value of the gif property.
     * 
     * @param value
     *     allowed object is
     *     {@link Gif }
     *     
     */
    public void setGif(Gif value) {
        this.gif = value;
    }

    /**
     * Gets the value of the jpeg property.
     * 
     * @return
     *     possible object is
     *     {@link Jpeg }
     *     
     */
    public Jpeg getJpeg() {
        return jpeg;
    }

    /**
     * Sets the value of the jpeg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Jpeg }
     *     
     */
    public void setJpeg(Jpeg value) {
        this.jpeg = value;
    }

    /**
     * Gets the value of the png property.
     * 
     * @return
     *     possible object is
     *     {@link Png }
     *     
     */
    public Png getPng() {
        return png;
    }

    /**
     * Sets the value of the png property.
     * 
     * @param value
     *     allowed object is
     *     {@link Png }
     *     
     */
    public void setPng(Png value) {
        this.png = value;
    }

    /**
     * Gets the value of the notesbitmap property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getNotesbitmap() {
        return notesbitmap;
    }

    /**
     * Sets the value of the notesbitmap property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setNotesbitmap(byte[] value) {
        this.notesbitmap = ((byte[]) value);
    }

    /**
     * Gets the value of the cgm property.
     * 
     * @return
     *     possible object is
     *     {@link Cgm }
     *     
     */
    public Cgm getCgm() {
        return cgm;
    }

    /**
     * Sets the value of the cgm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cgm }
     *     
     */
    public void setCgm(Cgm value) {
        this.cgm = value;
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
     * Gets the value of the across property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAcross() {
        if (across == null) {
            return new BigInteger("1");
        } else {
            return across;
        }
    }

    /**
     * Sets the value of the across property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAcross(BigInteger value) {
        this.across = value;
    }

    /**
     * Gets the value of the down property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDown() {
        if (down == null) {
            return new BigInteger("1");
        } else {
            return down;
        }
    }

    /**
     * Sets the value of the down property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDown(BigInteger value) {
        this.down = value;
    }

    /**
     * Gets the value of the colorizegrays property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isColorizegrays() {
        if (colorizegrays == null) {
            return false;
        } else {
            return colorizegrays;
        }
    }

    /**
     * Sets the value of the colorizegrays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setColorizegrays(Boolean value) {
        this.colorizegrays = value;
    }

    /**
     * Gets the value of the browsercompatible property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isBrowsercompatible() {
        if (browsercompatible == null) {
            return false;
        } else {
            return browsercompatible;
        }
    }

    /**
     * Sets the value of the browsercompatible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBrowsercompatible(Boolean value) {
        this.browsercompatible = value;
    }

    /**
     * Gets the value of the imagename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImagename() {
        return imagename;
    }

    /**
     * Sets the value of the imagename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImagename(String value) {
        this.imagename = value;
    }

    /**
     * Gets the value of the refresh property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isRefresh() {
        if (refresh == null) {
            return false;
        } else {
            return refresh;
        }
    }

    /**
     * Sets the value of the refresh property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRefresh(Boolean value) {
        this.refresh = value;
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
     * Gets the value of the alias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlias() {
        return alias;
    }

    /**
     * Sets the value of the alias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlias(String value) {
        this.alias = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the hide property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hide property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHide().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DesignNoteHideTokens }
     * 
     * 
     */
    public List<DesignNoteHideTokens> getHide() {
        if (hide == null) {
            hide = new ArrayList<DesignNoteHideTokens>();
        }
        return this.hide;
    }

    /**
     * Gets the value of the nocompose property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNocompose() {
        return nocompose;
    }

    /**
     * Sets the value of the nocompose property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNocompose(Boolean value) {
        this.nocompose = value;
    }

    /**
     * Gets the value of the noquery property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoquery() {
        return noquery;
    }

    /**
     * Sets the value of the noquery property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoquery(Boolean value) {
        this.noquery = value;
    }

    /**
     * Gets the value of the norenderv3 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNorenderv3() {
        return norenderv3;
    }

    /**
     * Sets the value of the norenderv3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNorenderv3(Boolean value) {
        this.norenderv3 = value;
    }

    /**
     * Gets the value of the insertdialog property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInsertdialog() {
        return insertdialog;
    }

    /**
     * Sets the value of the insertdialog property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInsertdialog(Boolean value) {
        this.insertdialog = value;
    }

    /**
     * Gets the value of the newinsertdialog property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNewinsertdialog() {
        return newinsertdialog;
    }

    /**
     * Sets the value of the newinsertdialog property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNewinsertdialog(Boolean value) {
        this.newinsertdialog = value;
    }

    /**
     * Gets the value of the otherdialog property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOtherdialog() {
        return otherdialog;
    }

    /**
     * Sets the value of the otherdialog property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOtherdialog(Boolean value) {
        this.otherdialog = value;
    }

    /**
     * Gets the value of the noreplace property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isNoreplace() {
        if (noreplace == null) {
            return false;
        } else {
            return noreplace;
        }
    }

    /**
     * Sets the value of the noreplace property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoreplace(Boolean value) {
        this.noreplace = value;
    }

    /**
     * Gets the value of the readonly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReadonly() {
        return readonly;
    }

    /**
     * Sets the value of the readonly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReadonly(Boolean value) {
        this.readonly = value;
    }

    /**
     * Gets the value of the propagatenoreplace property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPropagatenoreplace() {
        return propagatenoreplace;
    }

    /**
     * Sets the value of the propagatenoreplace property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPropagatenoreplace(Boolean value) {
        this.propagatenoreplace = value;
    }

    /**
     * Gets the value of the useapplet property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isUseapplet() {
        if (useapplet == null) {
            return false;
        } else {
            return useapplet;
        }
    }

    /**
     * Sets the value of the useapplet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseapplet(Boolean value) {
        this.useapplet = value;
    }

    /**
     * Gets the value of the treatashtml property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isTreatashtml() {
        if (treatashtml == null) {
            return false;
        } else {
            return treatashtml;
        }
    }

    /**
     * Sets the value of the treatashtml property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTreatashtml(Boolean value) {
        this.treatashtml = value;
    }

    /**
     * Gets the value of the htmlallfields property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHtmlallfields() {
        return htmlallfields;
    }

    /**
     * Sets the value of the htmlallfields property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHtmlallfields(Boolean value) {
        this.htmlallfields = value;
    }

    /**
     * Gets the value of the publicaccess property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPublicaccess() {
        return publicaccess;
    }

    /**
     * Sets the value of the publicaccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPublicaccess(Boolean value) {
        this.publicaccess = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the default property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isDefault() {
        if (_default == null) {
            return false;
        } else {
            return _default;
        }
    }

    /**
     * Sets the value of the default property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefault(Boolean value) {
        this._default = value;
    }

    /**
     * Gets the value of the private property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isPrivate() {
        if (_private == null) {
            return false;
        } else {
            return _private;
        }
    }

    /**
     * Sets the value of the private property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrivate(Boolean value) {
        this._private = value;
    }

    /**
     * Gets the value of the designerversion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesignerversion() {
        return designerversion;
    }

    /**
     * Sets the value of the designerversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesignerversion(String value) {
        this.designerversion = value;
    }

    /**
     * Gets the value of the fromtemplate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromtemplate() {
        return fromtemplate;
    }

    /**
     * Sets the value of the fromtemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromtemplate(String value) {
        this.fromtemplate = value;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
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
