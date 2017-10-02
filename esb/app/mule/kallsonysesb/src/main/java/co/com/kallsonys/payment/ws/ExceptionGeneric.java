
package co.com.kallsonys.payment.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ExceptionGeneric complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ExceptionGeneric">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="subCode" type="{http://www.kallsonys.com.co/cim/common/exceptiongeneric}ExceptionGeneric" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExceptionGeneric", namespace = "http://www.kallsonys.com.co/cim/common/exceptiongeneric", propOrder = {
    "code",
    "description",
    "subCode"
})
public class ExceptionGeneric {

    @XmlElement(required = true)
    protected String code;
    @XmlElement(required = true)
    protected String description;
    protected ExceptionGeneric subCode;

    /**
     * Obtiene el valor de la propiedad code.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Define el valor de la propiedad code.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Obtiene el valor de la propiedad description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Define el valor de la propiedad description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Obtiene el valor de la propiedad subCode.
     * 
     * @return
     *     possible object is
     *     {@link ExceptionGeneric }
     *     
     */
    public ExceptionGeneric getSubCode() {
        return subCode;
    }

    /**
     * Define el valor de la propiedad subCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ExceptionGeneric }
     *     
     */
    public void setSubCode(ExceptionGeneric value) {
        this.subCode = value;
    }

}
