package com.d4rk3on.intranet.config;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.d4rk3on.intranet.common.util.function.Utils;
import com.d4rk3on.intranet.error.model.exception.FunctionalException;
import com.d4rk3on.intranet.error.model.exception.TechnicalException;
import com.d4rk3on.intranet.error.util.ErrorConstants;

/**
 * Aspect to capture the errors by layers
 * 
 * @author javier.moreno
 *
 */
@Aspect
@Configuration
public class ExceptionInterceptor {

	/**
	 * Logback logger
	 */
	protected final Logger LOGGER = LoggerFactory.getLogger(ExceptionInterceptor.class);

	@Autowired
	private Utils utils;

	/**
	 * Captures exceptions in the repositories layer
	 * 
	 * @param ex
	 */
	@AfterThrowing(pointcut = "execution(* com.d4rk3on.intranet.*.repository.*Dao.*(..))", throwing = "ex")
	public void repositoryException(Throwable ex) {
		LOGGER.info("[Uid: {}] [Thread: {}] >>> Excepción en la capa de acceso de a datos.",
				utils.getAuthenticationName(), utils.getThreadId());

		LOGGER.error("[Uid: {}] [Thread: {}] >>> {}", utils.getAuthenticationName(), utils.getThreadId(),
				ex.getMessage());

		if (!(ex instanceof FunctionalException))
			throw new TechnicalException(ErrorConstants.DEFAULT_REPOSITORY_EXCEPTION, ex);
	}

	/**
	 * Captures exceptions in the services layer
	 * 
	 * @param ex
	 */
	@AfterThrowing(pointcut = "execution(* com.d4rk3on.intranet.*.service.*Service.*(..))", throwing = "ex")
	public void serviceException(Throwable ex) {
		LOGGER.info("[Uid: {}] [Thread: {}] >>> Excepción en la capa de servicios.", utils.getAuthenticationName(),
				utils.getThreadId());

		LOGGER.error("[Uid: {}] [Thread: {}] >>> {}", utils.getAuthenticationName(), utils.getThreadId(),
				ex.getMessage());

		if (!(ex instanceof FunctionalException))
			throw new TechnicalException(ErrorConstants.DEFAULT_SERVICE_EXCEPTION, ex);
	}

	/**
	 * Captures exceptions in the controllers layer
	 * 
	 * @param ex
	 */
	@AfterThrowing(pointcut = "execution(* com.d4rk3on.intranet.*.web.*Controller.*(..))", throwing = "ex")
	public void controllerException(Throwable ex) {
		LOGGER.info("[Uid: {}] [Thread: {}] >>> Excepción en la capa de control.", utils.getAuthenticationName(),
				utils.getThreadId());

		LOGGER.error("[Uid: {}] [Thread: {}] >>> {}", utils.getAuthenticationName(), utils.getThreadId(),
				ex.getMessage());

		if (!(ex instanceof FunctionalException))
			throw new TechnicalException(ErrorConstants.DEFAULT_CONTROLLER_EXCEPTION, ex);
	}
}
