package com.bicSolene.springBicSolene.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.bicSolene.springBicSolene.service.UnknownBicSoleneException;



@SuppressWarnings("serial")
@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "BicSolene not found")

public class NotFoundException extends RuntimeException {

	public NotFoundException(String msg, UnknownBicSoleneException cause) {
		super(msg, cause);
	}

}
