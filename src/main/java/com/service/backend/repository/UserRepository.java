package com.service.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.service.backend.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
	
	public User findByName(String name);
	
	public User findByNameAndPassword(String name, String password);
}
