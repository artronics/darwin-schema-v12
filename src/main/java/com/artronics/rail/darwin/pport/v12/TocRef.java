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
 *       &lt;attribute name="toc" use="required" type="{http://www.thalesgroup.com/rtti/XmlRefData/v3}TOCType" />
 *       &lt;attribute name="tocname" use="required" type="{http://www.thalesgroup.com/rtti/XmlRefData/v3}TOCNameType" />
 *       &lt;attribute name="url" type="{http://www.thalesgroup.com/rtti/XmlRefData/v3}UrlType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "TocRef")
public class TocRef {

    @XmlAttribute(name = "toc", required = true)
    protected String toc;
    @XmlAttribute(name = "tocname", required = true)
    protected String tocname;
    @XmlAttribute(name = "url")
    protected String url;

    /**
     * Gets the value of the toc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToc() {
        return toc;
    }

    /**
     * Sets the value of the toc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToc(String value) {
        this.toc = value;
    }

    /**
     * Gets the value of the tocname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTocname() {
        return tocname;
    }

    /**
     * Sets the value of the tocname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTocname(String value) {
        this.tocname = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

}
