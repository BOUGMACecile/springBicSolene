package com.bicSolene.springBicSolene.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;

import com.bicSolene.springBicSolene.model.BicSolene;


public interface BicSoleneRepository extends  JpaRepository<BicSolene, Long>{

	public BicSolene findById(@NonNull long id);
	
	

}
