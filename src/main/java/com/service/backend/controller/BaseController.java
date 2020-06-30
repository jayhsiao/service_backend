package com.service.backend.controller;

import org.springframework.http.ResponseEntity;

import com.service.backend.model.ResponseVO;

public class BaseController {
	
	public ResponseEntity<Object> response(
			int code,
			String message,
			Object result) {
		
		ResponseVO<Object> resp = new ResponseVO<>();
		resp.setResponseCode(code);
		resp.setResponseMessage(message);
		resp.setResponseResult(result);

		return ResponseEntity.ok(resp);
	}
}
