
package co.com.kallsonys.esb.brms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="shipmentCompany" type="{http://www.kallsonys.com.co/cim/message/brms/v1}ShipmentCompanyType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "shipmentCompany"
})
@XmlRootElement(name = "DefineShipmentCompanyRs")
public class DefineShipmentCompanyRs {

    @XmlElement(required = true)
    protected ShipmentCompanyType shipmentCompany;

    /**
     * Gets the value of the shipmentCompany property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentCompanyType }
     *     
     */
    public ShipmentCompanyType getShipmentCompany() {
        return shipmentCompany;
    }

    /**
     * Sets the value of the shipmentCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentCompanyType }
     *     
     */
    public void setShipmentCompany(ShipmentCompanyType value) {
        this.shipmentCompany = value;
    }

}
