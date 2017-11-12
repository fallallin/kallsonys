
package co.com.kallsonys.esb.shipment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.kallsonys.com.co/cim/businessentities/shipment}ShipmentOrderType">
 *       &lt;sequence>
 *         &lt;element name="orderInfo" type="{http://www.kallsonys.com.co/cim/businessentities/shipment}OrderInfoType" minOccurs="0"/>
 *         &lt;element name="productVendorCompanyInfo" type="{http://www.kallsonys.com.co/cim/businessentities/shipment}ProductVendorCompanyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderType", namespace = "http://www.kallsonys.com.co/cim/message/shipment/v1")
public class OrderType
    extends ShipmentOrderType
{


}
