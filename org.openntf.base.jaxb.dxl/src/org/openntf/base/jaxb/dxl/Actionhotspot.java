//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.23 at 02:06:11 PM CET 
//


package org.openntf.base.jaxb.dxl;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for actionhotspot complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="actionhotspot">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="code" type="{http://www.lotus.com/dxl}code"/>
 *         &lt;group ref="{http://www.lotus.com/dxl}richtext.inline"/>
 *       &lt;/choice>
 *       &lt;attGroup ref="{http://www.lotus.com/dxl}html.core.attrs"/>
 *       &lt;attribute name="hotspotstyle" type="{http://www.lotus.com/dxl}action.hotspot.styles" default="border" />
 *       &lt;attribute name="targetframe" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="regionid" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "actionhotspot", namespace = "http://www.lotus.com/dxl", propOrder = {
    "content"
})
public class Actionhotspot {

    @XmlElementRefs({
        @XmlElementRef(name = "embeddedoutline", namespace = "http://www.lotus.com/dxl", type = JAXBElement.class),
        @XmlElementRef(name = "viewlink", namespace = "http://www.lotus.com/dxl", type = JAXBElement.class),
        @XmlElementRef(name = "namedelementref", namespace = "http://www.lotus.com/dxl", type = JAXBElement.class),
        @XmlElementRef(name = "sharedfieldref", namespace = "http://www.lotus.com/dxl", type = JAXBElement.class),
        @XmlElementRef(name = "databaselink", namespace = "http://www.lotus.com/dxl", type = JAXBElement.class),
        @XmlElementRef(name = "break", namespace = "http://www.lotus.com/dxl", type = JAXBElement.class),
        @XmlElementRef(name = "code", namespace = "http://www.lotus.com/dxl", type = JAXBElement.class),
        @XmlElementRef(name = "field", namespace = "http://www.lotus.com/dxl", type = JAXBElement.class),
        @XmlElementRef(name = "computedtext", namespace = "http://www.lotus.com/dxl", type = JAXBElement.class),
        @XmlElementRef(name = "layer", namespace = "http://www.lotus.com/dxl", type = JAXBElement.class),
        @XmlElementRef(name = "region", namespace = "http://www.lotus.com/dxl", type = JAXBElement.class),
        @XmlElementRef(name = "span", namespace = "http://www.lotus.com/dxl", type = JAXBElement.class),
        @XmlElementRef(name = "horizrule", namespace = "http://www.lotus.com/dxl", type = JAXBElement.class),
        @XmlElementRef(name = "embeddedfolderpane", namespace = "http://www.lotus.com/dxl", type = JAXBElement.class),
        @XmlElementRef(name = "doclink", namespace = "http://www.lotus.com/dxl", type = JAXBElement.class),
        @XmlElementRef(name = "compositedata", namespace = "http://www.lotus.com/dxl", type = JAXBElement.class),
        @XmlElementRef(name = "picture", namespace = "http://www.lotus.com/dxl", type = JAXBElement.class),
        @XmlElementRef(name = "nonxmlchar", namespace = "http://www.lotus.com/dxl", type = JAXBElement.class),
        @XmlElementRef(name = "embeddedview", namespace = "http://www.lotus.com/dxl", type = JAXBElement.class),
        @XmlElementRef(name = "namedelementlink", namespace = "http://www.lotus.com/dxl", type = JAXBElement.class),
        @XmlElementRef(name = "attachmentref", namespace = "http://www.lotus.com/dxl", type = JAXBElement.class),
        @XmlElementRef(name = "objectref", namespace = "http://www.lotus.com/dxl", type = JAXBElement.class),
        @XmlElementRef(name = "richtextdata", namespace = "http://www.lotus.com/dxl", type = JAXBElement.class),
        @XmlElementRef(name = "popup", namespace = "http://www.lotus.com/dxl", type = JAXBElement.class),
        @XmlElementRef(name = "imagemap", namespace = "http://www.lotus.com/dxl", type = JAXBElement.class),
        @XmlElementRef(name = "embeddedcontrol", namespace = "http://www.lotus.com/dxl", type = JAXBElement.class),
        @XmlElementRef(name = "embeddednavigator", namespace = "http://www.lotus.com/dxl", type = JAXBElement.class),
        @XmlElementRef(name = "anchor", namespace = "http://www.lotus.com/dxl", type = JAXBElement.class),
        @XmlElementRef(name = "button", namespace = "http://www.lotus.com/dxl", type = JAXBElement.class),
        @XmlElementRef(name = "urllink", namespace = "http://www.lotus.com/dxl", type = JAXBElement.class),
        @XmlElementRef(name = "run", namespace = "http://www.lotus.com/dxl", type = JAXBElement.class),
        @XmlElementRef(name = "embeddeddatepicker", namespace = "http://www.lotus.com/dxl", type = JAXBElement.class),
        @XmlElementRef(name = "actionhotspot", namespace = "http://www.lotus.com/dxl", type = JAXBElement.class),
        @XmlElementRef(name = "embeddedfileuploadcontrol", namespace = "http://www.lotus.com/dxl", type = JAXBElement.class),
        @XmlElementRef(name = "javaapplet", namespace = "http://www.lotus.com/dxl", type = JAXBElement.class)
    })
    @XmlMixed
    protected List<Serializable> content;
    @XmlAttribute
    protected ActionHotspotStyles hotspotstyle;
    @XmlAttribute
    protected String targetframe;
    @XmlAttribute
    protected String name;
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
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Namedelementref }{@code >}
     * {@link JAXBElement }{@code <}{@link Viewlink }{@code >}
     * {@link JAXBElement }{@code <}{@link Embeddedoutline }{@code >}
     * {@link JAXBElement }{@code <}{@link Break }{@code >}
     * {@link JAXBElement }{@code <}{@link Databaselink }{@code >}
     * {@link JAXBElement }{@code <}{@link Sharedfieldref }{@code >}
     * {@link JAXBElement }{@code <}{@link Computedtext }{@code >}
     * {@link JAXBElement }{@code <}{@link Field }{@code >}
     * {@link JAXBElement }{@code <}{@link Code }{@code >}
     * {@link String }
     * {@link JAXBElement }{@code <}{@link Region }{@code >}
     * {@link JAXBElement }{@code <}{@link Layer }{@code >}
     * {@link JAXBElement }{@code <}{@link Embeddedfolderpane }{@code >}
     * {@link JAXBElement }{@code <}{@link Horizrule }{@code >}
     * {@link JAXBElement }{@code <}{@link Span }{@code >}
     * {@link JAXBElement }{@code <}{@link Doclink }{@code >}
     * {@link JAXBElement }{@code <}{@link Picture }{@code >}
     * {@link JAXBElement }{@code <}{@link Compositedata }{@code >}
     * {@link JAXBElement }{@code <}{@link Nonxmlchar }{@code >}
     * {@link JAXBElement }{@code <}{@link Namedelementlink }{@code >}
     * {@link JAXBElement }{@code <}{@link Embeddedview }{@code >}
     * {@link JAXBElement }{@code <}{@link Attachmentref }{@code >}
     * {@link JAXBElement }{@code <}{@link Popup }{@code >}
     * {@link JAXBElement }{@code <}{@link Richtextdata }{@code >}
     * {@link JAXBElement }{@code <}{@link Objectref }{@code >}
     * {@link JAXBElement }{@code <}{@link Embeddedcontrol }{@code >}
     * {@link JAXBElement }{@code <}{@link Imagemap }{@code >}
     * {@link JAXBElement }{@code <}{@link Button }{@code >}
     * {@link JAXBElement }{@code <}{@link Anchor }{@code >}
     * {@link JAXBElement }{@code <}{@link Embeddednavigator }{@code >}
     * {@link JAXBElement }{@code <}{@link Run }{@code >}
     * {@link JAXBElement }{@code <}{@link Urllink }{@code >}
     * {@link JAXBElement }{@code <}{@link Embeddedfileuploadcontrol }{@code >}
     * {@link JAXBElement }{@code <}{@link Actionhotspot }{@code >}
     * {@link JAXBElement }{@code <}{@link Embeddeddatepicker }{@code >}
     * {@link JAXBElement }{@code <}{@link Javaapplet }{@code >}
     * 
     * 
     */
    public List<Serializable> getContent() {
        if (content == null) {
            content = new ArrayList<Serializable>();
        }
        return this.content;
    }

    /**
     * Gets the value of the hotspotstyle property.
     * 
     * @return
     *     possible object is
     *     {@link ActionHotspotStyles }
     *     
     */
    public ActionHotspotStyles getHotspotstyle() {
        if (hotspotstyle == null) {
            return ActionHotspotStyles.BORDER;
        } else {
            return hotspotstyle;
        }
    }

    /**
     * Sets the value of the hotspotstyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionHotspotStyles }
     *     
     */
    public void setHotspotstyle(ActionHotspotStyles value) {
        this.hotspotstyle = value;
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
