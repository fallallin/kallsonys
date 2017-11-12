
package co.com.kallsonys.esb.brms;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.5.1
 * 2017-11-04T19:40:55.461-05:00
 * Generated source version: 2.5.1
 * 
 */
public final class BRMSPortType_BRMSPort_Client {

    private static final QName SERVICE_NAME = new QName("http://www.kallsonys.com.co/cim/message/brms/v1", "BRMSService");

    private BRMSPortType_BRMSPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = BRMSService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        BRMSService ss = new BRMSService(wsdlURL, SERVICE_NAME);
        BRMSPortType port = ss.getBRMSPort();  
        
        {
        System.out.println("Invoking defineShipmentCompany...");
        co.com.kallsonys.esb.brms.DefineShipmentCompanyRq _defineShipmentCompany_defineShipmentCompanyRq = null;
        try {
            co.com.kallsonys.esb.brms.DefineShipmentCompanyRs _defineShipmentCompany__return = port.defineShipmentCompany(_defineShipmentCompany_defineShipmentCompanyRq);
            System.out.println("defineShipmentCompany.result=" + _defineShipmentCompany__return);

        } catch (DefineShipmentCompanyFault1 e) { 
            System.out.println("Expected exception: DefineShipmentCompany_fault1 has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking validateAmountAccordingCustomerClass...");
        co.com.kallsonys.esb.brms.ValidateAmountAccordingCustomerClassRq _validateAmountAccordingCustomerClass_validateAmountAccordingCustomerClassRq = null;
        try {
            co.com.kallsonys.esb.brms.ValidateAmountAccordingCustomerClassRs _validateAmountAccordingCustomerClass__return = port.validateAmountAccordingCustomerClass(_validateAmountAccordingCustomerClass_validateAmountAccordingCustomerClassRq);
            System.out.println("validateAmountAccordingCustomerClass.result=" + _validateAmountAccordingCustomerClass__return);

        } catch (ValidateAmountAccordingCustomerClassFault1 e) { 
            System.out.println("Expected exception: ValidateAmountAccordingCustomerClass_fault1 has occurred.");
            System.out.println(e.toString());
        }
            }

        System.exit(0);
    }

}