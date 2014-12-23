//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.23 at 02:06:11 PM CET 
//


package org.openntf.base.jaxb.dxl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for simpleaction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="simpleaction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice minOccurs="0">
 *         &lt;element name="modifybyformaction" type="{http://www.lotus.com/dxl}modifybyformaction"/>
 *         &lt;element name="sendreplyaction" type="{http://www.lotus.com/dxl}sendreplyaction"/>
 *         &lt;element name="sendmailaction" type="{http://www.lotus.com/dxl}sendmailaction"/>
 *         &lt;element name="sendnewsletteraction" type="{http://www.lotus.com/dxl}sendnewsletteraction"/>
 *         &lt;element name="formula" type="{http://www.lotus.com/dxl}formula"/>
 *       &lt;/choice>
 *       &lt;attribute name="action" use="required" type="{http://www.lotus.com/dxl}simpleaction.types" />
 *       &lt;attribute name="folder" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="agent" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="server" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="file" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="field" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="appendvalue" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="formulatype" type="{http://www.lotus.com/dxl}formula.types" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "simpleaction", namespace = "http://www.lotus.com/dxl", propOrder = {
    "modifybyformaction",
    "sendreplyaction",
    "sendmailaction",
    "sendnewsletteraction",
    "formula"
})
public class Simpleaction {

    protected Modifybyformaction modifybyformaction;
    protected Sendreplyaction sendreplyaction;
    protected Sendmailaction sendmailaction;
    protected Sendnewsletteraction sendnewsletteraction;
    protected Formula formula;
    @XmlAttribute(required = true)
    protected SimpleactionTypes action;
    @XmlAttribute
    protected String folder;
    @XmlAttribute
    protected String agent;
    @XmlAttribute
    protected String server;
    @XmlAttribute
    protected String file;
    @XmlAttribute
    protected String field;
    @XmlAttribute
    protected String value;
    @XmlAttribute
    protected Boolean appendvalue;
    @XmlAttribute
    protected FormulaTypes formulatype;

    /**
     * Gets the value of the modifybyformaction property.
     * 
     * @return
     *     possible object is
     *     {@link Modifybyformaction }
     *     
     */
    public Modifybyformaction getModifybyformaction() {
        return modifybyformaction;
    }

    /**
     * Sets the value of the modifybyformaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Modifybyformaction }
     *     
     */
    public void setModifybyformaction(Modifybyformaction value) {
        this.modifybyformaction = value;
    }

    /**
     * Gets the value of the sendreplyaction property.
     * 
     * @return
     *     possible object is
     *     {@link Sendreplyaction }
     *     
     */
    public Sendreplyaction getSendreplyaction() {
        return sendreplyaction;
    }

    /**
     * Sets the value of the sendreplyaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sendreplyaction }
     *     
     */
    public void setSendreplyaction(Sendreplyaction value) {
        this.sendreplyaction = value;
    }

    /**
     * Gets the value of the sendmailaction property.
     * 
     * @return
     *     possible object is
     *     {@link Sendmailaction }
     *     
     */
    public Sendmailaction getSendmailaction() {
        return sendmailaction;
    }

    /**
     * Sets the value of the sendmailaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sendmailaction }
     *     
     */
    public void setSendmailaction(Sendmailaction value) {
        this.sendmailaction = value;
    }

    /**
     * Gets the value of the sendnewsletteraction property.
     * 
     * @return
     *     possible object is
     *     {@link Sendnewsletteraction }
     *     
     */
    public Sendnewsletteraction getSendnewsletteraction() {
        return sendnewsletteraction;
    }

    /**
     * Sets the value of the sendnewsletteraction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sendnewsletteraction }
     *     
     */
    public void setSendnewsletteraction(Sendnewsletteraction value) {
        this.sendnewsletteraction = value;
    }

    /**
     * Gets the value of the formula property.
     * 
     * @return
     *     possible object is
     *     {@link Formula }
     *     
     */
    public Formula getFormula() {
        return formula;
    }

    /**
     * Sets the value of the formula property.
     * 
     * @param value
     *     allowed object is
     *     {@link Formula }
     *     
     */
    public void setFormula(Formula value) {
        this.formula = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleactionTypes }
     *     
     */
    public SimpleactionTypes getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleactionTypes }
     *     
     */
    public void setAction(SimpleactionTypes value) {
        this.action = value;
    }

    /**
     * Gets the value of the folder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolder() {
        return folder;
    }

    /**
     * Sets the value of the folder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolder(String value) {
        this.folder = value;
    }

    /**
     * Gets the value of the agent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgent() {
        return agent;
    }

    /**
     * Sets the value of the agent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgent(String value) {
        this.agent = value;
    }

    /**
     * Gets the value of the server property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServer() {
        return server;
    }

    /**
     * Sets the value of the server property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServer(String value) {
        this.server = value;
    }

    /**
     * Gets the value of the file property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFile() {
        return file;
    }

    /**
     * Sets the value of the file property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFile(String value) {
        this.file = value;
    }

    /**
     * Gets the value of the field property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField() {
        return field;
    }

    /**
     * Sets the value of the field property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField(String value) {
        this.field = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the appendvalue property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAppendvalue() {
        return appendvalue;
    }

    /**
     * Sets the value of the appendvalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAppendvalue(Boolean value) {
        this.appendvalue = value;
    }

    /**
     * Gets the value of the formulatype property.
     * 
     * @return
     *     possible object is
     *     {@link FormulaTypes }
     *     
     */
    public FormulaTypes getFormulatype() {
        return formulatype;
    }

    /**
     * Sets the value of the formulatype property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormulaTypes }
     *     
     */
    public void setFormulatype(FormulaTypes value) {
        this.formulatype = value;
    }

}
