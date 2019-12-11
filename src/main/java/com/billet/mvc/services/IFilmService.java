package com.billet.mvc.services;

import java.util.List;

import com.billet.mvc.entites.Film;

public interface IFilmService {
	
    public Film save(Film entity);
	
	public Film update(Film entity);
	
	public List<Film> selectAll();
	
	public List<Film> selectAll(String sortField, String sort);
	
	public Film getById(int id);
	
	public void remove(int id);
	
	public Film findOne(String paramName, Object paramValue);
	
	public Film findOne(String[] paramNames, Object[] paramValues);
	
	public int findCountBy(String paramName, String paramvalue);

}
