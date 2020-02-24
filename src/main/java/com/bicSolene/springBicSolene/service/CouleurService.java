package com.bicSolene.springBicSolene.service;

import java.util.List;


import com.bicSolene.springBicSolene.model.Couleur;

public interface CouleurService {
	
//to find a color
	public Couleur findCouleur(String couleurName);
	
	//To create /add a Color
	
		public Couleur addCouleur(String couleurName);
		
		
		/***
		 * To  have all Color which exist in db
		 * */
		
		public List<Couleur> findAllCouleur();
		
		//public Couleur saveOrUpdateCouleur(Couleur couleur);
		
		public void deleteCouleur(long id);
	
}
