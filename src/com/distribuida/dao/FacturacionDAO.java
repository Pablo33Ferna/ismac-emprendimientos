package com.distribuida.dao;

import java.util.List;

import com.distribuida.entities.Facturacion;

public interface FacturacionDAO {

	public List<Facturacion> findAll();
	
	public Facturacion findOne(int id);
	
	public void add(Facturacion facturacion);
	
	public void up(Facturacion facturacion);
	
	public void del(int id);
	
}
