package co.com.kallsonys.esb.payment;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;

import co.com.kallsonys.esb.util.UtilConstants;

public class CreditCardPortTypeImpl implements CreditCardPortType {
	
	@Resource
	WebServiceContext wsctx;

	@Override
	public VerifyCreditCardRs verifyCreditCard(VerifyCreditCardRq verifyCreditCardRq) throws VerifyCreditCardFault1 {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PaymentCreditCardRs paymentCreditCard(PaymentCreditCardRq paymentCreditCardRq)
			throws PaymentCreditCardFault1 {
		PaymentCreditCardRs respuesta = new PaymentCreditCardRs();
		try {
			URL url = new URL("http://localhost:9090/payment");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Type", "application/json");
			String input = "{\"orderId\":\"" + paymentCreditCardRq.getOrderInfo().getOrderId() + 
					       "\",\"ccType\":\"" + paymentCreditCardRq.getCreditCardInfo().getCardType() + 
					       "\",\"ccNum\":\"" + paymentCreditCardRq.getCreditCardInfo().getCardNumber() + 
					       "\",\"idCustomer\":\"" + paymentCreditCardRq.getCustomerInfo().getCompanyId() + 
					       "\",\"purchaseValue\":\"" + paymentCreditCardRq.getOrderInfo().getOrderPrice() + "\"}";
			
			OutputStream os = conn.getOutputStream();
			os.write(input.getBytes());
			os.flush();

			if (conn.getResponseCode() != HttpURLConnection.HTTP_OK) {
				throw new RuntimeException("HTTP error code : "
					+ conn.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(
					(conn.getInputStream())));

			String output;
			StringBuffer xml = new StringBuffer();
			while ((output = br.readLine()) != null) {
				xml.append(output);
			}
			conn.disconnect();
			
			// Parseo
			SAXBuilder saxBuilder = new SAXBuilder();
			Document doc = saxBuilder.build(new StringReader(xml.toString()));
			String message = doc.getRootElement().getText();
			
			if ("".equals(message)) {
				List a = doc.getRootElement().getChildren();
				String msgError = ((Element)a.get(0)).getText();
				throw new PaymentCreditCardFault1(msgError);
			}
			
			// Respuesta
			respuesta.setIsPaid(Boolean.parseBoolean(message));
		} catch (Exception e) {
			throw new PaymentCreditCardFault1(e.getMessage());
		}
		
		return respuesta;
	}

}