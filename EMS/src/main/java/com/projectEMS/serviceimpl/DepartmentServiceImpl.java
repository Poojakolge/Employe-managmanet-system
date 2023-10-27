package com.projectEMS.serviceimpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.projectEMS.dao.DepartmentRepository;
import com.projectEMS.dto.DepartmentDTO;
import com.projectEMS.entities.Department;
import com.projectEMS.service.DepartmentService;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {
	
	@Autowired
	private DepartmentRepository departmentRepository;
	
	@Override
	public DepartmentDTO createDepartment(Department department) {
		return null;
	}

	@Override
	public List<DepartmentDTO> getAllDepartments() {
		return null;
	}

	@Override
	public DepartmentDTO getDepartmentById(int id) {
		return null;
	}

	@Override
	public Department updateDepartment(int id, Department department) {
		return null;
	}

	@Override
	public String deleteDepartment (int id) {
		return null;

}
	

}
