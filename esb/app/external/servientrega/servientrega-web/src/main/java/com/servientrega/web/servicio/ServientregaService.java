package com.servientrega.web.servicio;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

import java.lang.reflect.InvocationTargetException;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import org.apache.log4j.Logger;

import com.servientrega.modelo.dto.DTOCheckShipmentStatusResult;
import com.servientrega.modelo.dto.DTOFullfillShipmentResult;
import com.servientrega.modelo.dto.DTOServientregaShipment;
import com.servientrega.negocio.NegocioEnvio;
import com.servientrega.utils.excepciones.GenericException;

/**
 * Session Bean implementation class ServicioRegion
 */
@Stateless
@Path("envio")
public class ServientregaService {
	@EJB
    private NegocioEnvio negocioEnvio;
	
	/**
     * Variable estatica para imprimir logs...
     */
    private static final Logger logger = Logger.getLogger(ServientregaService.class.getName());
	
    /**
     * Default constructor. 
     */
    public ServientregaService() {
        super();
    }
    
    @GET
    @Path("verificarEstadoEnvio")
    @Produces({APPLICATION_JSON})
    public DTOCheckShipmentStatusResult verificarEstadoEnvio(@QueryParam("orderId") String orderId) throws GenericException {
    	DTOCheckShipmentStatusResult resp = new DTOCheckShipmentStatusResult();
    	resp.setCheckShipmentStatusResult(negocioEnvio.estadoEnvio(orderId));
    	return resp;
    }

	@POST
    @Path("cumplirConEnvio")
    @Produces({APPLICATION_JSON})
    public DTOFullfillShipmentResult cumplirConEnvio(DTOServientregaShipment dtoEnvio) throws IllegalAccessException, InvocationTargetException, GenericException {
		DTOFullfillShipmentResult resp = new DTOFullfillShipmentResult();
		resp.setFullfillShipmentResult(negocioEnvio.crearEnvio(dtoEnvio) != null);
    	return resp;
    }
    
    protected Logger getLogger() {
		return logger;
	}
}