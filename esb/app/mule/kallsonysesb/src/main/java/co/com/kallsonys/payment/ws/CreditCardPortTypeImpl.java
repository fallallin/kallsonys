package co.com.kallsonys.payment.ws;

import javax.annotation.Resource;
import javax.xml.ws.WebServiceContext;

public class CreditCardPortTypeImpl implements CreditCardPortType {

	@Resource
    private WebServiceContext context;

	@Override
	public VerifyCreditCardRs verifyCreditCard(VerifyCreditCardRq verifyCreditCardRq) throws VerifyCreditCardFault1 {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PaymentCreditCardRs paymentCreditCard(PaymentCreditCardRq paymentCreditCardRq)
			throws PaymentCreditCardFault1 {
		// TODO Auto-generated method stub
		return null;
	}
}
