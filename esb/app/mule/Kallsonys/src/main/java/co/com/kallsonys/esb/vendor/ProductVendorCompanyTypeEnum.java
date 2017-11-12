
package co.com.kallsonys.esb.vendor;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductVendorCompanyTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProductVendorCompanyTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SONY"/>
 *     &lt;enumeration value="RS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProductVendorCompanyTypeEnum", namespace = "http://www.kallsonys.com.co/cim/businessentities/productvendorcompany")
@XmlEnum
public enum ProductVendorCompanyTypeEnum {

    SONY,
    RS;

    public String value() {
        return name();
    }

    public static ProductVendorCompanyTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
