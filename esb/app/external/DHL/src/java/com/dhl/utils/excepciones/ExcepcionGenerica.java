/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dhl.utils.excepciones;

/**
 *
 * @author ohuertas
 */
public class ExcepcionGenerica extends Exception {
	private static final long serialVersionUID = 1L;
	
	public ExcepcionGenerica (String message) {
		super(message);
    }

    public ExcepcionGenerica (Throwable cause) {
        super (cause);
    }

    public ExcepcionGenerica (String message, Throwable cause) {
        super (message, cause);
    }
}
