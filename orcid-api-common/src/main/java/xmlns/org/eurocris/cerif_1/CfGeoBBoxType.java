//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.26 at 11:29:18 AM GMT 
//


package xmlns.org.eurocris.cerif_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for cfGeoBBox__Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cfGeoBBox__Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cfGeoBBoxId" type="{urn:xmlns:org:eurocris:cerif-1.6-2}cfId__Type"/>
 *         &lt;element name="cfWBLong" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="cfEBLong" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="cfSBLat" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="cfNBLat" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="cfMinElev" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="cfMaxElev" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="cfURI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="cfName" type="{urn:xmlns:org:eurocris:cerif-1.6-2}cfMLangString__Type"/>
 *           &lt;element name="cfDescr" type="{urn:xmlns:org:eurocris:cerif-1.6-2}cfMLangString__Type"/>
 *           &lt;element name="cfKeyw" type="{urn:xmlns:org:eurocris:cerif-1.6-2}cfMLangString__Type"/>
 *           &lt;element name="cfPAddr_GeoBBox">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="cfPAddrId" type="{urn:xmlns:org:eurocris:cerif-1.6-2}cfId__Type"/>
 *                     &lt;group ref="{urn:xmlns:org:eurocris:cerif-1.6-2}cfCoreClassWithFraction__Group"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="cfGeoBBox_Class" type="{urn:xmlns:org:eurocris:cerif-1.6-2}cfCoreClassWithFraction__Type"/>
 *           &lt;element name="cfGeoBBox_GeoBBox">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;choice>
 *                       &lt;element name="cfGeoBBoxId2" type="{urn:xmlns:org:eurocris:cerif-1.6-2}cfId__Type"/>
 *                       &lt;element name="cfGeoBBoxId1" type="{urn:xmlns:org:eurocris:cerif-1.6-2}cfId__Type"/>
 *                     &lt;/choice>
 *                     &lt;group ref="{urn:xmlns:org:eurocris:cerif-1.6-2}cfCoreClassWithFraction__Group"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="cfResProd_GeoBBox">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="cfResProdId" type="{urn:xmlns:org:eurocris:cerif-1.6-2}cfId__Type"/>
 *                     &lt;group ref="{urn:xmlns:org:eurocris:cerif-1.6-2}cfCoreClassWithFraction__Group"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="cfGeoBBox_Meas">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="cfMeasId" type="{urn:xmlns:org:eurocris:cerif-1.6-2}cfId__Type"/>
 *                     &lt;group ref="{urn:xmlns:org:eurocris:cerif-1.6-2}cfCoreClassWithFraction__Group"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="cfFedId" type="{urn:xmlns:org:eurocris:cerif-1.6-2}cfFedId__EmbType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cfGeoBBox__Type", propOrder = {
    "cfGeoBBoxId",
    "cfWBLong",
    "cfEBLong",
    "cfSBLat",
    "cfNBLat",
    "cfMinElev",
    "cfMaxElev",
    "cfURI",
    "cfNameOrCfDescrOrCfKeyw"
})
public class CfGeoBBoxType {

    @XmlElement(required = true)
    protected String cfGeoBBoxId;
    protected Float cfWBLong;
    protected Float cfEBLong;
    protected Float cfSBLat;
    protected Float cfNBLat;
    protected Float cfMinElev;
    protected Float cfMaxElev;
    protected String cfURI;
    @XmlElementRefs({
        @XmlElementRef(name = "cfGeoBBox_GeoBBox", namespace = "urn:xmlns:org:eurocris:cerif-1.6-2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "cfGeoBBox_Class", namespace = "urn:xmlns:org:eurocris:cerif-1.6-2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "cfResProd_GeoBBox", namespace = "urn:xmlns:org:eurocris:cerif-1.6-2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "cfPAddr_GeoBBox", namespace = "urn:xmlns:org:eurocris:cerif-1.6-2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "cfKeyw", namespace = "urn:xmlns:org:eurocris:cerif-1.6-2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "cfDescr", namespace = "urn:xmlns:org:eurocris:cerif-1.6-2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "cfName", namespace = "urn:xmlns:org:eurocris:cerif-1.6-2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "cfFedId", namespace = "urn:xmlns:org:eurocris:cerif-1.6-2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "cfGeoBBox_Meas", namespace = "urn:xmlns:org:eurocris:cerif-1.6-2", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> cfNameOrCfDescrOrCfKeyw;

    /**
     * Gets the value of the cfGeoBBoxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCfGeoBBoxId() {
        return cfGeoBBoxId;
    }

    /**
     * Sets the value of the cfGeoBBoxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCfGeoBBoxId(String value) {
        this.cfGeoBBoxId = value;
    }

    /**
     * Gets the value of the cfWBLong property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCfWBLong() {
        return cfWBLong;
    }

    /**
     * Sets the value of the cfWBLong property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCfWBLong(Float value) {
        this.cfWBLong = value;
    }

    /**
     * Gets the value of the cfEBLong property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCfEBLong() {
        return cfEBLong;
    }

    /**
     * Sets the value of the cfEBLong property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCfEBLong(Float value) {
        this.cfEBLong = value;
    }

    /**
     * Gets the value of the cfSBLat property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCfSBLat() {
        return cfSBLat;
    }

    /**
     * Sets the value of the cfSBLat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCfSBLat(Float value) {
        this.cfSBLat = value;
    }

    /**
     * Gets the value of the cfNBLat property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCfNBLat() {
        return cfNBLat;
    }

    /**
     * Sets the value of the cfNBLat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCfNBLat(Float value) {
        this.cfNBLat = value;
    }

    /**
     * Gets the value of the cfMinElev property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCfMinElev() {
        return cfMinElev;
    }

    /**
     * Sets the value of the cfMinElev property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCfMinElev(Float value) {
        this.cfMinElev = value;
    }

    /**
     * Gets the value of the cfMaxElev property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCfMaxElev() {
        return cfMaxElev;
    }

    /**
     * Sets the value of the cfMaxElev property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCfMaxElev(Float value) {
        this.cfMaxElev = value;
    }

    /**
     * Gets the value of the cfURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCfURI() {
        return cfURI;
    }

    /**
     * Sets the value of the cfURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCfURI(String value) {
        this.cfURI = value;
    }

    /**
     * Gets the value of the cfNameOrCfDescrOrCfKeyw property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cfNameOrCfDescrOrCfKeyw property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCfNameOrCfDescrOrCfKeyw().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link CfCoreClassWithFractionType }{@code >}
     * {@link JAXBElement }{@code <}{@link CfGeoBBoxType.CfGeoBBoxGeoBBox }{@code >}
     * {@link JAXBElement }{@code <}{@link CfGeoBBoxType.CfResProdGeoBBox }{@code >}
     * {@link JAXBElement }{@code <}{@link CfGeoBBoxType.CfPAddrGeoBBox }{@code >}
     * {@link JAXBElement }{@code <}{@link CfMLangStringType }{@code >}
     * {@link JAXBElement }{@code <}{@link CfMLangStringType }{@code >}
     * {@link JAXBElement }{@code <}{@link CfMLangStringType }{@code >}
     * {@link JAXBElement }{@code <}{@link CfGeoBBoxType.CfGeoBBoxMeas }{@code >}
     * {@link JAXBElement }{@code <}{@link CfFedIdEmbType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getCfNameOrCfDescrOrCfKeyw() {
        if (cfNameOrCfDescrOrCfKeyw == null) {
            cfNameOrCfDescrOrCfKeyw = new ArrayList<JAXBElement<?>>();
        }
        return this.cfNameOrCfDescrOrCfKeyw;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;choice>
     *           &lt;element name="cfGeoBBoxId2" type="{urn:xmlns:org:eurocris:cerif-1.6-2}cfId__Type"/>
     *           &lt;element name="cfGeoBBoxId1" type="{urn:xmlns:org:eurocris:cerif-1.6-2}cfId__Type"/>
     *         &lt;/choice>
     *         &lt;group ref="{urn:xmlns:org:eurocris:cerif-1.6-2}cfCoreClassWithFraction__Group"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "cfGeoBBoxId2",
        "cfGeoBBoxId1",
        "cfClassId",
        "cfClassSchemeId",
        "cfStartDate",
        "cfEndDate",
        "cfFraction"
    })
    public static class CfGeoBBoxGeoBBox {

        protected String cfGeoBBoxId2;
        protected String cfGeoBBoxId1;
        @XmlElement(required = true)
        protected String cfClassId;
        @XmlElement(required = true)
        protected String cfClassSchemeId;
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar cfStartDate;
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar cfEndDate;
        protected Float cfFraction;

        /**
         * Gets the value of the cfGeoBBoxId2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCfGeoBBoxId2() {
            return cfGeoBBoxId2;
        }

        /**
         * Sets the value of the cfGeoBBoxId2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCfGeoBBoxId2(String value) {
            this.cfGeoBBoxId2 = value;
        }

        /**
         * Gets the value of the cfGeoBBoxId1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCfGeoBBoxId1() {
            return cfGeoBBoxId1;
        }

        /**
         * Sets the value of the cfGeoBBoxId1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCfGeoBBoxId1(String value) {
            this.cfGeoBBoxId1 = value;
        }

        /**
         * Gets the value of the cfClassId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCfClassId() {
            return cfClassId;
        }

        /**
         * Sets the value of the cfClassId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCfClassId(String value) {
            this.cfClassId = value;
        }

        /**
         * Gets the value of the cfClassSchemeId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCfClassSchemeId() {
            return cfClassSchemeId;
        }

        /**
         * Sets the value of the cfClassSchemeId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCfClassSchemeId(String value) {
            this.cfClassSchemeId = value;
        }

        /**
         * Gets the value of the cfStartDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCfStartDate() {
            return cfStartDate;
        }

        /**
         * Sets the value of the cfStartDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCfStartDate(XMLGregorianCalendar value) {
            this.cfStartDate = value;
        }

        /**
         * Gets the value of the cfEndDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCfEndDate() {
            return cfEndDate;
        }

        /**
         * Sets the value of the cfEndDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCfEndDate(XMLGregorianCalendar value) {
            this.cfEndDate = value;
        }

        /**
         * Gets the value of the cfFraction property.
         * 
         * @return
         *     possible object is
         *     {@link Float }
         *     
         */
        public Float getCfFraction() {
            return cfFraction;
        }

        /**
         * Sets the value of the cfFraction property.
         * 
         * @param value
         *     allowed object is
         *     {@link Float }
         *     
         */
        public void setCfFraction(Float value) {
            this.cfFraction = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="cfMeasId" type="{urn:xmlns:org:eurocris:cerif-1.6-2}cfId__Type"/>
     *         &lt;group ref="{urn:xmlns:org:eurocris:cerif-1.6-2}cfCoreClassWithFraction__Group"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "cfMeasId",
        "cfClassId",
        "cfClassSchemeId",
        "cfStartDate",
        "cfEndDate",
        "cfFraction"
    })
    public static class CfGeoBBoxMeas {

        @XmlElement(required = true)
        protected String cfMeasId;
        @XmlElement(required = true)
        protected String cfClassId;
        @XmlElement(required = true)
        protected String cfClassSchemeId;
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar cfStartDate;
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar cfEndDate;
        protected Float cfFraction;

        /**
         * Gets the value of the cfMeasId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCfMeasId() {
            return cfMeasId;
        }

        /**
         * Sets the value of the cfMeasId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCfMeasId(String value) {
            this.cfMeasId = value;
        }

        /**
         * Gets the value of the cfClassId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCfClassId() {
            return cfClassId;
        }

        /**
         * Sets the value of the cfClassId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCfClassId(String value) {
            this.cfClassId = value;
        }

        /**
         * Gets the value of the cfClassSchemeId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCfClassSchemeId() {
            return cfClassSchemeId;
        }

        /**
         * Sets the value of the cfClassSchemeId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCfClassSchemeId(String value) {
            this.cfClassSchemeId = value;
        }

        /**
         * Gets the value of the cfStartDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCfStartDate() {
            return cfStartDate;
        }

        /**
         * Sets the value of the cfStartDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCfStartDate(XMLGregorianCalendar value) {
            this.cfStartDate = value;
        }

        /**
         * Gets the value of the cfEndDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCfEndDate() {
            return cfEndDate;
        }

        /**
         * Sets the value of the cfEndDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCfEndDate(XMLGregorianCalendar value) {
            this.cfEndDate = value;
        }

        /**
         * Gets the value of the cfFraction property.
         * 
         * @return
         *     possible object is
         *     {@link Float }
         *     
         */
        public Float getCfFraction() {
            return cfFraction;
        }

        /**
         * Sets the value of the cfFraction property.
         * 
         * @param value
         *     allowed object is
         *     {@link Float }
         *     
         */
        public void setCfFraction(Float value) {
            this.cfFraction = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="cfPAddrId" type="{urn:xmlns:org:eurocris:cerif-1.6-2}cfId__Type"/>
     *         &lt;group ref="{urn:xmlns:org:eurocris:cerif-1.6-2}cfCoreClassWithFraction__Group"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "cfPAddrId",
        "cfClassId",
        "cfClassSchemeId",
        "cfStartDate",
        "cfEndDate",
        "cfFraction"
    })
    public static class CfPAddrGeoBBox {

        @XmlElement(required = true)
        protected String cfPAddrId;
        @XmlElement(required = true)
        protected String cfClassId;
        @XmlElement(required = true)
        protected String cfClassSchemeId;
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar cfStartDate;
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar cfEndDate;
        protected Float cfFraction;

        /**
         * Gets the value of the cfPAddrId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCfPAddrId() {
            return cfPAddrId;
        }

        /**
         * Sets the value of the cfPAddrId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCfPAddrId(String value) {
            this.cfPAddrId = value;
        }

        /**
         * Gets the value of the cfClassId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCfClassId() {
            return cfClassId;
        }

        /**
         * Sets the value of the cfClassId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCfClassId(String value) {
            this.cfClassId = value;
        }

        /**
         * Gets the value of the cfClassSchemeId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCfClassSchemeId() {
            return cfClassSchemeId;
        }

        /**
         * Sets the value of the cfClassSchemeId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCfClassSchemeId(String value) {
            this.cfClassSchemeId = value;
        }

        /**
         * Gets the value of the cfStartDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCfStartDate() {
            return cfStartDate;
        }

        /**
         * Sets the value of the cfStartDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCfStartDate(XMLGregorianCalendar value) {
            this.cfStartDate = value;
        }

        /**
         * Gets the value of the cfEndDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCfEndDate() {
            return cfEndDate;
        }

        /**
         * Sets the value of the cfEndDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCfEndDate(XMLGregorianCalendar value) {
            this.cfEndDate = value;
        }

        /**
         * Gets the value of the cfFraction property.
         * 
         * @return
         *     possible object is
         *     {@link Float }
         *     
         */
        public Float getCfFraction() {
            return cfFraction;
        }

        /**
         * Sets the value of the cfFraction property.
         * 
         * @param value
         *     allowed object is
         *     {@link Float }
         *     
         */
        public void setCfFraction(Float value) {
            this.cfFraction = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="cfResProdId" type="{urn:xmlns:org:eurocris:cerif-1.6-2}cfId__Type"/>
     *         &lt;group ref="{urn:xmlns:org:eurocris:cerif-1.6-2}cfCoreClassWithFraction__Group"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "cfResProdId",
        "cfClassId",
        "cfClassSchemeId",
        "cfStartDate",
        "cfEndDate",
        "cfFraction"
    })
    public static class CfResProdGeoBBox {

        @XmlElement(required = true)
        protected String cfResProdId;
        @XmlElement(required = true)
        protected String cfClassId;
        @XmlElement(required = true)
        protected String cfClassSchemeId;
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar cfStartDate;
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar cfEndDate;
        protected Float cfFraction;

        /**
         * Gets the value of the cfResProdId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCfResProdId() {
            return cfResProdId;
        }

        /**
         * Sets the value of the cfResProdId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCfResProdId(String value) {
            this.cfResProdId = value;
        }

        /**
         * Gets the value of the cfClassId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCfClassId() {
            return cfClassId;
        }

        /**
         * Sets the value of the cfClassId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCfClassId(String value) {
            this.cfClassId = value;
        }

        /**
         * Gets the value of the cfClassSchemeId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCfClassSchemeId() {
            return cfClassSchemeId;
        }

        /**
         * Sets the value of the cfClassSchemeId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCfClassSchemeId(String value) {
            this.cfClassSchemeId = value;
        }

        /**
         * Gets the value of the cfStartDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCfStartDate() {
            return cfStartDate;
        }

        /**
         * Sets the value of the cfStartDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCfStartDate(XMLGregorianCalendar value) {
            this.cfStartDate = value;
        }

        /**
         * Gets the value of the cfEndDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCfEndDate() {
            return cfEndDate;
        }

        /**
         * Sets the value of the cfEndDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCfEndDate(XMLGregorianCalendar value) {
            this.cfEndDate = value;
        }

        /**
         * Gets the value of the cfFraction property.
         * 
         * @return
         *     possible object is
         *     {@link Float }
         *     
         */
        public Float getCfFraction() {
            return cfFraction;
        }

        /**
         * Sets the value of the cfFraction property.
         * 
         * @param value
         *     allowed object is
         *     {@link Float }
         *     
         */
        public void setCfFraction(Float value) {
            this.cfFraction = value;
        }

    }

}