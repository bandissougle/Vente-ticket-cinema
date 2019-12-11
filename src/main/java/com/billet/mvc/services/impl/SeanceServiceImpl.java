package com.billet.mvc.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.billet.mvc.dao.ISeanceDao;
import com.billet.mvc.entites.Seance;
import com.billet.mvc.services.ISeanceService;

@Transactional
public class SeanceServiceImpl implements ISeanceService{
	
	private ISeanceDao dao;

	public void setDao(ISeanceDao dao) {
		this.dao = dao;
	}

	@Override
	public Seance save(Seance entity) {
		return dao.save(entity);
	}

	@Override
	public Seance update(Seance entity) {
		return dao.update(entity);
	}

	@Override
	public List<Seance> selectAll() {
		return dao.selectAll();
	}

	@Override
	public List<Seance> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}

	@Override
	public Seance getById(int id) {
		return dao.getById(id);
	}

	@Override
	public void remove(int id) {
		dao.remove(id);
		
	}

	@Override
	public Seance findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public Seance findOne(String[] paramNames, Object[] paramValues) {
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramvalue) {
		return dao.findCountBy(paramName, paramvalue);
	}

}
