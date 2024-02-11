package com.cg.placement.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="admin")
public class Admin 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)            
	private int a_id;

	@ManyToOne
	  @JoinColumns({
	    @JoinColumn(name="u_id", referencedColumnName="id"),
	    @JoinColumn(name="a_name", referencedColumnName="name"),
	    @JoinColumn(name="a_password", referencedColumnName="password")
	  })
	
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getA_id() {
		return a_id;
	}

	public void setA_id(int a_id) {
		this.a_id = a_id;
	}
	
}

// Can't have OneToOne container for JoinColumns as it shows broken mapping while mapping multiple columns.
// Can't use OneToOne multiple times also, as Duplicate OneToOne is not allowed.

