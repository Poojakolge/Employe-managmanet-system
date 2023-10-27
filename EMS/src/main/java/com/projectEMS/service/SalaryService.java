package com.projectEMS.service;

import java.util.List;
import com.projectEMS.dto.SalaryDTO;
import com.projectEMS.entities.Salary;

public interface SalaryService {
	List<SalaryDTO> getAllSalaries();
	SalaryDTO getSalaryById(int id);
	SalaryDTO createSalary(Salary salary);
	Salary updateSalary(int id, Salary salary);
	String deleteSalary(int id);

}
