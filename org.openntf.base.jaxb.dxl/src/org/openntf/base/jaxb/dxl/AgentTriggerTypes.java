//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.23 at 02:06:11 PM CET 
//


package org.openntf.base.jaxb.dxl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for agent.trigger.types.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="agent.trigger.types">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="actionsmenu"/>
 *     &lt;enumeration value="agentlist"/>
 *     &lt;enumeration value="beforenewmail"/>
 *     &lt;enumeration value="afternewmail"/>
 *     &lt;enumeration value="docupdate"/>
 *     &lt;enumeration value="docpaste"/>
 *     &lt;enumeration value="scheduled"/>
 *     &lt;enumeration value="serverstart"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "agent.trigger.types", namespace = "http://www.lotus.com/dxl")
@XmlEnum
public enum AgentTriggerTypes {

    @XmlEnumValue("actionsmenu")
    ACTIONSMENU("actionsmenu"),
    @XmlEnumValue("agentlist")
    AGENTLIST("agentlist"),
    @XmlEnumValue("beforenewmail")
    BEFORENEWMAIL("beforenewmail"),
    @XmlEnumValue("afternewmail")
    AFTERNEWMAIL("afternewmail"),
    @XmlEnumValue("docupdate")
    DOCUPDATE("docupdate"),
    @XmlEnumValue("docpaste")
    DOCPASTE("docpaste"),
    @XmlEnumValue("scheduled")
    SCHEDULED("scheduled"),
    @XmlEnumValue("serverstart")
    SERVERSTART("serverstart");
    private final String value;

    AgentTriggerTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AgentTriggerTypes fromValue(String v) {
        for (AgentTriggerTypes c: AgentTriggerTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}