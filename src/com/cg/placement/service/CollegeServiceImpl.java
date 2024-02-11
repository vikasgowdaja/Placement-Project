package com.cg.placement.service;

import com.cg.placement.entities.College;
import com.cg.placement.repository.CollegeRepositoryImpl;
import com.cg.placement.repository.ICollegeRepository;

public class CollegeServiceImpl implements ICollegeService {
	// Step 1: Establishing connection between Service and Repo
	private ICollegeRepository dao;

	public CollegeServiceImpl() {
		dao = new CollegeRepositoryImpl();
	}

	// Step 2: Service calls to perform CRUD Operation

	@Override
	public College addCollege(College college) {
		dao.beginTransaction();
		dao.addCollege(college);
		dao.commitTrasaction();
		return college;
	}

	@Override
	public College updateCollege(College college) {
		dao.beginTransaction();
		dao.updateCollege(college);
		dao.commitTrasaction();
		return college;
	}

	@Override
	public College searchCollege(int id) {
		College college = dao.searchCollege(id);
		return college;
	}

	@Override
	public College deleteCollege(College college) {
		dao.beginTransaction();
		dao.deleteCollege(college);
		dao.commitTrasaction();
		return college;
	}

	@Override
	public College schedulePlacement(College college) {
		// TODO Auto-generated method stub
		return null;
	}

}
