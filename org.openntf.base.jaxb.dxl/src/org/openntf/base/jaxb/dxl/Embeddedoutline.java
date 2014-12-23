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
 * <p>Java class for embeddedoutline complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="embeddedoutline">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="control" type="{http://www.lotus.com/dxl}control" minOccurs="0"/>
 *         &lt;element name="title" type="{http://www.lotus.com/dxl}title" minOccurs="0"/>
 *         &lt;element name="toplevel" type="{http://www.lotus.com/dxl}toplevel" minOccurs="0"/>
 *         &lt;element name="sublevel" type="{http://www.lotus.com/dxl}sublevel" minOccurs="0"/>
 *         &lt;element name="twistieimage" type="{http://www.lotus.com/dxl}twistieimage" minOccurs="0"/>
 *         &lt;element name="border" type="{http://www.lotus.com/dxl}border" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.lotus.com/dxl}direction.attrs"/>
 *       &lt;attribute name="display" type="{http://www.lotus.com/dxl}outline.displaydirections" default="vertical" />
 *       &lt;attribute name="expand" type="{http://www.lotus.com/dxl}outline.expandtypes" default="saved" />
 *       &lt;attribute name="imagelabel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="rootname" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="samebackground" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="samefont" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="showtwistie" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="osstyletwistie" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="targetframe" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="tileimage" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="type" type="{http://www.lotus.com/dxl}outline.types" default="tree" />
 *       &lt;attribute name="useappletinbrowser" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}string" default="100%" />
 *       &lt;attribute name="widthtype" type="{http://www.lotus.com/dxl}eoutline.sizetypes" default="fitwindow" />
 *       &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}string" default="1in" />
 *       &lt;attribute name="heighttype" type="{http://www.lotus.com/dxl}eoutline.sizetypes" default="fixed" />
 *       &lt;attribute name="scrollbars" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="showviewcontents" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="outline" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="database" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="showfolderunread" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="characters" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="columnwidth" type="{http://www.w3.org/2001/XMLSchema}string" default="0in" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "embeddedoutline", namespace = "http://www.lotus.com/dxl", propOrder = {
    "control",
    "title",
    "toplevel",
    "sublevel",
    "twistieimage",
    "border"
})
public class Embeddedoutline {

    protected Control control;
    protected Title title;
    protected Toplevel toplevel;
    protected Sublevel sublevel;
    protected Twistieimage twistieimage;
    protected Border border;
    @XmlAttribute
    protected OutlineDisplaydirections display;
    @XmlAttribute
    protected OutlineExpandtypes expand;
    @XmlAttribute
    protected String imagelabel;
    @XmlAttribute
    protected String name;
    @XmlAttribute
    protected String rootname;
    @XmlAttribute
    protected Boolean samebackground;
    @XmlAttribute
    protected Boolean samefont;
    @XmlAttribute
    protected Boolean showtwistie;
    @XmlAttribute
    protected Boolean osstyletwistie;
    @XmlAttribute
    protected String targetframe;
    @XmlAttribute
    protected Boolean tileimage;
    @XmlAttribute
    protected OutlineTypes type;
    @XmlAttribute
    protected Boolean useappletinbrowser;
    @XmlAttribute
    protected String width;
    @XmlAttribute
    protected EoutlineSizetypes widthtype;
    @XmlAttribute
    protected String height;
    @XmlAttribute
    protected EoutlineSizetypes heighttype;
    @XmlAttribute
    protected Boolean scrollbars;
    @XmlAttribute
    protected Boolean showviewcontents;
    @XmlAttribute
    protected String outline;
    @XmlAttribute
    protected String database;
    @XmlAttribute
    protected Boolean showfolderunread;
    @XmlAttribute
    protected BigInteger characters;
    @XmlAttribute
    protected String columnwidth;
    @XmlAttribute
    protected String direction;

    /**
     * Gets the value of the control property.
     * 
     * @return
     *     possible object is
     *     {@link Control }
     *     
     */
    public Control getControl() {
        return control;
    }

    /**
     * Sets the value of the control property.
     * 
     * @param value
     *     allowed object is
     *     {@link Control }
     *     
     */
    public void setControl(Control value) {
        this.control = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link Title }
     *     
     */
    public Title getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link Title }
     *     
     */
    public void setTitle(Title value) {
        this.title = value;
    }

    /**
     * Gets the value of the toplevel property.
     * 
     * @return
     *     possible object is
     *     {@link Toplevel }
     *     
     */
    public Toplevel getToplevel() {
        return toplevel;
    }

    /**
     * Sets the value of the toplevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Toplevel }
     *     
     */
    public void setToplevel(Toplevel value) {
        this.toplevel = value;
    }

    /**
     * Gets the value of the sublevel property.
     * 
     * @return
     *     possible object is
     *     {@link Sublevel }
     *     
     */
    public Sublevel getSublevel() {
        return sublevel;
    }

    /**
     * Sets the value of the sublevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sublevel }
     *     
     */
    public void setSublevel(Sublevel value) {
        this.sublevel = value;
    }

    /**
     * Gets the value of the twistieimage property.
     * 
     * @return
     *     possible object is
     *     {@link Twistieimage }
     *     
     */
    public Twistieimage getTwistieimage() {
        return twistieimage;
    }

    /**
     * Sets the value of the twistieimage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Twistieimage }
     *     
     */
    public void setTwistieimage(Twistieimage value) {
        this.twistieimage = value;
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
     * Gets the value of the display property.
     * 
     * @return
     *     possible object is
     *     {@link OutlineDisplaydirections }
     *     
     */
    public OutlineDisplaydirections getDisplay() {
        if (display == null) {
            return OutlineDisplaydirections.VERTICAL;
        } else {
            return display;
        }
    }

    /**
     * Sets the value of the display property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutlineDisplaydirections }
     *     
     */
    public void setDisplay(OutlineDisplaydirections value) {
        this.display = value;
    }

    /**
     * Gets the value of the expand property.
     * 
     * @return
     *     possible object is
     *     {@link OutlineExpandtypes }
     *     
     */
    public OutlineExpandtypes getExpand() {
        if (expand == null) {
            return OutlineExpandtypes.SAVED;
        } else {
            return expand;
        }
    }

    /**
     * Sets the value of the expand property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutlineExpandtypes }
     *     
     */
    public void setExpand(OutlineExpandtypes value) {
        this.expand = value;
    }

    /**
     * Gets the value of the imagelabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImagelabel() {
        return imagelabel;
    }

    /**
     * Sets the value of the imagelabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImagelabel(String value) {
        this.imagelabel = value;
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
     * Gets the value of the rootname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRootname() {
        return rootname;
    }

    /**
     * Sets the value of the rootname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRootname(String value) {
        this.rootname = value;
    }

    /**
     * Gets the value of the samebackground property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSamebackground() {
        if (samebackground == null) {
            return false;
        } else {
            return samebackground;
        }
    }

    /**
     * Sets the value of the samebackground property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSamebackground(Boolean value) {
        this.samebackground = value;
    }

    /**
     * Gets the value of the samefont property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSamefont() {
        if (samefont == null) {
            return false;
        } else {
            return samefont;
        }
    }

    /**
     * Sets the value of the samefont property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSamefont(Boolean value) {
        this.samefont = value;
    }

    /**
     * Gets the value of the showtwistie property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowtwistie() {
        return showtwistie;
    }

    /**
     * Sets the value of the showtwistie property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowtwistie(Boolean value) {
        this.showtwistie = value;
    }

    /**
     * Gets the value of the osstyletwistie property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOsstyletwistie() {
        return osstyletwistie;
    }

    /**
     * Sets the value of the osstyletwistie property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOsstyletwistie(Boolean value) {
        this.osstyletwistie = value;
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
     * Gets the value of the tileimage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTileimage() {
        return tileimage;
    }

    /**
     * Sets the value of the tileimage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTileimage(Boolean value) {
        this.tileimage = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link OutlineTypes }
     *     
     */
    public OutlineTypes getType() {
        if (type == null) {
            return OutlineTypes.TREE;
        } else {
            return type;
        }
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutlineTypes }
     *     
     */
    public void setType(OutlineTypes value) {
        this.type = value;
    }

    /**
     * Gets the value of the useappletinbrowser property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseappletinbrowser() {
        return useappletinbrowser;
    }

    /**
     * Sets the value of the useappletinbrowser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseappletinbrowser(Boolean value) {
        this.useappletinbrowser = value;
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
        if (width == null) {
            return "100%";
        } else {
            return width;
        }
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
     *     {@link EoutlineSizetypes }
     *     
     */
    public EoutlineSizetypes getWidthtype() {
        if (widthtype == null) {
            return EoutlineSizetypes.FITWINDOW;
        } else {
            return widthtype;
        }
    }

    /**
     * Sets the value of the widthtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link EoutlineSizetypes }
     *     
     */
    public void setWidthtype(EoutlineSizetypes value) {
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
        if (height == null) {
            return "1in";
        } else {
            return height;
        }
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
     *     {@link EoutlineSizetypes }
     *     
     */
    public EoutlineSizetypes getHeighttype() {
        if (heighttype == null) {
            return EoutlineSizetypes.FIXED;
        } else {
            return heighttype;
        }
    }

    /**
     * Sets the value of the heighttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link EoutlineSizetypes }
     *     
     */
    public void setHeighttype(EoutlineSizetypes value) {
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
            return true;
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
     * Gets the value of the showviewcontents property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isShowviewcontents() {
        if (showviewcontents == null) {
            return false;
        } else {
            return showviewcontents;
        }
    }

    /**
     * Sets the value of the showviewcontents property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowviewcontents(Boolean value) {
        this.showviewcontents = value;
    }

    /**
     * Gets the value of the outline property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutline() {
        return outline;
    }

    /**
     * Sets the value of the outline property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutline(String value) {
        this.outline = value;
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
     * Gets the value of the showfolderunread property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isShowfolderunread() {
        if (showfolderunread == null) {
            return false;
        } else {
            return showfolderunread;
        }
    }

    /**
     * Sets the value of the showfolderunread property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowfolderunread(Boolean value) {
        this.showfolderunread = value;
    }

    /**
     * Gets the value of the characters property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCharacters() {
        return characters;
    }

    /**
     * Sets the value of the characters property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCharacters(BigInteger value) {
        this.characters = value;
    }

    /**
     * Gets the value of the columnwidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumnwidth() {
        if (columnwidth == null) {
            return "0in";
        } else {
            return columnwidth;
        }
    }

    /**
     * Sets the value of the columnwidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumnwidth(String value) {
        this.columnwidth = value;
    }

    /**
     * Gets the value of the direction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirection() {
        if (direction == null) {
            return "lefttoright";
        } else {
            return direction;
        }
    }

    /**
     * Sets the value of the direction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirection(String value) {
        this.direction = value;
    }

}
