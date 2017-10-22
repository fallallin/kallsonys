/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dhl.model.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author ohuertas
 */
@Embeddable
public class DhlShipmentPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "partner")
    private String partner;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "orderId")
    private String orderId;

    public DhlShipmentPK() {
    }

    public DhlShipmentPK(String partner, String orderId) {
        this.partner = partner;
        this.orderId = orderId;
    }

    public String getPartner() {
        return partner;
    }

    public void setPartner(String partner) {
        this.partner = partner;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (partner != null ? partner.hashCode() : 0);
        hash += (orderId != null ? orderId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DhlShipmentPK)) {
            return false;
        }
        DhlShipmentPK other = (DhlShipmentPK) object;
        if ((this.partner == null && other.partner != null) || (this.partner != null && !this.partner.equals(other.partner))) {
            return false;
        }
        if ((this.orderId == null && other.orderId != null) || (this.orderId != null && !this.orderId.equals(other.orderId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.dhl.model.entities.DhlShipmentPK[ partner=" + partner + ", orderId=" + orderId + " ]";
    }
    
}
