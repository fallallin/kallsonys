
package co.com.kallsonys.payment.ws;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para OrderInfo_v1.0 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="OrderInfo_v1.0">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="orderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="items" type="{http://www.kallsonys.com.co/cim/businessentities/item}Item" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="orderPrice" type="{http://www.kallsonys.com.co/cim/common/money}MoneyGeneric" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderInfo_v1.0", namespace = "http://www.kallsonys.com.co/cim/businessentities/order", propOrder = {
    "orderId",
    "items",
    "orderPrice"
})
@XmlSeeAlso({
    OrderInfoType.class
})
public class OrderInfoV10 {

    protected String orderId;
    protected List<Item> items;
    protected BigDecimal orderPrice;

    /**
     * Obtiene el valor de la propiedad orderId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * Define el valor de la propiedad orderId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderId(String value) {
        this.orderId = value;
    }

    /**
     * Gets the value of the items property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the items property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Item }
     * 
     * 
     */
    public List<Item> getItems() {
        if (items == null) {
            items = new ArrayList<Item>();
        }
        return this.items;
    }

    /**
     * Obtiene el valor de la propiedad orderPrice.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOrderPrice() {
        return orderPrice;
    }

    /**
     * Define el valor de la propiedad orderPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOrderPrice(BigDecimal value) {
        this.orderPrice = value;
    }

    /**
     * Sets the value of the items property.
     * 
     * @param items
     *     allowed object is
     *     {@link Item }
     *     
     */
    public void setItems(List<Item> items) {
        this.items = items;
    }

}