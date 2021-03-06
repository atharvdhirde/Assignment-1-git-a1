package com.washerdetails.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class WasherNotFoundException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;

	public WasherNotFoundException(String exception) {
		super(exception);
	}
	
}