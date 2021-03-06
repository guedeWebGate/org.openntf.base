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
 * <p>Java class for picture complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="picture">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="border" type="{http://www.lotus.com/dxl}border" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="gif" type="{http://www.lotus.com/dxl}gif"/>
 *           &lt;element name="png" type="{http://www.lotus.com/dxl}png"/>
 *           &lt;element name="jpeg" type="{http://www.lotus.com/dxl}jpeg"/>
 *           &lt;element name="notesbitmap" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *           &lt;element name="cgm" type="{http://www.lotus.com/dxl}cgm"/>
 *           &lt;element name="imageref" type="{http://www.lotus.com/dxl}imageref"/>
 *           &lt;element name="nativeimage" type="{http://www.lotus.com/dxl}nativeimage"/>
 *           &lt;element name="bitmap" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;/choice>
 *         &lt;element name="caption" type="{http://www.lotus.com/dxl}caption" minOccurs="0"/>
 *         &lt;element name="code" type="{http://www.lotus.com/dxl}code" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.lotus.com/dxl}html.core.attrs"/>
 *       &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="scaledheight" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="scaledwidth" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="alttext" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="align" type="{http://www.lotus.com/dxl}picture.aligns" default="baseline" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "picture", namespace = "http://www.lotus.com/dxl", propOrder = {
    "border",
    "gif",
    "png",
    "jpeg",
    "notesbitmap",
    "cgm",
    "imageref",
    "nativeimage",
    "bitmap",
    "caption",
    "code"
})
public class Picture {

    protected Border border;
    protected Gif gif;
    protected Png png;
    protected Jpeg jpeg;
    protected byte[] notesbitmap;
    protected Cgm cgm;
    protected Imageref imageref;
    protected Nativeimage nativeimage;
    protected byte[] bitmap;
    protected Caption caption;
    protected List<Code> code;
    @XmlAttribute
    protected String height;
    @XmlAttribute
    protected String width;
    @XmlAttribute
    protected String scaledheight;
    @XmlAttribute
    protected String scaledwidth;
    @XmlAttribute
    protected String alttext;
    @XmlAttribute
    protected PictureAligns align;
    @XmlAttribute
    protected String name;
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
     * Gets the value of the nativeimage property.
     * 
     * @return
     *     possible object is
     *     {@link Nativeimage }
     *     
     */
    public Nativeimage getNativeimage() {
        return nativeimage;
    }

    /**
     * Sets the value of the nativeimage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Nativeimage }
     *     
     */
    public void setNativeimage(Nativeimage value) {
        this.nativeimage = value;
    }

    /**
     * Gets the value of the bitmap property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getBitmap() {
        return bitmap;
    }

    /**
     * Sets the value of the bitmap property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setBitmap(byte[] value) {
        this.bitmap = ((byte[]) value);
    }

    /**
     * Gets the value of the caption property.
     * 
     * @return
     *     possible object is
     *     {@link Caption }
     *     
     */
    public Caption getCaption() {
        return caption;
    }

    /**
     * Sets the value of the caption property.
     * 
     * @param value
     *     allowed object is
     *     {@link Caption }
     *     
     */
    public void setCaption(Caption value) {
        this.caption = value;
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
     * Gets the value of the scaledheight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScaledheight() {
        return scaledheight;
    }

    /**
     * Sets the value of the scaledheight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScaledheight(String value) {
        this.scaledheight = value;
    }

    /**
     * Gets the value of the scaledwidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScaledwidth() {
        return scaledwidth;
    }

    /**
     * Sets the value of the scaledwidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScaledwidth(String value) {
        this.scaledwidth = value;
    }

    /**
     * Gets the value of the alttext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlttext() {
        return alttext;
    }

    /**
     * Sets the value of the alttext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlttext(String value) {
        this.alttext = value;
    }

    /**
     * Gets the value of the align property.
     * 
     * @return
     *     possible object is
     *     {@link PictureAligns }
     *     
     */
    public PictureAligns getAlign() {
        if (align == null) {
            return PictureAligns.BASELINE;
        } else {
            return align;
        }
    }

    /**
     * Sets the value of the align property.
     * 
     * @param value
     *     allowed object is
     *     {@link PictureAligns }
     *     
     */
    public void setAlign(PictureAligns value) {
        this.align = value;
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
