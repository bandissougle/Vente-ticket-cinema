package com.billet.mvc.services;

import java.util.List;

import com.billet.mvc.entites.Administrateur;

public interface IAdministrateurService {
	
	public Administrateur save(Administrateur entity);
	
	public Administrateur update(Administrateur entity);
	
	public List<Administrateur> selectAll();
	
	public List<Administrateur> selectAll(String sortField, String sort);
	
	public Administrateur getById(int id);
	
	public void remove(int id);
	
	public Administrateur findOne(String paramName, Object paramValue);
	
	public Administrateur findOne(String[] paramNames, Object[] paramValues);
	
	public int findCountBy(String paramName, String paramvalue);

}
