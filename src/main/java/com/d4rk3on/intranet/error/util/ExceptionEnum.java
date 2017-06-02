package com.d4rk3on.intranet.error.util;

import org.springframework.http.HttpStatus;

import lombok.Getter;

/**
 * Enumeration to define the info content of the functional exceptions
 * 
 * @author javier.moreno
 *
 */
public enum ExceptionEnum {

	INVALID_INPUT_PARAMETERS(1, HttpStatus.BAD_REQUEST, "invalid.input.parameters"),
	NO_DATA_FOUND(100, HttpStatus.NO_CONTENT, "no.data.found");

	@Getter
	private Integer code;

	@Getter
	private HttpStatus httpStatus;

	@Getter
	private String key;

	/**
	 * 
	 * @param id
	 * @param httpStatus
	 * @param key
	 */
	private ExceptionEnum(final Integer code, final HttpStatus httpStatus, final String key) {
		this.code = code;
		this.httpStatus = httpStatus;
		this.key = key;
	}
}
