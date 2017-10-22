
package co.com.kallsonys.esb.payment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Company complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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
     * Gets the value of the companyId property.
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
     * Sets the value of the companyId property.
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
