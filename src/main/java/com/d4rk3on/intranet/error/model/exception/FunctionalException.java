package com.d4rk3on.intranet.error.model.exception;

import com.d4rk3on.intranet.error.util.ExceptionEnum;

import lombok.Getter;

/**
 * RuntimeException: This exception will be throw in case of this is a
 * functional error
 * 
 * @author javier.moreno
 *
 */
public class FunctionalException extends RuntimeException {

	/**
	 * Generated Serial Version ID
	 */
	private static final long serialVersionUID = -7216775367317787101L;

	@Getter
	private String id;

	@Getter
	private ExceptionEnum info;

	/**
	 * 
	 * @param id
	 * @param info
	 */
	public FunctionalException(String id, ExceptionEnum info) {
		super();
		this.id = id;
		this.info = info;
	}

	/**
	 * 
	 * @param message
	 * @param id
	 * @param info
	 */
	public FunctionalException(String message, String id, ExceptionEnum info) {
		super(message);
		this.id = id;
		this.info = info;
	}

	/**
	 * 
	 * @param cause
	 * @param id
	 * @param info
	 */
	public FunctionalException(Throwable cause, String id, ExceptionEnum info) {
		super(cause);
		this.id = id;
		this.info = info;
	}

	/**
	 * 
	 * @param message
	 * @param cause
	 * @param id
	 * @param info
	 */
	public FunctionalException(String message, Throwable cause, String id, ExceptionEnum info) {
		super(message, cause);
		this.id = id;
		this.info = info;
	}
}
