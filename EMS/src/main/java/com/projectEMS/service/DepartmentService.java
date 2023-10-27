package com.projectEMS.service;

import java.util.List;
import com.projectEMS.dto.DepartmentDTO;
import com.projectEMS.entities.Department;


public interface DepartmentService {
	List<DepartmentDTO> getAllDepartments();
	DepartmentDTO getDepartmentById(int id);
	DepartmentDTO createDepartment(Department department);
	Department updateDepartment (int id, Department department);
	String deleteDepartment(int id);	
}
