package com.projectEMS.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectEMS.entities.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer>{

}
