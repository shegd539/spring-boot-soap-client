//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.06.12 at 08:59:07 AM IST 
//


package com.zabetan.behpardakht.ipg.schemas;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SaveInternalTransferResult" type="{http://schemas.datacontract.org/2004/07/SunGard.Phase3.Core.Backend.Application.Contracts.DTO}AdvisoryData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "saveInternalTransferResult"
})
@XmlRootElement(name = "SaveInternalTransferResponse")
public class SaveInternalTransferResponse {

    @XmlElementRef(name = "SaveInternalTransferResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<AdvisoryData> saveInternalTransferResult;

    /**
     * Gets the value of the saveInternalTransferResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AdvisoryData }{@code >}
     *     
     */
    public JAXBElement<AdvisoryData> getSaveInternalTransferResult() {
        return saveInternalTransferResult;
    }

    /**
     * Sets the value of the saveInternalTransferResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AdvisoryData }{@code >}
     *     
     */
    public void setSaveInternalTransferResult(JAXBElement<AdvisoryData> value) {
        this.saveInternalTransferResult = value;
    }

}
