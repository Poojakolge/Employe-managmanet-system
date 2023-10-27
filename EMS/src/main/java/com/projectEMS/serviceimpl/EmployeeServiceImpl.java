package com.projectEMS.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.projectEMS.dao.EmployeeRepository;
import com.projectEMS.dto.EmployeeDTO;
import com.projectEMS.entities.Employee;
import com.projectEMS.service.EmployeeService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public EmployeeDTO createEmployee(Employee employee) {
		return null;
	}

	@Override
	public List<EmployeeDTO> getAllEmployees() {
		return null;
	}

	@Override
	public EmployeeDTO getEmployeeById(int id) {
		return null;
	}

	@Override
	public Employee updateEmployee(int id, Employee employee) {
		return null;
	}

	@Override
	public String deleteEmployee (int id) {
		return null;

}

}
