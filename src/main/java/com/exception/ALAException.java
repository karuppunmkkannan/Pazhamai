package com.exception;
public class ALAException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public ALAException(String message, Throwable throwable) {
		super(message, throwable);
	}

	public ALAException(String message) {
		super(message);
	}

}