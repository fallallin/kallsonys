
package co.com.kallsonys.esb.brms;

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
 *     &lt;restriction base="{http://www.kallsonys.com.co/cim/businessentities/order}OrderInfo_v1.0">
 *       &lt;sequence>
 *         &lt;element name="orderPrice" type="{http://www.kallsonys.com.co/cim/common/money}MoneyGeneric" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderType")
public class OrderType
    extends OrderInfoV10
{


}