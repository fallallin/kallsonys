
package co.com.kallsonys.esb.shipment;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the co.com.kallsonys.esb.shipment package. 
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
    private final static QName _HeaderRq_QNAME = new QName("http://www.kallsonys.com.co/cim/message/shipment/v1", "headerRq");
    private final static QName _Money_QNAME = new QName("http://www.kallsonys.com.co/cim/common/money", "money");
    private final static QName _HeaderRs_QNAME = new QName("http://www.kallsonys.com.co/cim/message/shipment/v1", "headerRs");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: co.com.kallsonys.esb.shipment
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
     * Create an instance of {@link CheckShipmentStatusRs }
     * 
     */
    public CheckShipmentStatusRs createCheckShipmentStatusRs() {
        return new CheckShipmentStatusRs();
    }

    /**
     * Create an instance of {@link FulfillShipmentRq }
     * 
     */
    public FulfillShipmentRq createFulfillShipmentRq() {
        return new FulfillShipmentRq();
    }

    /**
     * Create an instance of {@link Shipment }
     * 
     */
    public Shipment createShipment() {
        return new Shipment();
    }

    /**
     * Create an instance of {@link ShipmentOrderType }
     * 
     */
    public ShipmentOrderType createShipmentOrderType() {
        return new ShipmentOrderType();
    }

    /**
     * Create an instance of {@link AddresseeInfoType }
     * 
     */
    public AddresseeInfoType createAddresseeInfoType() {
        return new AddresseeInfoType();
    }

    /**
     * Create an instance of {@link CheckShipmentStatusRq }
     * 
     */
    public CheckShipmentStatusRq createCheckShipmentStatusRq() {
        return new CheckShipmentStatusRq();
    }

    /**
     * Create an instance of {@link FulfillShipmentRs }
     * 
     */
    public FulfillShipmentRs createFulfillShipmentRs() {
        return new FulfillShipmentRs();
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
     * Create an instance of {@link OrderType }
     * 
     */
    public OrderType createOrderType() {
        return new OrderType();
    }

    /**
     * Create an instance of {@link CheckOrderType }
     * 
     */
    public CheckOrderType createCheckOrderType() {
        return new CheckOrderType();
    }

    /**
     * Create an instance of {@link CheckOrderInfoType }
     * 
     */
    public CheckOrderInfoType createCheckOrderInfoType() {
        return new CheckOrderInfoType();
    }

    /**
     * Create an instance of {@link ProductVendorCompany }
     * 
     */
    public ProductVendorCompany createProductVendorCompany() {
        return new ProductVendorCompany();
    }

    /**
     * Create an instance of {@link ProductVendorCompanyType }
     * 
     */
    public ProductVendorCompanyType createProductVendorCompanyType() {
        return new ProductVendorCompanyType();
    }

    /**
     * Create an instance of {@link ItemType }
     * 
     */
    public ItemType createItemType() {
        return new ItemType();
    }

    /**
     * Create an instance of {@link AddresseeType }
     * 
     */
    public AddresseeType createAddresseeType() {
        return new AddresseeType();
    }

    /**
     * Create an instance of {@link AddressToSendType }
     * 
     */
    public AddressToSendType createAddressToSendType() {
        return new AddressToSendType();
    }

    /**
     * Create an instance of {@link OrderInfoType }
     * 
     */
    public OrderInfoType createOrderInfoType() {
        return new OrderInfoType();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionGeneric }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kallsonys.com.co/cim/common/exceptiongeneric", name = "exceptionGeneric")
    public JAXBElement<ExceptionGeneric> createExceptionGeneric(ExceptionGeneric value) {
        return new JAXBElement<ExceptionGeneric>(_ExceptionGeneric_QNAME, ExceptionGeneric.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HeaderRqType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kallsonys.com.co/cim/message/shipment/v1", name = "headerRq")
    public JAXBElement<HeaderRqType> createHeaderRq(HeaderRqType value) {
        return new JAXBElement<HeaderRqType>(_HeaderRq_QNAME, HeaderRqType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kallsonys.com.co/cim/common/money", name = "money")
    public JAXBElement<BigDecimal> createMoney(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Money_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HeaderRsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kallsonys.com.co/cim/message/shipment/v1", name = "headerRs")
    public JAXBElement<HeaderRsType> createHeaderRs(HeaderRsType value) {
        return new JAXBElement<HeaderRsType>(_HeaderRs_QNAME, HeaderRsType.class, null, value);
    }

}
