package com.d4rk3on.intranet.common.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.d4rk3on.intranet.common.model.entity.Employee;

/**
 * Employee repository
 * 
 * @author javier.moreno
 *
 */
@Repository
public interface EmployeeDao extends MongoRepository<Employee, String> {

	/**
	 * Find the Employee by his employee number
	 * 
	 * @param employeeNumber
	 * @return Employee
	 */
	public Employee findByEmployeeNumber(Integer employeeNumber);

/**
 * Find the Employee by his username
 * 
 * @param username
 * @return Employee
 */
	public Employee findByUsername(String username);
}
