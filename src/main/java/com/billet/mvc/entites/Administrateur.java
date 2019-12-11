package com.billet.mvc.entites;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "administrateur")
public class Administrateur implements Serializable {
	
	@Id
	@GeneratedValue
	private int id_administrateur;
	private String nom_admin;
	private String prenom_admin;
	private String adresse_electronique;
	private String adresse;
	
	
	public Administrateur() {
		super();
	}

	public int getId_administrateur() {
		return id_administrateur;
	}

	public void setId_administrateur(int id_administrateur) {
		this.id_administrateur = id_administrateur;
	}

	public String getNom_admin() {
		return nom_admin;
	}

	public void setNom_admin(String nom_admin) {
		this.nom_admin = nom_admin;
	}

	public String getPrenom_admin() {
		return prenom_admin;
	}

	public void setPrenom_admin(String prenom_admin) {
		this.prenom_admin = prenom_admin;
	}

	public String getAdresse_electronique() {
		return adresse_electronique;
	}

	public void setAdresse_electronique(String adresse_electronique) {
		this.adresse_electronique = adresse_electronique;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	


}
