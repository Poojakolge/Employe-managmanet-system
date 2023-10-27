package com.projectEMS.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.projectEMS.entities.Salary;

public interface SalaryRepository extends JpaRepository<Salary, Integer> {

}
