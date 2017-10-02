
package co.com.kallsonys.payment.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Company complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Company">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="companyId" type="{http://www.kallsonys.com.co/cim/businessentities/company}CompanyTypeEnum"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Company", namespace = "http://www.kallsonys.com.co/cim/businessentities/company", propOrder = {
    "companyId"
})
public class Company {

    @XmlElement(required = true)
    protected CompanyTypeEnum companyId;

    /**
     * Obtiene el valor de la propiedad companyId.
     * 
     * @return
     *     possible object is
     *     {@link CompanyTypeEnum }
     *     
     */
    public CompanyTypeEnum getCompanyId() {
        return companyId;
    }

    /**
     * Define el valor de la propiedad companyId.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyTypeEnum }
     *     
     */
    public void setCompanyId(CompanyTypeEnum value) {
        this.companyId = value;
    }

}
