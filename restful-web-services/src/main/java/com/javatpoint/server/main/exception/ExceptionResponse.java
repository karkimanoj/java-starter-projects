package com.javatpoint.server.main.exception;


public class ExceptionResponse 
{
	
	private Integer Status;
	private String message;
	private String error;
	private Object errors;
	
	public ExceptionResponse(Integer status, String message, String error, Object errors) 
	{
		super();
		Status = status;
		this.message = message;
		this.error = error;
		this.errors = errors;
	}

	
	/**
	 * @return the status
	 */
	public Integer getStatus() {
		return Status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(Integer status) {
		Status = status;
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	/**
	 * @return the error
	 */
	public String getError() {
		return error;
	}
	/**
	 * @param error the error to set
	 */
	public void setError(String error) {
		this.error = error;
	}
	/**
	 * @return the errors
	 */
	public Object getErrors() {
		return errors;
	}
	/**
	 * @param errors the errors to set
	 */
	public void setErrors(Object errors) {
		this.errors = errors;
	}
	
	
	
}
