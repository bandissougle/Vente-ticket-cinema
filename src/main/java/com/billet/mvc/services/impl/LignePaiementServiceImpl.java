package com.billet.mvc.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.billet.mvc.dao.ILignePaiementDao;
import com.billet.mvc.entites.LignePaiement;
import com.billet.mvc.services.ILignePaiementService;

@Transactional
public class LignePaiementServiceImpl implements ILignePaiementService{
	
	private ILignePaiementDao dao;

	public void setDao(ILignePaiementDao dao) {
		this.dao = dao;
	}

	@Override
	public LignePaiement save(LignePaiement entity) {
		return dao.save(entity);
	}

	@Override
	public LignePaiement update(LignePaiement entity) {
		return dao.update(entity);
	}

	@Override
	public List<LignePaiement> selectAll() {
		return dao.selectAll();
	}

	@Override
	public List<LignePaiement> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}

	@Override
	public LignePaiement getById(int id) {
		return dao.getById(id);
	}

	@Override
	public void remove(int id) {
		dao.remove(id);
	}

	@Override
	public LignePaiement findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public LignePaiement findOne(String[] paramNames, Object[] paramValues) {
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramvalue) {
		return dao.findCountBy(paramName, paramvalue);
	}

}
