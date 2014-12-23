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
 * <p>Java class for table complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="table">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tablerowstyle" type="{http://www.lotus.com/dxl}tablerowstyle" minOccurs="0"/>
 *         &lt;element name="border" type="{http://www.lotus.com/dxl}border" minOccurs="0"/>
 *         &lt;element name="tablecolumn" type="{http://www.lotus.com/dxl}tablecolumn" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="tablerow" type="{http://www.lotus.com/dxl}tablerow" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.lotus.com/dxl}html.core.attrs"/>
 *       &lt;attGroup ref="{http://www.lotus.com/dxl}direction.attrs"/>
 *       &lt;attribute name="widthtype" type="{http://www.lotus.com/dxl}table.widthtypes" />
 *       &lt;attribute name="minrowheight" type="{http://www.w3.org/2001/XMLSchema}string" default="0" />
 *       &lt;attribute name="rowspacing" type="{http://www.w3.org/2001/XMLSchema}string" default="0" />
 *       &lt;attribute name="columnspacing" type="{http://www.w3.org/2001/XMLSchema}string" default="0" />
 *       &lt;attribute name="cellborderstyle" type="{http://www.lotus.com/dxl}table.cellborderstyles" default="solid" />
 *       &lt;attribute name="cellbordercolor" type="{http://www.w3.org/2001/XMLSchema}string" default="none" />
 *       &lt;attribute name="colorstyle" type="{http://www.lotus.com/dxl}table.colorstyles" default="none" />
 *       &lt;attribute name="bgcolor" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="altbgcolor" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="leftmargin" type="{http://www.w3.org/2001/XMLSchema}string" default="1in" />
 *       &lt;attribute name="rightmargin" type="{http://www.w3.org/2001/XMLSchema}string" default="100%" />
 *       &lt;attribute name="refwidth" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="refrightmargin" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="r4spacing" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="user4spacing" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="rowdisplay" type="{http://www.lotus.com/dxl}table.rowdisplays" default="all" />
 *       &lt;attribute name="rowtimer" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="sizetabsequally" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="firsttabindent" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="tablocation" type="{http://www.lotus.com/dxl}table.tablocations" />
 *       &lt;attribute name="outsidewrap" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="insidewrap" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="insidewrapheight" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "table", namespace = "http://www.lotus.com/dxl", propOrder = {
    "tablerowstyle",
    "border",
    "tablecolumn",
    "tablerow"
})
public class Table {

    protected Tablerowstyle tablerowstyle;
    protected Border border;
    protected List<Tablecolumn> tablecolumn;
    protected List<Tablerow> tablerow;
    @XmlAttribute
    protected TableWidthtypes widthtype;
    @XmlAttribute
    protected String minrowheight;
    @XmlAttribute
    protected String rowspacing;
    @XmlAttribute
    protected String columnspacing;
    @XmlAttribute
    protected TableCellborderstyles cellborderstyle;
    @XmlAttribute
    protected String cellbordercolor;
    @XmlAttribute
    protected TableColorstyles colorstyle;
    @XmlAttribute
    protected String bgcolor;
    @XmlAttribute
    protected String altbgcolor;
    @XmlAttribute
    protected String leftmargin;
    @XmlAttribute
    protected String rightmargin;
    @XmlAttribute
    protected String refwidth;
    @XmlAttribute
    protected String refrightmargin;
    @XmlAttribute(name = "r4spacing")
    protected Boolean r4Spacing;
    @XmlAttribute(name = "user4spacing")
    protected Boolean user4Spacing;
    @XmlAttribute
    protected TableRowdisplays rowdisplay;
    @XmlAttribute
    protected BigInteger rowtimer;
    @XmlAttribute
    protected Boolean sizetabsequally;
    @XmlAttribute
    protected String firsttabindent;
    @XmlAttribute
    protected TableTablocations tablocation;
    @XmlAttribute
    protected Boolean outsidewrap;
    @XmlAttribute
    protected Boolean insidewrap;
    @XmlAttribute
    protected String insidewrapheight;
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
    @XmlAttribute
    protected String direction;

    /**
     * Gets the value of the tablerowstyle property.
     * 
     * @return
     *     possible object is
     *     {@link Tablerowstyle }
     *     
     */
    public Tablerowstyle getTablerowstyle() {
        return tablerowstyle;
    }

    /**
     * Sets the value of the tablerowstyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tablerowstyle }
     *     
     */
    public void setTablerowstyle(Tablerowstyle value) {
        this.tablerowstyle = value;
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
     * Gets the value of the tablecolumn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tablecolumn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTablecolumn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tablecolumn }
     * 
     * 
     */
    public List<Tablecolumn> getTablecolumn() {
        if (tablecolumn == null) {
            tablecolumn = new ArrayList<Tablecolumn>();
        }
        return this.tablecolumn;
    }

    /**
     * Gets the value of the tablerow property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tablerow property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTablerow().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tablerow }
     * 
     * 
     */
    public List<Tablerow> getTablerow() {
        if (tablerow == null) {
            tablerow = new ArrayList<Tablerow>();
        }
        return this.tablerow;
    }

    /**
     * Gets the value of the widthtype property.
     * 
     * @return
     *     possible object is
     *     {@link TableWidthtypes }
     *     
     */
    public TableWidthtypes getWidthtype() {
        return widthtype;
    }

    /**
     * Sets the value of the widthtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link TableWidthtypes }
     *     
     */
    public void setWidthtype(TableWidthtypes value) {
        this.widthtype = value;
    }

    /**
     * Gets the value of the minrowheight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinrowheight() {
        if (minrowheight == null) {
            return "0";
        } else {
            return minrowheight;
        }
    }

    /**
     * Sets the value of the minrowheight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinrowheight(String value) {
        this.minrowheight = value;
    }

    /**
     * Gets the value of the rowspacing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRowspacing() {
        if (rowspacing == null) {
            return "0";
        } else {
            return rowspacing;
        }
    }

    /**
     * Sets the value of the rowspacing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRowspacing(String value) {
        this.rowspacing = value;
    }

    /**
     * Gets the value of the columnspacing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumnspacing() {
        if (columnspacing == null) {
            return "0";
        } else {
            return columnspacing;
        }
    }

    /**
     * Sets the value of the columnspacing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumnspacing(String value) {
        this.columnspacing = value;
    }

    /**
     * Gets the value of the cellborderstyle property.
     * 
     * @return
     *     possible object is
     *     {@link TableCellborderstyles }
     *     
     */
    public TableCellborderstyles getCellborderstyle() {
        if (cellborderstyle == null) {
            return TableCellborderstyles.SOLID;
        } else {
            return cellborderstyle;
        }
    }

    /**
     * Sets the value of the cellborderstyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link TableCellborderstyles }
     *     
     */
    public void setCellborderstyle(TableCellborderstyles value) {
        this.cellborderstyle = value;
    }

    /**
     * Gets the value of the cellbordercolor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCellbordercolor() {
        if (cellbordercolor == null) {
            return "none";
        } else {
            return cellbordercolor;
        }
    }

    /**
     * Sets the value of the cellbordercolor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCellbordercolor(String value) {
        this.cellbordercolor = value;
    }

    /**
     * Gets the value of the colorstyle property.
     * 
     * @return
     *     possible object is
     *     {@link TableColorstyles }
     *     
     */
    public TableColorstyles getColorstyle() {
        if (colorstyle == null) {
            return TableColorstyles.NONE;
        } else {
            return colorstyle;
        }
    }

    /**
     * Sets the value of the colorstyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link TableColorstyles }
     *     
     */
    public void setColorstyle(TableColorstyles value) {
        this.colorstyle = value;
    }

    /**
     * Gets the value of the bgcolor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBgcolor() {
        return bgcolor;
    }

    /**
     * Sets the value of the bgcolor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBgcolor(String value) {
        this.bgcolor = value;
    }

    /**
     * Gets the value of the altbgcolor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltbgcolor() {
        return altbgcolor;
    }

    /**
     * Sets the value of the altbgcolor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltbgcolor(String value) {
        this.altbgcolor = value;
    }

    /**
     * Gets the value of the leftmargin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeftmargin() {
        if (leftmargin == null) {
            return "1in";
        } else {
            return leftmargin;
        }
    }

    /**
     * Sets the value of the leftmargin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeftmargin(String value) {
        this.leftmargin = value;
    }

    /**
     * Gets the value of the rightmargin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRightmargin() {
        if (rightmargin == null) {
            return "100%";
        } else {
            return rightmargin;
        }
    }

    /**
     * Sets the value of the rightmargin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRightmargin(String value) {
        this.rightmargin = value;
    }

    /**
     * Gets the value of the refwidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefwidth() {
        return refwidth;
    }

    /**
     * Sets the value of the refwidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefwidth(String value) {
        this.refwidth = value;
    }

    /**
     * Gets the value of the refrightmargin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefrightmargin() {
        return refrightmargin;
    }

    /**
     * Sets the value of the refrightmargin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefrightmargin(String value) {
        this.refrightmargin = value;
    }

    /**
     * Gets the value of the r4Spacing property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isR4Spacing() {
        return r4Spacing;
    }

    /**
     * Sets the value of the r4Spacing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setR4Spacing(Boolean value) {
        this.r4Spacing = value;
    }

    /**
     * Gets the value of the user4Spacing property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isUser4Spacing() {
        if (user4Spacing == null) {
            return false;
        } else {
            return user4Spacing;
        }
    }

    /**
     * Sets the value of the user4Spacing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUser4Spacing(Boolean value) {
        this.user4Spacing = value;
    }

    /**
     * Gets the value of the rowdisplay property.
     * 
     * @return
     *     possible object is
     *     {@link TableRowdisplays }
     *     
     */
    public TableRowdisplays getRowdisplay() {
        if (rowdisplay == null) {
            return TableRowdisplays.ALL;
        } else {
            return rowdisplay;
        }
    }

    /**
     * Sets the value of the rowdisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link TableRowdisplays }
     *     
     */
    public void setRowdisplay(TableRowdisplays value) {
        this.rowdisplay = value;
    }

    /**
     * Gets the value of the rowtimer property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRowtimer() {
        return rowtimer;
    }

    /**
     * Sets the value of the rowtimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRowtimer(BigInteger value) {
        this.rowtimer = value;
    }

    /**
     * Gets the value of the sizetabsequally property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSizetabsequally() {
        return sizetabsequally;
    }

    /**
     * Sets the value of the sizetabsequally property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSizetabsequally(Boolean value) {
        this.sizetabsequally = value;
    }

    /**
     * Gets the value of the firsttabindent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirsttabindent() {
        return firsttabindent;
    }

    /**
     * Sets the value of the firsttabindent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirsttabindent(String value) {
        this.firsttabindent = value;
    }

    /**
     * Gets the value of the tablocation property.
     * 
     * @return
     *     possible object is
     *     {@link TableTablocations }
     *     
     */
    public TableTablocations getTablocation() {
        return tablocation;
    }

    /**
     * Sets the value of the tablocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TableTablocations }
     *     
     */
    public void setTablocation(TableTablocations value) {
        this.tablocation = value;
    }

    /**
     * Gets the value of the outsidewrap property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isOutsidewrap() {
        if (outsidewrap == null) {
            return false;
        } else {
            return outsidewrap;
        }
    }

    /**
     * Sets the value of the outsidewrap property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOutsidewrap(Boolean value) {
        this.outsidewrap = value;
    }

    /**
     * Gets the value of the insidewrap property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isInsidewrap() {
        if (insidewrap == null) {
            return false;
        } else {
            return insidewrap;
        }
    }

    /**
     * Sets the value of the insidewrap property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInsidewrap(Boolean value) {
        this.insidewrap = value;
    }

    /**
     * Gets the value of the insidewrapheight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsidewrapheight() {
        return insidewrapheight;
    }

    /**
     * Sets the value of the insidewrapheight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsidewrapheight(String value) {
        this.insidewrapheight = value;
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