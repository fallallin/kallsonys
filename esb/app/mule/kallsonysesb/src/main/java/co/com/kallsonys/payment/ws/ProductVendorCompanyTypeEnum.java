
package co.com.kallsonys.payment.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ProductVendorCompanyTypeEnum.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="ProductVendorCompanyTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SONY"/>
 *     &lt;enumeration value="RAPIDSERVICE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProductVendorCompanyTypeEnum", namespace = "http://www.kallsonys.com.co/cim/businessentities/productvendorcompany")
@XmlEnum
public enum ProductVendorCompanyTypeEnum {

    SONY,
    RAPIDSERVICE;

    public String value() {
        return name();
    }

    public static ProductVendorCompanyTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
