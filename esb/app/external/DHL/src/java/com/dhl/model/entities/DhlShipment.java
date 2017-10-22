/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dhl.model.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ohuertas
 */
@Entity
@Table(name = "dhl_shipment")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DhlShipment.findAll", query = "SELECT d FROM DhlShipment d")
    , @NamedQuery(name = "DhlShipment.findByPartner", query = "SELECT d FROM DhlShipment d WHERE d.dhlShipmentPK.partner = :partner")
    , @NamedQuery(name = "DhlShipment.findBySupplier", query = "SELECT d FROM DhlShipment d WHERE d.supplier = :supplier")
    , @NamedQuery(name = "DhlShipment.findByOrderId", query = "SELECT d FROM DhlShipment d WHERE d.dhlShipmentPK.orderId = :orderId")
    , @NamedQuery(name = "DhlShipment.findByAddresseeName", query = "SELECT d FROM DhlShipment d WHERE d.addresseeName = :addresseeName")
    , @NamedQuery(name = "DhlShipment.findByAddresseeLastName", query = "SELECT d FROM DhlShipment d WHERE d.addresseeLastName = :addresseeLastName")
    , @NamedQuery(name = "DhlShipment.findByCountry", query = "SELECT d FROM DhlShipment d WHERE d.country = :country")
    , @NamedQuery(name = "DhlShipment.findByCity", query = "SELECT d FROM DhlShipment d WHERE d.city = :city")
    , @NamedQuery(name = "DhlShipment.findByStreet", query = "SELECT d FROM DhlShipment d WHERE d.street = :street")
    , @NamedQuery(name = "DhlShipment.findByState", query = "SELECT d FROM DhlShipment d WHERE d.state = :state")
    , @NamedQuery(name = "DhlShipment.findByZipcode", query = "SELECT d FROM DhlShipment d WHERE d.zipcode = :zipcode")})
public class DhlShipment implements Serializable {

    private static final long serialVersionUID = 1L;
    
    public static final String DEFAULT_VALUE_STATUS = "0";
    
    @EmbeddedId
    protected DhlShipmentPK dhlShipmentPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "supplier")
    private String supplier;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "addresseeName")
    private String addresseeName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "addresseeLastName")
    private String addresseeLastName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "country")
    private String country;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "city")
    private String city;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "street")
    private String street;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "state")
    private String state;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "zipcode")
    private String zipcode;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "dhlShipment")
    private List<DhlItems> dhlItemsList;

    public DhlShipment() {
    }

    public DhlShipment(DhlShipmentPK dhlShipmentPK) {
        this.dhlShipmentPK = dhlShipmentPK;
    }

    public DhlShipment(DhlShipmentPK dhlShipmentPK, String supplier, String addresseeName, String addresseeLastName, String country, String city, String street, String state, String zipcode) {
        this.dhlShipmentPK = dhlShipmentPK;
        this.supplier = supplier;
        this.addresseeName = addresseeName;
        this.addresseeLastName = addresseeLastName;
        this.country = country;
        this.city = city;
        this.street = street;
        this.state = state;
        this.zipcode = zipcode;
    }

    public DhlShipment(String partner, String orderId) {
        this.dhlShipmentPK = new DhlShipmentPK(partner, orderId);
    }

    public DhlShipmentPK getDhlShipmentPK() {
        return dhlShipmentPK;
    }

    public void setDhlShipmentPK(DhlShipmentPK dhlShipmentPK) {
        this.dhlShipmentPK = dhlShipmentPK;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getAddresseeName() {
        return addresseeName;
    }

    public void setAddresseeName(String addresseeName) {
        this.addresseeName = addresseeName;
    }

    public String getAddresseeLastName() {
        return addresseeLastName;
    }

    public void setAddresseeLastName(String addresseeLastName) {
        this.addresseeLastName = addresseeLastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    @XmlTransient
    public List<DhlItems> getDhlItemsList() {
        return dhlItemsList;
    }

    public void setDhlItemsList(List<DhlItems> dhlItemsList) {
        this.dhlItemsList = dhlItemsList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dhlShipmentPK != null ? dhlShipmentPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DhlShipment)) {
            return false;
        }
        DhlShipment other = (DhlShipment) object;
        if ((this.dhlShipmentPK == null && other.dhlShipmentPK != null) || (this.dhlShipmentPK != null && !this.dhlShipmentPK.equals(other.dhlShipmentPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.dhl.model.entities.DhlShipment[ dhlShipmentPK=" + dhlShipmentPK + " ]";
    }
    
}
