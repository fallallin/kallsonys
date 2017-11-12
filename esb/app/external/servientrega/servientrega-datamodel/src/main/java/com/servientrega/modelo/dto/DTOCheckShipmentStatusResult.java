package com.servientrega.modelo.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class DTOCheckShipmentStatusResult {
	private boolean checkShipmentStatusResult;

	public boolean isCheckShipmentStatusResult() {
		return checkShipmentStatusResult;
	}

	public void setCheckShipmentStatusResult(boolean checkShipmentStatusResult) {
		this.checkShipmentStatusResult = checkShipmentStatusResult;
	}
}
