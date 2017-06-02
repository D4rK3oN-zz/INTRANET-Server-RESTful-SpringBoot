package com.d4rk3on.intranet.error.model.exception;

/**
 * RuntimeException: This exception will be throw in case of this is a technical error
 * 
 * @author javier.moreno
 *
 */
public class TechnicalException extends RuntimeException {

	/**
	 * Generated Serial Version ID
	 */
	private static final long serialVersionUID = 5671458456215706654L;

	/**
	 * 
	 */
	public TechnicalException() {
		super();
	}

	/**
	 * 
	 * @param message
	 */
	public TechnicalException(String message) {
		super(message);
	}

	/**
	 * 
	 * @param message
	 * @param cause
	 */
	public TechnicalException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * 
	 * @param cause
	 */
	public TechnicalException(Throwable cause) {
		super(cause);
	}
}
