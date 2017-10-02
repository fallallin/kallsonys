
package co.com.kallsonys.payment.ws;

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
 * This class was generated by Apache CXF 2.7.18
 * 2017-10-01T18:20:43.191-05:00
 * Generated source version: 2.7.18
 * 
 */
public final class CreditCardPortType_CreditCardPort_Client {

    private static final QName SERVICE_NAME = new QName("http://www.kallsonys.com.co/cim/message/payment/v1", "CreditCardService");

    private CreditCardPortType_CreditCardPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = CreditCardService.WSDL_LOCATION;
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
      
        CreditCardService ss = new CreditCardService(wsdlURL, SERVICE_NAME);
        CreditCardPortType port = ss.getCreditCardPort();  
        
        {
        System.out.println("Invoking verifyCreditCard...");
        co.com.kallsonys.payment.ws.VerifyCreditCardRq _verifyCreditCard_verifyCreditCardRq = null;
        try {
            co.com.kallsonys.payment.ws.VerifyCreditCardRs _verifyCreditCard__return = port.verifyCreditCard(_verifyCreditCard_verifyCreditCardRq);
            System.out.println("verifyCreditCard.result=" + _verifyCreditCard__return);

        } catch (VerifyCreditCardFault1 e) { 
            System.out.println("Expected exception: VerifyCreditCard_fault1 has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking paymentCreditCard...");
        co.com.kallsonys.payment.ws.PaymentCreditCardRq _paymentCreditCard_paymentCreditCardRq = null;
        try {
            co.com.kallsonys.payment.ws.PaymentCreditCardRs _paymentCreditCard__return = port.paymentCreditCard(_paymentCreditCard_paymentCreditCardRq);
            System.out.println("paymentCreditCard.result=" + _paymentCreditCard__return);

        } catch (PaymentCreditCardFault1 e) { 
            System.out.println("Expected exception: PaymentCreditCard_fault1 has occurred.");
            System.out.println(e.toString());
        }
            }

        System.exit(0);
    }

}
