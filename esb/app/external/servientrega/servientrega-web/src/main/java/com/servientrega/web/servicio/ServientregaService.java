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

import com.servientrega.modelo.dto.DTOServientregaShipment;
import com.servientrega.negocio.NegocioEnvio;
import com.servientrega.utils.excepciones.ExcepcionGenerica;

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
    public boolean verificarEstadoEnvio(@QueryParam("orderId") String orderId) throws ExcepcionGenerica {
    	return negocioEnvio.estadoEnvio(orderId);
    }

	@POST
    @Path("cumplirConEnvio")
    @Produces({APPLICATION_JSON})
    public boolean cumplirConEnvio(DTOServientregaShipment dtoEnvio) throws IllegalAccessException, InvocationTargetException, ExcepcionGenerica {
    	return negocioEnvio.crearEnvio(dtoEnvio) != null;
    }
    
    protected Logger getLogger() {
		return logger;
	}
}