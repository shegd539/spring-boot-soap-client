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
 *         &lt;element name="firmSecurity" type="{http://schemas.datacontract.org/2004/07/SunGard.Phase3.Core.Backend.Application.Contracts.DTO}FirmSecurity" minOccurs="0"/&gt;
 *         &lt;element name="abaNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "firmSecurity",
    "abaNumber"
})
@XmlRootElement(name = "GetBankName")
public class GetBankName {

    @XmlElementRef(name = "firmSecurity", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<FirmSecurity> firmSecurity;
    @XmlElementRef(name = "abaNumber", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> abaNumber;

    /**
     * Gets the value of the firmSecurity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FirmSecurity }{@code >}
     *     
     */
    public JAXBElement<FirmSecurity> getFirmSecurity() {
        return firmSecurity;
    }

    /**
     * Sets the value of the firmSecurity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FirmSecurity }{@code >}
     *     
     */
    public void setFirmSecurity(JAXBElement<FirmSecurity> value) {
        this.firmSecurity = value;
    }

    /**
     * Gets the value of the abaNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAbaNumber() {
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
    public void setAbaNumber(JAXBElement<String> value) {
        this.abaNumber = value;
    }

}
