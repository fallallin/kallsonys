/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.payment.model;

import java.io.Serializable;
import java.util.Calendar;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ohuertas
 */
@Entity
@Table(name = "logpayment")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Logpayment.findAll", query = "SELECT l FROM Logpayment l")
    , @NamedQuery(name = "Logpayment.findById", query = "SELECT l FROM Logpayment l WHERE l.id = :id")
    , @NamedQuery(name = "Logpayment.findByIdorder", query = "SELECT l FROM Logpayment l WHERE l.idorder = :idorder")
    , @NamedQuery(name = "Logpayment.findByPaymentdate", query = "SELECT l FROM Logpayment l WHERE l.paymentdate = :paymentdate")})
public class Logpayment implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "IDORDER")
    private String idorder;
    @Column(name = "PAYMENTDATE")
    private Date paymentdate;

    public Logpayment() {
    }

    public Logpayment(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdorder() {
        return idorder;
    }

    public void setIdorder(String idorder) {
        this.idorder = idorder;
    }

    public Date getPaymentdate() {
        return paymentdate;
    }

    public void setPaymentdate(Date paymentdate) {
        this.paymentdate = paymentdate;
    }
    
    @PrePersist
    protected void onCreate() {
        // Obtener la fecha actual del sistema
        Calendar calendar = Calendar.getInstance();
        java.util.Date currentDate = calendar.getTime();
        paymentdate = new java.sql.Date(currentDate.getTime());
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
        if (!(object instanceof Logpayment)) {
            return false;
        }
        Logpayment other = (Logpayment) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.payment.model.Logpayment[ id=" + id + " ]";
    }
    
}
