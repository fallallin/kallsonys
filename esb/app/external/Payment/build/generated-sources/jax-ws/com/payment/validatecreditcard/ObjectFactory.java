
package com.payment.validatecreditcard;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.payment.validatecreditcard package. 
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

    private final static QName _Payment_QNAME = new QName("http://payment.com/ValidateCreditCard", "Payment");
    private final static QName _Valid_QNAME = new QName("http://payment.com/ValidateCreditCard", "valid");
    private final static QName _IsPaid_QNAME = new QName("http://payment.com/ValidateCreditCard", "isPaid");
    private final static QName _CreditCard_QNAME = new QName("http://payment.com/ValidateCreditCard", "CreditCard");
    private final static QName _Error_QNAME = new QName("http://payment.com/ValidateCreditCard", "error");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.payment.validatecreditcard
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PaymentType }
     * 
     */
    public PaymentType createPaymentType() {
        return new PaymentType();
    }

    /**
     * Create an instance of {@link CreditCardType }
     * 
     */
    public CreditCardType createCreditCardType() {
        return new CreditCardType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://payment.com/ValidateCreditCard", name = "Payment")
    public JAXBElement<PaymentType> createPayment(PaymentType value) {
        return new JAXBElement<PaymentType>(_Payment_QNAME, PaymentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://payment.com/ValidateCreditCard", name = "valid")
    public JAXBElement<Boolean> createValid(Boolean value) {
        return new JAXBElement<Boolean>(_Valid_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://payment.com/ValidateCreditCard", name = "isPaid")
    public JAXBElement<Boolean> createIsPaid(Boolean value) {
        return new JAXBElement<Boolean>(_IsPaid_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditCardType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://payment.com/ValidateCreditCard", name = "CreditCard")
    public JAXBElement<CreditCardType> createCreditCard(CreditCardType value) {
        return new JAXBElement<CreditCardType>(_CreditCard_QNAME, CreditCardType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://payment.com/ValidateCreditCard", name = "error")
    public JAXBElement<String> createError(String value) {
        return new JAXBElement<String>(_Error_QNAME, String.class, null, value);
    }

}
