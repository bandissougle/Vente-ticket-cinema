package com.billet.mvc.entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class LigneCommande implements Serializable{
	 
	@Id
	@GeneratedValue
	private int idLigneCommande;
	
	@ManyToOne
	@JoinColumn(name = "num_commande")
	private Commande commande;
	
	@ManyToOne
	@JoinColumn(name = "id_seance")
	private Seance seance;

	public int getIdLigneCommande() {
		return idLigneCommande;
	}

	public void setIdLigneCommande(int idLigneCommande) {
		this.idLigneCommande = idLigneCommande;
	}

	public Commande getCommande() {
		return commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}

	public Seance getSeance() {
		return seance;
	}

	public void setSeance(Seance seance) {
		this.seance = seance;
	}
	
	

}
