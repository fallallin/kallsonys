
package co.com.kallsonys.esb.shipment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *     &lt;restriction base="{http://www.kallsonys.com.co/cim/businessentities/shipment}Shipment">
 *       &lt;sequence>
 *         &lt;element name="partner" type="{http://www.kallsonys.com.co/cim/businessentities/shipmentcompany}ShipmentCompanyTypeEnum" minOccurs="0"/>
 *         &lt;element name="order" type="{http://www.kallsonys.com.co/cim/message/shipment/v1}OrderType" minOccurs="0"/>
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
@XmlType(name = "")
@XmlRootElement(name = "FulfillShipmentRq", namespace = "http://www.kallsonys.com.co/cim/message/shipment/v1")
public class FulfillShipmentRq
    extends Shipment
{


}
