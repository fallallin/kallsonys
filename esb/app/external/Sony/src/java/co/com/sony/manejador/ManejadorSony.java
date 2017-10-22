/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sony.manejador;

import co.com.sony.entities.KallsonysProperties;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ohuertas
 */
@Stateless
public class ManejadorSony {
    @PersistenceContext (unitName="sony-datamodel")
    private transient EntityManager em;
    /**
     * Default constructor. 
     */
	public ManejadorSony() {
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

