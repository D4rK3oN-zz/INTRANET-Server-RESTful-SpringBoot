package com.d4rk3on.intranet.error.util;

import java.io.Serializable;

/**
 * Error constants
 * 
 * @author javier.moreno
 *
 */
public class ErrorConstants implements Serializable {

	/**
	 * Generated Serial Version ID
	 */
	private static final long serialVersionUID = 4363632563394666589L;

	public static final String DEFAULT_CONTROLLER_EXCEPTION = "controller.technical.exception";
	public static final String DEFAULT_REPOSITORY_EXCEPTION = "repository.technical.exception";
	public static final String DEFAULT_SERVICE_EXCEPTION = "service.technical.exception";

	public static final String COMMON_KEY = "common.";
	public static final String EMPLOYEE_KEY = "employee.";
}
