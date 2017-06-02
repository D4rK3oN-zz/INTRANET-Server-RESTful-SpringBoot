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
	private String firstKey;

	@Getter
	private ExceptionEnum info;

	/**
	 * 
	 * @param firstKey
	 * @param info
	 */
	public FunctionalException(String firstKey, ExceptionEnum info) {
		super();
		this.firstKey = firstKey;
		this.info = info;
	}

	/**
	 * 
	 * @param message
	 * @param firstKey
	 * @param info
	 */
	public FunctionalException(String message, String firstKey, ExceptionEnum info) {
		super(message);
		this.firstKey = firstKey;
		this.info = info;
	}

	/**
	 * 
	 * @param cause
	 * @param firstKey
	 * @param info
	 */
	public FunctionalException(Throwable cause, String firstKey, ExceptionEnum info) {
		super(cause);
		this.firstKey = firstKey;
		this.info = info;
	}

	/**
	 * 
	 * @param message
	 * @param cause
	 * @param firstKey
	 * @param info
	 */
	public FunctionalException(String message, Throwable cause, String firstKey, ExceptionEnum info) {
		super(message, cause);
		this.firstKey = firstKey;
		this.info = info;
	}
}
