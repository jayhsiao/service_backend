package com.service.backend.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.service.backend.constant.ResponseCode;
import com.service.backend.model.User;
import com.service.backend.service.ServiceBackendService;

@CrossOrigin
@RestController
public class ServiceBackendController extends BaseController {
	
	@Autowired
	private ServiceBackendService serviceBackendService;
		
	/**
	 * REST API: Get User
	 * @param name
	 * @return
	 */
	@GetMapping(path = "/user/{name}")
	public ResponseEntity<Object> getUser(
			@PathVariable(value = "name") String name) {
		
		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("name", name);
		
		try {
			User user = serviceBackendService.getUser(paramMap);
			return this.response(ResponseCode.SUCCESS.getCode(), "Get User Success", user);
		} catch (Exception e) {
			return this.response(ResponseCode.FAIL.getCode(), e.getMessage(), null);
		}
	}
	
	/**
	 * REST API: Login
	 * @param name
	 * @param password
	 * @return
	 */
	@PostMapping(path = "/login")
	public ResponseEntity<Object> login(
			@RequestParam(value = "name") String name,
			@RequestParam(value = "password") String password) {
		
		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("name", name);
		paramMap.put("password", password);
		
		try {
			User user = serviceBackendService.login(paramMap);
			return this.response(ResponseCode.SUCCESS.getCode(), "Login Success", user);
		} catch (Exception e) {
			return this.response(ResponseCode.FAIL.getCode(), e.getMessage(), null);
		}
	}
}
