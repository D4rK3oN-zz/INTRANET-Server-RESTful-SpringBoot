package com.d4rk3on.intranet.common.service;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import com.d4rk3on.intranet.common.model.bean.EmployeeBean;

/**
 * Employee service interface
 * 
 * @author javier.moreno
 *
 */
public interface EmployeeService extends Serializable {

	public void deleteEmployee(EmployeeBean employee);

	public List<EmployeeBean> findEmployeesByCreationDate(Timestamp startDate, Timestamp endingDate);

	public List<EmployeeBean> findEmployeesByDocumentId(String documentId);

	public List<EmployeeBean> findEmployeesByNameAndSurname(String name, String surname);

	public EmployeeBean getEmployeeByEmployeeNumber(Integer employeeNumber);

	public EmployeeBean getEmployeeById(String id);

	public EmployeeBean getEmployeeByUsername(String username);

	public List<EmployeeBean> listActiveEmployees();

	public List<EmployeeBean> listInactiveEmployees();

	public List<EmployeeBean> listEmployees();

	public void saveEmployee(EmployeeBean employee);

	public void updateEmployee(EmployeeBean employee);
}
