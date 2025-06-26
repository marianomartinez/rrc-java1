package net.codejava;

public class InvalidOperationException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	InvalidOperationException() {};
	
	InvalidOperationException(String message) {
		super(message);
	}
}
