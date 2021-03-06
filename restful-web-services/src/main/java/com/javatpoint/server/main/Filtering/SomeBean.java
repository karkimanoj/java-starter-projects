package com.javatpoint.server.main.Filtering;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//@JsonIgnoreProperties indicates that the annotated fields is to be ignored from json response
//@JsonIgnoreProperties({"phone"})
@JsonFilter("SomeBeanFilter") //properties need to be ignored from json response is defined SomeBeanFilter  filter 
public class SomeBean 
{
	public String name;
	public String phone;
	
	////JsonIgnore indicates that the annotated method or field is to be ignored from json response
//	@JsonIgnore
	public String salary;
	
	public SomeBean(String name, String phone, String salary) 
	{
		super();
		this.name = name;
		this.phone = phone;
		this.salary = salary;
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
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the salary
	 */
	public String getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	
}
