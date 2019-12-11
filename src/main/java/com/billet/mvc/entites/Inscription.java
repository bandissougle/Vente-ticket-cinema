package com.billet.mvc.entites;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "inscription")
public class Inscription implements Serializable {
	
	@Id
	@GeneratedValue
	private int num_inscription;

	public int getNum_commande() {
		return num_inscription;
	}

	public void setNum_commande(int num_inscription) {
		this.num_inscription = num_inscription;
	}

	public int getNum_inscription() {
		return num_inscription;
	}

	public void setNum_inscription(int num_inscription) {
		this.num_inscription = num_inscription;
	}
	
	

}
