//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.06.12 at 08:59:07 AM IST 
//


package com.zabetan.behpardakht.ipg.schemas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfWireRecurringInstructionMini complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfWireRecurringInstructionMini"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WireRecurringInstructionMini" type="{http://schemas.datacontract.org/2004/07/SunGard.Phase3.Cdm.Backend.Service.Contracts}WireRecurringInstructionMini" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfWireRecurringInstructionMini", namespace = "http://schemas.datacontract.org/2004/07/SunGard.Phase3.Cdm.Backend.Service.Contracts", propOrder = {
    "wireRecurringInstructionMini"
})
public class ArrayOfWireRecurringInstructionMini {

    @XmlElement(name = "WireRecurringInstructionMini", nillable = true)
    protected List<WireRecurringInstructionMini> wireRecurringInstructionMini;

    /**
     * Gets the value of the wireRecurringInstructionMini property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wireRecurringInstructionMini property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWireRecurringInstructionMini().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WireRecurringInstructionMini }
     * 
     * 
     */
    public List<WireRecurringInstructionMini> getWireRecurringInstructionMini() {
        if (wireRecurringInstructionMini == null) {
            wireRecurringInstructionMini = new ArrayList<WireRecurringInstructionMini>();
        }
        return this.wireRecurringInstructionMini;
    }

}
