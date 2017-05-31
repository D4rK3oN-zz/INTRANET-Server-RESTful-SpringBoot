package com.d4rk3on.intranet.common.util.converter.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.d4rk3on.intranet.common.model.bean.EmployeeBean;
import com.d4rk3on.intranet.common.model.entity.Employee;
import com.d4rk3on.intranet.common.util.converter.BusinessLogicMapper;

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

	@Override
	public EmployeeBean entityToBean(Employee e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee beanToEntity(EmployeeBean b) {
		// TODO Auto-generated method stub
		return null;
	}

}
