package com.javatpoint.server.main.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice  
@RestController  
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler 
{
	@ExceptionHandler(Exception.class)  
	public final ResponseEntity<Object> handleExceptions(Exception ex, WebRequest request) 
	{
		ExceptionResponse expectionResponse = new ExceptionResponse(
				500, "internal server error", 
				HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase(), null
				);
		
		return new ResponseEntity<Object>(expectionResponse, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	
	@ExceptionHandler(CustomHttpResponseException.class)
	public final ResponseEntity<Object> handleCustomHttpResponseException(CustomHttpResponseException ex, WebRequest request) 
	{
		ExceptionResponse expectionResponse = new ExceptionResponse(
				ex.getHttpStatus().value(), 
				ex.getMessage(), 
				ex.getHttpStatus().getReasonPhrase(), 
				ex.getErrors()
				);
		
		return new ResponseEntity<Object>(expectionResponse, ex.getHttpStatus());
	}
	
}
