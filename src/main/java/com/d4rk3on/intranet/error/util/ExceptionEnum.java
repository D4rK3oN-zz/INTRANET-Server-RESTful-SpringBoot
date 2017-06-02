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

	INVALID_INPUT_PARAMETERS(HttpStatus.BAD_REQUEST, "invalid.input.parameters"),
	NO_DATA_FOUND(HttpStatus.NO_CONTENT, "no.data.found");

	@Getter
	private HttpStatus httpStatus;

	@Getter
	private String secondKey;

	/**
	 * 
	 * @param httpStatus
	 * @param secondKey
	 */
	private ExceptionEnum(final HttpStatus httpStatus, final String secondKey) {
		this.httpStatus = httpStatus;
		this.secondKey = secondKey;
	}
}
