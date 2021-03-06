package co.com.kallsonys.esb.vendor;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class FactoriesQuotesOrdersPortTypeImpl implements FactoriesQuotesOrdersPortType {
	
	enum VendorCompanies {
		SONY,
		RS
	}
	
	@Override
	public FactoryQuotesOrderRs factoryQuotesOrder(FactoryQuotesOrderRq factoryQuotesOrderRq)
			throws FactoryQuotesOrderFault1 {
		if (factoryQuotesOrderRq.getProductVendorCompanyInfo().getProductVendorCompanyId() == null) {
			 throw new FactoryQuotesOrderFault1("Defina un proveedor valido");
		}
		
		FactoryQuotesOrderRs resp = new FactoryQuotesOrderRs();
		
		String vendor = factoryQuotesOrderRq.getProductVendorCompanyInfo().getProductVendorCompanyId().value();

		switch (VendorCompanies.valueOf( vendor )) {
		case SONY:
			resp = quotesOrderSony(factoryQuotesOrderRq);
			break;
		case RS:
			resp = quotesOrderRapidService(factoryQuotesOrderRq);
			break;
		default:
			throw new FactoryQuotesOrderFault1("Defina un proveedor valido");
		}
		return resp;
	}
	
	private FactoryQuotesOrderRs quotesOrderSony(FactoryQuotesOrderRq factoryQuotesOrderRq) throws FactoryQuotesOrderFault1 {
		FactoryQuotesOrderRs resp = new FactoryQuotesOrderRs();
		try {
			URL url = new URL("http://localhost:9191/vendor/sony/quotesorder");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Type", "application/json");
			
			StringBuffer input = new StringBuffer();
			input.append("{");
			input.append("\"orderId\":\"" + factoryQuotesOrderRq.getOrderInfo().getOrderId() + "\",");
			input.append("\"items\": [ ");

			for (Item item : factoryQuotesOrderRq.getOrderInfo().getItems()) {
				input.append("{ ");
				input.append("\"itemId\":\"" + item.getItemId() + "\",");
				input.append("\"quantity\":" + item.getQuantity());
				input.append("},");
			}
			
			if (input.lastIndexOf(",") == input.length()-1) {
				input.replace(input.length()-1, input.length(), "]");
			} else {
				input.append("]");
			}
			
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
				throw new FactoryQuotesOrderFault1(jsonObject.get("errorMessage").toString());
			}
			
			// Respuesta
			String[] nameRoot = org.json.JSONObject.getNames(jsonObject);
			org.json.JSONObject jsonChild = (org.json.JSONObject) jsonObject.get(nameRoot[0]);
			resp.setOrderPrice(new BigDecimal(((org.json.JSONObject)jsonChild.get("result")).get("supplierPrice").toString()));
		} catch (Exception e) {
			throw new FactoryQuotesOrderFault1(e.getMessage());
		}
		return resp;
	}

	private FactoryQuotesOrderRs quotesOrderRapidService(FactoryQuotesOrderRq factoryQuotesOrderRq) throws FactoryQuotesOrderFault1 {
		FactoryQuotesOrderRs resp = new FactoryQuotesOrderRs();
		try {
			URL url = new URL("http://localhost:9191/vendor/rs/quotesorder");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Type", "application/json");
			
			StringBuffer input = new StringBuffer();
			input.append("{");
			input.append("\"orderId\":\"" + factoryQuotesOrderRq.getOrderInfo().getOrderId() + "\",");
			input.append("\"items\": [ ");

			for (Item item : factoryQuotesOrderRq.getOrderInfo().getItems()) {
				input.append("{ ");
				input.append("\"itemId\":\"" + item.getItemId() + "\",");
				input.append("\"quantity\":" + item.getQuantity());
				input.append("},");
			}
			
			if (input.lastIndexOf(",") == input.length()-1) {
				input.replace(input.length()-1, input.length(), "]");
			} else {
				input.append("]");
			}
			
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
				throw new FactoryQuotesOrderFault1(jsonObject.get("errorMessage").toString());
			}
			
			// Respuesta
			String[] nameRoot = org.json.JSONObject.getNames(jsonObject);
			org.json.JSONObject jsonChild = (org.json.JSONObject) jsonObject.get(nameRoot[0]);
			resp.setOrderPrice(new BigDecimal(((org.json.JSONObject)jsonChild.get("result")).get("supplierPrice").toString()));
		} catch (Exception e) {
			throw new FactoryQuotesOrderFault1(e.getMessage());
		}
		return resp;
	}

	

	@Override
	public ValidateOrderQuoteRs validateOrderQuote(ValidateOrderQuoteRq validateOrderQuoteRq)
			throws ValidateOrderQuoteFault1 {
		if (validateOrderQuoteRq.getProductVendorCompanyInfo().getProductVendorCompanyId() == null) {
			 throw new ValidateOrderQuoteFault1("Defina un proveedor valido");
		}
		ValidateOrderQuoteRs resp = new ValidateOrderQuoteRs();
		String vendor = validateOrderQuoteRq.getProductVendorCompanyInfo().getProductVendorCompanyId().value();

		switch (VendorCompanies.valueOf( vendor )) {
		case SONY:
			resp = validateOrderSony(validateOrderQuoteRq);
			break;
		case RS:
			resp = validateOrderRapidService(validateOrderQuoteRq);
			break;
		default:
			throw new ValidateOrderQuoteFault1("Defina un proveedor valido");
		}
		return resp;
	}
	
	private ValidateOrderQuoteRs validateOrderSony(ValidateOrderQuoteRq validateOrderQuoteRq) throws ValidateOrderQuoteFault1 {
		ValidateOrderQuoteRs resp = new ValidateOrderQuoteRs();
		try {
			URL url = new URL("http://localhost:9191/vendor/sony/validateorder");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Type", "application/json");
			
			StringBuffer input = new StringBuffer();
			input.append("{");
			input.append("\"orderId\":\"" + validateOrderQuoteRq.getOrderInfo().getOrderId() + "\"");			
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
				throw new FactoryQuotesOrderFault1(jsonObject.get("errorMessage").toString());
			}
			
			// Respuesta
			String[] nameRoot = org.json.JSONObject.getNames(jsonObject);
			org.json.JSONObject jsonChild = (org.json.JSONObject) jsonObject.get(nameRoot[0]);
			resp.setResult(Boolean.parseBoolean(jsonChild.get("result").toString()));
		} catch (Exception e) {
			throw new ValidateOrderQuoteFault1(e.getMessage());
		}
		return resp;
	}

	private ValidateOrderQuoteRs validateOrderRapidService(ValidateOrderQuoteRq validateOrderQuoteRq) throws ValidateOrderQuoteFault1 {
		ValidateOrderQuoteRs resp = new ValidateOrderQuoteRs();
		try {
			URL url = new URL("http://localhost:9191/vendor/rs/validateorder");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Type", "application/json");
			
			StringBuffer input = new StringBuffer();
			input.append("{");
			input.append("\"orderId\":\"" + validateOrderQuoteRq.getOrderInfo().getOrderId() + "\"");			
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
				throw new FactoryQuotesOrderFault1(jsonObject.get("errorMessage").toString());
			}
			
			// Respuesta
			String[] nameRoot = org.json.JSONObject.getNames(jsonObject);
			org.json.JSONObject jsonChild = (org.json.JSONObject) jsonObject.get(nameRoot[0]);
			resp.setResult(Boolean.parseBoolean(jsonChild.get("result").toString()));
		} catch (Exception e) {
			throw new ValidateOrderQuoteFault1(e.getMessage());
		}
		return resp;
	}

	@Override
	public FactorysQuotesOrdersRs factorysQuotesOrders(FactorysQuotesOrdersRq factorysQuotesOrdersRq)
			throws FactorysQuotesOrdersFault1 {
		FactorysQuotesOrdersRs resp = new FactorysQuotesOrdersRs();
		List<QuotesOrdersByFactoryType> quotesByFactoryList = new ArrayList<QuotesOrdersByFactoryType>();
		for (VendorCompanies vendorId : VendorCompanies.values()) {
			ProductVendorCompanyTypeEnum pvcte = ProductVendorCompanyTypeEnum.valueOf(vendorId.toString());
			FactoryQuotesOrderRq factoryQuotesOrderRq = new FactoryQuotesOrderRq();
			factoryQuotesOrderRq.setOrderInfo(factorysQuotesOrdersRq.getOrderInfo());
			ProductVendorCompany pvc = new ProductVendorCompany();
			pvc.setProductVendorCompanyId(pvcte);
			factoryQuotesOrderRq.setProductVendorCompanyInfo(pvc);
			try {
				FactoryQuotesOrderRs factoryQuotesOrderRs = factoryQuotesOrder(factoryQuotesOrderRq);
				QuotesOrdersByFactoryType quotesByFactory = new QuotesOrdersByFactoryType();
				quotesByFactory.setOrderInfo(new OrderInfoV10());
				quotesByFactory.getOrderInfo().setOrderPrice(factoryQuotesOrderRs.getOrderPrice());
				quotesByFactory.setProductVendorCompanyInfo(new ProductVendorCompany());
				quotesByFactory.getProductVendorCompanyInfo().setProductVendorCompanyId(pvcte);
				quotesByFactoryList.add(quotesByFactory);
			} catch (FactoryQuotesOrderFault1 e) {
				throw new FactorysQuotesOrdersFault1(e.getMessage());
			}
		}
		resp.setQuotesOrdersByFactory(quotesByFactoryList);
		return resp;
	}
}
