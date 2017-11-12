/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sony.negocio;

import co.com.sony.excepcion.ExcepcionGenerica;
import co.com.sony.manejador.ManejadorSony;
import co.com.sony.sonyquoteservice.Item;
import co.com.sony.sonyquoteservice.Quote;
import co.com.sony.sonyquoteservice.SonyQuoteServiceProcessRequest;
import co.com.sony.sonyquoteservice.SonyQuoteServiceProcessResponse;
import java.math.BigDecimal;
import java.util.Random;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author ohuertas
 */
@Stateless
public class NegocioSony {
    public static final String _PROPERTY_DECISOR_FACTORY_ = "DECISOR_FACTORY";
    public static final String _PROPERTY_RANDOM_ = "RANDOM";
    public static final String _PROPERTY_SONY_ = "SONY";
    public static final BigDecimal _PRICE_FACTOR_MIN_ = new BigDecimal(20000);
    public static final BigDecimal _PRICE_FACTOR_MAX_ = new BigDecimal(50000);
    
    @EJB
    private ManejadorSony manejadorSony;
    
    /**
     * Default constructor. 
     */
    public NegocioSony() {
    	super();
    }
    
    public String consultarValorPropiedad(String idProperty) {
        return manejadorSony.getValueProperty(idProperty);
    }

    public SonyQuoteServiceProcessResponse orderQuoute(SonyQuoteServiceProcessRequest payload) throws ExcepcionGenerica {
        BigDecimal price = new BigDecimal(0);
        SonyQuoteServiceProcessResponse process = new SonyQuoteServiceProcessResponse();
        if (payload!=null) {
            if (payload.getOrderId() != null) {
                if (payload.getItems() != null) {
                    for (Item item : payload.getItems()) {
                        if (item.getItemId() != null) {
                            String property_factory = consultarValorPropiedad(_PROPERTY_DECISOR_FACTORY_); 
                            if (_PROPERTY_RANDOM_.equals(property_factory) || _PROPERTY_SONY_.equals(property_factory)) {
                                Random r = new Random();
                                price = price.add(_PRICE_FACTOR_MIN_.add((_PRICE_FACTOR_MAX_.subtract(_PRICE_FACTOR_MIN_)).multiply(new BigDecimal(r.nextDouble()))).multiply(new BigDecimal(item.getQuantity())));
                            } else {
                                price = price.add(_PRICE_FACTOR_MAX_.multiply(new BigDecimal(item.getQuantity())));
                            }
                        }  
                    }
                    
                    price = price.setScale(2, BigDecimal.ROUND_HALF_EVEN);
                    Quote quote = new Quote();
                    quote.setSupplierPrice(price.toString());
                    process.setResult(quote);
                } else {
                throw new ExcepcionGenerica("No llego item");
            }
            } else {
                throw new ExcepcionGenerica("No llego la orden");
            }
        } else {
            throw new ExcepcionGenerica("Obligatorio el número de la orden");
        }
        return process;
    }
}
