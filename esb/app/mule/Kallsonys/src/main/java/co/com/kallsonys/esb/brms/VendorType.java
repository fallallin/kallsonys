
package co.com.kallsonys.esb.brms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VendorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VendorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.kallsonys.com.co/cim/businessentities/productvendorcompany}ProductVendorCompany">
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
@XmlType(name = "VendorType")
public class VendorType
    extends ProductVendorCompany
{


}
