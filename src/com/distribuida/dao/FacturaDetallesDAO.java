package com.distribuida.dao;

import java.util.List;

import com.distribuida.entities.FacturaDetalles;

public interface FacturaDetallesDAO {

	public List<FacturaDetalles> findAll();
	
	public FacturaDetalles findOne(int id);
	
	public void add(FacturaDetalles facturadetalles);
	
	public void up(FacturaDetalles facturadetalles);
	
	public void del(int id);
	
}
