package com.billet.mvc.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.billet.mvc.dao.IInscriptionDao;
import com.billet.mvc.entites.Inscription;
import com.billet.mvc.services.IInscriptionService;


@Transactional
public class InscriptionServiceImpl implements IInscriptionService{
	
	private IInscriptionDao dao;

	public void setDao(IInscriptionDao dao) {
		this.dao = dao;
	}

	@Override
	public Inscription save(Inscription entity) {
		return dao.save(entity);
	}

	@Override
	public Inscription update(Inscription entity) {
		return dao.update(entity);
	}

	@Override
	public List<Inscription> selectAll() {
		return dao.selectAll();
	}

	@Override
	public List<Inscription> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}

	@Override
	public Inscription getById(int id) {
		return dao.getById(id);
	}

	@Override
	public void remove(int id) {
		dao.remove(id);
	}

	@Override
	public Inscription findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public Inscription findOne(String[] paramNames, Object[] paramValues) {
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramvalue) {
		return dao.findCountBy(paramName, paramvalue);
	}

}
