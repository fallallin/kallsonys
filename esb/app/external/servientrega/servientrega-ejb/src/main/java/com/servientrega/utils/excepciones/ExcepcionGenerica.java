package com.servientrega.utils.excepciones;

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
