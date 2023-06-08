package com.twg.springboot.mydiary.services;

import java.util.List;

import com.twg.springboot.mydiary.entity.User;

public interface UserService {
	
	
	public  User saveUser(User users);
	
	  public  User userupdate(User users);
	  
	  public void deleteUser(User users);
	  
	  public User findById(long id);
	  
	  public List<User>findAllUsers();
	  
	 public User findByUserName(String username);

}
