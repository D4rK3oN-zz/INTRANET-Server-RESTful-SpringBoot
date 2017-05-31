package com.d4rk3on.intranet.common.model.dto.response;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

/**
 * Employee response
 * 
 * @author javier.moreno
 *
 */
public class EmployeeResponseDto implements Serializable {

	/**
	 * Generated Serial Version ID
	 */
	private static final long serialVersionUID = 7615054411641456563L;

	@Getter
	@Setter
	private Integer employeeNumber;

	@Getter
	@Setter
	private String name;

	@Getter
	@Setter
	private String surname;

	@Getter
	@Setter
	private String email;
}
