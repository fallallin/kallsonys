/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dhl.model.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ohuertas
 */
@Entity
@Table(name = "dhl_items")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DhlItems.findAll", query = "SELECT d FROM DhlItems d")
    , @NamedQuery(name = "DhlItems.findByItemID", query = "SELECT d FROM DhlItems d WHERE d.dhlItemsPK.itemID = :itemID")
    , @NamedQuery(name = "DhlItems.findByPartner", query = "SELECT d FROM DhlItems d WHERE d.dhlItemsPK.partner = :partner")
    , @NamedQuery(name = "DhlItems.findByOrderId", query = "SELECT d FROM DhlItems d WHERE d.dhlItemsPK.orderId = :orderId")
    , @NamedQuery(name = "DhlItems.findByProdID", query = "SELECT d FROM DhlItems d WHERE d.prodID = :prodID")
    , @NamedQuery(name = "DhlItems.findByProductName", query = "SELECT d FROM DhlItems d WHERE d.productName = :productName")
    , @NamedQuery(name = "DhlItems.findByPartNumber", query = "SELECT d FROM DhlItems d WHERE d.partNumber = :partNumber")
    , @NamedQuery(name = "DhlItems.findByPrice", query = "SELECT d FROM DhlItems d WHERE d.price = :price")
    , @NamedQuery(name = "DhlItems.findByQuantity", query = "SELECT d FROM DhlItems d WHERE d.quantity = :quantity")})
public class DhlItems implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DhlItemsPK dhlItemsPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "prodID")
    private String prodID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "productName")
    private String productName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "partNumber")
    private String partNumber;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "price")
    private BigDecimal price;
    @Basic(optional = false)
    @NotNull
    @Column(name = "quantity")
    private int quantity;
    @JoinColumns({
        @JoinColumn(name = "partner", referencedColumnName = "partner", insertable = false, updatable = false)
        , @JoinColumn(name = "orderId", referencedColumnName = "orderId", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private DhlShipment dhlShipment;

    public DhlItems() {
    }

    public DhlItems(DhlItemsPK dhlItemsPK) {
        this.dhlItemsPK = dhlItemsPK;
    }

    public DhlItems(DhlItemsPK dhlItemsPK, String prodID, String productName, String partNumber, BigDecimal price, int quantity) {
        this.dhlItemsPK = dhlItemsPK;
        this.prodID = prodID;
        this.productName = productName;
        this.partNumber = partNumber;
        this.price = price;
        this.quantity = quantity;
    }

    public DhlItems(String itemID, String partner, String orderId) {
        this.dhlItemsPK = new DhlItemsPK(itemID, partner, orderId);
    }

    public DhlItemsPK getDhlItemsPK() {
        return dhlItemsPK;
    }

    public void setDhlItemsPK(DhlItemsPK dhlItemsPK) {
        this.dhlItemsPK = dhlItemsPK;
    }

    public String getProdID() {
        return prodID;
    }

    public void setProdID(String prodID) {
        this.prodID = prodID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public DhlShipment getDhlShipment() {
        return dhlShipment;
    }

    public void setDhlShipment(DhlShipment dhlShipment) {
        this.dhlShipment = dhlShipment;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dhlItemsPK != null ? dhlItemsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DhlItems)) {
            return false;
        }
        DhlItems other = (DhlItems) object;
        if ((this.dhlItemsPK == null && other.dhlItemsPK != null) || (this.dhlItemsPK != null && !this.dhlItemsPK.equals(other.dhlItemsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.dhl.model.entities.DhlItems[ dhlItemsPK=" + dhlItemsPK + " ]";
    }
    
}
