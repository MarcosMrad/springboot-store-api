package com.mrad.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mrad.project.entities.Product;

public interface ProductRepository  extends JpaRepository<Product, Long>{
	
	
	
}
