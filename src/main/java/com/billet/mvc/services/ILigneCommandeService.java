package com.billet.mvc.services;

import java.util.List;

import com.billet.mvc.entites.LigneCommande;

public interface ILigneCommandeService {
	
	public LigneCommande save(LigneCommande entity);
	
	public LigneCommande update(LigneCommande entity);
	
	public List<LigneCommande> selectAll();
	
	public List<LigneCommande> selectAll(String sortField, String sort);
	
	public LigneCommande getById(int id);
	
	public void remove(int id);
	
	public LigneCommande findOne(String paramName, Object paramValue);
	
	public LigneCommande findOne(String[] paramNames, Object[] paramValues);
	
	public int findCountBy(String paramName, String paramvalue);

}
