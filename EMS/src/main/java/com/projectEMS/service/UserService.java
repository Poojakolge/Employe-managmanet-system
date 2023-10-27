package com.projectEMS.service;

import java.util.List;
import com.projectEMS.dto.UserDTO;
import com.projectEMS.entities.User;

public interface UserService {
	List<UserDTO> getAllUsers();
	UserDTO getUserById(int id);
	UserDTO createUser(User user);
	User updateUser(int id, User user);
	String deleteUser(int id);	

}
