package com.d4rk3on.intranet.common.util.function;

import java.io.Serializable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import com.d4rk3on.intranet.common.util.constant.AppConstants;

/**
 * Generic Utils
 * 
 * @author javier.moreno
 *
 */
@Component
public class Utils implements Serializable {

	/**
	 * Generated Serial Version ID
	 */
	private static final long serialVersionUID = -5902174481396758988L;

	/**
	 * Logback logger
	 */
	protected final Logger LOGGER = LoggerFactory.getLogger(Utils.class);

	/**
	 * 
	 * 
	 * @return String
	 */
	public String getAuthenticationName() {
		return SecurityContextHolder.getContext().getAuthentication().getName();
	}

	/**
	 * 
	 * 
	 * @param stackTraceElements
	 * @return String
	 */
	public String getMethodName(StackTraceElement[] stackTraceElements) {
		return stackTraceElements[AppConstants.STACK_TRACE_CUR_METHOD].getMethodName();
	}

	/**
	 * 
	 * 
	 * @return long
	 */
	public long getThreadId() {
		return Thread.currentThread().getId();
	}
}
