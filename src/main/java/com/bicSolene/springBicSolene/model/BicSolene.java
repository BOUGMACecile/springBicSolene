package com.bicSolene.springBicSolene.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "BICSOLENE")
public class BicSolene {
	
	//Declaration of BicSolene attributes
	@Id
	//@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@GeneratedValue(generator = "seq_generator", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name="seq_generator", sequenceName = "SEQ_BICSOLENE", allocationSize=1)
	private long id;
	
	@Column(name = "IDCOULEUR", nullable = false)
	private int idCouleur;
	
	private boolean capuchon;
	
	private boolean bouchon;
	
	@Column(name = "NAME", nullable = false)
	private String name;
	
	@Column(name = "IDTYPESTYLO", nullable = false)
	private int idTypeStylo;
	


	public BicSolene() {}// TODO Auto-generated constructor stub



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public int getIdCouleur() {
		return idCouleur;
	}



	public void setIdCouleur(int idCouleur) {
		this.idCouleur = idCouleur;
	}



	public boolean isCapuchon() {
		return capuchon;
	}



	public void setCapuchon(boolean capuchon) {
		this.capuchon = capuchon;
	}



	public boolean isBouchon() {
		return bouchon;
	}



	public void setBouchon(boolean bouchon) {
		this.bouchon = bouchon;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getIdTypeStylo() {
		return idTypeStylo;
	}



	public void setIdTypeStylo(int idTypeStylo) {
		this.idTypeStylo = idTypeStylo;
	}
	
	
		
	

}//end  class BicSolene
