package com.billet.mvc.entites;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "client")
public class Client implements Serializable {
	
	@Id
	@GeneratedValue
	private int idClient;
	private String nom_client;
	private String prenom_client;
	private String adresse_electronique;
	private String adresse;
	
	@OneToMany(mappedBy = "client")
	private List<Commande> commande;
	
	
	
	public Client() {
		super();
		
	}
	
	public int getId_Client() {
		return idClient;
	}
	
	public String getNom_client() {
		return nom_client;
	}
	public void setNom_client(String nom_client) {
		this.nom_client = nom_client;
	}
	public String getPrenom_client() {
		return prenom_client;
	}
	public void setPrenom_client(String prenom_client) {
		this.prenom_client = prenom_client;
	}
	public String getAdresse_electronique() {
		return adresse_electronique;
	}
	public void setAdresse_electronique(String adresse_electronique) {
		this.adresse_electronique = adresse_electronique;
	}
	public String getAdresse_postale() {
		return adresse;
	}
	public void setAdresse_postale(String adresse) {
		this.adresse = adresse;
	}
}
