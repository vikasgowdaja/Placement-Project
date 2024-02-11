package com.cg.placement.service;

import com.cg.placement.entities.Admin;
import com.cg.placement.entities.User;

public interface IUserService 
{
	
	public User addNewUser(User user);  
	public User updateUser(User user);  
	public User login(User user); 
	public User logout(); 

	public Admin addAdmin(Admin admin);        //////////////////////////////
}
