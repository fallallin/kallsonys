
package co.com.kallsonys.payment.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ShipmentInfo_v1.0 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
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
