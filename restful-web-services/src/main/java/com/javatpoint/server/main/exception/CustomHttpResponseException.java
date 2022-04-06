package com.javatpoint.server.main.exception;

import org.springframework.http.HttpStatus;


@SuppressWarnings("serial")
public class CustomHttpResponseException extends RuntimeException 
{
	private HttpStatus httpStatus;
	private Object errors;
	
	public CustomHttpResponseException(HttpStatus httpStatus) 
	{
		super(httpStatus.getReasonPhrase());
		this.httpStatus = httpStatus;
		this.errors = null;
	}
	
	public CustomHttpResponseException(HttpStatus httpStatus, String message) 
	{
		super(message);
		this.httpStatus = httpStatus;
		this.errors = null;
	}
	
	
	public CustomHttpResponseException(HttpStatus httpStatus, String message, Object errors) 
	{
		super(message);
		this.httpStatus = httpStatus;
		this.errors = errors;
	}
	
	/**
	 * @return the httpStatus
	 */
	public HttpStatus getHttpStatus() 
	{
		return httpStatus;
	}

	/**
	 * @param httpStatus the httpStatus to set
	 */
	public void setHttpStatus(HttpStatus httpStatus) 
	{
		this.httpStatus = httpStatus;
	}

	/**
	 * @return the errors
	 */
	public Object getErrors() 
	{
		return errors;
	}

	/**
	 * @param errors the errors to set
	 */
	public void setErrors(Object errors) 
	{
		this.errors = errors;
	}
}
