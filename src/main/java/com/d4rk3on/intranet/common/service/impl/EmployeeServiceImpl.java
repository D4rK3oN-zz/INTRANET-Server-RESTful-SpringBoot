package com.d4rk3on.intranet.common.service.impl;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.d4rk3on.intranet.common.model.bean.EmployeeBean;
import com.d4rk3on.intranet.common.service.EmployeeService;

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
	public List<EmployeeBean> findEmployeesByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EmployeeBean> findEmployeesBySurname(String surname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeeBean getEmployeeById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeeBean getEmployeeByEmployeeNumber(Integer employeeNumber) {
		// TODO Auto-generated method stub
		return null;
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
		// TODO Auto-generated method stub
		return null;
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
