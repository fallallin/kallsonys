/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.payment;

import co.com.payment.integration.CreditCardFacade;
import co.com.payment.integration.LogPaymentFacade;
import co.com.payment.model.Creditcard;
import co.com.payment.util.ComunUtil;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebService;

/**
 *
 * @author ohuertas
 */
@WebService(serviceName = "ValidateCreditCard", portName = "ValidateCreditCard", endpointInterface = "com.payment.ValidateCreditCard", targetNamespace = "http://payment.com", wsdlLocation = "WEB-INF/wsdl/PaymentWebService/PaymentService.wsdl")
public class PaymentWebService {

    private final String _ID_KALLSONYS_ = "KALLSONYS";

    @EJB
    private CreditCardFacade creditCardBean;
    
    @EJB
    private LogPaymentFacade logPaymentFacade;
    
    public boolean verifyCC(com.payment.validatecreditcard.CreditCardType creditCard) throws com.payment.CreditCardValidationFaultMessage {
        List<Creditcard> lst = creditCardBean.getCreditCardByTypeNumberCard(new Creditcard(creditCard.getCcType(), creditCard.getCcNum()));
        return !lst.isEmpty();
    }

    public boolean payment(com.payment.validatecreditcard.PaymentType creditCard) throws com.payment.PaymentFaultMessage {
        boolean result = false;
        List<Creditcard> lst = creditCardBean.getCreditCardByTypeNumberCard(new Creditcard(creditCard.getCreditCard().getCcType(), creditCard.getCreditCard().getCcNum()));
        if (!lst.isEmpty()) {
            if (ComunUtil.isNumeric(creditCard.getPurchaseValue() != null ? creditCard.getPurchaseValue().toString() : "null")) {
                if (_ID_KALLSONYS_.compareTo(creditCard.getIdCustomer()) == 0) {
                    try {
                        result = logPaymentFacade.saveLogPayment(creditCard);
                    } catch (Exception ex) {
                        throw new com.payment.PaymentFaultMessage(ex.getMessage(), "ERROR");
                    }
                } else {
                    throw new com.payment.PaymentFaultMessage("No fue posible realizar el pago porque el cliente no es KallSonys", "ERROR");
                }
            } else {
                throw new com.payment.PaymentFaultMessage("No fue posible realizar el pago porque el valor a pagar es invalido", "ERROR");
            }
        } else {
            throw new com.payment.PaymentFaultMessage("No fue posible realizar el pago porque la tarjeta no pertenece al banco", "ERROR");
        }   
        return result;
    } 
}
