package com.d4rk3on.intranet.config;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.d4rk3on.intranet.common.util.function.Utils;

@Aspect
@Configuration
public class ExceptionInterceptor {

	/**
	 * Logback logger
	 */
	protected final Logger LOGGER = LoggerFactory.getLogger(ExceptionInterceptor.class);

	@Autowired
	private Utils utils;

	@AfterThrowing(pointcut = "execution(* com.d4rk3on.intranet.*.repository.*Dao.*(..))", throwing = "ex")
	public void repositoryException(Throwable ex) {
		LOGGER.info("[Uid: {}] [Thread: {}] >>> Excepción en la capa de acceso de a datos.",
				utils.getAuthenticationName(), utils.getThreadId());

		LOGGER.error("[Uid: {}] [Thread: {}] >>> {}", utils.getAuthenticationName(), utils.getThreadId(),
				ex.getMessage());
	}

	@AfterThrowing(pointcut = "execution(* com.d4rk3on.intranet.*.service.*Service.*(..))", throwing = "ex")
	public void serviceException(Throwable ex) {
		LOGGER.info("[Uid: {}] [Thread: {}] >>> Excepción en la capa de servicios.", utils.getAuthenticationName(),
				utils.getThreadId());

		LOGGER.error("[Uid: {}] [Thread: {}] >>> {}", utils.getAuthenticationName(), utils.getThreadId(),
				ex.getMessage());
	}
}
