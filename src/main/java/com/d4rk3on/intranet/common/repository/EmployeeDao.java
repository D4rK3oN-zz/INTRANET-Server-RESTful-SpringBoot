package com.d4rk3on.intranet.common.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.d4rk3on.intranet.common.model.entity.EmployeeEntity;

/**
 * Employee repository
 * 
 * @author javier.moreno
 *
 */
@Repository
public interface EmployeeDao extends MongoRepository<EmployeeEntity, String> {

	/**
	 * Find the Employee by his employee number
	 * 
	 * @param employeeNumber
	 * @return EmployeeEntity
	 */
	public EmployeeEntity findByEmployeeNumber(Integer employeeNumber);

/**
 * Find the Employee by his username
 * 
 * @param username
 * @return EmployeeEntity
 */
	public EmployeeEntity findByUsername(String username);
}
