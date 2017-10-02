/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sony;

import co.com.sony.sonyquoteservice.Item;
import co.com.sony.sonyquoteservice.OrderQuouteResponseElement;
import co.com.sony.sonyquoteservice.Quote;
import co.com.sony.sonyquoteservice.SonyQuoteServiceProcessResponse;
import java.math.BigDecimal;
import java.util.Random;
import javax.jws.WebService;

/**
 *
 * @author ohuertas
 */
@WebService(serviceName = "SonyQuoteService", portName = "SonyQuoteServicePort", endpointInterface = "co.com.sony.SonyQuoteService", targetNamespace = "http://sony.com.co/", wsdlLocation = "WEB-INF/wsdl/SonyWebService/SonyService.wsdl")
public class SonyWebService {

    public static final BigDecimal _PRICE_FACTOR_MIN_ = new BigDecimal(200000);
    public static final BigDecimal _PRICE_FACTOR_MAX_ = new BigDecimal(500000);
    public co.com.sony.sonyquoteservice.SonyQuoteServiceProcessResponse orderQuoute(co.com.sony.sonyquoteservice.SonyQuoteServiceProcessRequest payload) {
        BigDecimal price = new BigDecimal(0);
        SonyQuoteServiceProcessResponse process = new SonyQuoteServiceProcessResponse();
        if (payload!=null) {
            if (payload.getOrderId() != null) {
                if (payload.getItems() != null) {
                    for (Item item : payload.getItems()) {
                        if (item.getItemId() != null) {
                            Random r = new Random();
                            price = price.add(_PRICE_FACTOR_MIN_.add((_PRICE_FACTOR_MAX_.subtract(_PRICE_FACTOR_MIN_)).multiply(new BigDecimal(r.nextDouble()))).multiply(new BigDecimal(item.getQuantity())));
                        }  
                    }
                    
                    price = price.setScale(2, BigDecimal.ROUND_HALF_EVEN);
                    Quote quote = new Quote();
                    quote.setSupplierPrice(price.toString());
                    process.setResult(quote);
                } else {
                throw new UnsupportedOperationException("Error:  No llego item");
            }
            } else {
                throw new UnsupportedOperationException("Error:  No llego la orden");
            }
        } else {
            throw new UnsupportedOperationException("Error:  Null");
        }
        return process;
    }

    public co.com.sony.sonyquoteservice.OrderQuouteResponseElement validateOrderQuoute(co.com.sony.sonyquoteservice.OrderQuouteElement parameters) {
        if (parameters!=null) {
            if (parameters.getOrderId()!=null) {
                OrderQuouteResponseElement orderResponse = new OrderQuouteResponseElement();
                orderResponse.setResult(true);
                return orderResponse;
            } else {
                throw new UnsupportedOperationException("Error:  No llego la orden");
            }
        } else {
            throw new UnsupportedOperationException("Error:  Null");
        }
    }
    
}
