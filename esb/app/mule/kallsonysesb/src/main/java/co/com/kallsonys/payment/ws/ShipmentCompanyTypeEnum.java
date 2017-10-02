
package co.com.kallsonys.payment.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ShipmentCompanyTypeEnum.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="ShipmentCompanyTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DHL"/>
 *     &lt;enumeration value="SERVIENTREGA"/>
 *     &lt;enumeration value="DEPRISA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ShipmentCompanyTypeEnum", namespace = "http://www.kallsonys.com.co/cim/businessentities/shipmentcompany")
@XmlEnum
public enum ShipmentCompanyTypeEnum {

    DHL,
    SERVIENTREGA,
    DEPRISA;

    public String value() {
        return name();
    }

    public static ShipmentCompanyTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
