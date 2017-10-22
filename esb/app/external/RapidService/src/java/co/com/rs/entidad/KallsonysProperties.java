/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.rs.entidad;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "kallsonys_properties")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "KallsonysProperties.findAll", query = "SELECT k FROM KallsonysProperties k")
    , @NamedQuery(name = "KallsonysProperties.findByPropertyId", query = "SELECT k FROM KallsonysProperties k WHERE k.propertyId = :propertyId")
    , @NamedQuery(name = "KallsonysProperties.findByPropertyValue", query = "SELECT k FROM KallsonysProperties k WHERE k.propertyValue = :propertyValue")
    , @NamedQuery(name = "KallsonysProperties.findByPropertyDesc", query = "SELECT k FROM KallsonysProperties k WHERE k.propertyDesc = :propertyDesc")})
public class KallsonysProperties implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "propertyId")
    private String propertyId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "propertyValue")
    private String propertyValue;
    @Size(max = 200)
    @Column(name = "propertyDesc")
    private String propertyDesc;

    public KallsonysProperties() {
    }

    public KallsonysProperties(String propertyId) {
        this.propertyId = propertyId;
    }

    public KallsonysProperties(String propertyId, String propertyValue) {
        this.propertyId = propertyId;
        this.propertyValue = propertyValue;
    }

    public String getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(String propertyId) {
        this.propertyId = propertyId;
    }

    public String getPropertyValue() {
        return propertyValue;
    }

    public void setPropertyValue(String propertyValue) {
        this.propertyValue = propertyValue;
    }

    public String getPropertyDesc() {
        return propertyDesc;
    }

    public void setPropertyDesc(String propertyDesc) {
        this.propertyDesc = propertyDesc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (propertyId != null ? propertyId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof KallsonysProperties)) {
            return false;
        }
        KallsonysProperties other = (KallsonysProperties) object;
        if ((this.propertyId == null && other.propertyId != null) || (this.propertyId != null && !this.propertyId.equals(other.propertyId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.rp.entidad.KallsonysProperties[ propertyId=" + propertyId + " ]";
    }
    
}
