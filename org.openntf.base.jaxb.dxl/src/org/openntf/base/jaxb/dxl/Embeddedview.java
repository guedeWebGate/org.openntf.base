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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for embeddedview complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="embeddedview">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="code" type="{http://www.lotus.com/dxl}code" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="sparefont" type="{http://www.lotus.com/dxl}sparefont" minOccurs="0"/>
 *         &lt;element name="border" type="{http://www.lotus.com/dxl}border" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="embeddedname" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sclickframe" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="dclickframe" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="usedefaultlines" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="displayusing" type="{http://www.lotus.com/dxl}embeddedview.display.types" default="javaapplet" />
 *       &lt;attribute name="linestodisplay" type="{http://www.w3.org/2001/XMLSchema}integer" default="0" />
 *       &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="widthtype" type="{http://www.lotus.com/dxl}embedded.fit.types" default="fixed" />
 *       &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="heighttype" type="{http://www.lotus.com/dxl}embedded.fit.types" default="fixed" />
 *       &lt;attribute name="scrollbars" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="showheader" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="selectionfollowsmouse" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="transparentbackground" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="showentriesaslinks" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="showactionbar" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="showselectionmargin" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="database" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="showcurrentthreadonly" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="useviewsselectionmarginprop" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "embeddedview", namespace = "http://www.lotus.com/dxl", propOrder = {
    "code",
    "sparefont",
    "border"
})
public class Embeddedview {

    protected List<Code> code;
    protected Sparefont sparefont;
    protected Border border;
    @XmlAttribute
    protected String name;
    @XmlAttribute
    protected String embeddedname;
    @XmlAttribute
    protected String sclickframe;
    @XmlAttribute
    protected String dclickframe;
    @XmlAttribute
    protected Boolean usedefaultlines;
    @XmlAttribute
    protected EmbeddedviewDisplayTypes displayusing;
    @XmlAttribute
    protected BigInteger linestodisplay;
    @XmlAttribute
    protected String width;
    @XmlAttribute
    protected EmbeddedFitTypes widthtype;
    @XmlAttribute
    protected String height;
    @XmlAttribute
    protected EmbeddedFitTypes heighttype;
    @XmlAttribute
    protected Boolean scrollbars;
    @XmlAttribute
    protected Boolean showheader;
    @XmlAttribute
    protected Boolean selectionfollowsmouse;
    @XmlAttribute
    protected Boolean transparentbackground;
    @XmlAttribute
    protected Boolean showentriesaslinks;
    @XmlAttribute
    protected Boolean showactionbar;
    @XmlAttribute
    protected Boolean showselectionmargin;
    @XmlAttribute
    protected String database;
    @XmlAttribute
    protected Boolean showcurrentthreadonly;
    @XmlAttribute
    protected Boolean useviewsselectionmarginprop;

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
     * Gets the value of the sparefont property.
     * 
     * @return
     *     possible object is
     *     {@link Sparefont }
     *     
     */
    public Sparefont getSparefont() {
        return sparefont;
    }

    /**
     * Sets the value of the sparefont property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sparefont }
     *     
     */
    public void setSparefont(Sparefont value) {
        this.sparefont = value;
    }

    /**
     * Gets the value of the border property.
     * 
     * @return
     *     possible object is
     *     {@link Border }
     *     
     */
    public Border getBorder() {
        return border;
    }

    /**
     * Sets the value of the border property.
     * 
     * @param value
     *     allowed object is
     *     {@link Border }
     *     
     */
    public void setBorder(Border value) {
        this.border = value;
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
     * Gets the value of the embeddedname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmbeddedname() {
        return embeddedname;
    }

    /**
     * Sets the value of the embeddedname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmbeddedname(String value) {
        this.embeddedname = value;
    }

    /**
     * Gets the value of the sclickframe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSclickframe() {
        return sclickframe;
    }

    /**
     * Sets the value of the sclickframe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSclickframe(String value) {
        this.sclickframe = value;
    }

    /**
     * Gets the value of the dclickframe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDclickframe() {
        return dclickframe;
    }

    /**
     * Sets the value of the dclickframe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDclickframe(String value) {
        this.dclickframe = value;
    }

    /**
     * Gets the value of the usedefaultlines property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isUsedefaultlines() {
        if (usedefaultlines == null) {
            return true;
        } else {
            return usedefaultlines;
        }
    }

    /**
     * Sets the value of the usedefaultlines property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUsedefaultlines(Boolean value) {
        this.usedefaultlines = value;
    }

    /**
     * Gets the value of the displayusing property.
     * 
     * @return
     *     possible object is
     *     {@link EmbeddedviewDisplayTypes }
     *     
     */
    public EmbeddedviewDisplayTypes getDisplayusing() {
        if (displayusing == null) {
            return EmbeddedviewDisplayTypes.JAVAAPPLET;
        } else {
            return displayusing;
        }
    }

    /**
     * Sets the value of the displayusing property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmbeddedviewDisplayTypes }
     *     
     */
    public void setDisplayusing(EmbeddedviewDisplayTypes value) {
        this.displayusing = value;
    }

    /**
     * Gets the value of the linestodisplay property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLinestodisplay() {
        if (linestodisplay == null) {
            return new BigInteger("0");
        } else {
            return linestodisplay;
        }
    }

    /**
     * Sets the value of the linestodisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLinestodisplay(BigInteger value) {
        this.linestodisplay = value;
    }

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWidth(String value) {
        this.width = value;
    }

    /**
     * Gets the value of the widthtype property.
     * 
     * @return
     *     possible object is
     *     {@link EmbeddedFitTypes }
     *     
     */
    public EmbeddedFitTypes getWidthtype() {
        if (widthtype == null) {
            return EmbeddedFitTypes.FIXED;
        } else {
            return widthtype;
        }
    }

    /**
     * Sets the value of the widthtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmbeddedFitTypes }
     *     
     */
    public void setWidthtype(EmbeddedFitTypes value) {
        this.widthtype = value;
    }

    /**
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeight(String value) {
        this.height = value;
    }

    /**
     * Gets the value of the heighttype property.
     * 
     * @return
     *     possible object is
     *     {@link EmbeddedFitTypes }
     *     
     */
    public EmbeddedFitTypes getHeighttype() {
        if (heighttype == null) {
            return EmbeddedFitTypes.FIXED;
        } else {
            return heighttype;
        }
    }

    /**
     * Sets the value of the heighttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmbeddedFitTypes }
     *     
     */
    public void setHeighttype(EmbeddedFitTypes value) {
        this.heighttype = value;
    }

    /**
     * Gets the value of the scrollbars property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isScrollbars() {
        if (scrollbars == null) {
            return false;
        } else {
            return scrollbars;
        }
    }

    /**
     * Sets the value of the scrollbars property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setScrollbars(Boolean value) {
        this.scrollbars = value;
    }

    /**
     * Gets the value of the showheader property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isShowheader() {
        if (showheader == null) {
            return true;
        } else {
            return showheader;
        }
    }

    /**
     * Sets the value of the showheader property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowheader(Boolean value) {
        this.showheader = value;
    }

    /**
     * Gets the value of the selectionfollowsmouse property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSelectionfollowsmouse() {
        if (selectionfollowsmouse == null) {
            return false;
        } else {
            return selectionfollowsmouse;
        }
    }

    /**
     * Sets the value of the selectionfollowsmouse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSelectionfollowsmouse(Boolean value) {
        this.selectionfollowsmouse = value;
    }

    /**
     * Gets the value of the transparentbackground property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isTransparentbackground() {
        if (transparentbackground == null) {
            return false;
        } else {
            return transparentbackground;
        }
    }

    /**
     * Sets the value of the transparentbackground property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTransparentbackground(Boolean value) {
        this.transparentbackground = value;
    }

    /**
     * Gets the value of the showentriesaslinks property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isShowentriesaslinks() {
        if (showentriesaslinks == null) {
            return false;
        } else {
            return showentriesaslinks;
        }
    }

    /**
     * Sets the value of the showentriesaslinks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowentriesaslinks(Boolean value) {
        this.showentriesaslinks = value;
    }

    /**
     * Gets the value of the showactionbar property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isShowactionbar() {
        if (showactionbar == null) {
            return false;
        } else {
            return showactionbar;
        }
    }

    /**
     * Sets the value of the showactionbar property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowactionbar(Boolean value) {
        this.showactionbar = value;
    }

    /**
     * Gets the value of the showselectionmargin property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isShowselectionmargin() {
        if (showselectionmargin == null) {
            return false;
        } else {
            return showselectionmargin;
        }
    }

    /**
     * Sets the value of the showselectionmargin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowselectionmargin(Boolean value) {
        this.showselectionmargin = value;
    }

    /**
     * Gets the value of the database property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatabase() {
        return database;
    }

    /**
     * Sets the value of the database property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatabase(String value) {
        this.database = value;
    }

    /**
     * Gets the value of the showcurrentthreadonly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isShowcurrentthreadonly() {
        if (showcurrentthreadonly == null) {
            return false;
        } else {
            return showcurrentthreadonly;
        }
    }

    /**
     * Sets the value of the showcurrentthreadonly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowcurrentthreadonly(Boolean value) {
        this.showcurrentthreadonly = value;
    }

    /**
     * Gets the value of the useviewsselectionmarginprop property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isUseviewsselectionmarginprop() {
        if (useviewsselectionmarginprop == null) {
            return true;
        } else {
            return useviewsselectionmarginprop;
        }
    }

    /**
     * Sets the value of the useviewsselectionmarginprop property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseviewsselectionmarginprop(Boolean value) {
        this.useviewsselectionmarginprop = value;
    }

}
