package com.kallsonys.oms.ws.rest.service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.kallsonys.oms.ws.rest.vo.AnswerProductsVO;
import com.kallsonys.oms.ws.rest.vo.ConsultProductsVO;
import com.kallsonys.oms.ws.rest.vo.ProductsVO;


@Path("/OmsProducts")
public class ServiceProducts {

	@POST
	@Path("/consultarProductos")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	public List<AnswerProductsVO> consultarProductos(ConsultProductsVO consultaProducto) {
		List<AnswerProductsVO> listaProductos = new ArrayList<AnswerProductsVO>();

		AnswerProductsVO producto = new AnswerProductsVO();

		producto.setCodigoProducto("Codigo Quemado 1");
		producto.setDescripcionProducto("Descripcion Quemada 1");
		producto.setNombreProducto("Nombre Quemado 1");
		producto.setPrecioProducto("100");
		listaProductos.add(producto);

		producto = new AnswerProductsVO();

		producto.setCodigoProducto("Codigo Quemado 2");
		producto.setDescripcionProducto("Descripcion Quemada 2");
		producto.setNombreProducto("Nombre Quemado 1");
		producto.setPrecioProducto("200");
		listaProductos.add(producto);

		return listaProductos;
	}
}
