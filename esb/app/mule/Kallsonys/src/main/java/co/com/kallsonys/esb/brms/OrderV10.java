
package co.com.kallsonys.esb.brms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Order_v1.0 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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
     * Gets the value of the orderInfo property.
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
     * Sets the value of the orderInfo property.
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
     * Gets the value of the productVendorCompanyInfo property.
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
     * Sets the value of the productVendorCompanyInfo property.
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
     * Gets the value of the shippingCompanyInfo property.
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
     * Sets the value of the shippingCompanyInfo property.
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
