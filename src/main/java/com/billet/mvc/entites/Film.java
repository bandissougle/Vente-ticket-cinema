package com.billet.mvc.entites;


import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "film")
public class Film implements Serializable {
	
	@Id
	@GeneratedValue
	private int id_film;

	private String titre_film;
	
	@OneToMany(mappedBy = "film")
	private List<Seance> seance;
	
	public Film() {
		
	}

	public String getTitre_film() {
		return titre_film;
	}

	public void setTitre_film(String titre_film) {
		this.titre_film = titre_film;
	}
	
	public List<Seance> getSeance() {
		return seance;
	}

	public void setSeance(List<Seance> seance) {
		this.seance = seance;
	}

	public int getId_film() {
		return id_film;
	}

	public void setId_film(int id_film) {
		this.id_film = id_film;
	}
	
	

}
