package com.d4rk3on.intranet.error.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;

import com.d4rk3on.intranet.common.web.GenericController;

/**
 * Global exception controller
 * 
 * @author javier.moreno
 *
 */
@ControllerAdvice
public class GlobalExceptionController extends GenericController {

	/**
	 * Generated Serial Version ID
	 */
	private static final long serialVersionUID = 3059550741884354708L;

	/**
	 * Logback logger
	 */
	protected final Logger LOGGER = LoggerFactory.getLogger(GlobalExceptionController.class);

	
}
