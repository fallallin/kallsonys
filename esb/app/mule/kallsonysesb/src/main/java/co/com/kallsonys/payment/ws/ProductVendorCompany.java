
package co.com.kallsonys.payment.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ProductVendorCompany complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ProductVendorCompany">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="productVendorCompanyId" type="{http://www.kallsonys.com.co/cim/businessentities/productvendorcompany}ProductVendorCompanyTypeEnum"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductVendorCompany", namespace = "http://www.kallsonys.com.co/cim/businessentities/productvendorcompany", propOrder = {
    "productVendorCompanyId"
})
public class ProductVendorCompany {

    @XmlElement(required = true)
    protected ProductVendorCompanyTypeEnum productVendorCompanyId;

    /**
     * Obtiene el valor de la propiedad productVendorCompanyId.
     * 
     * @return
     *     possible object is
     *     {@link ProductVendorCompanyTypeEnum }
     *     
     */
    public ProductVendorCompanyTypeEnum getProductVendorCompanyId() {
        return productVendorCompanyId;
    }

    /**
     * Define el valor de la propiedad productVendorCompanyId.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductVendorCompanyTypeEnum }
     *     
     */
    public void setProductVendorCompanyId(ProductVendorCompanyTypeEnum value) {
        this.productVendorCompanyId = value;
    }

}
