package com.lti.exception;

public class DataAccessException extends Exception {

	public DataAccessException() {
		super();
	}

	public DataAccessException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	public DataAccessException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public DataAccessException(String arg0) {
		super(arg0);
	}

	public DataAccessException(Throwable arg0) {
		super(arg0);
	}
	
	

}
