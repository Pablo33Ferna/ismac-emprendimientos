package com.distribuida.dao;

import java.util.List;

import com.distribuida.entities.EmpresaProducto;

public interface EmpresaProductoDAO {

	public List<EmpresaProducto> findAll();
	
	public EmpresaProducto findOne(int id);
	
	public void add(EmpresaProducto empresaproducto);
	
	public void up(EmpresaProducto empresaproducto);
	
	public void del(int id);
}
