package com.billet.mvc.services;

import java.util.List;

import com.billet.mvc.entites.Commande;

public interface ICommandeService {
	
	public Commande save(Commande entity);
	
	public Commande update(Commande entity);
	
	public List<Commande> selectAll();
	
	public List<Commande> selectAll(String sortField, String sort);
	
	public Commande getById(int id);
	
	public void remove(int id);
	
	public Commande findOne(String paramName, Object paramValue);
	
	public Commande findOne(String[] paramNames, Object[] paramValues);
	
	public int findCountBy(String paramName, String paramvalue);

}
