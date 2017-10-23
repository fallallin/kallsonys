
package co.com.kallsonys.esb.payment;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.5.1
 * 2017-10-08T08:38:18.398-05:00
 * Generated source version: 2.5.1
 */

@WebFault(name = "exceptionGeneric", targetNamespace = "http://www.kallsonys.com.co/cim/common/exceptiongeneric")
public class PaymentCreditCardFault1 extends Exception {
    
    private co.com.kallsonys.esb.payment.ExceptionGeneric exceptionGeneric;

    public PaymentCreditCardFault1() {
        super();
    }
    
    public PaymentCreditCardFault1(String message) {
        super(message);
    }
    
    public PaymentCreditCardFault1(String message, Throwable cause) {
        super(message, cause);
    }

    public PaymentCreditCardFault1(String message, co.com.kallsonys.esb.payment.ExceptionGeneric exceptionGeneric) {
        super(message);
        this.exceptionGeneric = exceptionGeneric;
    }

    public PaymentCreditCardFault1(String message, co.com.kallsonys.esb.payment.ExceptionGeneric exceptionGeneric, Throwable cause) {
        super(message, cause);
        this.exceptionGeneric = exceptionGeneric;
    }

    public co.com.kallsonys.esb.payment.ExceptionGeneric getFaultInfo() {
        return this.exceptionGeneric;
    }
}