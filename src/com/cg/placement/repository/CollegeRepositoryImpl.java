package com.cg.placement.repository;

import javax.persistence.EntityManager;

import com.cg.placement.entities.College;

public class CollegeRepositoryImpl implements ICollegeRepository {

	// Step 1: Start JPA LifeCycle
	private EntityManager entityManager;

	public CollegeRepositoryImpl() {
		entityManager = JPAUtil.getEntityManager();
	}

	// Create operation - Repo/DAO
	@Override
	public College addCollege(College college) {
		entityManager.persist(college);
		return college;
	}

	@Override
	public College updateCollege(College college) {
		entityManager.merge(college);
		return college;
	}

	@Override
	public College searchCollege(int id) {
		College college = entityManager.find(College.class, id);
		return college;
	}

	@Override
	public void deleteCollege(int id) {
		College college = entityManager.find(College.class, id);
		entityManager.remove(college);
	}

	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
	}

	@Override
	public void commitTrasaction() {
		entityManager.getTransaction().commit();
	}

	@Override
	public College deleteCollege(College college) {
		entityManager.remove(college);
		return college;
	}

}
