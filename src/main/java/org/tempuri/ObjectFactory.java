
package org.tempuri;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the org.tempuri package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 *
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SendEmail }
     *
     */
    public SendEmail createSendEmail() {
        return new SendEmail();
    }

    /**
     * Create an instance of {@link SendEmailResponse }
     *
     */
    public SendEmailResponse createSendEmailResponse() {
        return new SendEmailResponse();
    }

    /**
     * Create an instance of {@link SendEmailRev1 }
     *
     */
    public SendEmailRev1 createSendEmailRev1() {
        return new SendEmailRev1();
    }

    /**
     * Create an instance of {@link SendEmailRev1Response }
     *
     */
    public SendEmailRev1Response createSendEmailRev1Response() {
        return new SendEmailRev1Response();
    }

}
