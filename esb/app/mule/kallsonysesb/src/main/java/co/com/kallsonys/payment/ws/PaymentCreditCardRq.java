
package co.com.kallsonys.payment.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
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
