/**
 * 
 */
package com.javatpoint.server.main.user;

import java.net.URI;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import static org.springframework.hateoas.EntityModel.of;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;
import com.javatpoint.server.main.exception.CustomHttpResponseException;
import javax.validation.Valid;  

@RestController
public class UserResource 
{
	@Autowired
	private UserDaoService service;

	@GetMapping("/users")
	public List<User> retriveAllUsers()
	{
		return service.findAll();
	}
	
	@GetMapping("/users/{id}")
	public User retriveUser(@PathVariable Integer id)
	{
		User user = service.findOne(id);
		if(user == null)
		{
			throw new CustomHttpResponseException(HttpStatus.NOT_FOUND);
		}
		
		return user;
	}
	
	@GetMapping("/usersWithLinks/{id}")
	public EntityModel<User> retriveUserWithLinks(@PathVariable Integer id)
	{
		
		User user = service.findOne(id);
		if(user == null)
		{
			throw new CustomHttpResponseException(HttpStatus.NOT_FOUND);
		}
		
		EntityModel<User> userResource = of(user);
		WebMvcLinkBuilder linkTo = linkTo(methodOn(this.getClass()).retriveAllUsers());
		
		userResource.add(linkTo.withRel("all_users"));
		return userResource;
	}
	
//	@PostMapping("/users")
//	public User createUser(@RequestBody User user)
//	{
//		return service.save(user);
//	}
	
	//with proper status code, header and response
	@PostMapping("/users")
	public ResponseEntity<Object> createUser(@Valid @RequestBody User user)
	{
		
		User newUser = service.save(user);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(newUser.getId()).toUri();
		return ResponseEntity.created(location).build();
	}
	
	@DeleteMapping("/users/{id}")
	public ResponseEntity<Object> delete(@PathVariable Integer id)
	{
		User user = service.deleteUser(id);
		
		if(user == null)
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "user not found");
		
		return ResponseEntity.noContent().build();
	}
	
//	@GetMapping("/users/getdata")
//	public String getdata()
//	{
//		return "manoj";
//	}
}
