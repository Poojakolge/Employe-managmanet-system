package com.projectEMS.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.projectEMS.dao.SalaryRepository;
import com.projectEMS.dto.SalaryDTO;
import com.projectEMS.entities.Salary;
import com.projectEMS.service.SalaryService;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class SalaryServiceImpl implements SalaryService {
	
	@Autowired
	private  SalaryRepository  salaryRepository;
	
	@Override
	public  SalaryDTO createSalary(Salary salary) {
		return null;
	}

	@Override
	public List<SalaryDTO> getAllSalaries() {
		return null;
	}

	@Override
	public SalaryDTO getSalaryById(int id) {
		return null;
	}

	@Override
	public Salary updateSalary(int id, Salary salary) {
		return null;
	}

	@Override
	public String deleteSalary (int id) {
		return null;

}


}
