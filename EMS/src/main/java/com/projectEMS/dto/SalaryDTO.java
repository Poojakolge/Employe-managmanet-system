package com.projectEMS.dto;

import javax.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor(staticName="build")
@Data
public class SalaryDTO {
	private int id;
	
	@NotEmpty
	private Long amountmonthly;
	
	@NotEmpty
	private Long amountannual;

}
