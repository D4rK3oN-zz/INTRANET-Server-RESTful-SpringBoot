package com.d4rk3on.intranet.common.model.dto.response;

import java.io.Serializable;
import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

/**
 * Employee response
 * 
 * @author javier.moreno
 *
 */
public class EmployeeCompleteResponseDto implements Serializable {

	/**
	 * Generated Serial Version ID
	 */
	private static final long serialVersionUID = 7615054411641456563L;

	@Getter
	@Setter
	private Integer id;

	@Getter
	@Setter
	private String username;

	@Getter
	@Setter
	private Integer employeeNumber;

	@Getter
	@Setter
	private String documentId;

	@Getter
	@Setter
	private String name;

	@Getter
	@Setter
	private String surname;

	@Getter
	@Setter
	private String email;

	@Getter
	@Setter
	private Timestamp creationDate;

	@Getter
	@Setter
	private Timestamp modifyDate;

	@Getter
	@Setter
	private Timestamp deleteDate;
}
