package com.distribuida.principal;

import java.util.List;
import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.ClienteDAO;
import com.distribuida.dao.FacturacionDAO;
import com.distribuida.dao.FormaPagoDAO;
import com.distribuida.dao.PedidoDAO;
import com.distribuida.entities.Cliente;
import com.distribuida.entities.Facturacion;
import com.distribuida.entities.FormaPago;
import com.distribuida.entities.Pedido;

public class PrincipalFacturacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		FacturacionDAO facturacionDAO = context.getBean("facturacionDAOImpl",FacturacionDAO.class);
		ClienteDAO clienteDAO = context.getBean("clienteDAOImpl", ClienteDAO.class);
		PedidoDAO pedidoDAO = context.getBean("pedidoDAOImpl", PedidoDAO.class);
	    FormaPagoDAO formaPagoDAO = context.getBean("formaPagoDAOImpl", FormaPagoDAO.class); 
		
		
		//CRUD
		
		//add
		Cliente cliente = clienteDAO.findOne(0);
		Pedido pedido = pedidoDAO.findOne(0);
		FormaPago formapago = formaPagoDAO.findOne(0);
		Facturacion facturacion = new Facturacion(0,"FAC-0001", new Date(),123.32, 0.12 , 129.55 , cliente, pedido , formapago);
		facturacionDAO.add(facturacion);
		
		//findAll
				List<Facturacion> facturaciones = facturacionDAO.findAll();
				
				//Implesion
				for(Facturacion item : facturaciones ) {
					System.out.println(item.toString());
				}
				
				// findOne
				// Facturacion facturacion = facturacionDAO.findOne(2);
				// System.out.println(factura.toString());
		
		context.close();
	}

}
