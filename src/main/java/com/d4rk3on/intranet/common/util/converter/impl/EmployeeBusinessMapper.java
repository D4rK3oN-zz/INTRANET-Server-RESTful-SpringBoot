package com.d4rk3on.intranet.common.util.converter.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.d4rk3on.intranet.common.model.bean.EmployeeBean;
import com.d4rk3on.intranet.common.model.entity.Employee;
import com.d4rk3on.intranet.common.util.converter.BusinessLogicMapper;
import com.d4rk3on.intranet.common.util.function.Utils;
import com.d4rk3on.intranet.error.model.exception.TechnicalException;

/**
 * 
 * @author javier.moreno
 *
 */
@Component
public class EmployeeBusinessMapper implements BusinessLogicMapper<EmployeeBean, Employee> {

	/**
	 * Generated Serial Version ID
	 */
	private static final long serialVersionUID = -824933059329340641L;

	/**
	 * Logback logger
	 */
	protected final Logger LOGGER = LoggerFactory.getLogger(EmployeeBusinessMapper.class);

	@Autowired
	private Utils utils;

	private EmployeeBean employeeBean;

	private Employee employee;

	@Override
	public EmployeeBean entityToBean(Employee e) {
		try {
			LOGGER.info("[Uid: {}] [Thread: {}] >>> Entrada al método: [{}];", utils.getAuthenticationName(),
					utils.getThreadId(), utils.getMethodName(Thread.currentThread().getStackTrace()));

			LOGGER.debug("[Uid: {}] [Thread: {}] >>> Parámetros de entrada: <e> [{}];", utils.getAuthenticationName(),
					utils.getThreadId(), e);

			employeeBean = new EmployeeBean();

			// TODO: setters

			LOGGER.trace("[Uid: {}] [Thread: {}] >>> Valor de retorno: [{}];", utils.getAuthenticationName(),
					utils.getThreadId(), employeeBean);

			return employeeBean;

		} catch (Exception ex) {
			LOGGER.info("[Uid: {}] [Thread: {}] >>> Excepción en el mapeo de objetos.", utils.getAuthenticationName(),
					utils.getThreadId());

			LOGGER.error("[Uid: {}] [Thread: {}] >>> {}", utils.getAuthenticationName(), utils.getThreadId(),
					ex.getMessage());

			throw new TechnicalException();

		} finally {
			LOGGER.info("[Uid: {}] [Thread: {}] >>> Salida del método: [{}];", utils.getAuthenticationName(),
					utils.getThreadId(), utils.getMethodName(Thread.currentThread().getStackTrace()));
		}
	}

	@Override
	public Employee beanToEntity(EmployeeBean b) {

		employee = new Employee();

		return employee;
	}

}
