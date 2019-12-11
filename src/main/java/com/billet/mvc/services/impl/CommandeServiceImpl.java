package com.billet.mvc.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.billet.mvc.dao.ICommandeDao;
import com.billet.mvc.entites.Commande;
import com.billet.mvc.services.ICommandeService;


@Transactional
public class CommandeServiceImpl implements ICommandeService{
	
	private ICommandeDao dao;

	public void setDao(ICommandeDao dao) {
		this.dao = dao;
	}

	@Override
	public Commande save(Commande entity) {
		return dao.save(entity);
	}

	@Override
	public Commande update(Commande entity) {
		return dao.update(entity);
	}

	@Override
	public List<Commande> selectAll() {
		return dao.selectAll();
	}

	@Override
	public List<Commande> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}

	@Override
	public Commande getById(int id) {
		return dao.getById(id);
	}

	@Override
	public void remove(int id) {
		dao.remove(id);
	}

	@Override
	public Commande findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public Commande findOne(String[] paramNames, Object[] paramValues) {
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramvalue) {
		return dao.findCountBy(paramName, paramvalue);
	}

}
