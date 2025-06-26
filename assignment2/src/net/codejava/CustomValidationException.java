package net.codejava;

public class CustomValidationException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	CustomValidationException() {}
	
	CustomValidationException(String message) {
		super(message);
	}
}
