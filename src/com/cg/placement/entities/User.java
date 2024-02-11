package com.cg.placement.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User implements Serializable
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
           
	private int id;
	private String name;
	private String type;
	private String password;
	
    @OneToOne(mappedBy="collegeAdmin")                      
	private College college;                               
	
	@OneToMany(targetEntity=Admin.class, mappedBy="user")
	private List<Admin> admins;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setAdmins(List<Admin> admins) {
		this.admins = admins;
	}
	public void setCollege(College college) {
		this.college = college;
	}
	
	public College getCollege()                                
	{
		return college;
	}
	public List<Admin> getAdmins() {
		return admins;
	}
	
	public User(int id, String name, String type, String password, College college, List<Admin> admins) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.password = password;
		this.college = college;
		this.admins = admins;
	}
	
	
	public User() 
	{
		super();
		
	}

	
}
