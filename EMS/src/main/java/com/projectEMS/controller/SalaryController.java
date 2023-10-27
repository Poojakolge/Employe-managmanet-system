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
import com.projectEMS.dto.SalaryDTO;
import com.projectEMS.entities.Salary;
import com.projectEMS.service.SalaryService;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/salary")
@AllArgsConstructor
public class SalaryController {
	private  final SalaryService salaryService;

	@GetMapping("/{id}")
    public ResponseEntity<SalaryDTO> getSalaryById(@PathVariable int id) {
		SalaryDTO salaryDTO = salaryService.getSalaryById(id);
        return ResponseEntity.ok(salaryDTO);
    }

    @PostMapping
    public ResponseEntity<SalaryDTO> createSalary(@RequestBody Salary salaryDTO) {
    	SalaryDTO createdSalary = salaryService.createSalary(salaryDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdSalary);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Salary> updateSalary(@PathVariable int id, @RequestBody Salary salary) {
    	salary.setId(id);
    	Salary updatedSalary = salaryService.updateSalary(id, salary);
        return ResponseEntity.ok(updatedSalary);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSalary(@PathVariable int id) {
    	salaryService.deleteSalary(id);
        return ResponseEntity.noContent().build();
   }

}
