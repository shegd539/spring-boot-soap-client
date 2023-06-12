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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AchInstruction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AchInstruction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ABANumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ACHAlias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ACHType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AddNewAch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="BankAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BankNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DDAIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InternalABA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Payee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PingInstruction1" type="{http://schemas.datacontract.org/2004/07/SunGard.Phase3.Cdm.Backend.Service.Contracts}PingInstruction" minOccurs="0"/&gt;
 *         &lt;element name="PingInstruction2" type="{http://schemas.datacontract.org/2004/07/SunGard.Phase3.Cdm.Backend.Service.Contracts}PingInstruction" minOccurs="0"/&gt;
 *         &lt;element name="PingInstruction3" type="{http://schemas.datacontract.org/2004/07/SunGard.Phase3.Cdm.Backend.Service.Contracts}PingInstruction" minOccurs="0"/&gt;
 *         &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AchInstruction", namespace = "http://schemas.datacontract.org/2004/07/SunGard.Phase3.Cdm.Backend.Service.Contracts", propOrder = {
    "abaNumber",
    "achAlias",
    "achType",
    "addNewAch",
    "bankAccountNumber",
    "bankName",
    "bankNumber",
    "ddaIdentifier",
    "endDate",
    "internalABA",
    "payee",
    "pingInstruction1",
    "pingInstruction2",
    "pingInstruction3",
    "priority",
    "startDate"
})
public class AchInstruction {

    @XmlElementRef(name = "ABANumber", namespace = "http://schemas.datacontract.org/2004/07/SunGard.Phase3.Cdm.Backend.Service.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> abaNumber;
    @XmlElementRef(name = "ACHAlias", namespace = "http://schemas.datacontract.org/2004/07/SunGard.Phase3.Cdm.Backend.Service.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> achAlias;
    @XmlElementRef(name = "ACHType", namespace = "http://schemas.datacontract.org/2004/07/SunGard.Phase3.Cdm.Backend.Service.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> achType;
    @XmlElement(name = "AddNewAch")
    protected Boolean addNewAch;
    @XmlElementRef(name = "BankAccountNumber", namespace = "http://schemas.datacontract.org/2004/07/SunGard.Phase3.Cdm.Backend.Service.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bankAccountNumber;
    @XmlElementRef(name = "BankName", namespace = "http://schemas.datacontract.org/2004/07/SunGard.Phase3.Cdm.Backend.Service.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bankName;
    @XmlElementRef(name = "BankNumber", namespace = "http://schemas.datacontract.org/2004/07/SunGard.Phase3.Cdm.Backend.Service.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bankNumber;
    @XmlElementRef(name = "DDAIdentifier", namespace = "http://schemas.datacontract.org/2004/07/SunGard.Phase3.Cdm.Backend.Service.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ddaIdentifier;
    @XmlElementRef(name = "EndDate", namespace = "http://schemas.datacontract.org/2004/07/SunGard.Phase3.Cdm.Backend.Service.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> endDate;
    @XmlElementRef(name = "InternalABA", namespace = "http://schemas.datacontract.org/2004/07/SunGard.Phase3.Cdm.Backend.Service.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> internalABA;
    @XmlElementRef(name = "Payee", namespace = "http://schemas.datacontract.org/2004/07/SunGard.Phase3.Cdm.Backend.Service.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> payee;
    @XmlElementRef(name = "PingInstruction1", namespace = "http://schemas.datacontract.org/2004/07/SunGard.Phase3.Cdm.Backend.Service.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<PingInstruction> pingInstruction1;
    @XmlElementRef(name = "PingInstruction2", namespace = "http://schemas.datacontract.org/2004/07/SunGard.Phase3.Cdm.Backend.Service.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<PingInstruction> pingInstruction2;
    @XmlElementRef(name = "PingInstruction3", namespace = "http://schemas.datacontract.org/2004/07/SunGard.Phase3.Cdm.Backend.Service.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<PingInstruction> pingInstruction3;
    @XmlElementRef(name = "Priority", namespace = "http://schemas.datacontract.org/2004/07/SunGard.Phase3.Cdm.Backend.Service.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> priority;
    @XmlElementRef(name = "StartDate", namespace = "http://schemas.datacontract.org/2004/07/SunGard.Phase3.Cdm.Backend.Service.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> startDate;

    /**
     * Gets the value of the abaNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getABANumber() {
        return abaNumber;
    }

    /**
     * Sets the value of the abaNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setABANumber(JAXBElement<String> value) {
        this.abaNumber = value;
    }

    /**
     * Gets the value of the achAlias property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getACHAlias() {
        return achAlias;
    }

    /**
     * Sets the value of the achAlias property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setACHAlias(JAXBElement<String> value) {
        this.achAlias = value;
    }

    /**
     * Gets the value of the achType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getACHType() {
        return achType;
    }

    /**
     * Sets the value of the achType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setACHType(JAXBElement<String> value) {
        this.achType = value;
    }

    /**
     * Gets the value of the addNewAch property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAddNewAch() {
        return addNewAch;
    }

    /**
     * Sets the value of the addNewAch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAddNewAch(Boolean value) {
        this.addNewAch = value;
    }

    /**
     * Gets the value of the bankAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBankAccountNumber() {
        return bankAccountNumber;
    }

    /**
     * Sets the value of the bankAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBankAccountNumber(JAXBElement<String> value) {
        this.bankAccountNumber = value;
    }

    /**
     * Gets the value of the bankName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBankName() {
        return bankName;
    }

    /**
     * Sets the value of the bankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBankName(JAXBElement<String> value) {
        this.bankName = value;
    }

    /**
     * Gets the value of the bankNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBankNumber() {
        return bankNumber;
    }

    /**
     * Sets the value of the bankNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBankNumber(JAXBElement<String> value) {
        this.bankNumber = value;
    }

    /**
     * Gets the value of the ddaIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDDAIdentifier() {
        return ddaIdentifier;
    }

    /**
     * Sets the value of the ddaIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDDAIdentifier(JAXBElement<String> value) {
        this.ddaIdentifier = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEndDate(JAXBElement<String> value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the internalABA property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInternalABA() {
        return internalABA;
    }

    /**
     * Sets the value of the internalABA property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInternalABA(JAXBElement<String> value) {
        this.internalABA = value;
    }

    /**
     * Gets the value of the payee property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPayee() {
        return payee;
    }

    /**
     * Sets the value of the payee property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPayee(JAXBElement<String> value) {
        this.payee = value;
    }

    /**
     * Gets the value of the pingInstruction1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PingInstruction }{@code >}
     *     
     */
    public JAXBElement<PingInstruction> getPingInstruction1() {
        return pingInstruction1;
    }

    /**
     * Sets the value of the pingInstruction1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PingInstruction }{@code >}
     *     
     */
    public void setPingInstruction1(JAXBElement<PingInstruction> value) {
        this.pingInstruction1 = value;
    }

    /**
     * Gets the value of the pingInstruction2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PingInstruction }{@code >}
     *     
     */
    public JAXBElement<PingInstruction> getPingInstruction2() {
        return pingInstruction2;
    }

    /**
     * Sets the value of the pingInstruction2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PingInstruction }{@code >}
     *     
     */
    public void setPingInstruction2(JAXBElement<PingInstruction> value) {
        this.pingInstruction2 = value;
    }

    /**
     * Gets the value of the pingInstruction3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PingInstruction }{@code >}
     *     
     */
    public JAXBElement<PingInstruction> getPingInstruction3() {
        return pingInstruction3;
    }

    /**
     * Sets the value of the pingInstruction3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PingInstruction }{@code >}
     *     
     */
    public void setPingInstruction3(JAXBElement<PingInstruction> value) {
        this.pingInstruction3 = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPriority(JAXBElement<String> value) {
        this.priority = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStartDate(JAXBElement<String> value) {
        this.startDate = value;
    }

}