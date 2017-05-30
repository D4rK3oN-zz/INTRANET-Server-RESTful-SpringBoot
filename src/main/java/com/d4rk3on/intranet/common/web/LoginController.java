package com.d4rk3on.intranet.common.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.d4rk3on.intranet.common.util.constant.UrlConstants;

/**
 * App access controller.
 * 
 * @author javier.moreno
 *
 */
@RestController
@RequestMapping(UrlConstants.PATH_PUBLIC)
public class LoginController extends GenericController {

	/**
	 * Generated Serial Version ID
	 */
	private static final long serialVersionUID = 1822324567280428583L;

	@RequestMapping(value = UrlConstants.LOGIN, method = RequestMethod.POST)
	public void login() {

	}

	@RequestMapping(value = UrlConstants.LOGOUT, method = RequestMethod.POST)
	public void logout() {

	}
}
