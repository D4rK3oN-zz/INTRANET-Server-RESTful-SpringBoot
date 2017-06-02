package com.d4rk3on.intranet.common.util.converter.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.d4rk3on.intranet.common.model.bean.EmployeeBean;
import com.d4rk3on.intranet.common.model.entity.EmployeeEntity;
import com.d4rk3on.intranet.common.util.converter.BusinessLogicMapper;
import com.d4rk3on.intranet.common.util.function.Utils;
import com.d4rk3on.intranet.error.model.exception.TechnicalException;

/**
 * 
 * @author javier.moreno
 *
 */
@Component
public class EmployeeBusinessMapper implements BusinessLogicMapper<EmployeeBean, EmployeeEntity> {

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

	private EmployeeEntity employeeEntity;

	@Override
	public EmployeeBean entityToBean(EmployeeEntity entity) {
		try {
			LOGGER.info("[Uid: {}] [Thread: {}] >>> Entrada al método: [{}];", utils.getAuthenticationName(),
					utils.getThreadId(), utils.getMethodName(Thread.currentThread().getStackTrace()));

			LOGGER.debug("[Uid: {}] [Thread: {}] >>> Parámetros de entrada: <entity> [{}];",
					utils.getAuthenticationName(), utils.getThreadId(), entity);

			employeeBean = new EmployeeBean();

			employeeBean.setId(entity.getId());
			employeeBean.setEmployeeNumber(entity.getEmployeeNumber());
			employeeBean.setUsername(entity.getUsername());
			employeeBean.setPassword(entity.getPassword());
			employeeBean.setDocumentId(entity.getDocumentId());
			employeeBean.setName(entity.getName());
			employeeBean.setSurname(entity.getSurname());
			employeeBean.setEmail(entity.getEmail());
			employeeBean.setCreationDate(entity.getCreationDate());
			employeeBean.setModifyDate(entity.getModifyDate());
			employeeBean.setDeleteDate(entity.getDeleteDate());

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
	public EmployeeEntity beanToEntity(EmployeeBean bean) {

		employeeEntity = new EmployeeEntity();

		return employeeEntity;
	}

}
