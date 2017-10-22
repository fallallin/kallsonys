/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sony;

import co.com.sony.excepcion.ExcepcionGenerica;
import co.com.sony.negocio.NegocioSony;
import co.com.sony.sonyquoteservice.OrderQuouteResponseElement;
import javax.ejb.EJB;
import javax.jws.WebService;

/**
 *
 * @author ohuertas
 */
@WebService(serviceName = "SonyQuoteService", portName = "SonyQuoteServicePort", endpointInterface = "co.com.sony.SonyQuoteService", targetNamespace = "http://sony.com.co/", wsdlLocation = "WEB-INF/wsdl/SonyWebService/SonyService.wsdl")
public class SonyWebService {
    @EJB
    private NegocioSony negocioSony;
    
    public co.com.sony.sonyquoteservice.SonyQuoteServiceProcessResponse orderQuoute(co.com.sony.sonyquoteservice.SonyQuoteServiceProcessRequest payload) throws ExcepcionGenerica {
        return negocioSony.orderQuoute(payload);
    }

    public co.com.sony.sonyquoteservice.OrderQuouteResponseElement validateOrderQuoute(co.com.sony.sonyquoteservice.OrderQuouteElement parameters) throws ExcepcionGenerica {
        if (parameters!=null) {
            if (parameters.getOrderId()!=null) {
                OrderQuouteResponseElement orderResponse = new OrderQuouteResponseElement();
                orderResponse.setResult(true);
                return orderResponse;
            } else {
                throw new ExcepcionGenerica("No llego la orden");
            }
        } else {
            throw new ExcepcionGenerica("Obligatorio el númeor de la orden");
        }
    }
    
}
