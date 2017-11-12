
package co.com.kallsonys.esb.vendor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuotesOrdersByFactoryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuotesOrdersByFactoryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.kallsonys.com.co/cim/businessentities/order}Order_v1.0">
 *       &lt;sequence>
 *         &lt;element name="orderInfo" type="{http://www.kallsonys.com.co/cim/message/factoryquotesorder/v1}OrderInfoPriceType" minOccurs="0"/>
 *         &lt;element name="productVendorCompanyInfo" type="{http://www.kallsonys.com.co/cim/businessentities/productvendorcompany}ProductVendorCompany" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuotesOrdersByFactoryType")
public class QuotesOrdersByFactoryType
    extends OrderV10
{


}
