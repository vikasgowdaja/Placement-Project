package com.cg.placement.service;

import com.cg.placement.entities.Admin;
import com.cg.placement.entities.User;
import com.cg.placement.repository.UserRepositoryImpl;
import com.cg.placement.repository.IUserRepository;

public class UserServiceImpl implements IUserService {
	// Step 1: Establishing connection between Service and Repo
	private IUserRepository dao;

	public UserServiceImpl() {
		dao = new UserRepositoryImpl();
	}

	// Step 2: Service calls to perform CRUD Operation

	@Override
	public User addNewUser(User user) {
		dao.beginTransaction();
		dao.addNewUser(user);
		dao.commitTrasaction();
		return user;
	}

	@Override
	public User updateUser(User user) {
		dao.beginTransaction();
		dao.updateUser(user);
		dao.commitTrasaction();
		return user;
	}

	@Override
	public User login(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User logout() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Admin addAdmin(Admin admin) /////////////////////////////
	{
		dao.beginTransaction();
		dao.addAdmin(admin);
		dao.commitTrasaction();
		return admin;
	}

}
