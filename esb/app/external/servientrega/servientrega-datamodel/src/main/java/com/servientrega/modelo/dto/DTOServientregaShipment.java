package com.servientrega.modelo.dto;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

import java.util.List;


/**
 * The persistent class for the servientrega_shipment database table.
 * 
 */
@XmlRootElement
public class DTOServientregaShipment implements Serializable {
	private static final long serialVersionUID = 1L;

	private String orderid;

	private String city;

	private String fname;

	private String lname;

	private String state;

	private String status;

	private String street;

	private String zipcode;

	private List<DTOServientregaItem> servientregaItems;

	public DTOServientregaShipment() {
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

	public List<DTOServientregaItem> getServientregaItems() {
		return this.servientregaItems;
	}

	public void setServientregaItems(List<DTOServientregaItem> servientregaItems) {
		this.servientregaItems = servientregaItems;
	}

	public DTOServientregaItem addServientregaItem(DTOServientregaItem servientregaItem) {
		getServientregaItems().add(servientregaItem);
		servientregaItem.setServientregaShipment(this);

		return servientregaItem;
	}

	public DTOServientregaItem removeServientregaItem(DTOServientregaItem servientregaItem) {
		getServientregaItems().remove(servientregaItem);
		servientregaItem.setServientregaShipment(null);

		return servientregaItem;
	}

}