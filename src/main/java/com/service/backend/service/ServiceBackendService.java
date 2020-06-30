package com.service.backend.service;

import java.util.Map;

import com.service.backend.model.User;

public interface ServiceBackendService {
	
	public User getUser(Map<String, Object> paramMap);

    public User login(Map<String, Object> paramMap);
}