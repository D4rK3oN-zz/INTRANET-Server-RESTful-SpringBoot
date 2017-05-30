package com.d4rk3on.intranet.common.model.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.d4rk3on.intranet.common.util.constant.MongoDbConstants;

import lombok.Data;

/**
 * Employee entity
 * 
 * @author javier.moreno
 *
 */
@Document(collection = MongoDbConstants.COL_EMPLOYEE)
@Data
public class Employee {

	@Id
	private String id;

	private Integer employeeNumber;

	private String username;

	private String password;

	private String name;

	private String surname;

	private String email;
}
