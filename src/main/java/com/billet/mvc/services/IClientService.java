package com.billet.mvc.services;

import java.util.List;

import com.billet.mvc.entites.Client;

public interface IClientService {
	
	public Client save(Client entity);
	
	public Client update(Client entity);
	
	public List<Client> selectAll();
	
	public List<Client> selectAll(String sortField, String sort);
	
	public Client getById(int id);
	
	public void remove(int id);
	
	public Client findOne(String paramName, Object paramValue);
	
	public Client findOne(String[] paramNames, Object[] paramValues);
	
	public int findCountBy(String paramName, String paramvalue);

}
