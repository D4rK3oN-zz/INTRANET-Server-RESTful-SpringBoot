package com.d4rk3on.intranet.common.model.entity;

import java.sql.Timestamp;

import javax.validation.constraints.NotNull;

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
public class EmployeeEntity {

	@Id
	private String id;

	@NotNull(message = "")
	private Integer employeeNumber;

	@NotNull(message = "")
	private String username;

	@NotNull(message = "")
	private String password;

	@NotNull(message = "")
	private String documentId;

	private String name;

	private String surname;

	private String email;

	@NotNull(message = "")
	private Timestamp creationDate;

	private Timestamp modifyDate;

	private Timestamp deleteDate;
}
