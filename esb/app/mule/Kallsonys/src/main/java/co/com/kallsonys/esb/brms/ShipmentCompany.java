
package co.com.kallsonys.esb.brms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShipmentCompany complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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
@XmlSeeAlso({
    ShipmentCompanyType.class
})
public class ShipmentCompany {

    @XmlElement(required = true)
    protected ShipmentCompanyTypeEnum shipmentCompanyId;

    /**
     * Gets the value of the shipmentCompanyId property.
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
     * Sets the value of the shipmentCompanyId property.
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
