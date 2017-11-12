
package co.com.kallsonys.esb.shipment;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerClassTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CustomerClassTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PLATINO"/>
 *     &lt;enumeration value="DORADO"/>
 *     &lt;enumeration value="PLATEADO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CustomerClassTypeEnum", namespace = "http://www.kallsonys.com.co/cim/businessentities/customer")
@XmlEnum
public enum CustomerClassTypeEnum {

    PLATINO,
    DORADO,
    PLATEADO;

    public String value() {
        return name();
    }

    public static CustomerClassTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
