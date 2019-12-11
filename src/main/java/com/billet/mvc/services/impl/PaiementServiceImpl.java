package com.billet.mvc.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.billet.mvc.dao.IPaiementDao;
import com.billet.mvc.entites.Paiement;
import com.billet.mvc.services.IPaiementService;


@Transactional
public class PaiementServiceImpl implements IPaiementService{
	
	private IPaiementDao dao;

	public void setDao(IPaiementDao dao) {
		this.dao = dao;
	}

	@Override
	public Paiement save(Paiement entity) {
		return dao.save(entity);
	}

	@Override
	public Paiement update(Paiement entity) {
		return dao.update(entity);
	}

	@Override
	public List<Paiement> selectAll() {
		return dao.selectAll();
	}

	@Override
	public List<Paiement> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}

	@Override
	public Paiement getById(int id) {
		return dao.getById(id);
	}

	@Override
	public void remove(int id) {
		dao.remove(id);
	}

	@Override
	public Paiement findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public Paiement findOne(String[] paramNames, Object[] paramValues) {
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramvalue) {
		return dao.findCountBy(paramName, paramvalue);
	}

}
