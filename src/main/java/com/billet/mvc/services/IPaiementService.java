package com.billet.mvc.services;

import java.util.List;

import com.billet.mvc.entites.Paiement;

public interface IPaiementService {
	
	public Paiement save(Paiement entity);
	
	public Paiement update(Paiement entity);
	
	public List<Paiement> selectAll();
	
	public List<Paiement> selectAll(String sortField, String sort);
	
	public Paiement getById(int id);
	
	public void remove(int id);
	
	public Paiement findOne(String paramName, Object paramValue);
	
	public Paiement findOne(String[] paramNames, Object[] paramValues);
	
	public int findCountBy(String paramName, String paramvalue);

}
