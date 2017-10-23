package com.servientrega.modelo.dto;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

import java.math.BigDecimal;
import java.math.BigInteger;


/**
 * The persistent class for the servientrega_items database table.
 * 
 */
@XmlRootElement
public class DTOServientregaItem implements Serializable {
	private static final long serialVersionUID = 1L;

	private String itemid;

	private BigDecimal price;

	private BigInteger prodid;

	private String productname;

	private String productnum;

	private int quantity;

	private DTOServientregaShipment servientregaShipment;

	public DTOServientregaItem() {
	}
	
	public String getItemid() {
		return this.itemid;
	}
	
	public void setItemid(String itemid) {
		this.itemid = itemid;
	}

	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public BigInteger getProdid() {
		return this.prodid;
	}

	public void setProdid(BigInteger prodid) {
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

	public DTOServientregaShipment getServientregaShipment() {
		return this.servientregaShipment;
	}

	public void setServientregaShipment(DTOServientregaShipment servientregaShipment) {
		this.servientregaShipment = servientregaShipment;
	}
}