/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.rs.manejador;

import co.com.rs.entidad.KallsonysProperties;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ohuertas
 */
@Stateless
public class ManejadorRapidService {
    @PersistenceContext (unitName="rs-datamodel")
    private transient EntityManager em;
    
    /**
     * Default constructor. 
     */
	public ManejadorRapidService() {
		super();
	}
    
    public String getValueProperty(String propertyId) {
    	String resp = null;
        KallsonysProperties kallsonysProperty = (KallsonysProperties) em.createNamedQuery("KallsonysProperties.findByPropertyId").setParameter("propertyId", propertyId).getSingleResult();
    	if (kallsonysProperty != null) {
            em.refresh(kallsonysProperty);
            resp = kallsonysProperty.getPropertyValue();
        }
    	return resp;
    }
}
