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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for datetimelist complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="datetimelist">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="datetime" type="{http://www.lotus.com/dxl}datetime" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="datetimepair" type="{http://www.lotus.com/dxl}datetimepair" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datetimelist", namespace = "http://www.lotus.com/dxl", propOrder = {
    "datetime",
    "datetimepair"
})
public class Datetimelist {

    protected List<Datetime> datetime;
    protected List<Datetimepair> datetimepair;

    /**
     * Gets the value of the datetime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datetime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatetime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Datetime }
     * 
     * 
     */
    public List<Datetime> getDatetime() {
        if (datetime == null) {
            datetime = new ArrayList<Datetime>();
        }
        return this.datetime;
    }

    /**
     * Gets the value of the datetimepair property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datetimepair property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatetimepair().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Datetimepair }
     * 
     * 
     */
    public List<Datetimepair> getDatetimepair() {
        if (datetimepair == null) {
            datetimepair = new ArrayList<Datetimepair>();
        }
        return this.datetimepair;
    }

}
