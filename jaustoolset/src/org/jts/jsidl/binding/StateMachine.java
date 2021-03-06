//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.12.21 at 10:07:33 AM CET 
//


package org.jts.jsidl.binding;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:jaus:jsidl:1.0}state" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:jaus:jsidl:1.0}default_state" minOccurs="0"/>
 *         &lt;element ref="{urn:jaus:jsidl:1.0}pseudo_start_state" minOccurs="0"/>
 *         &lt;element ref="{urn:jaus:jsidl:plus}mxCell" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{urn:jaus:jsidl:1.0}identifier_ns" />
 *       &lt;attribute name="interpretation" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "state",
    "defaultState",
    "pseudoStartState",
    "mxCell"
})
@XmlRootElement(name = "state_machine")
public class StateMachine {

    protected List<State> state;
    @XmlElement(name = "default_state")
    protected DefaultState defaultState;
    @XmlElement(name = "pseudo_start_state")
    protected PseudoStartState pseudoStartState;
    @XmlElement(namespace = "urn:jaus:jsidl:plus")
    protected MxCell mxCell;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "interpretation")
    @XmlSchemaType(name = "anySimpleType")
    protected String interpretation;

    /**
     * Gets the value of the state property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the state property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getState().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link State }
     * 
     * 
     */
    public List<State> getState() {
        if (state == null) {
            state = new ArrayList<State>();
        }
        return this.state;
    }

    /**
     * Gets the value of the defaultState property.
     * 
     * @return
     *     possible object is
     *     {@link DefaultState }
     *     
     */
    public DefaultState getDefaultState() {
        return defaultState;
    }

    /**
     * Sets the value of the defaultState property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultState }
     *     
     */
    public void setDefaultState(DefaultState value) {
        this.defaultState = value;
    }

    /**
     * Gets the value of the pseudoStartState property.
     * 
     * @return
     *     possible object is
     *     {@link PseudoStartState }
     *     
     */
    public PseudoStartState getPseudoStartState() {
        return pseudoStartState;
    }

    /**
     * Sets the value of the pseudoStartState property.
     * 
     * @param value
     *     allowed object is
     *     {@link PseudoStartState }
     *     
     */
    public void setPseudoStartState(PseudoStartState value) {
        this.pseudoStartState = value;
    }

    /**
     * Gets the value of the mxCell property.
     * 
     * @return
     *     possible object is
     *     {@link MxCell }
     *     
     */
    public MxCell getMxCell() {
        return mxCell;
    }

    /**
     * Sets the value of the mxCell property.
     * 
     * @param value
     *     allowed object is
     *     {@link MxCell }
     *     
     */
    public void setMxCell(MxCell value) {
        this.mxCell = value;
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
     * Gets the value of the interpretation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterpretation() {
        return interpretation;
    }

    /**
     * Sets the value of the interpretation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterpretation(String value) {
        this.interpretation = value;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    @Override
    public boolean equals(Object that) {
        String[] ignore={"interpretation"};
		return EqualsBuilder.reflectionEquals(this, that, ignore);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

}
