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
 * <p>Java class for ArrayOfAchInstruction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAchInstruction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AchInstruction" type="{http://schemas.datacontract.org/2004/07/SunGard.Phase3.Cdm.Backend.Service.Contracts}AchInstruction" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAchInstruction", namespace = "http://schemas.datacontract.org/2004/07/SunGard.Phase3.Cdm.Backend.Service.Contracts", propOrder = {
    "achInstruction"
})
public class ArrayOfAchInstruction {

    @XmlElement(name = "AchInstruction", nillable = true)
    protected List<AchInstruction> achInstruction;

    /**
     * Gets the value of the achInstruction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the achInstruction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAchInstruction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AchInstruction }
     * 
     * 
     */
    public List<AchInstruction> getAchInstruction() {
        if (achInstruction == null) {
            achInstruction = new ArrayList<AchInstruction>();
        }
        return this.achInstruction;
    }

}
