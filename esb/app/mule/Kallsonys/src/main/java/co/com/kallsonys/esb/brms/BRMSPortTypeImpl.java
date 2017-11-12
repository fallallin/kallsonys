package co.com.kallsonys.esb.brms;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class BRMSPortTypeImpl implements BRMSPortType {

	@Override
	public DefineShipmentCompanyRs defineShipmentCompany(DefineShipmentCompanyRq defineShipmentCompanyRq)
			throws DefineShipmentCompanyFault1 {
		DefineShipmentCompanyRs resp = new DefineShipmentCompanyRs();
		try {
			URL url = new URL("http://localhost:9191/brms/defineshipment");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Type", "application/json");
			
			StringBuffer input = new StringBuffer();
			input.append("{");
			input.append("\"country\":\"" + defineShipmentCompanyRq.getLocalization().getCountry() + "\",");
			input.append("\"productVendorCompanyId\":\"" + defineShipmentCompanyRq.getVendor().getProductVendorCompanyId() + "\"");			
			input.append("}");
							
			OutputStream os = conn.getOutputStream();
			os.write(input.toString().getBytes());
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
				throw new DefineShipmentCompanyFault1(jsonObject.get("errorMessage").toString());
			}
			
			// Respuesta
			String[] nameRoot = org.json.JSONObject.getNames(jsonObject);
			org.json.JSONObject jsonChild = (org.json.JSONObject) jsonObject.get(nameRoot[0]);
			ShipmentCompanyType sct = new ShipmentCompanyType();
			sct.setShipmentCompanyId(ShipmentCompanyTypeEnum.valueOf(jsonChild.get("def:return").toString()));
			resp.setShipmentCompany(sct);
		} catch (Exception e) {
			throw new DefineShipmentCompanyFault1(e.getMessage());
		}
		return resp;
	}

	@Override
	public ValidateAmountAccordingCustomerClassRs validateAmountAccordingCustomerClass(
			ValidateAmountAccordingCustomerClassRq validateAmountAccordingCustomerClassRq)
			throws ValidateAmountAccordingCustomerClassFault1 {
		ValidateAmountAccordingCustomerClassRs resp = new ValidateAmountAccordingCustomerClassRs();
		try {
			URL url = new URL("http://localhost:9191/brms/validateamountcustomer");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Type", "application/json");
			
			StringBuffer input = new StringBuffer();
			input.append("{");
			input.append("\"customerClass\":\"" + validateAmountAccordingCustomerClassRq.getCustomer().getCustomerClass() + "\",");
			input.append("\"orderPrice\":" + validateAmountAccordingCustomerClassRq.getOrder().getOrderPrice());			
			input.append("}");
							
			OutputStream os = conn.getOutputStream();
			os.write(input.toString().getBytes());
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
				throw new ValidateAmountAccordingCustomerClassFault1(jsonObject.get("errorMessage").toString());
			}
			
			// Respuesta
			String[] nameRoot = org.json.JSONObject.getNames(jsonObject);
			org.json.JSONObject jsonChild = (org.json.JSONObject) jsonObject.get(nameRoot[0]);
			resp.setValid(Boolean.parseBoolean(jsonChild.get("def:return").toString()));
		} catch (Exception e) {
			throw new ValidateAmountAccordingCustomerClassFault1(e.getMessage());
		}
		return resp;
	}

}
