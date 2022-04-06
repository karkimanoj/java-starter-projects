package com.javatpoint.server.main.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ModelNotFoundException extends RuntimeException 
{

	private static final long serialVersionUID = 7668069253871475848L;

	public ModelNotFoundException(String message) 
	{
		super(message);
	}

}
