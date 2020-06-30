package com.service.backend.exception;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ApplicationException extends Exception{

	private static final long serialVersionUID = 1L;

	public ApplicationException(String message) {
        super(message);
    }

    public ApplicationException(String message, Throwable cause) {
        super(message, cause);
    }

    public ApplicationException(Throwable cause) {
        super(cause);
    }
}
