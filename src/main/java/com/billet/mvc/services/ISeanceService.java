package com.billet.mvc.services;

import java.util.List;

import com.billet.mvc.entites.Seance;

public interface ISeanceService {
	
	public Seance save(Seance entity);
	
	public Seance update(Seance entity);
	
	public List<Seance> selectAll();
	
	public List<Seance> selectAll(String sortField, String sort);
	
	public Seance getById(int id);
	
	public void remove(int id);
	
	public Seance findOne(String paramName, Object paramValue);
	
	public Seance findOne(String[] paramNames, Object[] paramValues);
	
	public int findCountBy(String paramName, String paramvalue);

}
