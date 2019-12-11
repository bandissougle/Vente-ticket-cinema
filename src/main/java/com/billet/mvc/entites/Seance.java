package com.billet.mvc.entites;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "seance")
public class Seance implements Serializable {
	
	@Id
	@GeneratedValue
	private int id_seance;
	
	private int nbre_place;
	
	private Date date_seance;
	
	private Date horaire;
	
	private int prix;
	
	@ManyToOne
	@JoinColumn(name = "id_film")
	private Film film;
	
	@OneToMany(mappedBy = "seance")
	private List<LigneCommande> ligneCommande;
	
	@OneToMany(mappedBy = "seance")
	private List<LignePaiement> lignePaiement;
	
	private String lieu;
	
	public Seance() {
	
	}
	
	public int getNbre_place() {
		return nbre_place;
	}
	public void setNbre_place(int nbre_place) {
		this.nbre_place = nbre_place;
	}
	public Date getDate_seance() {
		return date_seance;
	}
	public void setDate_seance(Date date_seance) {
		this.date_seance = date_seance;
	}
	public Date getHoraire() {
		return horaire;
	}
	public void setHoraire(Date horaire) {
		this.horaire = horaire;
	}
	public String getLieu() {
		return lieu;
	}
	public void setLieu(String lieu) {
		this.lieu = lieu;
	}
	public int getId_seance() {
		return id_seance;
	}
	public void setId_seance(int id_seance) {
		this.id_seance = id_seance;
	}
	public Film getFilm() {
		return film;
	}
	public void setFilm(Film film) {
		this.film = film;
	}	
	
	public int getPrix() {
		return prix;
	}
	
	public void setPrix(int prix) {
		this.prix = prix;
	}

	public List<LigneCommande> getLigneCommande() {
		return ligneCommande;
	}

	public void setLigneCommande(List<LigneCommande> ligneCommande) {
		this.ligneCommande = ligneCommande;
	}
	
	
}
