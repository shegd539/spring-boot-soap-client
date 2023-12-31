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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Receipts complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Receipts"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AdvisoryData" type="{http://schemas.datacontract.org/2004/07/SunGard.Phase3.Core.Backend.Application.Contracts.DTO}AdvisoryData" minOccurs="0"/&gt;
 *         &lt;element name="CashReceipts" type="{http://schemas.datacontract.org/2004/07/SunGard.Phase3.Cdm.Backend.Service.Contracts}ArrayOfReceipt" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Receipts", namespace = "http://schemas.datacontract.org/2004/07/SunGard.Phase3.Cdm.Backend.Service.Contracts", propOrder = {
    "advisoryData",
    "cashReceipts"
})
public class Receipts {

    @XmlElementRef(name = "AdvisoryData", namespace = "http://schemas.datacontract.org/2004/07/SunGard.Phase3.Cdm.Backend.Service.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<AdvisoryData> advisoryData;
    @XmlElementRef(name = "CashReceipts", namespace = "http://schemas.datacontract.org/2004/07/SunGard.Phase3.Cdm.Backend.Service.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfReceipt> cashReceipts;

    /**
     * Gets the value of the advisoryData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AdvisoryData }{@code >}
     *     
     */
    public JAXBElement<AdvisoryData> getAdvisoryData() {
        return advisoryData;
    }

    /**
     * Sets the value of the advisoryData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AdvisoryData }{@code >}
     *     
     */
    public void setAdvisoryData(JAXBElement<AdvisoryData> value) {
        this.advisoryData = value;
    }

    /**
     * Gets the value of the cashReceipts property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfReceipt }{@code >}
     *     
     */
    public JAXBElement<ArrayOfReceipt> getCashReceipts() {
        return cashReceipts;
    }

    /**
     * Sets the value of the cashReceipts property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfReceipt }{@code >}
     *     
     */
    public void setCashReceipts(JAXBElement<ArrayOfReceipt> value) {
        this.cashReceipts = value;
    }

}
