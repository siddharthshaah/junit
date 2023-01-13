package com.ebid.exception;

public class EmptyArrayException extends RuntimeException {
	private static final long serialVersionUID = 3674175608228009359L;

	public EmptyArrayException() {
		super();
	}

	public EmptyArrayException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public EmptyArrayException(String message, Throwable cause) {
		super(message, cause);
	}

	public EmptyArrayException(String message) {
		super(message);
	}

	public EmptyArrayException(Throwable cause) {
		super(cause);
	}

}
