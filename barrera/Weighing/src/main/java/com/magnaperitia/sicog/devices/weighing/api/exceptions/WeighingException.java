package com.magnaperitia.sicog.devices.weighing.api.exceptions;

public class WeighingException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6424125107037759112L;
	
	public WeighingException() {
		// TODO Auto-generated constructor stub
	}
	
	public WeighingException(String message) {
		super(message);
	}
	
	public WeighingException(Throwable cause) {
		super(cause);
	}
	
	public WeighingException(String message, Throwable cause) {
		super(message, cause);
	}
	
}
