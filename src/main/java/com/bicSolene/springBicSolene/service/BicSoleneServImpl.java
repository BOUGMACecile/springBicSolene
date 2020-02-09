package com.bicSolene.springBicSolene.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bicSolene.springBicSolene.model.BicSolene;
import com.bicSolene.springBicSolene.repository.BicSoleneRepository;


@Service
public class BicSoleneServImpl implements BicSoleneService{
	
	@Autowired
	private BicSoleneRepository repoBicSolene;


		
			//Implements abstracts methodes of interface BicSolene
	@Override

	public BicSolene findBicSolene(long id)throws UnknownBicSoleneException {
		return repoBicSolene.findById(id);
				//.orElseThrow(() -> new UnknownBicSoleneException(id));
	}//end methode findBicSolene
	
	@Override
	public BicSolene addBicSolene(BicSolene bicSolene) {
		return repoBicSolene.save(bicSolene);
	}//end BicSolene addBicSolene
	
	
	//Find all BicSolene
	@Override
		public List<BicSolene> findAllBicSolene() {
			return repoBicSolene.findAll();
		
	}
	//delete a BicSolene
	@Override
		public void deleteBicSoleneById(long id) {
			repoBicSolene.deleteById(id);
		
	}//end deleteBicSolene
	
	//delete all BicSolene on db
	@Override
		public void deleteAllBicSolene(){
			repoBicSolene.deleteAll();
	}//enddeleteAllBicSolene
	
	//Methode to update a BicSolene
	@Override
		public BicSolene updateBicSolene(BicSolene bicSolene) {
			return repoBicSolene.save(bicSolene);
	}//end updateBicSolene
	
	
}// end BicSoleneImpl
