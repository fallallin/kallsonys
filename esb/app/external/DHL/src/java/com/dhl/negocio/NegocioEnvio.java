/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dhl.negocio;

import co.com.dhl.dhlshipmentservice.Item;
import co.com.dhl.dhlshipmentservice.Shipment;
import com.dhl.manejador.ManejadorEnvio;
import com.dhl.model.entities.DhlItems;
import com.dhl.model.entities.DhlItemsPK;
import com.dhl.model.entities.DhlShipment;
import com.dhl.model.entities.DhlShipmentPK;
import com.dhl.utils.excepciones.ExcepcionGenerica;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class NegocioRegion
 */
@Stateless
public class NegocioEnvio {

    @EJB
    private ManejadorEnvio manejadorEnvio;

    /**
     * Default constructor.
     */
    public NegocioEnvio() {
        super();
    }

    public boolean estadoEnvio(String partner, String orderId) throws ExcepcionGenerica {
        DhlShipmentPK id = new DhlShipmentPK(partner, orderId);
        boolean resp = false;

        DhlShipment envio = manejadorEnvio.estadoEnvio(id);
        if (envio != null) {
            resp = "1".equals(envio.getState());
        } else {
            throw new ExcepcionGenerica("El número de la orden " + orderId + " del partner " + partner + " en DHL, no existe");
        }

        return resp;
    }

    public Shipment crearEnvio(Shipment dtoEnvio) throws IllegalAccessException, InvocationTargetException, ExcepcionGenerica {
        DhlShipment envio = new DhlShipment();
        DhlShipmentPK dhlShipmentPK = new DhlShipmentPK(dtoEnvio.getPartner(), dtoEnvio.getOrderId());
        if (manejadorEnvio.existeEnvio(dhlShipmentPK)) {
            throw new ExcepcionGenerica("La orden " + dtoEnvio.getOrderId() + ", ya existe en DHL");
        }
        envio.setDhlShipmentPK(dhlShipmentPK);
        envio.setSupplier(dtoEnvio.getSupplier());
        envio.setAddresseeName(dtoEnvio.getAddresseeName());
        envio.setAddresseeLastName(dtoEnvio.getAddresseeLastName());
        envio.setCountry(dtoEnvio.getCountry());
        envio.setCity(dtoEnvio.getCity());
        envio.setStreet(dtoEnvio.getStreet());
        envio.setState(DhlShipment.DEFAULT_VALUE_STATUS);
        envio.setZipcode(dtoEnvio.getZipcode());

        List<DhlItems> lstItems = new ArrayList<DhlItems>();
        if (dtoEnvio.getItems() != null) {
            for (Item dtoItem : dtoEnvio.getItems().getItem()) {
                DhlItems dhlItem = new DhlItems();
                DhlItemsPK dhlIdItem = new DhlItemsPK(dtoItem.getItemID(), dtoEnvio.getPartner(), dtoEnvio.getOrderId());
                dhlItem.setDhlItemsPK(dhlIdItem);
                dhlItem.setProdID(dtoItem.getProdID());
                dhlItem.setProductName(dtoItem.getProductName());
                dhlItem.setPartNumber(dtoItem.getPartNumber());
                dhlItem.setPrice(new BigDecimal(dtoItem.getPrice()));
                dhlItem.setQuantity(dtoItem.getQuantity());
                lstItems.add(dhlItem);
            }
        } else {
            throw new ExcepcionGenerica("Seleccione por lo menos un item para ser enviado por DHL");
        }

        envio.setDhlItemsList(lstItems);
        
        manejadorEnvio.crearEnvio(envio);
        
        return dtoEnvio;
    }
}
