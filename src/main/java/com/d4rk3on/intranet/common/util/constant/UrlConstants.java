package com.d4rk3on.intranet.common.util.constant;

import java.io.Serializable;

public class UrlConstants implements Serializable {

	private static final long serialVersionUID = -5013458718225488828L;

	public static final String PATH_PUBLIC = "/public";
	public static final String PATH_SECURE = "/secure";
	public static final String PATH_ADMIN = "/admin";

	public static final String LOGIN = "/login";
	public static final String LOGOUT = "logout";

	public static final String EMPLOYEE = "/employees";
	public static final String EMPLOYEE_ID = "/{employeeId}";
}
