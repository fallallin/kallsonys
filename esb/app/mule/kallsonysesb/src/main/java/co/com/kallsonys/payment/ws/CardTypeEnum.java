
package co.com.kallsonys.payment.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para cardTypeEnum.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="cardTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DISCOVER"/>
 *     &lt;enumeration value="VISA"/>
 *     &lt;enumeration value="MASTERCARD"/>
 *     &lt;enumeration value="AMERICANEXPRESS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "cardTypeEnum", namespace = "http://www.kallsonys.com.co/cim/businessentities/creditcard")
@XmlEnum
public enum CardTypeEnum {

    DISCOVER,
    VISA,
    MASTERCARD,
    AMERICANEXPRESS;

    public String value() {
        return name();
    }

    public static CardTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
