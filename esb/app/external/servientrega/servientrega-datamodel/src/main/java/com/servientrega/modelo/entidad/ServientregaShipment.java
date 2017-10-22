package com.servientrega.modelo.entidad;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the servientrega_shipment database table.
 * 
 */
@Entity
@Table(name="servientrega_shipment")
@NamedQuery(name="ServientregaShipment.findAll", query="SELECT s FROM ServientregaShipment s")
public class ServientregaShipment implements Serializable {
	private static final long serialVersionUID = 1L;

	public static final String DEFAULT_VALUE_STATUS = "0";

	@Id
	private String orderid;

	private String city;

	private String fname;

	private String lname;

	private String state;

	private String status = "0";

	private String street;

	private String zipcode;

	//bi-directional many-to-one association to ServientregaItem
	@OneToMany(mappedBy="servientregaShipment", cascade=CascadeType.PERSIST)
	private List<ServientregaItem> servientregaItems;

	public ServientregaShipment() {
	}

	public String getOrderid() {
		return this.orderid;
	}

	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getFname() {
		return this.fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return this.lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStreet() {
		return this.street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getZipcode() {
		return this.zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public List<ServientregaItem> getServientregaItems() {
		return this.servientregaItems;
	}

	public void setServientregaItems(List<ServientregaItem> servientregaItems) {
		this.servientregaItems = servientregaItems;
	}

	public ServientregaItem addServientregaItem(ServientregaItem servientregaItem) {
		getServientregaItems().add(servientregaItem);
		servientregaItem.setServientregaShipment(this);

		return servientregaItem;
	}

	public ServientregaItem removeServientregaItem(ServientregaItem servientregaItem) {
		getServientregaItems().remove(servientregaItem);
		servientregaItem.setServientregaShipment(null);

		return servientregaItem;
	}

}