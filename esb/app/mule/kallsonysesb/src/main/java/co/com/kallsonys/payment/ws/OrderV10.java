
package co.com.kallsonys.payment.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Order_v1.0 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Order_v1.0">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="orderInfo" type="{http://www.kallsonys.com.co/cim/businessentities/order}OrderInfo_v1.0" minOccurs="0"/>
 *         &lt;element name="productVendorCompanyInfo" type="{http://www.kallsonys.com.co/cim/businessentities/productvendorcompany}ProductVendorCompany" minOccurs="0"/>
 *         &lt;element name="shippingCompanyInfo" type="{http://www.kallsonys.com.co/cim/businessentities/shipmentcompany}ShipmentCompany" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Order_v1.0", namespace = "http://www.kallsonys.com.co/cim/businessentities/order", propOrder = {
    "orderInfo",
    "productVendorCompanyInfo",
    "shippingCompanyInfo"
})
public class OrderV10 {

    protected OrderInfoV10 orderInfo;
    protected ProductVendorCompany productVendorCompanyInfo;
    protected ShipmentCompany shippingCompanyInfo;

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
     * Obtiene el valor de la propiedad productVendorCompanyInfo.
     * 
     * @return
     *     possible object is
     *     {@link ProductVendorCompany }
     *     
     */
    public ProductVendorCompany getProductVendorCompanyInfo() {
        return productVendorCompanyInfo;
    }

    /**
     * Define el valor de la propiedad productVendorCompanyInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductVendorCompany }
     *     
     */
    public void setProductVendorCompanyInfo(ProductVendorCompany value) {
        this.productVendorCompanyInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad shippingCompanyInfo.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentCompany }
     *     
     */
    public ShipmentCompany getShippingCompanyInfo() {
        return shippingCompanyInfo;
    }

    /**
     * Define el valor de la propiedad shippingCompanyInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentCompany }
     *     
     */
    public void setShippingCompanyInfo(ShipmentCompany value) {
        this.shippingCompanyInfo = value;
    }

}