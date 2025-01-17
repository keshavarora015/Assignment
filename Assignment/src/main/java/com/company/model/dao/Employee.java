package com.company.model.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "employee")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer eid;
	private String name;
	private double salary;
	
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name="fk_did")
	private Department department;
	
	
	private List<Project>Projects=new ArrayList<>();

	
	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<Project> getProjects() {
		return Projects;
	}

	public void setProjects(List<Project> projects) {
		Projects = projects;
	}

	public Employee() {
	}

	public Employee(String name, double salary, Department department, List<Project> projects) {
		this.name = name;
		this.salary = salary;
		this.department = department;
		Projects = projects;
	}

	public Employee(Integer eid, String name, double salary, Department department, List<Project> projects) {
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
		this.department = department;
		Projects = projects;
	}
	
}

