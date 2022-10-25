package com.fluentgrid.mdms.exceptionhandler;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;

/**
 * 
 * @author Vikky
 *
 */
public class MdmsAppException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final Logger logger = LogManager.getLogger(MdmsAppException.class);

	private HttpStatus httpStatus;
	
	
	
	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}

	public MdmsAppException(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}
	
	public MdmsAppException(String errorMessage) {
		super(errorMessage);
	}
	
	public MdmsAppException(String errorMessage, Throwable throwable) {
		super(errorMessage, throwable);
	}
	
	public MdmsAppException(Throwable throwable) {
		super(throwable);
	}
	
	public MdmsAppException(String errorMessage, HttpStatus httpStatus, Throwable throwable) {
		super(errorMessage, throwable);
		this.httpStatus = httpStatus;
	}
	
	public MdmsAppException(String errorMessage, HttpStatus httpStatus) {
		super(errorMessage);
		this.httpStatus = httpStatus;
	}
}
