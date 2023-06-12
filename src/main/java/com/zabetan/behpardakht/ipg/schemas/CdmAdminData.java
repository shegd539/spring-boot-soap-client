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
 * <p>Java class for CdmAdminData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CdmAdminData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ApproverModel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DisableAcb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DisableAchInstructions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DisableApproverEditing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DisableThirdPartyCheck" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DisableWireCurr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CdmAdminData", namespace = "http://schemas.datacontract.org/2004/07/SunGard.Phase3.Cdm.Backend.Service.Contracts", propOrder = {
    "approverModel",
    "disableAcb",
    "disableAchInstructions",
    "disableApproverEditing",
    "disableThirdPartyCheck",
    "disableWireCurr"
})
public class CdmAdminData {

    @XmlElementRef(name = "ApproverModel", namespace = "http://schemas.datacontract.org/2004/07/SunGard.Phase3.Cdm.Backend.Service.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> approverModel;
    @XmlElementRef(name = "DisableAcb", namespace = "http://schemas.datacontract.org/2004/07/SunGard.Phase3.Cdm.Backend.Service.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> disableAcb;
    @XmlElementRef(name = "DisableAchInstructions", namespace = "http://schemas.datacontract.org/2004/07/SunGard.Phase3.Cdm.Backend.Service.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> disableAchInstructions;
    @XmlElementRef(name = "DisableApproverEditing", namespace = "http://schemas.datacontract.org/2004/07/SunGard.Phase3.Cdm.Backend.Service.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> disableApproverEditing;
    @XmlElementRef(name = "DisableThirdPartyCheck", namespace = "http://schemas.datacontract.org/2004/07/SunGard.Phase3.Cdm.Backend.Service.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> disableThirdPartyCheck;
    @XmlElementRef(name = "DisableWireCurr", namespace = "http://schemas.datacontract.org/2004/07/SunGard.Phase3.Cdm.Backend.Service.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> disableWireCurr;

    /**
     * Gets the value of the approverModel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApproverModel() {
        return approverModel;
    }

    /**
     * Sets the value of the approverModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApproverModel(JAXBElement<String> value) {
        this.approverModel = value;
    }

    /**
     * Gets the value of the disableAcb property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDisableAcb() {
        return disableAcb;
    }

    /**
     * Sets the value of the disableAcb property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDisableAcb(JAXBElement<String> value) {
        this.disableAcb = value;
    }

    /**
     * Gets the value of the disableAchInstructions property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDisableAchInstructions() {
        return disableAchInstructions;
    }

    /**
     * Sets the value of the disableAchInstructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDisableAchInstructions(JAXBElement<String> value) {
        this.disableAchInstructions = value;
    }

    /**
     * Gets the value of the disableApproverEditing property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDisableApproverEditing() {
        return disableApproverEditing;
    }

    /**
     * Sets the value of the disableApproverEditing property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDisableApproverEditing(JAXBElement<String> value) {
        this.disableApproverEditing = value;
    }

    /**
     * Gets the value of the disableThirdPartyCheck property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDisableThirdPartyCheck() {
        return disableThirdPartyCheck;
    }

    /**
     * Sets the value of the disableThirdPartyCheck property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDisableThirdPartyCheck(JAXBElement<String> value) {
        this.disableThirdPartyCheck = value;
    }

    /**
     * Gets the value of the disableWireCurr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDisableWireCurr() {
        return disableWireCurr;
    }

    /**
     * Sets the value of the disableWireCurr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDisableWireCurr(JAXBElement<String> value) {
        this.disableWireCurr = value;
    }

}
