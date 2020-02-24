
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="_strEmailAddrTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="_strPasswordPDF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="_strCrdContent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="_strContent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="_strCustName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "strEmailAddrTo", "strPasswordPDF", "strCrdContent", "strContent", "strCustName" })
@XmlRootElement(name = "SendEmail")
public class SendEmail {

    @XmlElement(name = "_strEmailAddrTo")
    protected String strEmailAddrTo;
    @XmlElement(name = "_strPasswordPDF")
    protected String strPasswordPDF;
    @XmlElement(name = "_strCrdContent")
    protected String strCrdContent;
    @XmlElement(name = "_strContent")
    protected String strContent;
    @XmlElement(name = "_strCustName")
    protected String strCustName;

    /**
     * Gets the value of the strEmailAddrTo property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStrEmailAddrTo() {
        return strEmailAddrTo;
    }

    /**
     * Sets the value of the strEmailAddrTo property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStrEmailAddrTo(String value) {
        this.strEmailAddrTo = value;
    }

    /**
     * Gets the value of the strPasswordPDF property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStrPasswordPDF() {
        return strPasswordPDF;
    }

    /**
     * Sets the value of the strPasswordPDF property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStrPasswordPDF(String value) {
        this.strPasswordPDF = value;
    }

    /**
     * Gets the value of the strCrdContent property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStrCrdContent() {
        return strCrdContent;
    }

    /**
     * Sets the value of the strCrdContent property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStrCrdContent(String value) {
        this.strCrdContent = value;
    }

    /**
     * Gets the value of the strContent property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStrContent() {
        return strContent;
    }

    /**
     * Sets the value of the strContent property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStrContent(String value) {
        this.strContent = value;
    }

    /**
     * Gets the value of the strCustName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStrCustName() {
        return strCustName;
    }

    /**
     * Sets the value of the strCustName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStrCustName(String value) {
        this.strCustName = value;
    }

}
