package com.projectEMS.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.projectEMS.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
