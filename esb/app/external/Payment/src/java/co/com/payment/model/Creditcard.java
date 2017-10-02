/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.payment.model;

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
@Table(name = "creditcard")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Creditcard.findAll", query = "SELECT c FROM Creditcard c")
    , @NamedQuery(name = "Creditcard.findById", query = "SELECT c FROM Creditcard c WHERE c.id = :id")
    , @NamedQuery(name = "Creditcard.findByTypeCard", query = "SELECT c FROM Creditcard c WHERE c.typeCard = :typeCard")
    , @NamedQuery(name = "Creditcard.findByNumberCard", query = "SELECT c FROM Creditcard c WHERE c.numberCard = :numberCard")})
public class Creditcard implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "typeCard")
    private String typeCard;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "numberCard")
    private String numberCard;

    public Creditcard() {
    }

    public Creditcard(Long id) {
        this.id = id;
    }

    public Creditcard(Long id, String typeCard, String numberCard) {
        this.id = id;
        this.typeCard = typeCard;
        this.numberCard = numberCard;
    }

    public Creditcard(String ccType, String ccNum) {
        this.typeCard = ccType;
        this.numberCard = ccNum;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTypeCard() {
        return typeCard;
    }

    public void setTypeCard(String typeCard) {
        this.typeCard = typeCard;
    }

    public String getNumberCard() {
        return numberCard;
    }

    public void setNumberCard(String numberCard) {
        this.numberCard = numberCard;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Creditcard)) {
            return false;
        }
        Creditcard other = (Creditcard) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.payment.model.Creditcard[ id=" + id + " ]";
    }
    
}
