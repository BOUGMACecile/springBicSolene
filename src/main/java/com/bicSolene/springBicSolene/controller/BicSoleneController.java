package com.bicSolene.springBicSolene.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.bicSolene.springBicSolene.model.BicSolene;
import com.bicSolene.springBicSolene.service.BicSoleneServImpl;
import com.bicSolene.springBicSolene.service.BicSoleneService;
import com.bicSolene.springBicSolene.service.UnknownBicSoleneException;




@RestController
@RequestMapping(value="bicsolene")
public class BicSoleneController {
	

	public BicSoleneController() {}// TODO Auto-generated constructor stub
	
	//a log for error
	@SuppressWarnings("unused")
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	//Declaration of an objet Bicsolene'service via  of interface Class
	@Autowired
	private BicSoleneService bicSoleneserv;
	
	
	/**Method to find one BicSolene by id
	 * */
	
	 
	@GetMapping(path = "/{id}")
	public BicSolene getBicSoleneById(@PathVariable long id) {
		try {
			return bicSoleneserv.findBicSolene(id);
		}
		catch (UnknownBicSoleneException e) {
			throw new NotFoundException("BicSolene " + id + " not found", e);
		}
	}
	
	//Methode to create  a new Bicsolene 
	
	@PostMapping(path = "/add")
		public  BicSolene  createBicSolene(@RequestBody @Valid BicSolene bicSolene) {
		
		return bicSoleneserv.addBicSolene(bicSolene);//(location).build();
		
	}//end createBicSolene
		
		//Method to fetch all Bicslene from db
		
		@GetMapping(path ="/allBicsolene")
		//@ResponseStatus(HttpStatus.OK)
		
		public List <BicSolene> getAll() {
			return bicSoleneserv.findAllBicSolene();
		}
					
			
	
	//Method to delete a BicSolene
		@DeleteMapping(path ="/suppBicsolene")
		public void  suppBicsolene(@PathVariable @Valid long id) {
			try {
					 bicSoleneserv.deleteBicSoleneById(id);
			}catch (UnknownBicSoleneException e) {
				throw new NotFoundException("BicSolene " + id + " not found", e);
			}
		}
	//Methodeto delete all BicSolene
		@DeleteMapping(path ="/deleteAllBicSolene")
		public void deleteAllBicSolen() {
			bicSoleneserv.deleteAllBicSolene();
			
		}//end deleteAllBic
		
		
		//Method to update a BicSolene
		@PutMapping (path ="modifBicSolene/{id}")
		public BicSolene modifBicSolene(@PathVariable long id,@RequestBody @Valid BicSolene bicSolene) {
			BicSolene bicmodif = bicSoleneserv.findBicSolene(id);
			if (bicmodif!= null) {
				bicmodif= bicSolene;
			bicmodif.setId(id);
			//ou réuire les 2 lignes ci - dessus avec le ode en bas commenté
			//bicSolene.setId(id);
			}
			return bicSoleneserv.updateBicSolene(bicmodif);
					//bicSoleneserv.updateBicSolene(bicSolene);
		}//end modifBic
		
		
			
		
	
}//end class
