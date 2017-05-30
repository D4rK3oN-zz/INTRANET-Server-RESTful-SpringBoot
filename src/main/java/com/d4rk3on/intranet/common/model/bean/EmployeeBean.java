package com.d4rk3on.intranet.common.model.bean;

import java.io.Serializable;

import lombok.Data;

@Data
public class EmployeeBean implements Serializable {

	/**
	 * Generated Serial Version ID
	 */
	private static final long serialVersionUID = -423501821658571303L;

	private String id;

	private Integer employeeNumber;

	private String username;

	private String name;

	private String surname;

	private String email;
}
