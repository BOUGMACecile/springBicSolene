package com.bicSolene.springBicSolene.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.bicSolene.springBicSolene.model.Couleur;

import com.bicSolene.springBicSolene.repository.CouleurRepository;

@Service(value ="couleurService")
public  class CouleurServiceImpl implements CouleurService {
	
	/**
	 * 
	 *Instanciation of CouleurRepository
	 * @param private CouleurRepository
	 * */

	@Autowired
	private CouleurRepository colorBicSolene;
	
	//implements abstracts methods of couleurService
	
	//default constructor
	public CouleurServiceImpl() {}
	
	@Override
	public Couleur findCouleur(String couleurName) {
		return colorBicSolene.findByCouleurName(couleurName);
	}

	@Override
	public Couleur addCouleur(String couleurName) {
		
		return colorBicSolene.save(couleurName);
	}

	@Override
	public List<Couleur> findAllCouleur() {
		// TODO Auto-generated method stub
		return colorBicSolene.findAll();
	}
/**
	@Override
	public Couleur saveOrUpdateCouleur(Couleur couleur) {
		// TODO Auto-generated method stub
		return colorBicSolene.saveOrUpdateCouleur(couleur);
	}
	*/

	@Override
	public void deleteCouleur(long id) {}


	



}//end class CouleurServiceImpl
