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
 * <p>Java class for tablecell complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tablecell">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cellbackground" type="{http://www.lotus.com/dxl}cellbackground" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;group ref="{http://www.lotus.com/dxl}richtext.block"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.lotus.com/dxl}html.core.attrs"/>
 *       &lt;attribute name="bgcolor" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="rowspan" type="{http://www.w3.org/2001/XMLSchema}integer" default="1" />
 *       &lt;attribute name="columnspan" type="{http://www.w3.org/2001/XMLSchema}integer" default="1" />
 *       &lt;attribute name="colorstyle" type="{http://www.lotus.com/dxl}tablecell.color.styles" />
 *       &lt;attribute name="altbgcolor" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="valign" type="{http://www.lotus.com/dxl}vertical.aligns" />
 *       &lt;attribute name="borderwidth" type="{http://www.w3.org/2001/XMLSchema}string" default="1px" />
 *       &lt;attribute name="rowheader" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="columnheader" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="transition" type="{http://www.lotus.com/dxl}tablecell.transitions" default="none" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tablecell", namespace = "http://www.lotus.com/dxl", propOrder = {
    "cellbackground",
    "parOrPardefOrTable"
})
public class Tablecell {

    protected Cellbackground cellbackground;
    @XmlElements({
        @XmlElement(name = "par", type = Par.class),
        @XmlElement(name = "formregionbegin", type = Formregionbegin.class),
        @XmlElement(name = "block", type = Block.class),
        @XmlElement(name = "subformref", type = Subformref.class),
        @XmlElement(name = "compositedata", type = Compositedata.class),
        @XmlElement(name = "section", type = Section.class),
        @XmlElement(name = "table", type = Table.class),
        @XmlElement(name = "formregionend", type = Formregionend.class),
        @XmlElement(name = "pardef", type = Pardef.class)
    })
    protected List<java.lang.Object> parOrPardefOrTable;
    @XmlAttribute
    protected String bgcolor;
    @XmlAttribute
    protected BigInteger rowspan;
    @XmlAttribute
    protected BigInteger columnspan;
    @XmlAttribute
    protected TablecellColorStyles colorstyle;
    @XmlAttribute
    protected String altbgcolor;
    @XmlAttribute
    protected VerticalAligns valign;
    @XmlAttribute
    protected String borderwidth;
    @XmlAttribute
    protected Boolean rowheader;
    @XmlAttribute
    protected Boolean columnheader;
    @XmlAttribute
    protected TablecellTransitions transition;
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
     * Gets the value of the cellbackground property.
     * 
     * @return
     *     possible object is
     *     {@link Cellbackground }
     *     
     */
    public Cellbackground getCellbackground() {
        return cellbackground;
    }

    /**
     * Sets the value of the cellbackground property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cellbackground }
     *     
     */
    public void setCellbackground(Cellbackground value) {
        this.cellbackground = value;
    }

    /**
     * Gets the value of the parOrPardefOrTable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parOrPardefOrTable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParOrPardefOrTable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Par }
     * {@link Formregionbegin }
     * {@link Block }
     * {@link Subformref }
     * {@link Compositedata }
     * {@link Section }
     * {@link Table }
     * {@link Formregionend }
     * {@link Pardef }
     * 
     * 
     */
    public List<java.lang.Object> getParOrPardefOrTable() {
        if (parOrPardefOrTable == null) {
            parOrPardefOrTable = new ArrayList<java.lang.Object>();
        }
        return this.parOrPardefOrTable;
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
     * Gets the value of the rowspan property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRowspan() {
        if (rowspan == null) {
            return new BigInteger("1");
        } else {
            return rowspan;
        }
    }

    /**
     * Sets the value of the rowspan property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRowspan(BigInteger value) {
        this.rowspan = value;
    }

    /**
     * Gets the value of the columnspan property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getColumnspan() {
        if (columnspan == null) {
            return new BigInteger("1");
        } else {
            return columnspan;
        }
    }

    /**
     * Sets the value of the columnspan property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setColumnspan(BigInteger value) {
        this.columnspan = value;
    }

    /**
     * Gets the value of the colorstyle property.
     * 
     * @return
     *     possible object is
     *     {@link TablecellColorStyles }
     *     
     */
    public TablecellColorStyles getColorstyle() {
        return colorstyle;
    }

    /**
     * Sets the value of the colorstyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link TablecellColorStyles }
     *     
     */
    public void setColorstyle(TablecellColorStyles value) {
        this.colorstyle = value;
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
     * Gets the value of the valign property.
     * 
     * @return
     *     possible object is
     *     {@link VerticalAligns }
     *     
     */
    public VerticalAligns getValign() {
        return valign;
    }

    /**
     * Sets the value of the valign property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerticalAligns }
     *     
     */
    public void setValign(VerticalAligns value) {
        this.valign = value;
    }

    /**
     * Gets the value of the borderwidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorderwidth() {
        if (borderwidth == null) {
            return "1px";
        } else {
            return borderwidth;
        }
    }

    /**
     * Sets the value of the borderwidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorderwidth(String value) {
        this.borderwidth = value;
    }

    /**
     * Gets the value of the rowheader property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isRowheader() {
        if (rowheader == null) {
            return false;
        } else {
            return rowheader;
        }
    }

    /**
     * Sets the value of the rowheader property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRowheader(Boolean value) {
        this.rowheader = value;
    }

    /**
     * Gets the value of the columnheader property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isColumnheader() {
        if (columnheader == null) {
            return false;
        } else {
            return columnheader;
        }
    }

    /**
     * Sets the value of the columnheader property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setColumnheader(Boolean value) {
        this.columnheader = value;
    }

    /**
     * Gets the value of the transition property.
     * 
     * @return
     *     possible object is
     *     {@link TablecellTransitions }
     *     
     */
    public TablecellTransitions getTransition() {
        if (transition == null) {
            return TablecellTransitions.NONE;
        } else {
            return transition;
        }
    }

    /**
     * Sets the value of the transition property.
     * 
     * @param value
     *     allowed object is
     *     {@link TablecellTransitions }
     *     
     */
    public void setTransition(TablecellTransitions value) {
        this.transition = value;
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
