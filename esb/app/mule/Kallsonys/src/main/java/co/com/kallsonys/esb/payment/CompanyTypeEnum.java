
package co.com.kallsonys.esb.payment;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompanyTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CompanyTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="KALLSONYS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CompanyTypeEnum", namespace = "http://www.kallsonys.com.co/cim/businessentities/company")
@XmlEnum
public enum CompanyTypeEnum {

    KALLSONYS;

    public String value() {
        return name();
    }

    public static CompanyTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
