package com.bicSolene.springBicSolene.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bicSolene.springBicSolene.model.Couleur;
import com.bicSolene.springBicSolene.service.CouleurService;
import com.bicSolene.springBicSolene.service.UnknownBicSoleneException;

@RestController
@RequestMapping(value="couleur")

public class CouleurController {
	/**
	 * 
	 *Instantiation of CouleurService
	 * @param private CouleurService
	 * */
	@Autowired
	private CouleurService couleurService;

	public CouleurController() {}// TODO Auto-generated constructor stub
	
	/**Method to find one Color by couleurName
	 * */
	
	@GetMapping(path = "/couleurName")
	public Couleur getCouleurBycouleurName(@PathVariable String couleurName) {
		return couleurService.findCouleur(couleurName);
			}
	
	/**Method to create new Color by couleurName
	 * */
	@PostMapping(path = "/add")
	
	public Couleur addCouleur(@RequestBody @Valid Couleur couleurName) {
		return couleurService.addCouleur(couleurName);
	}
	

	/**Method to to fetch all Color from db
	 * */

	@GetMapping(path ="/allBicsolene")
 public  List<Couleur> findAllCouleur() {
	 return couleurService.findAllCouleur();
 }

	/**Method to delete a Color from db*/
	
	@DeleteMapping(path ="/suppCouleur")
	public void  suppBicsolene(@PathVariable @Valid long id) {
		try {
			couleurService.deleteCouleur(id);
		}catch (UnknownBicSoleneException e) {
			throw new NotFoundException("Couleur " + id + " not found", e);
		}
	}
	
	
}//end classCouleurController
