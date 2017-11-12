package com.dhl.manejador;

import com.dhl.model.entities.DhlShipment;
import com.dhl.model.entities.DhlShipmentPK;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Session Bean implementation class ManejadorEnvio
 */
@Stateless
public class ManejadorEnvio {
	@PersistenceContext (unitName="dhl-datamodel")
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
    public DhlShipment crearEnvio(DhlShipment envio) {
    	em.persist(envio);
    	em.flush();
        return envio;
    }
    
    public DhlShipment estadoEnvio(DhlShipmentPK id) {
    	DhlShipment resp = em.find(DhlShipment.class, id);
    	if (resp != null) {
            em.refresh(resp);
        }
    	return resp;
    }
    
    public boolean existeEnvio(DhlShipmentPK id) {
        return estadoEnvio(id) != null;
    }
}
