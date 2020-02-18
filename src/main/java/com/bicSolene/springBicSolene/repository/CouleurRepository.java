package com.bicSolene.springBicSolene.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bicSolene.springBicSolene.model.Couleur;


public interface CouleurRepository extends  JpaRepository<Couleur, Long>{
	
	public Couleur findByCouleurName(String couleurName);
	
	public List<Couleur> findAll();
	//not necessary
	/**
	public Couleur saveOrUpdateCouleur(Couleur couleur);
	*/
	public Couleur save(String couleurName);
	
}
