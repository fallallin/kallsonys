package co.com.kallsonys.esb.vendor;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.5.1
 * 2017-11-06T10:08:02.547-05:00
 * Generated source version: 2.5.1
 * 
 */
@WebService(targetNamespace = "http://www.kallsonys.com.co/cim/message/factoryquotesorder/v1", name = "FactoriesQuotesOrdersPortType")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface FactoriesQuotesOrdersPortType {

    @WebMethod(action = "validateOrderQuote")
    @WebResult(name = "ValidateOrderQuoteRs", targetNamespace = "http://www.kallsonys.com.co/cim/message/factoryquotesorder/v1", partName = "ValidateOrderQuoteRs")
    public ValidateOrderQuoteRs validateOrderQuote(
        @WebParam(partName = "ValidateOrderQuoteRq", name = "ValidateOrderQuoteRq", targetNamespace = "http://www.kallsonys.com.co/cim/message/factoryquotesorder/v1")
        ValidateOrderQuoteRq validateOrderQuoteRq
    ) throws ValidateOrderQuoteFault1;

    @WebMethod(action = "factorysQuotesOrders")
    @WebResult(name = "FactorysQuotesOrdersRs", targetNamespace = "http://www.kallsonys.com.co/cim/message/factoryquotesorder/v1", partName = "FactorysQuotesOrdersRs")
    public FactorysQuotesOrdersRs factorysQuotesOrders(
        @WebParam(partName = "FactorysQuotesOrdersRq", name = "FactorysQuotesOrdersRq", targetNamespace = "http://www.kallsonys.com.co/cim/message/factoryquotesorder/v1")
        FactorysQuotesOrdersRq factorysQuotesOrdersRq
    ) throws FactorysQuotesOrdersFault1;

    @WebMethod(action = "factoryQuotesOrder")
    @WebResult(name = "FactoryQuotesOrderRs", targetNamespace = "http://www.kallsonys.com.co/cim/message/factoryquotesorder/v1", partName = "FactoryQuotesOrderRs")
    public FactoryQuotesOrderRs factoryQuotesOrder(
        @WebParam(partName = "FactoryQuotesOrderRq", name = "FactoryQuotesOrderRq", targetNamespace = "http://www.kallsonys.com.co/cim/message/factoryquotesorder/v1")
        FactoryQuotesOrderRq factoryQuotesOrderRq
    ) throws FactoryQuotesOrderFault1;
}
