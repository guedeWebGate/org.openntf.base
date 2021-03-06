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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for action complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="action">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="imageref" type="{http://www.lotus.com/dxl}imageref" minOccurs="0"/>
 *         &lt;element name="code" type="{http://www.lotus.com/dxl}code" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.lotus.com/dxl}notesflow.publishing.attrs"/>
 *       &lt;attGroup ref="{http://www.lotus.com/dxl}reading.order.attrs"/>
 *       &lt;attribute name="title" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="displaytype" type="{http://www.lotus.com/dxl}action.types" default="button" />
 *       &lt;attribute name="targetframe" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="hide" type="{http://www.w3.org/2001/XMLSchema}token" default="" />
 *       &lt;attribute name="showinmenu" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="showinbar" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="splitbutton" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="compappaction" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="extattrs" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="showinrightbuttonmenu" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="systemcommand" type="{http://www.lotus.com/dxl}action.systemcommands" />
 *       &lt;attribute name="icon" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="graphicalign" type="{http://www.lotus.com/dxl}lr.aligns" default="left" />
 *       &lt;attribute name="align" type="{http://www.lotus.com/dxl}lr.aligns" default="left" />
 *       &lt;attribute name="onlyiconinbar" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "action", namespace = "http://www.lotus.com/dxl", propOrder = {
    "imageref",
    "code"
})
public class Action {

    protected Imageref imageref;
    protected List<Code> code;
    @XmlAttribute
    protected String title;
    @XmlAttribute
    protected BigInteger id;
    @XmlAttribute
    protected ActionTypes displaytype;
    @XmlAttribute
    protected String targetframe;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String hide;
    @XmlAttribute
    protected Boolean showinmenu;
    @XmlAttribute
    protected Boolean showinbar;
    @XmlAttribute
    protected Boolean splitbutton;
    @XmlAttribute
    protected String compappaction;
    @XmlAttribute
    protected String extattrs;
    @XmlAttribute
    protected Boolean showinrightbuttonmenu;
    @XmlAttribute
    protected ActionSystemcommands systemcommand;
    @XmlAttribute
    protected BigInteger icon;
    @XmlAttribute
    protected LrAligns graphicalign;
    @XmlAttribute
    protected LrAligns align;
    @XmlAttribute
    protected Boolean onlyiconinbar;
    @XmlAttribute
    protected Boolean publishonolelaunch;
    @XmlAttribute
    protected Boolean closewhenchosen;
    @XmlAttribute
    protected Boolean docfocuswhenchosen;
    @XmlAttribute
    protected String readingorder;

    /**
     * Gets the value of the imageref property.
     * 
     * @return
     *     possible object is
     *     {@link Imageref }
     *     
     */
    public Imageref getImageref() {
        return imageref;
    }

    /**
     * Sets the value of the imageref property.
     * 
     * @param value
     *     allowed object is
     *     {@link Imageref }
     *     
     */
    public void setImageref(Imageref value) {
        this.imageref = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the code property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Code }
     * 
     * 
     */
    public List<Code> getCode() {
        if (code == null) {
            code = new ArrayList<Code>();
        }
        return this.code;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setId(BigInteger value) {
        this.id = value;
    }

    /**
     * Gets the value of the displaytype property.
     * 
     * @return
     *     possible object is
     *     {@link ActionTypes }
     *     
     */
    public ActionTypes getDisplaytype() {
        if (displaytype == null) {
            return ActionTypes.BUTTON;
        } else {
            return displaytype;
        }
    }

    /**
     * Sets the value of the displaytype property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionTypes }
     *     
     */
    public void setDisplaytype(ActionTypes value) {
        this.displaytype = value;
    }

    /**
     * Gets the value of the targetframe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetframe() {
        return targetframe;
    }

    /**
     * Sets the value of the targetframe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetframe(String value) {
        this.targetframe = value;
    }

    /**
     * Gets the value of the hide property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHide() {
        if (hide == null) {
            return "";
        } else {
            return hide;
        }
    }

    /**
     * Sets the value of the hide property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHide(String value) {
        this.hide = value;
    }

    /**
     * Gets the value of the showinmenu property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isShowinmenu() {
        if (showinmenu == null) {
            return true;
        } else {
            return showinmenu;
        }
    }

    /**
     * Sets the value of the showinmenu property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowinmenu(Boolean value) {
        this.showinmenu = value;
    }

    /**
     * Gets the value of the showinbar property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isShowinbar() {
        if (showinbar == null) {
            return true;
        } else {
            return showinbar;
        }
    }

    /**
     * Sets the value of the showinbar property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowinbar(Boolean value) {
        this.showinbar = value;
    }

    /**
     * Gets the value of the splitbutton property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSplitbutton() {
        return splitbutton;
    }

    /**
     * Sets the value of the splitbutton property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSplitbutton(Boolean value) {
        this.splitbutton = value;
    }

    /**
     * Gets the value of the compappaction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompappaction() {
        return compappaction;
    }

    /**
     * Sets the value of the compappaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompappaction(String value) {
        this.compappaction = value;
    }

    /**
     * Gets the value of the extattrs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtattrs() {
        return extattrs;
    }

    /**
     * Sets the value of the extattrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtattrs(String value) {
        this.extattrs = value;
    }

    /**
     * Gets the value of the showinrightbuttonmenu property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isShowinrightbuttonmenu() {
        if (showinrightbuttonmenu == null) {
            return false;
        } else {
            return showinrightbuttonmenu;
        }
    }

    /**
     * Sets the value of the showinrightbuttonmenu property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowinrightbuttonmenu(Boolean value) {
        this.showinrightbuttonmenu = value;
    }

    /**
     * Gets the value of the systemcommand property.
     * 
     * @return
     *     possible object is
     *     {@link ActionSystemcommands }
     *     
     */
    public ActionSystemcommands getSystemcommand() {
        return systemcommand;
    }

    /**
     * Sets the value of the systemcommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionSystemcommands }
     *     
     */
    public void setSystemcommand(ActionSystemcommands value) {
        this.systemcommand = value;
    }

    /**
     * Gets the value of the icon property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIcon() {
        return icon;
    }

    /**
     * Sets the value of the icon property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIcon(BigInteger value) {
        this.icon = value;
    }

    /**
     * Gets the value of the graphicalign property.
     * 
     * @return
     *     possible object is
     *     {@link LrAligns }
     *     
     */
    public LrAligns getGraphicalign() {
        if (graphicalign == null) {
            return LrAligns.LEFT;
        } else {
            return graphicalign;
        }
    }

    /**
     * Sets the value of the graphicalign property.
     * 
     * @param value
     *     allowed object is
     *     {@link LrAligns }
     *     
     */
    public void setGraphicalign(LrAligns value) {
        this.graphicalign = value;
    }

    /**
     * Gets the value of the align property.
     * 
     * @return
     *     possible object is
     *     {@link LrAligns }
     *     
     */
    public LrAligns getAlign() {
        if (align == null) {
            return LrAligns.LEFT;
        } else {
            return align;
        }
    }

    /**
     * Sets the value of the align property.
     * 
     * @param value
     *     allowed object is
     *     {@link LrAligns }
     *     
     */
    public void setAlign(LrAligns value) {
        this.align = value;
    }

    /**
     * Gets the value of the onlyiconinbar property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isOnlyiconinbar() {
        if (onlyiconinbar == null) {
            return false;
        } else {
            return onlyiconinbar;
        }
    }

    /**
     * Sets the value of the onlyiconinbar property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOnlyiconinbar(Boolean value) {
        this.onlyiconinbar = value;
    }

    /**
     * Gets the value of the publishonolelaunch property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isPublishonolelaunch() {
        if (publishonolelaunch == null) {
            return false;
        } else {
            return publishonolelaunch;
        }
    }

    /**
     * Sets the value of the publishonolelaunch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPublishonolelaunch(Boolean value) {
        this.publishonolelaunch = value;
    }

    /**
     * Gets the value of the closewhenchosen property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClosewhenchosen() {
        return closewhenchosen;
    }

    /**
     * Sets the value of the closewhenchosen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClosewhenchosen(Boolean value) {
        this.closewhenchosen = value;
    }

    /**
     * Gets the value of the docfocuswhenchosen property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDocfocuswhenchosen() {
        return docfocuswhenchosen;
    }

    /**
     * Sets the value of the docfocuswhenchosen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDocfocuswhenchosen(Boolean value) {
        this.docfocuswhenchosen = value;
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
