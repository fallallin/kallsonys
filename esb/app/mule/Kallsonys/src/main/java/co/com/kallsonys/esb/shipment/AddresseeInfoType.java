
package co.com.kallsonys.esb.shipment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddresseeInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddresseeInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addressee" type="{http://www.kallsonys.com.co/cim/businessentities/shipment}AddresseeType" minOccurs="0"/>
 *         &lt;element name="addressToSend" type="{http://www.kallsonys.com.co/cim/businessentities/shipment}AddressToSendType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddresseeInfoType", propOrder = {
    "addressee",
    "addressToSend"
})
public class AddresseeInfoType {

    protected AddresseeType addressee;
    protected AddressToSendType addressToSend;

    /**
     * Gets the value of the addressee property.
     * 
     * @return
     *     possible object is
     *     {@link AddresseeType }
     *     
     */
    public AddresseeType getAddressee() {
        return addressee;
    }

    /**
     * Sets the value of the addressee property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddresseeType }
     *     
     */
    public void setAddressee(AddresseeType value) {
        this.addressee = value;
    }

    /**
     * Gets the value of the addressToSend property.
     * 
     * @return
     *     possible object is
     *     {@link AddressToSendType }
     *     
     */
    public AddressToSendType getAddressToSend() {
        return addressToSend;
    }

    /**
     * Sets the value of the addressToSend property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressToSendType }
     *     
     */
    public void setAddressToSend(AddressToSendType value) {
        this.addressToSend = value;
    }

}
