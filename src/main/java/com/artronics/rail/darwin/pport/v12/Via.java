//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.12.08 at 11:29:01 PM GMT 
//


package com.artronics.rail.darwin.pport.v12;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="at" use="required" type="{http://www.thalesgroup.com/rtti/XmlRefData/v3}CrsType" />
 *       &lt;attribute name="dest" use="required" type="{http://www.thalesgroup.com/rtti/XmlRefData/v3}TiplocType" />
 *       &lt;attribute name="loc1" use="required" type="{http://www.thalesgroup.com/rtti/XmlRefData/v3}TiplocType" />
 *       &lt;attribute name="loc2" type="{http://www.thalesgroup.com/rtti/XmlRefData/v3}TiplocType" />
 *       &lt;attribute name="viatext" use="required" type="{http://www.thalesgroup.com/rtti/XmlRefData/v3}ViaTextType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "Via")
public class Via {

    @XmlAttribute(name = "at", required = true)
    protected String at;
    @XmlAttribute(name = "dest", required = true)
    protected String dest;
    @XmlAttribute(name = "loc1", required = true)
    protected String loc1;
    @XmlAttribute(name = "loc2")
    protected String loc2;
    @XmlAttribute(name = "viatext", required = true)
    protected String viatext;

    /**
     * Gets the value of the at property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAt() {
        return at;
    }

    /**
     * Sets the value of the at property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAt(String value) {
        this.at = value;
    }

    /**
     * Gets the value of the dest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDest() {
        return dest;
    }

    /**
     * Sets the value of the dest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDest(String value) {
        this.dest = value;
    }

    /**
     * Gets the value of the loc1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoc1() {
        return loc1;
    }

    /**
     * Sets the value of the loc1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoc1(String value) {
        this.loc1 = value;
    }

    /**
     * Gets the value of the loc2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoc2() {
        return loc2;
    }

    /**
     * Sets the value of the loc2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoc2(String value) {
        this.loc2 = value;
    }

    /**
     * Gets the value of the viatext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViatext() {
        return viatext;
    }

    /**
     * Sets the value of the viatext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViatext(String value) {
        this.viatext = value;
    }

}
