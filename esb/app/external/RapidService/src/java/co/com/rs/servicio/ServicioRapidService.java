/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.rs.servicio;

import co.com.rapidservice.rapidservicequoteservice.OrderQuouteResponseElement;
import co.com.rs.excepcion.ExcepcionGenerica;
import co.com.rs.negocio.NegocioRapidService;
import javax.ejb.EJB;
import javax.jws.WebService;

/**
 *
 * @author ohuertas
 */
@WebService(serviceName = "RapidServiceQuoteService", portName = "RapidServiceQuoteServicePort", endpointInterface = "co.com.rapidservice.RapidServiceQuoteService", targetNamespace = "http://RapidService.com.co/", wsdlLocation = "WEB-INF/wsdl/ServicioRapidService/RapidService.wsdl")
public class ServicioRapidService {
    @EJB
    private NegocioRapidService negocioRS;
    
    public co.com.rapidservice.rapidservicequoteservice.OrderQuouteResponseElement orderQuoute(co.com.rapidservice.rapidservicequoteservice.OrderQuouteElement parameters) throws ExcepcionGenerica {
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

    public co.com.rapidservice.rapidservicequoteservice.ProcessQuoteResponseElement processQuote(co.com.rapidservice.rapidservicequoteservice.ProcessQuoteElement parameters) throws ExcepcionGenerica {
        return negocioRS.processQuote(parameters);
    }
}
