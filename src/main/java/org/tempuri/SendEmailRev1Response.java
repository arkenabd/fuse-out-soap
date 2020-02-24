
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
 *         &lt;element name="SendEmailRev1Result" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "sendEmailRev1Result" })
@XmlRootElement(name = "SendEmailRev1Response")
public class SendEmailRev1Response {

    @XmlElement(name = "SendEmailRev1Result")
    protected String sendEmailRev1Result;

    /**
     * Gets the value of the sendEmailRev1Result property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSendEmailRev1Result() {
        return sendEmailRev1Result;
    }

    /**
     * Sets the value of the sendEmailRev1Result property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSendEmailRev1Result(String value) {
        this.sendEmailRev1Result = value;
    }

}
