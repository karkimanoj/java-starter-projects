package com.javatpoint.server.main.Filtering;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

@RestController
public class FilteringController 
{

	@GetMapping("/filtering")
	public MappingJacksonValue retrieveSomeBean()  
	{
		SomeBean someBean = new SomeBean("suman", "9867544567", "5000usd");
		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("phone", "salary");
		FilterProvider filters = (new SimpleFilterProvider()).addFilter("SomeBeanFilter", filter);
		
		MappingJacksonValue mapping = new MappingJacksonValue(someBean);
		
		mapping.setFilters(filters);
		return mapping;
	}
	
	@GetMapping("/filtering-list")
	public MappingJacksonValue getdata()
	{
		List<SomeBean> someBeans = Arrays.asList(new SomeBean("suman", "9867544567", "5000usd"), new SomeBean("suman", "9867544567", "5000usd"));
		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("name", "salary");
		FilterProvider filters = (new SimpleFilterProvider()).addFilter("SomeBeanFilter", filter);
		
		MappingJacksonValue mapping = new MappingJacksonValue(someBeans);
		mapping.setFilters(filters);
		return mapping;
//		return Arrays.asList(new SomeBean("suman", "9867544567", "5000usd"), new SomeBean("suman", "9867544567", "5000usd"));
	}
	

	
}
