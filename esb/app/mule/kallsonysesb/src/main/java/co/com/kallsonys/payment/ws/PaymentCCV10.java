
package co.com.kallsonys.payment.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PaymentCC_v1.0 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PaymentCC_v1.0">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customerInfo" type="{http://www.kallsonys.com.co/cim/businessentities/company}Company" minOccurs="0"/>
 *         &lt;element name="orderInfo" type="{http://www.kallsonys.com.co/cim/businessentities/order}OrderInfo_v1.0" minOccurs="0"/>
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
@XmlType(name = "PaymentCC_v1.0", namespace = "http://www.kallsonys.com.co/cim/businessentities/paymentcc", propOrder = {
    "customerInfo",
    "orderInfo",
    "creditCardInfo"
})
@XmlSeeAlso({
    PaymentCreditCardRq.class
})
public class PaymentCCV10 {

    protected Company customerInfo;
    protected OrderInfoV10 orderInfo;
    protected CreditCard creditCardInfo;

    /**
     * Obtiene el valor de la propiedad customerInfo.
     * 
     * @return
     *     possible object is
     *     {@link Company }
     *     
     */
    public Company getCustomerInfo() {
        return customerInfo;
    }

    /**
     * Define el valor de la propiedad customerInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link Company }
     *     
     */
    public void setCustomerInfo(Company value) {
        this.customerInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad orderInfo.
     * 
     * @return
     *     possible object is
     *     {@link OrderInfoV10 }
     *     
     */
    public OrderInfoV10 getOrderInfo() {
        return orderInfo;
    }

    /**
     * Define el valor de la propiedad orderInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderInfoV10 }
     *     
     */
    public void setOrderInfo(OrderInfoV10 value) {
        this.orderInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad creditCardInfo.
     * 
     * @return
     *     possible object is
     *     {@link CreditCard }
     *     
     */
    public CreditCard getCreditCardInfo() {
        return creditCardInfo;
    }

    /**
     * Define el valor de la propiedad creditCardInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCard }
     *     
     */
    public void setCreditCardInfo(CreditCard value) {
        this.creditCardInfo = value;
    }

}
