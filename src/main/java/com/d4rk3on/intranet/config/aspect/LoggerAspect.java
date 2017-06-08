package com.d4rk3on.intranet.config.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.Arrays;

/**
 * Aspect to configure default logs
 *
 * @author javier.moreno
 */
@Aspect
@Configuration
public class LoggerAspect {

	/**
	 * Logback logger
	 */
	private final Logger LOGGER = LoggerFactory.getLogger(LoggerAspect.class);

	@Pointcut("within(@org.springframework.web.bind.annotation.RestController *)")
	protected void allController() {
	}

	@Pointcut("within(@org.springframework.stereotype.Service *)")
	protected void allService() {
	}

	@Pointcut("within(@org.springframework.stereotype.Repository *)")
	protected void allRepository() {
	}

	@Around("allController() || allService() || allRepository()")
	public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
		LOGGER.info("[Uid: {}] [Thread: {}] >>> Entrada al método: [{}];",
				SecurityContextHolder.getContext().getAuthentication().getName(),
				Thread.currentThread().getId(), joinPoint.getSignature().getName());

		if (joinPoint.getArgs() != null && joinPoint.getArgs().length > 0)
			LOGGER.debug("[Uid: {}] [Thread: {}] >>> Parámetros de entrada: [{}];",
					SecurityContextHolder.getContext().getAuthentication().getName(),
					Thread.currentThread().getId(), Arrays.toString(joinPoint.getArgs()));

		final Object resultMethodExecution = joinPoint.proceed();

		LOGGER.info("[Uid: {}] [Thread: {}] >>> Salida del método: [{}];",
				SecurityContextHolder.getContext().getAuthentication().getName(),
				Thread.currentThread().getId(), joinPoint.getSignature().getName());

		return resultMethodExecution;
	}
/*
	@Before("allMethod()")
	public void logBefore(JoinPoint joinPoint) {

	}

	@AfterReturning(pointcut = "allMethod()", returning = "result")
	public void logAfter(JoinPoint joinPoint, Object result) {

	}
*/
}
