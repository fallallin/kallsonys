package com.servientrega.modelo.dto.utils;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class DTOGenericException implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public static final int _CODE_EXCEPTION_ = 400;
	
	private int errorCode = _CODE_EXCEPTION_;
	private String errorMessage;
	
	public DTOGenericException(int errorCode, String errorMessage) {
		this.errorCode = errorCode;
		this.errorMessage = errorMessage; 
	}
	
	public DTOGenericException(String errorMessage) {
		this.errorMessage = errorMessage; 
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
}
