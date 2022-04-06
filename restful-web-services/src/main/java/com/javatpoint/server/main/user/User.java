package com.javatpoint.server.main.user;

import java.util.Date;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

public class User 
{
	
	public Integer id;
	
	@Size(min = 5, message = "Name should be % characters")
	public String name;
	
	@Past
	public Date dob;
	
	protected User() {  }  
	
	public User(Integer id, String name, Date dob)
	{
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the dob
	 */
	public Date getDob() {
		return dob;
	}

	/**
	 * @param dob the dob to set
	 */
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	@Override
	public String toString()
	{
		return String.format("User [id=%s, name=%s, dob=%s]", id, name, dob);  
	}
}
