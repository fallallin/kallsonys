package com.servientrega.negocio;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.log4j.Logger;

import com.servientrega.manejador.ManejadorEnvio;
import com.servientrega.modelo.dto.DTOServientregaItem;
import com.servientrega.modelo.dto.DTOServientregaShipment;
import com.servientrega.modelo.entidad.ServientregaItem;
import com.servientrega.modelo.entidad.ServientregaItemPK;
import com.servientrega.modelo.entidad.ServientregaShipment;
import com.servientrega.utils.excepciones.ExcepcionGenerica;


/**
 * Session Bean implementation class NegocioRegion
 */
@Stateless
public class NegocioEnvio extends NegocioAbstracto<ServientregaShipment, DTOServientregaShipment> {
	/**
     * Variable estatica para imprimir logs...
     */
    private static final Logger logger = Logger.getLogger(ServientregaShipment.class.getName());
	
	@EJB
	private ManejadorEnvio manejadorEnvio;

    /**
     * Default constructor. 
     */
    public NegocioEnvio() {
    	super();
    }
    
    public DTOServientregaShipment crearEnvio(DTOServientregaShipment dtoEnvio) throws IllegalAccessException, InvocationTargetException, ExcepcionGenerica {
    	logService(this.getClass().getName(), "crear", dtoEnvio);
    	
    	ServientregaShipment envio = new ServientregaShipment();
    	copiarPropiedades(envio, dtoEnvio);
    	envio.setStatus(ServientregaShipment.DEFAULT_VALUE_STATUS);
    	
    	List<ServientregaItem> lstServientregaItem = new ArrayList<ServientregaItem>();
    	if (dtoEnvio.getServientregaItems() != null) {
	    	for (DTOServientregaItem dtoServientregaItem : dtoEnvio.getServientregaItems()) {
	            ServientregaItem servientregaItem = new ServientregaItem();
	            ServientregaItemPK id = new ServientregaItemPK();
	            BeanUtils.copyProperties(servientregaItem, dtoServientregaItem);
	            id.setItemid(dtoServientregaItem.getItemid());
	            id.setOrdid(dtoEnvio.getOrderid());
	            servientregaItem.setId(id);
	            servientregaItem.setServientregaShipment(envio);
	            lstServientregaItem.add(servientregaItem);
	    	}
    	} else {
    		throw new ExcepcionGenerica("Seleccione por lo menos un item para ser enviado por Servientrega");
    	}
    	
    	envio.setServientregaItems(lstServientregaItem);
    	manejadorEnvio.crearEnvio(envio);
    	return dtoEnvio;
    }
    
    
    public boolean estadoEnvio(String orderId) throws ExcepcionGenerica {
    	ServientregaShipment envio;
    	boolean resp = false;
    	
    	envio = manejadorEnvio.estadoEnvio(orderId);
    	if (envio != null) {
    		resp = "1".equals(envio.getStatus());
    	} else {
    		throw new ExcepcionGenerica("El número de la orden " + orderId + ", no existe");
    	}
		
    	return resp;
    }
    

	@Override
	protected Logger getLogger() {
		return logger;
	}

	@Override
	protected DTOServientregaShipment instanciarDTO() {
		return new DTOServientregaShipment();
	}

	@Override
	protected ServientregaShipment instanciarEntidad() {
		return new ServientregaShipment();
	}
}
