package com.souvik.org.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.souvik.org.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	// Only definition required
	Optional<User> findByUserName(String userName);
}
