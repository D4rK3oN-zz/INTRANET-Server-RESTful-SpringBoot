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

	private static final String EXEC_CONTROLLER = "execution(* com.d4rk3on.intranet.*.web.*Controller.*(..))";
	private static final String EXEC_SERVICE = "execution(* com.d4rk3on.intranet.*.service.*.*ServiceImpl.*(..))";
	private static final String EXEC_REPOSITORY = "execution(* com.d4rk3on.intranet.*.repository.*Dao.*(..))";
	// private static final String EXEC_CONVERTER = "";

	@Pointcut(EXEC_CONTROLLER)
	protected void allController() {
	}

	@Pointcut(EXEC_SERVICE)
	protected void allService() {
	}

	@Pointcut(EXEC_REPOSITORY)
	protected void allRepository() {
	}

	// @Pointcut(EXEC_CONVERTER)
	// protected void allConverter() {
	// }

	@Around("allController() || allService() || allRepository()")
	public Object aroundController(ProceedingJoinPoint joinPoint) throws Throwable {

		String userId = SecurityContextHolder.getContext().getAuthentication().getName();
		long threadId = Thread.currentThread().getId();
		String methodName = joinPoint.getSignature().toShortString();

		LOGGER.info("[Uid: {}] [Thread: {}] >>> Entrada al método: [{}];", userId, threadId, methodName);

		if (joinPoint.getArgs() != null && joinPoint.getArgs().length > 0)
			LOGGER.debug("[Uid: {}] [Thread: {}] >>> Parámetros de entrada: {};", userId, threadId,
					Arrays.toString(joinPoint.getArgs()));

		final Object resultMethodExecution = joinPoint.proceed();

		LOGGER.trace("[Uid: {}] [Thread: {}] >>> Valor de retorno: [{}];", userId, threadId,
				resultMethodExecution.toString());

		LOGGER.info("[Uid: {}] [Thread: {}] >>> Salida del método: [{}];", userId, threadId, methodName);

		return resultMethodExecution;
	}

}
