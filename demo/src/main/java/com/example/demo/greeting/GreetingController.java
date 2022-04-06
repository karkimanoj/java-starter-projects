package com.example.demo.greeting;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController 
{
	private final AtomicLong counter = new AtomicLong(); // Long can be used here. AtomicLong is used in multithreads
	private final String template = " hello world,  %s";
	
	@GetMapping("/")
	public Greeting greeting(@RequestParam String name )
//	public Greeting greeting(@RequestParam(value = "name", defaultValue ="") String name ) // if default value is needed
	{
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
		
	}
}
