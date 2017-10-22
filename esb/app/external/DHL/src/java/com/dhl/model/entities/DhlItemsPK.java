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
public class DhlItemsPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "itemID")
    private String itemID;
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

    public DhlItemsPK() {
    }

    public DhlItemsPK(String itemID, String partner, String orderId) {
        this.itemID = itemID;
        this.partner = partner;
        this.orderId = orderId;
    }

    public String getItemID() {
        return itemID;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
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
        hash += (itemID != null ? itemID.hashCode() : 0);
        hash += (partner != null ? partner.hashCode() : 0);
        hash += (orderId != null ? orderId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DhlItemsPK)) {
            return false;
        }
        DhlItemsPK other = (DhlItemsPK) object;
        if ((this.itemID == null && other.itemID != null) || (this.itemID != null && !this.itemID.equals(other.itemID))) {
            return false;
        }
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
        return "com.dhl.model.entities.DhlItemsPK[ itemID=" + itemID + ", partner=" + partner + ", orderId=" + orderId + " ]";
    }
    
}
