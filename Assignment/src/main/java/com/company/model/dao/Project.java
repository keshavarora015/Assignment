package com.company.model.dao;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name = "project")
public class Project {
	
	private String projectName;
	
	private Date startDate;
	
	private String managerName;
	
	public Project(String projectName, Date startDate, String managerName) {
		this.projectName = projectName;
		this.startDate = startDate;
		this.managerName = managerName;
	}
	
	public Project() {
	}
	
	public String getProjectName() {
		return projectName;
	}
	
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	public Date getStartDate() {
		return startDate;
	}
	
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	
}

