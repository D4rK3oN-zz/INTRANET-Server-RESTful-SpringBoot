package com.d4rk3on.intranet.common.service.impl;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.d4rk3on.intranet.common.model.bean.EmployeeBean;
import com.d4rk3on.intranet.common.model.entity.Employee;
import com.d4rk3on.intranet.common.repository.EmployeeDao;
import com.d4rk3on.intranet.common.service.EmployeeService;
import com.d4rk3on.intranet.common.util.converter.BusinessLogicMapper;
import com.d4rk3on.intranet.common.util.function.Utils;
import com.d4rk3on.intranet.error.model.exception.FunctionalException;
import com.d4rk3on.intranet.error.util.ErrorConstants;
import com.d4rk3on.intranet.error.util.ExceptionEnum;

/**
 * Employee service implementation
 * 
 * @author javier.moreno
 *
 */
@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Throwable.class)
public class EmployeeServiceImpl implements EmployeeService {

	/**
	 * Generated Serial Version ID
	 */
	private static final long serialVersionUID = 3464551192792752718L;

	/**
	 * Logback logger
	 */
	protected final Logger LOGGER = LoggerFactory.getLogger(EmployeeServiceImpl.class);

	@Autowired
	private Utils utils;

	@Autowired
	private BusinessLogicMapper<EmployeeBean, Employee> employeeMapper;

	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public void deleteEmployee(EmployeeBean employee) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<EmployeeBean> findEmployeesByCreationDate(Timestamp startDate, Timestamp endingDate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EmployeeBean> findEmployeesByDocumentId(String documentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EmployeeBean> findEmployeesByNameAndSurname(String name, String surname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeeBean getEmployeeByEmployeeNumber(Integer employeeNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeeBean getEmployeeById(String id) {
		LOGGER.info("[Uid: {}] [Thread: {}] >>> Entrada al servicio: [{}];", utils.getAuthenticationName(),
				utils.getThreadId(), utils.getMethodName(Thread.currentThread().getStackTrace()));

		LOGGER.debug("[Uid: {}] [Thread: {}] >>> Parámetros de entrada: <id> [{}];", utils.getAuthenticationName(),
				utils.getThreadId(), id);

		Employee employee = employeeDao.findOne(id);

		LOGGER.trace("[Uid: {}] [Thread: {}] >>> Respuesta de la db: <employee> [{}];", utils.getAuthenticationName(),
				utils.getThreadId(), employee);

		if (employee == null)
			throw new FunctionalException(ErrorConstants.EMPLOYEE_KEY, ExceptionEnum.NO_DATA_FOUND);

		EmployeeBean employeeBean = employeeMapper.entityToBean(employee);

		LOGGER.trace("[Uid: {}] [Thread: {}] >>> Valor de retorno: [{}];", utils.getAuthenticationName(),
				utils.getThreadId(), employeeBean);

		LOGGER.info("[Uid: {}] [Thread: {}] >>> Salida del servicio: [{}];", utils.getAuthenticationName(),
				utils.getThreadId(), utils.getMethodName(Thread.currentThread().getStackTrace()));

		return employeeBean;
	}

	@Override
	public EmployeeBean getEmployeeByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EmployeeBean> listActiveEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EmployeeBean> listInactiveEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EmployeeBean> listEmployees() {
		LOGGER.info("[Uid: {}] [Thread: {}] >>> Entrada al servicio: [{}];", utils.getAuthenticationName(),
				utils.getThreadId(), utils.getMethodName(Thread.currentThread().getStackTrace()));

		List<Employee> listEmployee = employeeDao.findAll();

		LOGGER.trace("[Uid: {}] [Thread: {}] >>> Respuesta de la db: <listEmployee> [{}];",
				utils.getAuthenticationName(), utils.getThreadId(), listEmployee);

		if (listEmployee == null || listEmployee.isEmpty())
			throw new FunctionalException(ErrorConstants.EMPLOYEE_KEY, ExceptionEnum.NO_DATA_FOUND);

		List<EmployeeBean> listEmployeeBean = new ArrayList<EmployeeBean>();

		listEmployee.forEach(employee -> listEmployeeBean.add(employeeMapper.entityToBean(employee)));

		LOGGER.trace("[Uid: {}] [Thread: {}] >>> Valor de retorno: [{}];", utils.getAuthenticationName(),
				utils.getThreadId(), listEmployeeBean);

		LOGGER.info("[Uid: {}] [Thread: {}] >>> Salida del servicio: [{}];", utils.getAuthenticationName(),
				utils.getThreadId(), utils.getMethodName(Thread.currentThread().getStackTrace()));

		return listEmployeeBean;
	}

	@Override
	public void saveEmployee(EmployeeBean employee) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateEmployee(EmployeeBean employee) {
		// TODO Auto-generated method stub

	}

}
