package com.cg.placement.repository;

import com.cg.placement.entities.College;

public interface ICollegeRepository 
{
	public College addCollege(College college);
	public College updateCollege(College college);
	public College searchCollege(int id);
	public College deleteCollege(College college);
	
	
	public abstract void beginTransaction();
	public abstract void commitTrasaction();
	void deleteCollege(int id);
	
}
