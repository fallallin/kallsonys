
package com.payment;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * Payment service
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10-b140803.1500
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ValidateCreditCard", targetNamespace = "http://payment.com", wsdlLocation = "file:/D:/workspacePUJ/GitHub/kallsonys/esb/app/external/Payment/src/conf/xml-resources/web-services/PaymentWebService/wsdl/PaymentService.wsdl")
public class ValidateCreditCard_Service
    extends Service
{

    private final static URL VALIDATECREDITCARD_WSDL_LOCATION;
    private final static WebServiceException VALIDATECREDITCARD_EXCEPTION;
    private final static QName VALIDATECREDITCARD_QNAME = new QName("http://payment.com", "ValidateCreditCard");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/D:/workspacePUJ/GitHub/kallsonys/esb/app/external/Payment/src/conf/xml-resources/web-services/PaymentWebService/wsdl/PaymentService.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        VALIDATECREDITCARD_WSDL_LOCATION = url;
        VALIDATECREDITCARD_EXCEPTION = e;
    }

    public ValidateCreditCard_Service() {
        super(__getWsdlLocation(), VALIDATECREDITCARD_QNAME);
    }

    public ValidateCreditCard_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), VALIDATECREDITCARD_QNAME, features);
    }

    public ValidateCreditCard_Service(URL wsdlLocation) {
        super(wsdlLocation, VALIDATECREDITCARD_QNAME);
    }

    public ValidateCreditCard_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, VALIDATECREDITCARD_QNAME, features);
    }

    public ValidateCreditCard_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ValidateCreditCard_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ValidateCreditCard
     */
    @WebEndpoint(name = "ValidateCreditCard")
    public ValidateCreditCard getValidateCreditCard() {
        return super.getPort(new QName("http://payment.com", "ValidateCreditCard"), ValidateCreditCard.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ValidateCreditCard
     */
    @WebEndpoint(name = "ValidateCreditCard")
    public ValidateCreditCard getValidateCreditCard(WebServiceFeature... features) {
        return super.getPort(new QName("http://payment.com", "ValidateCreditCard"), ValidateCreditCard.class, features);
    }

    private static URL __getWsdlLocation() {
        if (VALIDATECREDITCARD_EXCEPTION!= null) {
            throw VALIDATECREDITCARD_EXCEPTION;
        }
        return VALIDATECREDITCARD_WSDL_LOCATION;
    }

}