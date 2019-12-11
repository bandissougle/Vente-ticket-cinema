package com.billet.mvc.services;

import java.util.List;

import com.billet.mvc.entites.LignePaiement;

public interface ILignePaiementService {
	
	public LignePaiement save(LignePaiement entity);
	
	public LignePaiement update(LignePaiement entity);
	
	public List<LignePaiement> selectAll();
	
	public List<LignePaiement> selectAll(String sortField, String sort);
	
	public LignePaiement getById(int id);
	
	public void remove(int id);
	
	public LignePaiement findOne(String paramName, Object paramValue);
	
	public LignePaiement findOne(String[] paramNames, Object[] paramValues);
	
	public int findCountBy(String paramName, String paramvalue);

}
