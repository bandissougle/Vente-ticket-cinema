package com.billet.mvc.entites;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "paiement")
public class Paiement implements Serializable {
	
	@Id
	@GeneratedValue
	private int num_paiement;
	
	private String code;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date date_paiement;
	
	@OneToMany(mappedBy = "paiement")
	private List<LignePaiement> lignePaiement;

	public int getNum_paiement() {
		return num_paiement;
	}

	public void setNum_paiement(int num_paiement) {
		this.num_paiement = num_paiement;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Date getDate_paiement() {
		return date_paiement;
	}

	public void setDate_paiement(Date date_paiement) {
		this.date_paiement = date_paiement;
	}

	public List<LignePaiement> getLignePaiement() {
		return lignePaiement;
	}

	public void setLignePaiement(List<LignePaiement> lignePaiement) {
		this.lignePaiement = lignePaiement;
	}
	
	

}
