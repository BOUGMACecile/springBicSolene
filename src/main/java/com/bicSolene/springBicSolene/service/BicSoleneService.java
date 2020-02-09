package com.bicSolene.springBicSolene.service;

import java.util.List;

import com.bicSolene.springBicSolene.model.BicSolene;



public interface BicSoleneService {
	
	//to find a one BicSolene
	public BicSolene findBicSolene(long id)throws UnknownBicSoleneException;
	
	//To create /add a BicSolene
	
	public BicSolene addBicSolene(BicSolene bicSolene);
	/***
	 * To  have all BicSolene 
	 * */
	
	public List<BicSolene> findAllBicSolene();
	
	//To delete BicSolene by id
	
	public void deleteBicSoleneById(long id);
	
	//To delete all Bicsolene
	
	public void deleteAllBicSolene();
	
	//To update a Bicsolene
	
	public BicSolene updateBicSolene(BicSolene bicSolene);
	

}//end interface BicSolene
