package com.servientrega.modelo.entidad;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the servientrega_items database table.
 * 
 */
@Entity
@Table(name="servientrega_items")
@NamedQuery(name="ServientregaItem.findAll", query="SELECT s FROM ServientregaItem s")
public class ServientregaItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ServientregaItemPK id;

	private BigDecimal price;

	private String prodid;

	private String productname;

	private String productnum;

	private int quantity;

	//bi-directional many-to-one association to ServientregaShipment
	@ManyToOne
	@JoinColumn(name="ordid")
	private ServientregaShipment servientregaShipment;

	public ServientregaItem() {
	}

	public ServientregaItemPK getId() {
		return this.id;
	}

	public void setId(ServientregaItemPK id) {
		this.id = id;
	}

	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getProdid() {
		return this.prodid;
	}

	public void setProdid(String prodid) {
		this.prodid = prodid;
	}

	public String getProductname() {
		return this.productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public String getProductnum() {
		return this.productnum;
	}

	public void setProductnum(String productnum) {
		this.productnum = productnum;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public ServientregaShipment getServientregaShipment() {
		return this.servientregaShipment;
	}

	public void setServientregaShipment(ServientregaShipment servientregaShipment) {
		this.servientregaShipment = servientregaShipment;
	}

}