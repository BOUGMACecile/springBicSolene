package com.bicSolene.springBicSolene.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table(name = "COULEUR")
public class Couleur {
	
	//Declaration of Color attributes
	/**
	 * */
	@Id
	//@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@GeneratedValue(generator = "seq_generator", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name="seq_generator", sequenceName = "SEQ_COULEUR", allocationSize=1)
	@Column(name = "ID", nullable = false)
private long id;
	
	@Column(name = "couleurName", nullable = false)	
private String couleurName;
	
	public Couleur() {}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCouleurName() {
		return couleurName;
	}

	public void setCouleurName(String couleurName) {
		this.couleurName = couleurName;
	}
	

}//end class Couleur
