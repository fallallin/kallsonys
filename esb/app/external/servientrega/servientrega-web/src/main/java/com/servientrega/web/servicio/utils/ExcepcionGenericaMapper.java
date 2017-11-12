package com.servientrega.web.servicio.utils;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

import com.servientrega.modelo.dto.utils.DTOGenericException;

@Provider
public class ExcepcionGenericaMapper implements ExceptionMapper<Exception> {
	@Override
    public Response toResponse(Exception exception) {
    	DTOGenericException dto = new DTOGenericException(exception.getMessage());
    	return Response.status(DTOGenericException._CODE_EXCEPTION_).entity(dto).type(APPLICATION_JSON).build();
    }
}
