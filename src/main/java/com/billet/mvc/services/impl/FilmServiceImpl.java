package com.billet.mvc.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.billet.mvc.dao.IFilmDao;
import com.billet.mvc.entites.Film;
import com.billet.mvc.services.IFilmService;

@Transactional
public class FilmServiceImpl implements IFilmService {
	
	private IFilmDao dao;

	public void setDao(IFilmDao dao) {
		this.dao = dao;
	}

	@Override
	public Film save(Film entity) {
		return dao.save(entity);
	}

	@Override
	public Film update(Film entity) {
		return dao.update(entity);
	}

	@Override
	public List<Film> selectAll() {
		return dao.selectAll();
	}

	@Override
	public List<Film> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}

	@Override
	public Film getById(int id) {
		return dao.getById(id);
	}

	@Override
	public void remove(int id) {
		dao.remove(id);
	}

	@Override
	public Film findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public Film findOne(String[] paramNames, Object[] paramValues) {
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramvalue) {
		return dao.findCountBy(paramName, paramvalue);
	}
	
	

}
