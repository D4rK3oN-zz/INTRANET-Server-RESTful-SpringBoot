package com.d4rk3on.intranet.common.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author javier.moreno
 *
 */
@RestController
@RequestMapping("/public")
public class LoginController extends GenericController {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1822324567280428583L;

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public void login() {

	}

	@RequestMapping(value = "/logout", method = RequestMethod.POST)
	public void logout() {

	}
}
