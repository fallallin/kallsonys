
package com.payment.validatecreditcard;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PaymentType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PaymentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idOrder" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CreditCard" type="{http://payment.com/ValidateCreditCard}CreditCardType"/>
 *         &lt;element name="idCustomer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="purchaseValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentType", propOrder = {
    "idOrder",
    "creditCard",
    "idCustomer",
    "purchaseValue"
})
public class PaymentType {

    @XmlElement(required = true)
    protected String idOrder;
    @XmlElement(name = "CreditCard", required = true)
    protected CreditCardType creditCard;
    @XmlElement(required = true)
    protected String idCustomer;
    @XmlElement(required = true)
    protected BigDecimal purchaseValue;

    /**
     * Obtiene el valor de la propiedad idOrder.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdOrder() {
        return idOrder;
    }

    /**
     * Define el valor de la propiedad idOrder.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdOrder(String value) {
        this.idOrder = value;
    }

    /**
     * Obtiene el valor de la propiedad creditCard.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardType }
     *     
     */
    public CreditCardType getCreditCard() {
        return creditCard;
    }

    /**
     * Define el valor de la propiedad creditCard.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardType }
     *     
     */
    public void setCreditCard(CreditCardType value) {
        this.creditCard = value;
    }

    /**
     * Obtiene el valor de la propiedad idCustomer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCustomer() {
        return idCustomer;
    }

    /**
     * Define el valor de la propiedad idCustomer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCustomer(String value) {
        this.idCustomer = value;
    }

    /**
     * Obtiene el valor de la propiedad purchaseValue.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPurchaseValue() {
        return purchaseValue;
    }

    /**
     * Define el valor de la propiedad purchaseValue.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPurchaseValue(BigDecimal value) {
        this.purchaseValue = value;
    }

}
