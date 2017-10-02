
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
 *         &lt;element name="valid" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "valid"
})
@XmlRootElement(name = "VerifyCreditCardRs")
public class VerifyCreditCardRs {

    protected boolean valid;

    /**
     * Obtiene el valor de la propiedad valid.
     * This getter has been renamed from isValid() to getValid() by cxf-xjc-boolean plugin.
     * 
     */
    public boolean getValid() {
        return valid;
    }

    /**
     * Define el valor de la propiedad valid.
     * 
     */
    public void setValid(boolean value) {
        this.valid = value;
    }

}
