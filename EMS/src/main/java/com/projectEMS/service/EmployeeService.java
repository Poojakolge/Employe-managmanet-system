package com.projectEMS.service;

import java.util.List;
import com.projectEMS.dto.EmployeeDTO;
import com.projectEMS.entities.Employee;

public interface EmployeeService {
	List<EmployeeDTO> getAllEmployees();
	EmployeeDTO getEmployeeById(int id);
	EmployeeDTO createEmployee(Employee employee);
	Employee updateEmployee(int id, Employee employee);
	String deleteEmployee(int id);	


}
