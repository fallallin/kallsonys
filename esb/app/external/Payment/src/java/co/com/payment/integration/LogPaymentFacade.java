/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.payment.integration;

import co.com.payment.model.Logpayment;
import com.payment.validatecreditcard.PaymentType;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author ohuertas
 */
@Stateless
public class LogPaymentFacade {

    @PersistenceContext(unitName = "PaymentPU")
    private EntityManager em;

    protected EntityManager getEntityManager() {
        return em;
    }

    public LogPaymentFacade() {
        super();
    }

    public boolean saveLogPayment(PaymentType creditCard) throws Exception {
        boolean result = false;
        Query query = this.getEntityManager().createQuery("SELECT c FROM Logpayment c WHERE c.idorder = :idorder");
        query.setParameter("idorder", creditCard.getIdOrder());
        if (query.getResultList().isEmpty()) {
          
            Logpayment logPayment = new Logpayment();
            logPayment.setIdorder(creditCard.getIdOrder());
            
            this.getEntityManager().persist(logPayment);
            result = true;
        } else {
            throw new Exception("No fue posible realizar el pago porque el identificador de la orden ya existe");
        }
        
        return result;
    }
}
