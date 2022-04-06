package com.javatpoint.server.main.helloworld;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController 
{
	@Autowired
	private MessageSource messageSource;
	
	@GetMapping("/hellow-world")
	public String hellowWorld()
	{
		return "hellow world!";
	}
	
	@GetMapping("/hello-world-bean")
	public HelloWorldBean hellowWorldBean()
	{
		return new HelloWorldBean("hello-world");
	}
	
	@GetMapping("/hellow-world/path-variable/{name}")
	public HelloWorldBean  HelloWorldBeanPathVariable(@PathVariable String name)
	{
		return new HelloWorldBean(String.format("hello world! %s", name));
	}
	
	@GetMapping("/hellow-world/internationalMessage")
	public String internationalMessage()
	{	
		return messageSource.getMessage("good.morning.message", null, LocaleContextHolder.getLocale());
	}

}
