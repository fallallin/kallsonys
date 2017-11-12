
package co.com.kallsonys.esb.shipment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Shipment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Shipment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="partner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="order" type="{http://www.kallsonys.com.co/cim/businessentities/shipment}ShipmentOrderType" minOccurs="0"/>
 *         &lt;element name="addresseeInfo" type="{http://www.kallsonys.com.co/cim/businessentities/shipment}AddresseeInfoType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Shipment", propOrder = {
    "partner",
    "order",
    "addresseeInfo"
})
@XmlSeeAlso({
    CheckShipmentStatusRq.class,
    FulfillShipmentRq.class
})
public class Shipment {

    protected String partner;
    protected ShipmentOrderType order;
    protected AddresseeInfoType addresseeInfo;

    /**
     * Gets the value of the partner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartner() {
        return partner;
    }

    /**
     * Sets the value of the partner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartner(String value) {
        this.partner = value;
    }

    /**
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentOrderType }
     *     
     */
    public ShipmentOrderType getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentOrderType }
     *     
     */
    public void setOrder(ShipmentOrderType value) {
        this.order = value;
    }

    /**
     * Gets the value of the addresseeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AddresseeInfoType }
     *     
     */
    public AddresseeInfoType getAddresseeInfo() {
        return addresseeInfo;
    }

    /**
     * Sets the value of the addresseeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddresseeInfoType }
     *     
     */
    public void setAddresseeInfo(AddresseeInfoType value) {
        this.addresseeInfo = value;
    }

}
