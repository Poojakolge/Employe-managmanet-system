package com.projectEMS.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectEMS.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
