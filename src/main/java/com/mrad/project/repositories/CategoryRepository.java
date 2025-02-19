package com.mrad.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mrad.project.entities.Category;

public interface CategoryRepository  extends JpaRepository<Category, Long>{
	
	
	
}
