/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.rs.negocio;

import co.com.rapidservice.rapidservicequoteservice.Item;
import co.com.rapidservice.rapidservicequoteservice.ProcessQuoteElement;
import co.com.rapidservice.rapidservicequoteservice.ProcessQuoteResponseElement;
import co.com.rapidservice.rapidservicequoteservice.Quote;
import co.com.rs.excepcion.ExcepcionGenerica;
import co.com.rs.manejador.ManejadorRapidService;
import java.math.BigDecimal;
import java.util.Random;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author ohuertas
 */
@Stateless
public class NegocioRapidService {
    public static final String _PROPERTY_DECISOR_FACTORY_ = "DECISOR_FACTORY";
    public static final String _PROPERTY_RANDOM_ = "RANDOM";
    public static final String _PROPERTY_RS_ = "RS";
    public static final BigDecimal _PRICE_FACTOR_MIN_ = new BigDecimal(20000);
    public static final BigDecimal _PRICE_FACTOR_MAX_ = new BigDecimal(50000);
    
    @EJB
    private ManejadorRapidService manejadorRS;
    
    /**
     * Default constructor. 
     */
    public NegocioRapidService() {
    	super();
    }
    
    public String consultarValorPropiedad(String idProperty) {
        return manejadorRS.getValueProperty(idProperty);
    }

    public ProcessQuoteResponseElement processQuote(ProcessQuoteElement payload) throws ExcepcionGenerica {
        BigDecimal price = new BigDecimal(0);
        ProcessQuoteResponseElement process = new ProcessQuoteResponseElement();
        if (payload!=null) {
            if (payload.getOrderId() != null) {
                if (payload.getItems() != null) {
                    for (Item item : payload.getItems()) {
                        if (item.getItemId() != null) {
                            String property_factory = consultarValorPropiedad(_PROPERTY_DECISOR_FACTORY_); 
                            if (_PROPERTY_RANDOM_.equals(property_factory) || _PROPERTY_RS_.equals(property_factory)) {
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
