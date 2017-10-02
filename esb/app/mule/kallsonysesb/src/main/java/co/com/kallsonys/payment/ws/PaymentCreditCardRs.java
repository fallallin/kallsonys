
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
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="isPaid" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "isPaid"
})
@XmlRootElement(name = "PaymentCreditCardRs")
public class PaymentCreditCardRs {

    protected boolean isPaid;

    /**
     * Obtiene el valor de la propiedad isPaid.
     * This getter has been renamed from isIsPaid() to getIsPaid() by cxf-xjc-boolean plugin.
     * 
     */
    public boolean getIsPaid() {
        return isPaid;
    }

    /**
     * Define el valor de la propiedad isPaid.
     * 
     */
    public void setIsPaid(boolean value) {
        this.isPaid = value;
    }

}
