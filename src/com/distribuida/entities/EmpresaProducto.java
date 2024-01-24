package com.distribuida.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "empresa_producto")
public class EmpresaProducto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idempresa_producto")
	private int idempresaProducto;
	@Column(name = "producto")
	private String producto;
	@Column(name = "descripcion")
	private String descripcion;
	
	public EmpresaProducto () {}
	
	
	
	public EmpresaProducto(int idempresaProducto, String producto, String descripcion) {
		this.idempresaProducto = idempresaProducto;
		this.producto = producto;
		this.descripcion = descripcion;
	}



	public int getIdempresaProducto() {
		return idempresaProducto;
	}
	public void setIdempresaProducto(int idempresaProducto) {
		this.idempresaProducto = idempresaProducto;
	}
	public String getProducto() {
		return producto;
	}
	public void setProducto(String producto) {
		this.producto = producto;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String  descripcion) {
		this.descripcion = descripcion;
	}



	@Override
	public String toString() {
		return "EmpresaProducto [idempresaProducto=" + idempresaProducto + ", producto=" + producto + ", descripcion="
				+ descripcion + "]";
	}
	
}
