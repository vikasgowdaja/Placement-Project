package com.cg.placement.entities;


import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="college")
public class College implements Serializable
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String college;
	private String location;
	
	@OneToOne(cascade=CascadeType.ALL)                      
	@JoinColumn(name="collegeAdmin_id")                     
	private User collegeAdmin;
	
	@OneToMany(mappedBy = "college", cascade=CascadeType.ALL)           
	private List<Certificate> certificates;
	
	@OneToMany(mappedBy= "college",cascade=CascadeType.ALL)
	private List<Student> students;
	
	
	@OneToMany(mappedBy= "college",cascade=CascadeType.ALL)                   
	private List<Placement> placements;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public User getCollegeAdmin() {
		return collegeAdmin;
	}
	public void setCollegeAdmin(User collegeAdmin) {
		this.collegeAdmin = collegeAdmin;
	}
	
	public String getCollege() {
		return college;
	}
	
	public void setCollege(String college) {
		this.college = college;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	public List<Certificate> getCertificates() {
		return certificates;
	}
	public void setCertificates(List<Certificate> certificates) {
		this.certificates = certificates;
	}
	
	public List<Placement> getPlacements() {
		return placements;
	}
	public void setPlacements(List<Placement> placements) {
		this.placements = placements;
	}
	
	public College(int id, User collegeAdmin, String college, String location,
			List<Certificate> certificates, List<Student> students, List<Placement> placements) 
	{
		super();
		this.id = id;
		this.collegeAdmin = collegeAdmin;
		this.college = college;
		this.location = location;
		this.certificates = certificates;
		this.students = students;
		this.placements = placements;
	}
	
	public College()
	{
		super();
	}

}
