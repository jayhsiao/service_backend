package com.service.backend.constant;

public enum ResponseCode {
	SUCCESS(1), FAIL(2);
	
	private int code;
	
	private ResponseCode(int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}
}
