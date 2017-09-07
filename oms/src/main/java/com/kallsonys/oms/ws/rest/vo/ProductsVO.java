package com.kallsonys.oms.ws.rest.vo;

public class ProductsVO {

	private Integer id;
	private String name;
	private String description;
	private String price;
	private Integer externalIdentifier;
	private Integer idProducer;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public Integer getExternalIdentifier() {
		return externalIdentifier;
	}
	public void setExternalIdentifier(Integer externalIdentifier) {
		this.externalIdentifier = externalIdentifier;
	}
	public Integer getIdProducer() {
		return idProducer;
	}
	public void setIdProducer(Integer idProducer) {
		this.idProducer = idProducer;
	}
	
}
