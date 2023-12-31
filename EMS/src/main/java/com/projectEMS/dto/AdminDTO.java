package com.projectEMS.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor(staticName="build")
@Data
public class AdminDTO {
	
	@NotNull(message="Username cannot be null")
	private String username;
	
	@NotBlank (message="Enter password")
	private String password;
	
	@Email(message="Enter proper email")
	private String email;

	public void setId(int id) {
		// TODO Auto-generated method stub
		
	}


}
