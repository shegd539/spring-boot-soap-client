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
 * <p>Java class for DisbursementList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DisbursementList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Advisory" type="{http://schemas.datacontract.org/2004/07/SunGard.Phase3.Core.Backend.Application.Contracts.DTO}AdvisoryData" minOccurs="0"/&gt;
 *         &lt;element name="CdmAdminData" type="{http://schemas.datacontract.org/2004/07/SunGard.Phase3.Cdm.Backend.Service.Contracts}CdmAdminData" minOccurs="0"/&gt;
 *         &lt;element name="Disbursements" type="{http://schemas.datacontract.org/2004/07/SunGard.Phase3.Cdm.Backend.Service.Contracts}ArrayOfDisbursement" minOccurs="0"/&gt;
 *         &lt;element name="MoreRecordsAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="pagerControl" type="{http://schemas.datacontract.org/2004/07/SunGard.Phase3.Cdm.Backend.Service.Contracts}PagerControl" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisbursementList", namespace = "http://schemas.datacontract.org/2004/07/SunGard.Phase3.Cdm.Backend.Service.Contracts", propOrder = {
    "advisory",
    "cdmAdminData",
    "disbursements",
    "moreRecordsAvailable",
    "pagerControl"
})
public class DisbursementList {

    @XmlElementRef(name = "Advisory", namespace = "http://schemas.datacontract.org/2004/07/SunGard.Phase3.Cdm.Backend.Service.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<AdvisoryData> advisory;
    @XmlElementRef(name = "CdmAdminData", namespace = "http://schemas.datacontract.org/2004/07/SunGard.Phase3.Cdm.Backend.Service.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<CdmAdminData> cdmAdminData;
    @XmlElementRef(name = "Disbursements", namespace = "http://schemas.datacontract.org/2004/07/SunGard.Phase3.Cdm.Backend.Service.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDisbursement> disbursements;
    @XmlElement(name = "MoreRecordsAvailable")
    protected Boolean moreRecordsAvailable;
    @XmlElementRef(name = "pagerControl", namespace = "http://schemas.datacontract.org/2004/07/SunGard.Phase3.Cdm.Backend.Service.Contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<PagerControl> pagerControl;

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
     * Gets the value of the cdmAdminData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CdmAdminData }{@code >}
     *     
     */
    public JAXBElement<CdmAdminData> getCdmAdminData() {
        return cdmAdminData;
    }

    /**
     * Sets the value of the cdmAdminData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CdmAdminData }{@code >}
     *     
     */
    public void setCdmAdminData(JAXBElement<CdmAdminData> value) {
        this.cdmAdminData = value;
    }

    /**
     * Gets the value of the disbursements property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDisbursement }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDisbursement> getDisbursements() {
        return disbursements;
    }

    /**
     * Sets the value of the disbursements property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDisbursement }{@code >}
     *     
     */
    public void setDisbursements(JAXBElement<ArrayOfDisbursement> value) {
        this.disbursements = value;
    }

    /**
     * Gets the value of the moreRecordsAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMoreRecordsAvailable() {
        return moreRecordsAvailable;
    }

    /**
     * Sets the value of the moreRecordsAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMoreRecordsAvailable(Boolean value) {
        this.moreRecordsAvailable = value;
    }

    /**
     * Gets the value of the pagerControl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PagerControl }{@code >}
     *     
     */
    public JAXBElement<PagerControl> getPagerControl() {
        return pagerControl;
    }

    /**
     * Sets the value of the pagerControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PagerControl }{@code >}
     *     
     */
    public void setPagerControl(JAXBElement<PagerControl> value) {
        this.pagerControl = value;
    }

}
