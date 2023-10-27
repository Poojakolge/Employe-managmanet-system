package com.projectEMS.serviceimpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.projectEMS.dao.AdminRepository;
import com.projectEMS.dto.AdminDTO;
import com.projectEMS.entities.Admin;
import com.projectEMS.service.AdminService;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	private AdminRepository adminRepository;

	@Override
	public AdminDTO createAdmin(Admin admin) {
		return null;
	}

	@Override
	public List<AdminDTO> getAllAdmins() {
		return null;
	}

	@Override
	public AdminDTO getAdminById(int id) {
		return null;
	}

	@Override
	public Admin updateAdmin(int id, Admin admin) {
		return null;
	}

	@Override
	public String deleteAdmin(int id) {
		return null;
	}
}
