package com.projectEMS.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor(staticName="build")
@Data
public class EmployeeDTO {
	private int id;
	
	@NotNull(message="Firstname cannot be null")
	private String firstname;
	
	@NotNull(message="Lastname cannot be null")
	private String lastname;
	
	@Email(message="Enter proper email")
	private String email;
	
	@NotEmpty(message="Gender cannot be null or empty")
	private String gender;
	
	@Min(18)
	@Max(40)
	private int age;
	
	private String address;
	
	@NotBlank (message="Enter mobile no.")
	private Long mobileno;
	
	@NotNull
	private int departmentId;
	
	/*
	 * @NotEmpty private String role;
	 */
}
