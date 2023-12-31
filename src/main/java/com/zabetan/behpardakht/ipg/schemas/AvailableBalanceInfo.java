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
 * <p>Java class for AvailableBalanceInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AvailableBalanceInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Advisory" type="{http://schemas.datacontract.org/2004/07/SunGard.Phase3.Core.Backend.Application.Contracts.DTO}AdvisoryData" minOccurs="0"/&gt;
 *         &lt;element name="BalanceInfo" type="{http://schemas.datacontract.org/2004/07/System.Collections.Generic}ArrayOfKeyValuePairOfstringstring" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AvailableBalanceInfo", namespace = "http://schemas.datacontract.org/2004/07/SunGard.Phase3.Cdm.Backend.Service.Contracts", propOrder = {
    "accountNumber",
    "advisory",
    "balanceInfo"
})
public class AvailableBalanceInfo {

    @XmlElementRef(name = "AccountNumber", namespace = "http://schemas.datacontract.org/2004/07/SunGard.Phase3.Cdm.Backend.Service.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> accountNumber;
    @XmlElementRef(name = "Advisory", namespace = "http://schemas.datacontract.org/2004/07/SunGard.Phase3.Cdm.Backend.Service.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<AdvisoryData> advisory;
    @XmlElementRef(name = "BalanceInfo", namespace = "http://schemas.datacontract.org/2004/07/SunGard.Phase3.Cdm.Backend.Service.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValuePairOfstringstring> balanceInfo;

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAccountNumber(JAXBElement<String> value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the advisory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AdvisoryData }{@code >}
     *     
     */
    public JAXBElement<AdvisoryData> getAdvisory() {
        return advisory;
    }

    /**
     * Sets the value of the advisory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AdvisoryData }{@code >}
     *     
     */
    public void setAdvisory(JAXBElement<AdvisoryData> value) {
        this.advisory = value;
    }

    /**
     * Gets the value of the balanceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValuePairOfstringstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValuePairOfstringstring> getBalanceInfo() {
        return balanceInfo;
    }

    /**
     * Sets the value of the balanceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValuePairOfstringstring }{@code >}
     *     
     */
    public void setBalanceInfo(JAXBElement<ArrayOfKeyValuePairOfstringstring> value) {
        this.balanceInfo = value;
    }

}
