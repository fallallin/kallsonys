
package co.com.kallsonys.payment.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ShipmentCompany complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ShipmentCompany">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="shipmentCompanyId" type="{http://www.kallsonys.com.co/cim/businessentities/shipmentcompany}ShipmentCompanyTypeEnum"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentCompany", namespace = "http://www.kallsonys.com.co/cim/businessentities/shipmentcompany", propOrder = {
    "shipmentCompanyId"
})
public class ShipmentCompany {

    @XmlElement(required = true)
    protected ShipmentCompanyTypeEnum shipmentCompanyId;

    /**
     * Obtiene el valor de la propiedad shipmentCompanyId.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentCompanyTypeEnum }
     *     
     */
    public ShipmentCompanyTypeEnum getShipmentCompanyId() {
        return shipmentCompanyId;
    }

    /**
     * Define el valor de la propiedad shipmentCompanyId.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentCompanyTypeEnum }
     *     
     */
    public void setShipmentCompanyId(ShipmentCompanyTypeEnum value) {
        this.shipmentCompanyId = value;
    }

}
