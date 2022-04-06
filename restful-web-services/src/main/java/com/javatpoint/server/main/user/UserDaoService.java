package com.javatpoint.server.main.user;

import java.util.*;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService 
{
	
	private static List<User> users = new ArrayList<User>();
	private static Integer userCount = 5;
	
	static
	{
		users.add(new User(1, "manoj", new Date()));
		users.add(new User(2, "kiran", new Date()));
		users.add(new User(3, "araj", new Date()));
		users.add(new User(4, "bimal", new Date()));
		users.add(new User(5, "pradip", new Date()));
	}
	
	public List<User> findAll()
	{
		return users;
	}
	
	public User save(User user)
	{
		if(user.id == null)
		{
			user.setId(++userCount);
		}
		
		users.add(user);
		return user;
	}
	
	public User findOne(Integer id)
	{
		for(User user:users)
		{
			if(user.getId() == id)
				return user;
		}
		
		return null;
	}
	
	public User deleteUser(Integer id)
	{
		User user;
		Iterator<User> iterator = users.iterator();
		
		while(iterator.hasNext())
		{
			user = iterator.next();
			
			if(user.getId() == id)
			{
				iterator.remove();
				return user;
			}
			
		}
		return null;
	}
	
}
