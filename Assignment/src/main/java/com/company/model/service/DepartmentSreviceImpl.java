package com.company.model.service;

import java.util.List;
import com.company.model.dao.Employee;
import com.company.model.repository.DepartmentDao;
import com.company.model.repository.EmployeeDao;

public class DepartmentSreviceImpl implements DepartmentService {

	private DepartmentDao departmentDao;
	private EmployeeDao employeeDao;
	
	@Override
	public List<Employee> getAllEmployee() {
		List<Employee>employees =employeeDao.findAll();
		return employees;
	}
}
