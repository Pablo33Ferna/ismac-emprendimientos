package com.distribuida.entities;

import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "factura_detalles")
public class FacturaDetalles {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_factura")
	private int idFacturaDetalle;
	@Column(name = "Producto")
	private String producto;
	@Column(name = "Cantidad")
	private int cantidad;
	@Column(name = "preciounidad")
	private BigDecimal preUnidad;
	@Column(name = "subtotal")
	private BigDecimal subTotal;
	@Column(name = "descuento1")
	private BigDecimal descuento1;
	@Column(name = "descuento2")
	private BigDecimal descuento2;
	
	@ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	@JoinColumn(name="idFactura")
	private Facturacion factura;
	@ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	@JoinColumn(name="idEmpresaProducto")
	private EmpresaProducto empresaProducto;
	
	public FacturaDetalles () {}
	
	public FacturaDetalles(int idFacturaDetalle, String producto, int cantidad, BigDecimal preUnidad, BigDecimal subTotal,
			BigDecimal descuento1, BigDecimal descuento2, Facturacion factura, EmpresaProducto empresaProducto) {
		this.idFacturaDetalle = idFacturaDetalle;
		this.producto = producto;
		this.cantidad = cantidad;
		this.preUnidad = preUnidad;
		this.subTotal = subTotal;
		this.descuento1 = descuento1;
		this.descuento2 = descuento2;
		this.factura = factura;
		this.empresaProducto = empresaProducto;
	}

	
	public FacturaDetalles (Facturacion factura) {
		this.factura = factura;
	}
	
	public FacturaDetalles (EmpresaProducto empresaProducto) {
		this.empresaProducto = empresaProducto;
	}

	
	public int getIdFacturaDetalle() {
		return idFacturaDetalle;
	}

	public void setIdFacturaDetalle(int idFacturaDetalle) {
		this.idFacturaDetalle = idFacturaDetalle;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public BigDecimal getPreUnidad() {
		return preUnidad;
	}

	public void setPreUnidad(BigDecimal preUnidad) {
		this.preUnidad = preUnidad;
	}

	public BigDecimal getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(BigDecimal subTotal) {
		this.subTotal = subTotal;
	}

	public BigDecimal getDescuento1() {
		return descuento1;
	}

	public void setDescuento1(BigDecimal descuento1) {
		this.descuento1 = descuento1;
	}

	public BigDecimal getDescuento2() {
		return descuento2;
	}

	public void setDescuento2(BigDecimal descuento2) {
		this.descuento2 = descuento2;
	}

	public Facturacion getFactura() {
		return factura;
	}

	public void setFactura(Facturacion factura) {
		this.factura = factura;
	}

	public EmpresaProducto getEmpresaProducto() {
		return empresaProducto;
	}

	public void setEmpresaProducto(EmpresaProducto empresaProducto) {
		this.empresaProducto = empresaProducto;
	}

	@Override
	public String toString() {
		return "FacturaDetalles [idFacturaDetalle=" + idFacturaDetalle + ", producto=" + producto + ", cantidad="
				+ cantidad + ", preUnidad=" + preUnidad + ", subTotal=" + subTotal + ", descuento1=" + descuento1
				+ ", descuento2=" + descuento2 + ", factura=" + factura + ", empresaProducto=" + empresaProducto + "]";
	}

}
