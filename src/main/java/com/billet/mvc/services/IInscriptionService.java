package com.billet.mvc.services;

import java.util.List;

import com.billet.mvc.entites.Inscription;

public interface IInscriptionService {
	
	public Inscription save(Inscription entity);
	
	public Inscription update(Inscription entity);
	
	public List<Inscription> selectAll();
	
	public List<Inscription> selectAll(String sortField, String sort);
	
	public Inscription getById(int id);
	
	public void remove(int id);
	
	public Inscription findOne(String paramName, Object paramValue);
	
	public Inscription findOne(String[] paramNames, Object[] paramValues);
	
	public int findCountBy(String paramName, String paramvalue);

}
