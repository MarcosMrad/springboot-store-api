package com.mrad.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mrad.project.entities.User;

public interface UserRepository  extends JpaRepository<User, Long>{
	
	
	
}
