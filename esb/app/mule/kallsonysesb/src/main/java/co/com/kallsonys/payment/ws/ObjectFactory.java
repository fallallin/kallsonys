
package co.com.kallsonys.payment.ws;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the co.com.kallsonys.payment.ws package. 
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

    private final static QName _ExceptionGeneric_QNAME = new QName("http://www.kallsonys.com.co/cim/common/exceptiongeneric", "exceptionGeneric");
    private final static QName _Money_QNAME = new QName("http://www.kallsonys.com.co/cim/common/money", "money");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: co.com.kallsonys.payment.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link VerifyCreditCardRq }
     * 
     */
    public VerifyCreditCardRq createVerifyCreditCardRq() {
        return new VerifyCreditCardRq();
    }

    /**
     * Create an instance of {@link CreditCard }
     * 
     */
    public CreditCard createCreditCard() {
        return new CreditCard();
    }

    /**
     * Create an instance of {@link PaymentCreditCardRs }
     * 
     */
    public PaymentCreditCardRs createPaymentCreditCardRs() {
        return new PaymentCreditCardRs();
    }

    /**
     * Create an instance of {@link VerifyCreditCardRs }
     * 
     */
    public VerifyCreditCardRs createVerifyCreditCardRs() {
        return new VerifyCreditCardRs();
    }

    /**
     * Create an instance of {@link PaymentCreditCardRq }
     * 
     */
    public PaymentCreditCardRq createPaymentCreditCardRq() {
        return new PaymentCreditCardRq();
    }

    /**
     * Create an instance of {@link PaymentCCV10 }
     * 
     */
    public PaymentCCV10 createPaymentCCV10() {
        return new PaymentCCV10();
    }

    /**
     * Create an instance of {@link Company }
     * 
     */
    public Company createCompany() {
        return new Company();
    }

    /**
     * Create an instance of {@link OrderInfoV10 }
     * 
     */
    public OrderInfoV10 createOrderInfoV10() {
        return new OrderInfoV10();
    }

    /**
     * Create an instance of {@link OrderInfoType }
     * 
     */
    public OrderInfoType createOrderInfoType() {
        return new OrderInfoType();
    }

    /**
     * Create an instance of {@link ShipmentCompany }
     * 
     */
    public ShipmentCompany createShipmentCompany() {
        return new ShipmentCompany();
    }

    /**
     * Create an instance of {@link Item }
     * 
     */
    public Item createItem() {
        return new Item();
    }

    /**
     * Create an instance of {@link ExceptionGeneric }
     * 
     */
    public ExceptionGeneric createExceptionGeneric() {
        return new ExceptionGeneric();
    }

    /**
     * Create an instance of {@link ProductVendorCompany }
     * 
     */
    public ProductVendorCompany createProductVendorCompany() {
        return new ProductVendorCompany();
    }

    /**
     * Create an instance of {@link ShipmentInfoV10 }
     * 
     */
    public ShipmentInfoV10 createShipmentInfoV10() {
        return new ShipmentInfoV10();
    }

    /**
     * Create an instance of {@link OrderV10 }
     * 
     */
    public OrderV10 createOrderV10() {
        return new OrderV10();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionGeneric }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kallsonys.com.co/cim/common/exceptiongeneric", name = "exceptionGeneric")
    public JAXBElement<ExceptionGeneric> createExceptionGeneric(ExceptionGeneric value) {
        return new JAXBElement<ExceptionGeneric>(_ExceptionGeneric_QNAME, ExceptionGeneric.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kallsonys.com.co/cim/common/money", name = "money")
    public JAXBElement<BigDecimal> createMoney(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Money_QNAME, BigDecimal.class, null, value);
    }

}
