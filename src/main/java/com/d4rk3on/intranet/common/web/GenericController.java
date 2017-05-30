package com.d4rk3on.intranet.common.web;

import java.io.Serializable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Default controller
 * 
 * @author javier.moreno
 *
 */
public abstract class GenericController implements Serializable {

	/**
	 * Generated Serial Version ID
	 */
	private static final long serialVersionUID = -6662227396485321706L;

	/**
	 * Logback logger
	 */
	protected final Logger LOGGER = LoggerFactory.getLogger(getClass());
}
