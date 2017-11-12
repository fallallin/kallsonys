
package co.com.kallsonys.esb.brms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShipmentInfo_v1.0 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentInfo_v1.0">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
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
@XmlType(name = "ShipmentInfo_v1.0", namespace = "http://www.kallsonys.com.co/cim/businessentities/order", propOrder = {
    "shippingCompanyInfo"
})
public class ShipmentInfoV10 {

    protected ShipmentCompany shippingCompanyInfo;

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
