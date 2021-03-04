package com.company.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.company.model.dao.Department;

@Repository
public interface DepartmentDao extends JpaRepository<Department, Integer> {

}
