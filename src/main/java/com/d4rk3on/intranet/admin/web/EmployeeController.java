package com.d4rk3on.intranet.admin.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.d4rk3on.intranet.common.util.constant.UrlConstants;
import com.d4rk3on.intranet.common.web.GenericController;

/**
 * 
 * @author javier.moreno
 *
 */
@RestController
@RequestMapping(UrlConstants.PATH_ADMIN + UrlConstants.EMPLOYEE)
public class EmployeeController extends GenericController {

	/**
	 * Generated Serial Version ID
	 */
	private static final long serialVersionUID = -5113575402724058415L;

}
