package com.bicSolene.springBicSolene.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;

import com.bicSolene.springBicSolene.model.BicSolene;



public interface BicSoleneRepository extends  JpaRepository<BicSolene, Long>{
	//Ajouter dans cette interface, on peut ajouter des méthodes qui ne font pas partie du CRUD

	public BicSolene findById(@NonNull long id);
	

}
