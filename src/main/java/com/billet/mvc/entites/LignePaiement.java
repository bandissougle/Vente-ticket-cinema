package com.billet.mvc.entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class LignePaiement implements Serializable {
	
	@Id
	@GeneratedValue
	private int id_LignePaiement;
	
	@ManyToOne
	@JoinColumn(name = "id_seance")
	private Seance seance;
	
	
	@ManyToOne
	@JoinColumn(name = "num_paiement")
	private Paiement paiement;

	public int getId_LignePaiement() {
		return id_LignePaiement;
	}

	public void setId_LignePaiement(int id_LignePaiement) {
		this.id_LignePaiement = id_LignePaiement;
	}

	public Seance getSeance() {
		return seance;
	}

	public void setSeance(Seance seance) {
		this.seance = seance;
	}

	public Paiement getPaiement() {
		return paiement;
	}

	public void setPaiement(Paiement paiement) {
		this.paiement = paiement;
	}
	
	

}
