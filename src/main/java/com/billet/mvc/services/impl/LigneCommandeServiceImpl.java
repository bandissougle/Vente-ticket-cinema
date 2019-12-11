package com.billet.mvc.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.billet.mvc.dao.ILigneCommandeDao;
import com.billet.mvc.entites.LigneCommande;
import com.billet.mvc.services.ILigneCommandeService;


@Transactional
public class LigneCommandeServiceImpl implements ILigneCommandeService{
	
	private ILigneCommandeDao dao;

	public void setDao(ILigneCommandeDao dao) {
		this.dao = dao;
	}

	@Override
	public LigneCommande save(LigneCommande entity) {
		return dao.save(entity);
	}

	@Override
	public LigneCommande update(LigneCommande entity) {
		return dao.update(entity);
	}

	@Override
	public List<LigneCommande> selectAll() {
		return dao.selectAll();
	}

	@Override
	public List<LigneCommande> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}

	@Override
	public LigneCommande getById(int id) {
		return dao.getById(id);
	}

	@Override
	public void remove(int id) {
		dao.remove(id);
	}

	@Override
	public LigneCommande findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public LigneCommande findOne(String[] paramNames, Object[] paramValues) {
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramvalue) {
		return dao.findCountBy(paramName, paramvalue);
	}

}
