package com.cg.placement.repository;

import com.cg.placement.entities.Admin;
import com.cg.placement.entities.User;

public interface IUserRepository 
{
	public User addNewUser(User user);
	public User updateUser(User user);
	public User deleteUser(User user);
	
	public Admin addAdmin(Admin admin);           //
	
	public abstract void beginTransaction();
	public abstract void commitTrasaction();
	void deleteUser(int id);

}
