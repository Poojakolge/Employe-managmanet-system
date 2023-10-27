package com.projectEMS.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.projectEMS.dto.AdminDTO;
import com.projectEMS.entities.Admin;
import com.projectEMS.service.AdminService;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/admins")
@AllArgsConstructor
public class AdminController {
	private final AdminService adminService;
	
	 @GetMapping("/{id}")
	    public ResponseEntity<AdminDTO> getAdminById(@PathVariable int id) {
	        AdminDTO adminDTO = adminService.getAdminById(id);
	        return ResponseEntity.ok(adminDTO);
	    }

	    @PostMapping
	    public ResponseEntity<AdminDTO> createAdmin(@RequestBody Admin adminDTO) {
	        AdminDTO createdAdmin = adminService.createAdmin(adminDTO);
	        return ResponseEntity.status(HttpStatus.CREATED).body(createdAdmin);
	    }

	    @PutMapping("/{id}")
	    public ResponseEntity<Admin> updateAdmin(@PathVariable int id, @RequestBody Admin admin) {
	        admin.setId(id);
	        Admin updatedAdmin = adminService.updateAdmin(id, admin);
	        return ResponseEntity.ok(updatedAdmin);
	    }

	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> deleteAdmin(@PathVariable int id) {
	        adminService.deleteAdmin(id);
	        return ResponseEntity.noContent().build();
	    }
}
