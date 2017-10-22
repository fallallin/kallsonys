package com.servientrega.manejador;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.servientrega.modelo.entidad.ServientregaShipment;

/**
 * Session Bean implementation class ManejadorEnvio
 */
@Stateless
public class ManejadorEnvio {
	@PersistenceContext (unitName="servientrega-datamodel")
    private transient EntityManager em;
    /**
     * Default constructor. 
     */
	public ManejadorEnvio() {
		super();
	}
	
	/**
	 * Crea el envio
	 * @param envio
	 * @return el mismo objeto si la transaccion fue satisfactoria
	 */
    public ServientregaShipment crearEnvio(ServientregaShipment envio) {
    	em.persist(envio);
    	em.flush();
		return envio;
    }
    
    public ServientregaShipment estadoEnvio(String orderId) {
    	ServientregaShipment resp = em.find(ServientregaShipment.class, orderId);
    	if (resp!=null) { 
    		em.refresh(resp);
    	}
    	return resp;
    }
}
