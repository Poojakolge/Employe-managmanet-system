package com.projectEMS.serviceimpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.projectEMS.dao.UserRepository;
import com.projectEMS.dto.UserDTO;
import com.projectEMS.entities.User;
import com.projectEMS.service.UserService;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDTO createUser(User user) {
		return null;
	}

	@Override
	public List<UserDTO> getAllUsers() {
		return null;
	}

	@Override
	public UserDTO getUserById(int id) {
		return null;
	}

	@Override
	public User updateUser(int id, User user) {
		return null;
	}

	@Override
	public String deleteUser (int id) {
		return null;

}
}