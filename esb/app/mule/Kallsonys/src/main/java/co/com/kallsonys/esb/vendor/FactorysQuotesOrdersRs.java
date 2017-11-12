
package co.com.kallsonys.esb.vendor;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="quotesOrdersByFactory" type="{http://www.kallsonys.com.co/cim/message/factoryquotesorder/v1}QuotesOrdersByFactoryType" maxOccurs="unbounded"/>
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
    "quotesOrdersByFactory"
})
@XmlRootElement(name = "FactorysQuotesOrdersRs")
public class FactorysQuotesOrdersRs {

    @XmlElement(required = true)
    protected List<QuotesOrdersByFactoryType> quotesOrdersByFactory;

    /**
     * Gets the value of the quotesOrdersByFactory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quotesOrdersByFactory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuotesOrdersByFactory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuotesOrdersByFactoryType }
     * 
     * 
     */
    public List<QuotesOrdersByFactoryType> getQuotesOrdersByFactory() {
        if (quotesOrdersByFactory == null) {
            quotesOrdersByFactory = new ArrayList<QuotesOrdersByFactoryType>();
        }
        return this.quotesOrdersByFactory;
    }

    /**
     * Sets the value of the quotesOrdersByFactory property.
     * 
     * @param quotesOrdersByFactory
     *     allowed object is
     *     {@link QuotesOrdersByFactoryType }
     *     
     */
    public void setQuotesOrdersByFactory(List<QuotesOrdersByFactoryType> quotesOrdersByFactory) {
        this.quotesOrdersByFactory = quotesOrdersByFactory;
    }

}
