package com.servientrega.modelo.dto.utils;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class DTOExcepcionGenerica implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public static final int CODIGO_EXCEPCION = 400;
	
	private int codigoExcepcion = CODIGO_EXCEPCION;
	private String mensajeExcepcion;
	
	public DTOExcepcionGenerica(int codigoExcepcion, String mensajeExcepcion) {
		this.codigoExcepcion = codigoExcepcion;
		this.mensajeExcepcion = mensajeExcepcion; 
	}
	
	public DTOExcepcionGenerica(String mensajeExcepcion) {
		this.mensajeExcepcion = mensajeExcepcion; 
	}
	
	public int getCodigoExcepcion() {
		return codigoExcepcion;
	}
	public void setCodigoExcepcion(int codigoExcepcion) {
		this.codigoExcepcion = codigoExcepcion;
	}
	public String getMensajeExcepcion() {
		return mensajeExcepcion;
	}
	public void setMensajeExcepcion(String mensajeExcepcion) {
		this.mensajeExcepcion = mensajeExcepcion;
	}
	
	
}
