package com.service.backend.service;

import com.service.backend.exception.ApplicationRuntimeException;
import com.service.backend.model.User;
import com.service.backend.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;

@Service
@Transactional
public class ServiceBackendServiceImpl implements ServiceBackendService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User getUser(Map<String, Object> paramMap) {
		String name = (String) paramMap.get("name");
		return userRepository.findByName(name);
	}

	@Override
	public User login(Map<String, Object> paramMap) {
		String name = (String) paramMap.get("name");
		String password = (String) paramMap.get("password");
		
		User user = userRepository.findByNameAndPassword(name, password);
		if(user == null) {
			throw new ApplicationRuntimeException("帳號 或 密碼 錯誤");
		}
		
		return user;
	}
}
