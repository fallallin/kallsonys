
package co.com.kallsonys.esb.payment;

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
 *     &lt;restriction base="{http://www.kallsonys.com.co/cim/businessentities/paymentcc}PaymentCC_v1.0">
 *       &lt;sequence>
 *         &lt;element name="customerInfo" type="{http://www.kallsonys.com.co/cim/businessentities/company}Company" minOccurs="0"/>
 *         &lt;element name="orderInfo" type="{http://www.kallsonys.com.co/cim/message/payment/v1}OrderInfoType" minOccurs="0"/>
 *         &lt;element name="creditCardInfo" type="{http://www.kallsonys.com.co/cim/businessentities/creditcard}CreditCard" minOccurs="0"/>
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
@XmlRootElement(name = "PaymentCreditCardRq")
public class PaymentCreditCardRq
    extends PaymentCCV10
{


}
