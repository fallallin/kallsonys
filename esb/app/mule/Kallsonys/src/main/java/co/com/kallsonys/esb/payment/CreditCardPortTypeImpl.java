package co.com.kallsonys.esb.payment;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import co.com.kallsonys.esb.shipment.FulfillShipmentFault1;

public class CreditCardPortTypeImpl implements CreditCardPortType {

	@Override
	public VerifyCreditCardRs verifyCreditCard(VerifyCreditCardRq verifyCreditCardRq) throws VerifyCreditCardFault1 {
		VerifyCreditCardRs resp = new VerifyCreditCardRs();
		try {
			URL url = new URL("http://localhost:9191/payment/verifyCC");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Type", "application/json");
			String input = "{\"ccType\":\"" + verifyCreditCardRq.getCardType() + 
					       "\",\"ccNum\":\"" + verifyCreditCardRq.getCardNumber() + "\"}";
			
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
			org.json.JSONObject jsonObject = new org.json.JSONObject(xml.toString());
			if (!jsonObject.isNull("errorMessage")) {
				throw new FulfillShipmentFault1(jsonObject.get("errorMessage").toString());
			}
			
			// Respuesta
			String[] nameRoot = org.json.JSONObject.getNames(jsonObject);
			org.json.JSONObject jsonChild = (org.json.JSONObject) jsonObject.get(nameRoot[0]);
			resp.setValid(Boolean.parseBoolean(jsonChild.get("$").toString()));
		} catch (Exception e) {
			throw new VerifyCreditCardFault1(e.getMessage());
		}
		return resp;
	}

	@Override
	public PaymentCreditCardRs paymentCreditCard(PaymentCreditCardRq paymentCreditCardRq)
			throws PaymentCreditCardFault1 {
		PaymentCreditCardRs resp = new PaymentCreditCardRs();
		try {
			URL url = new URL("http://localhost:9191/payment");
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
			org.json.JSONObject jsonObject = new org.json.JSONObject(xml.toString());
			if (!jsonObject.isNull("errorMessage")) {
				throw new FulfillShipmentFault1(jsonObject.get("errorMessage").toString());
			}
			
			// Respuesta
			String[] nameRoot = org.json.JSONObject.getNames(jsonObject);
			org.json.JSONObject jsonChild = (org.json.JSONObject) jsonObject.get(nameRoot[0]);
			resp.setIsPaid(Boolean.parseBoolean(jsonChild.get("$").toString()));
		} catch (Exception e) {
			throw new PaymentCreditCardFault1(e.getMessage());
		}
		
		return resp;
	}

}
