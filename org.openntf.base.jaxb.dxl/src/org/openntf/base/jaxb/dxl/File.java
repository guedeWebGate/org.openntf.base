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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for file complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="file">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="created" type="{http://www.lotus.com/dxl}created"/>
 *         &lt;element name="modified" type="{http://www.lotus.com/dxl}modified"/>
 *         &lt;element name="filedata" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="hosttype" type="{http://www.lotus.com/dxl}file.hosttype" default="unknown" />
 *       &lt;attribute name="compression" type="{http://www.lotus.com/dxl}file.compression" default="none" />
 *       &lt;attribute name="desiredcompression" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="attribute" type="{http://www.lotus.com/dxl}file.attributeslist" />
 *       &lt;attribute name="flags" type="{http://www.lotus.com/dxl}file.flagslist" />
 *       &lt;attribute name="encoding" type="{http://www.lotus.com/dxl}file.encoding" default="none" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="application" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="resourcestart" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="resourcesize" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="size" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="storagesize" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "file", namespace = "http://www.lotus.com/dxl", propOrder = {
    "created",
    "modified",
    "filedata"
})
public class File {

    @XmlElement(required = true)
    protected Created created;
    @XmlElement(required = true)
    protected Modified modified;
    protected byte[] filedata;
    @XmlAttribute
    protected FileHosttype hosttype;
    @XmlAttribute
    protected FileCompression compression;
    @XmlAttribute
    protected String desiredcompression;
    @XmlAttribute
    protected List<FileAttributes> attribute;
    @XmlAttribute
    protected List<FileFlags> flags;
    @XmlAttribute
    protected FileEncoding encoding;
    @XmlAttribute
    protected String name;
    @XmlAttribute
    protected String application;
    @XmlAttribute
    protected String type;
    @XmlAttribute
    protected BigInteger resourcestart;
    @XmlAttribute
    protected BigInteger resourcesize;
    @XmlAttribute
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger size;
    @XmlAttribute
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger storagesize;

    /**
     * Gets the value of the created property.
     * 
     * @return
     *     possible object is
     *     {@link Created }
     *     
     */
    public Created getCreated() {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     * @param value
     *     allowed object is
     *     {@link Created }
     *     
     */
    public void setCreated(Created value) {
        this.created = value;
    }

    /**
     * Gets the value of the modified property.
     * 
     * @return
     *     possible object is
     *     {@link Modified }
     *     
     */
    public Modified getModified() {
        return modified;
    }

    /**
     * Sets the value of the modified property.
     * 
     * @param value
     *     allowed object is
     *     {@link Modified }
     *     
     */
    public void setModified(Modified value) {
        this.modified = value;
    }

    /**
     * Gets the value of the filedata property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getFiledata() {
        return filedata;
    }

    /**
     * Sets the value of the filedata property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setFiledata(byte[] value) {
        this.filedata = ((byte[]) value);
    }

    /**
     * Gets the value of the hosttype property.
     * 
     * @return
     *     possible object is
     *     {@link FileHosttype }
     *     
     */
    public FileHosttype getHosttype() {
        if (hosttype == null) {
            return FileHosttype.UNKNOWN;
        } else {
            return hosttype;
        }
    }

    /**
     * Sets the value of the hosttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileHosttype }
     *     
     */
    public void setHosttype(FileHosttype value) {
        this.hosttype = value;
    }

    /**
     * Gets the value of the compression property.
     * 
     * @return
     *     possible object is
     *     {@link FileCompression }
     *     
     */
    public FileCompression getCompression() {
        if (compression == null) {
            return FileCompression.NONE;
        } else {
            return compression;
        }
    }

    /**
     * Sets the value of the compression property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileCompression }
     *     
     */
    public void setCompression(FileCompression value) {
        this.compression = value;
    }

    /**
     * Gets the value of the desiredcompression property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesiredcompression() {
        return desiredcompression;
    }

    /**
     * Sets the value of the desiredcompression property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesiredcompression(String value) {
        this.desiredcompression = value;
    }

    /**
     * Gets the value of the attribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FileAttributes }
     * 
     * 
     */
    public List<FileAttributes> getAttribute() {
        if (attribute == null) {
            attribute = new ArrayList<FileAttributes>();
        }
        return this.attribute;
    }

    /**
     * Gets the value of the flags property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flags property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlags().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FileFlags }
     * 
     * 
     */
    public List<FileFlags> getFlags() {
        if (flags == null) {
            flags = new ArrayList<FileFlags>();
        }
        return this.flags;
    }

    /**
     * Gets the value of the encoding property.
     * 
     * @return
     *     possible object is
     *     {@link FileEncoding }
     *     
     */
    public FileEncoding getEncoding() {
        if (encoding == null) {
            return FileEncoding.NONE;
        } else {
            return encoding;
        }
    }

    /**
     * Sets the value of the encoding property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileEncoding }
     *     
     */
    public void setEncoding(FileEncoding value) {
        this.encoding = value;
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
     * Gets the value of the application property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplication() {
        return application;
    }

    /**
     * Sets the value of the application property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplication(String value) {
        this.application = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the resourcestart property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getResourcestart() {
        return resourcestart;
    }

    /**
     * Sets the value of the resourcestart property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setResourcestart(BigInteger value) {
        this.resourcestart = value;
    }

    /**
     * Gets the value of the resourcesize property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getResourcesize() {
        return resourcesize;
    }

    /**
     * Sets the value of the resourcesize property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setResourcesize(BigInteger value) {
        this.resourcesize = value;
    }

    /**
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSize(BigInteger value) {
        this.size = value;
    }

    /**
     * Gets the value of the storagesize property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStoragesize() {
        return storagesize;
    }

    /**
     * Sets the value of the storagesize property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStoragesize(BigInteger value) {
        this.storagesize = value;
    }

}
