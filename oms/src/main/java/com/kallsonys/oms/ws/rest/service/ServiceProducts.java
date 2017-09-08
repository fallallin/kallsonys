package com.kallsonys.oms.ws.rest.service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.kallsonys.oms.persistence.connection.JdbcConnection;
import com.kallsonys.oms.ws.rest.vo.AnswerProductsVO;
import com.kallsonys.oms.ws.rest.vo.ConsultProductsVO;


@Path("/OmsProducts")
public class ServiceProducts {

	@POST
	@Path("/consultarProductos")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	public List<AnswerProductsVO> consultarProductos(ConsultProductsVO consultaProducto) {
		List<AnswerProductsVO> listaProductos;
	
		JdbcConnection conexion = new JdbcConnection();
		listaProductos = conexion.consultarProductos(consultaProducto);

		return listaProductos;
	}
}
