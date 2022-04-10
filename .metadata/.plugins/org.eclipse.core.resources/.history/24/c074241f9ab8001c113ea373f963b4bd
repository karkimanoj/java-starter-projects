package com.javatpoint.server.main;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@SpringBootApplication
public class RestfulWebServicesApplication 
{

	public static void main(String[] args)
	{
		SpringApplication.run(RestfulWebServicesApplication.class, args);
	}
	
	@Bean
	public LocaleResolver localResolver()
	{
		AcceptHeaderLocaleResolver localResolver = new AcceptHeaderLocaleResolver(); 
		localResolver.setDefaultLocale(Locale.US);
		return localResolver;
	}
	
	/* this is for spring actuator. didnot work due to version mismatch of spring boot and spring-data-rest-hal-explorer,
 	<dependency>  
		<groupId>org.springframework.boot</groupId>  
		<artifactId>spring-boot-starter-actuator</artifactId>  
	</dependency>  
	<dependency>
		<groupId>org.springframework.data</groupId>
		<artifactId>spring-data-rest-hal-explorer</artifactId>
	</dependency>
 */
	 
	//this bean is not required as spring.messages.basename=messages is used in application.properties 
//	@Bean
//	public ResourceBundleMessageSource bundleMessageSource()
//	{
//		ResourceBundleMessageSource bundleMessageSource = new ResourceBundleMessageSource();
//		bundleMessageSource.setBasename("messages");
//		return bundleMessageSource;
//	}

}
