
package co.com.kallsonys.esb.payment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductVendorCompany complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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
     * Gets the value of the productVendorCompanyId property.
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
     * Sets the value of the productVendorCompanyId property.
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
