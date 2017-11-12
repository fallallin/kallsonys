
package co.com.kallsonys.esb.brms;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the co.com.kallsonys.esb.brms package. 
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

    private final static QName _HeaderRs_QNAME = new QName("http://www.kallsonys.com.co/cim/message/brms/v1", "headerRs");
    private final static QName _HeaderRq_QNAME = new QName("http://www.kallsonys.com.co/cim/message/brms/v1", "headerRq");
    private final static QName _ExceptionGeneric_QNAME = new QName("http://www.kallsonys.com.co/cim/common/exceptiongeneric", "exceptionGeneric");
    private final static QName _Money_QNAME = new QName("http://www.kallsonys.com.co/cim/common/money", "money");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: co.com.kallsonys.esb.brms
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ShipmentCompany }
     * 
     */
    public ShipmentCompany createShipmentCompany() {
        return new ShipmentCompany();
    }

    /**
     * Create an instance of {@link Customer }
     * 
     */
    public Customer createCustomer() {
        return new Customer();
    }

    /**
     * Create an instance of {@link ProductVendorCompany }
     * 
     */
    public ProductVendorCompany createProductVendorCompany() {
        return new ProductVendorCompany();
    }

    /**
     * Create an instance of {@link ValidateAmountAccordingCustomerClassRs }
     * 
     */
    public ValidateAmountAccordingCustomerClassRs createValidateAmountAccordingCustomerClassRs() {
        return new ValidateAmountAccordingCustomerClassRs();
    }

    /**
     * Create an instance of {@link ValidateAmountAccordingCustomerClassRq }
     * 
     */
    public ValidateAmountAccordingCustomerClassRq createValidateAmountAccordingCustomerClassRq() {
        return new ValidateAmountAccordingCustomerClassRq();
    }

    /**
     * Create an instance of {@link CustomerType }
     * 
     */
    public CustomerType createCustomerType() {
        return new CustomerType();
    }

    /**
     * Create an instance of {@link OrderType }
     * 
     */
    public OrderType createOrderType() {
        return new OrderType();
    }

    /**
     * Create an instance of {@link DefineShipmentCompanyRs }
     * 
     */
    public DefineShipmentCompanyRs createDefineShipmentCompanyRs() {
        return new DefineShipmentCompanyRs();
    }

    /**
     * Create an instance of {@link ShipmentCompanyType }
     * 
     */
    public ShipmentCompanyType createShipmentCompanyType() {
        return new ShipmentCompanyType();
    }

    /**
     * Create an instance of {@link HeaderRsType }
     * 
     */
    public HeaderRsType createHeaderRsType() {
        return new HeaderRsType();
    }

    /**
     * Create an instance of {@link HeaderRqType }
     * 
     */
    public HeaderRqType createHeaderRqType() {
        return new HeaderRqType();
    }

    /**
     * Create an instance of {@link DefineShipmentCompanyRq }
     * 
     */
    public DefineShipmentCompanyRq createDefineShipmentCompanyRq() {
        return new DefineShipmentCompanyRq();
    }

    /**
     * Create an instance of {@link LocalizationType }
     * 
     */
    public LocalizationType createLocalizationType() {
        return new LocalizationType();
    }

    /**
     * Create an instance of {@link VendorType }
     * 
     */
    public VendorType createVendorType() {
        return new VendorType();
    }

    /**
     * Create an instance of {@link ExceptionGeneric }
     * 
     */
    public ExceptionGeneric createExceptionGeneric() {
        return new ExceptionGeneric();
    }

    /**
     * Create an instance of {@link HeaderType }
     * 
     */
    public HeaderType createHeaderType() {
        return new HeaderType();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
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
     * Create an instance of {@link OrderInfoV10 }
     * 
     */
    public OrderInfoV10 createOrderInfoV10() {
        return new OrderInfoV10();
    }

    /**
     * Create an instance of {@link Item }
     * 
     */
    public Item createItem() {
        return new Item();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HeaderRsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kallsonys.com.co/cim/message/brms/v1", name = "headerRs")
    public JAXBElement<HeaderRsType> createHeaderRs(HeaderRsType value) {
        return new JAXBElement<HeaderRsType>(_HeaderRs_QNAME, HeaderRsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HeaderRqType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kallsonys.com.co/cim/message/brms/v1", name = "headerRq")
    public JAXBElement<HeaderRqType> createHeaderRq(HeaderRqType value) {
        return new JAXBElement<HeaderRqType>(_HeaderRq_QNAME, HeaderRqType.class, null, value);
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
