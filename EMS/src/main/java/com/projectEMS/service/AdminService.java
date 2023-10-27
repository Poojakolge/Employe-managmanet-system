package com.projectEMS.service;

import java.util.List;

import com.projectEMS.dto.AdminDTO;
import com.projectEMS.entities.Admin;

public interface AdminService {
	List<AdminDTO> getAllAdmins();
	AdminDTO getAdminById(int id);
	AdminDTO createAdmin(Admin admin);
	Admin updateAdmin(int id, Admin admin);
	String deleteAdmin(int id);	
}
