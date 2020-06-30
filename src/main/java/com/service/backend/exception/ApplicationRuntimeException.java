package com.service.backend.exception;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ApplicationRuntimeException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public ApplicationRuntimeException(String message) {
        super(message);
    }

    public ApplicationRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public ApplicationRuntimeException(Throwable cause) {
        super(cause);
    }
}
