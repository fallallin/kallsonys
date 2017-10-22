/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dhl.servicio;

import com.dhl.negocio.NegocioEnvio;
import com.dhl.utils.excepciones.ExcepcionGenerica;
import java.lang.reflect.InvocationTargetException;
import javax.ejb.EJB;
import javax.jws.WebService;

/**
 *
 * @author ohuertas
 */
@WebService(serviceName = "DHLShipmentService", portName = "DHLShipmentServicePort", endpointInterface = "co.com.dhl.DHLShipmentServicePort", targetNamespace = "http://dhl.com.co/", wsdlLocation = "WEB-INF/wsdl/DHLService/DHLService.wsdl")
public class DHLService {
    @EJB
    private NegocioEnvio negocioEnvio;
    
    public boolean fullfillShipment(co.com.dhl.dhlshipmentservice.Shipment shipment) throws IllegalAccessException, InvocationTargetException, ExcepcionGenerica {
        return negocioEnvio.crearEnvio(shipment) != null;
    }

    public java.lang.String checkShipmentStatus(java.lang.String partner, java.lang.String orderId) throws ExcepcionGenerica {
        return String.valueOf(negocioEnvio.estadoEnvio(partner, orderId));
    }
    
}
