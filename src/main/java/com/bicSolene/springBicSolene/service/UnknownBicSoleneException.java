package com.bicSolene.springBicSolene.service;

@SuppressWarnings("serial")

public class UnknownBicSoleneException extends RuntimeException{
	
	private final long bicSoleneId;

	public UnknownBicSoleneException(long id) {
		
		super("No bicSolène exist with id=" + id);
		this.bicSoleneId = id;
	}
	
	public long getBicSoleneId() {
		return bicSoleneId;
	}
}//end class UnknownBicSoleneException

