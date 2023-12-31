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
 * <p>Java class for FirmSecurity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FirmSecurity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FirmId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Phase3AuthorizedId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Phase3AuthorizedPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FirmSecurity", namespace = "http://schemas.datacontract.org/2004/07/SunGard.Phase3.Core.Backend.Application.Contracts.DTO", propOrder = {
    "firmId",
    "phase3AuthorizedId",
    "phase3AuthorizedPassword",
    "userId"
})
public class FirmSecurity {

    @XmlElementRef(name = "FirmId", namespace = "http://schemas.datacontract.org/2004/07/SunGard.Phase3.Core.Backend.Application.Contracts.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> firmId;
    @XmlElementRef(name = "Phase3AuthorizedId", namespace = "http://schemas.datacontract.org/2004/07/SunGard.Phase3.Core.Backend.Application.Contracts.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> phase3AuthorizedId;
    @XmlElementRef(name = "Phase3AuthorizedPassword", namespace = "http://schemas.datacontract.org/2004/07/SunGard.Phase3.Core.Backend.Application.Contracts.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> phase3AuthorizedPassword;
    @XmlElementRef(name = "UserId", namespace = "http://schemas.datacontract.org/2004/07/SunGard.Phase3.Core.Backend.Application.Contracts.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userId;

    /**
     * Gets the value of the firmId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFirmId() {
        return firmId;
    }

    /**
     * Sets the value of the firmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFirmId(JAXBElement<String> value) {
        this.firmId = value;
    }

    /**
     * Gets the value of the phase3AuthorizedId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPhase3AuthorizedId() {
        return phase3AuthorizedId;
    }

    /**
     * Sets the value of the phase3AuthorizedId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPhase3AuthorizedId(JAXBElement<String> value) {
        this.phase3AuthorizedId = value;
    }

    /**
     * Gets the value of the phase3AuthorizedPassword property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPhase3AuthorizedPassword() {
        return phase3AuthorizedPassword;
    }

    /**
     * Sets the value of the phase3AuthorizedPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPhase3AuthorizedPassword(JAXBElement<String> value) {
        this.phase3AuthorizedPassword = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserId(JAXBElement<String> value) {
        this.userId = value;
    }

}
