package com.cg.placement.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "certificate")
public class Certificate {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int year;

	@OneToOne(mappedBy = "certificate")
	private Student student;

	@ManyToOne
	@JoinColumn(name = "college_id")
	private College college;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Student getStudent() {
		return student;
	}

	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

}
