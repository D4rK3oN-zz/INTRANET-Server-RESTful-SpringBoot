package com.d4rk3on.intranet.common.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.d4rk3on.intranet.common.model.entity.Employee;

public interface EmployeeDao extends MongoRepository<Employee, String> {

	public Employee findByEmployeeNumber(Integer employeeNumber);

	public Employee findByUsername(String username);
}
