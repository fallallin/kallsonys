package co.com.kallsonys.esb.vendor;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.5.1
 * 2017-11-06T10:08:02.547-05:00
 * Generated source version: 2.5.1
 * 
 */
@WebServiceClient(name = "FactoriesQuotesOrdersService", 
                  wsdlLocation = "file:/D:/workspacePUJ/GitHub/kallsonys/esb/app/mule/Kallsonys/src/main/wsdl/01_ESB/Message/01_Factories/wsdl/1.2/FactoriesQuotesOrders.wsdl",
                  targetNamespace = "http://www.kallsonys.com.co/cim/message/factoryquotesorder/v1") 
public class FactoriesQuotesOrdersService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.kallsonys.com.co/cim/message/factoryquotesorder/v1", "FactoriesQuotesOrdersService");
    public final static QName FactoriesQuotesOrdersPort = new QName("http://www.kallsonys.com.co/cim/message/factoryquotesorder/v1", "FactoriesQuotesOrdersPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/D:/workspacePUJ/GitHub/kallsonys/esb/app/mule/Kallsonys/src/main/wsdl/01_ESB/Message/01_Factories/wsdl/1.2/FactoriesQuotesOrders.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(FactoriesQuotesOrdersService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/D:/workspacePUJ/GitHub/kallsonys/esb/app/mule/Kallsonys/src/main/wsdl/01_ESB/Message/01_Factories/wsdl/1.2/FactoriesQuotesOrders.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public FactoriesQuotesOrdersService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public FactoriesQuotesOrdersService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public FactoriesQuotesOrdersService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public FactoriesQuotesOrdersService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public FactoriesQuotesOrdersService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public FactoriesQuotesOrdersService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns FactoriesQuotesOrdersPortType
     */
    @WebEndpoint(name = "FactoriesQuotesOrdersPort")
    public FactoriesQuotesOrdersPortType getFactoriesQuotesOrdersPort() {
        return super.getPort(FactoriesQuotesOrdersPort, FactoriesQuotesOrdersPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns FactoriesQuotesOrdersPortType
     */
    @WebEndpoint(name = "FactoriesQuotesOrdersPort")
    public FactoriesQuotesOrdersPortType getFactoriesQuotesOrdersPort(WebServiceFeature... features) {
        return super.getPort(FactoriesQuotesOrdersPort, FactoriesQuotesOrdersPortType.class, features);
    }

}
