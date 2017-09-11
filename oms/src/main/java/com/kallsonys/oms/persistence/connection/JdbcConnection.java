package com.kallsonys.oms.persistence.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.kallsonys.oms.ws.rest.vo.AnswerProductsVO;
import com.kallsonys.oms.ws.rest.vo.ConsultProductsVO;

public class JdbcConnection {

	private Connection con = null;
	static Statement st;

	private PreparedStatement preparedStmt = null;
	String sql = "";
	Boolean transaccion = false;
	ResultSet rs = null;

	private String server = "localhost";
	private String port = "1521";
	private String type = "xe";
	private String user = "system";
	private String pass = "Gmaj2060725!";

	public void conexionBD() {
		String url = "jdbc:oracle:thin:@" + this.server + ":" + this.port + ":" + this.type;
		
		 try {
	            Class.forName("oracle.jdbc.driver.OracleDriver");
	            System.out.println("Oracle JDBC Driver Registered!");
	            con = DriverManager.getConnection(url, this.user, this.pass);
		        if (con != null) {
		            System.out.println("You made it, take control your database now!");
		        } else {
		            System.out.println("Failed to make connection!");
		        }
	        } catch (ClassNotFoundException e) {
	            System.err.println("Where is your Oracle JDBC Driver?");
	            e.printStackTrace();
	            return;
	        }catch (SQLException e) {
	            System.err.println("Connection Failed! Check output console");
	            e.printStackTrace();
	            return;
	        }
		
	}

	/**
	 * Realiza la consulta de productos por los parametros del objeto
	 * ConsultProductsVO
	 * 
	 * @param consultProducts
	 * @return List<AnswerProductsVO>
	 * @author andres.falla
	 */
	public List<AnswerProductsVO> consultarProductos(ConsultProductsVO consultProducts) {

		List<AnswerProductsVO> listaResultados = new ArrayList<AnswerProductsVO>();
		AnswerProductsVO resultado;

		sql = "SELECT id, name, description, price, externalidentifier, idproducer FROM products WHERE 1=1";
		sql = sql  + this.filtrosConsultarProductos(consultProducts);
		
		int iterador = 1;

		try {

			this.conexionBD();
			preparedStmt = con.prepareStatement(sql);
			
			if(consultProducts.getCodigo() != null && ! consultProducts.getCodigo().trim().equals("")){
				preparedStmt.setInt(iterador,Integer.parseInt(consultProducts.getCodigo()));
				iterador++;
			}
			
			if(consultProducts.getNombre() != null && ! consultProducts.getNombre().trim().equals("")){
				preparedStmt.setString(iterador, consultProducts.getNombre());
				iterador++;
			}
			
			if(consultProducts.getDescripcion() != null && ! consultProducts.getDescripcion().trim().equals("")){
				preparedStmt.setString(iterador, consultProducts.getDescripcion());
				iterador++;
			}
			rs = preparedStmt.executeQuery();

			while (rs.next()) {
				resultado = new AnswerProductsVO();
				resultado.setCodigoProducto(String.valueOf(rs.getInt("externalidentifier")));
				resultado.setNombreProducto(rs.getString("name"));
				resultado.setDescripcionProducto(rs.getString("description"));
				resultado.setPrecioProducto(rs.getString("price"));
				listaResultados.add(resultado);
			}
		} catch (SQLException e) {
			System.err.println("Ocucrrio un error al consultar las obligaciones");
			e.getStackTrace();
		} catch (Exception e) {
			System.err.println("Error No controlado al consultar las obligaciones");
			e.getStackTrace();
		} finally {
			try {
				con.close();
				preparedStmt.close();
			} catch (SQLException e) {
				System.err.println("Error al cerrar la conexion");
			}
		}
		return listaResultados;
	}

	
	private String  filtrosConsultarProductos(ConsultProductsVO consultProducts){
		
		String filtros = "";
		if(consultProducts.getCodigo() != null && ! consultProducts.getCodigo().trim().equals("")){
			filtros = filtros + " AND externalidentifier = ?";
		}
		
		if(consultProducts.getNombre() != null && ! consultProducts.getNombre().trim().equals("")){
			filtros = filtros + " AND name = ?";
		}
		
		if(consultProducts.getDescripcion() != null && ! consultProducts.getDescripcion().trim().equals("")){
			filtros = filtros + " AND description = ?";
		}
		return filtros;
	}
	
}
