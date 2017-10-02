/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.payment.integration;

import co.com.payment.model.Creditcard;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author ohuertas
 */
@Stateless
public class CreditCardFacade {
    @PersistenceContext(unitName = "PaymentPU")
    private EntityManager em;

    protected EntityManager getEntityManager() {
        return em;
    }

    public CreditCardFacade() {
        super();
    }

    public List<Creditcard> getCreditCardByTypeNumberCard(Creditcard creditCard) {
        Query query = this.getEntityManager().createQuery("SELECT c FROM Creditcard c WHERE c.typeCard = :typeCard and c.numberCard = :numberCard");
        query.setParameter("typeCard", creditCard.getTypeCard());
        query.setParameter("numberCard", creditCard.getNumberCard());
        return query.getResultList();
    }
}
