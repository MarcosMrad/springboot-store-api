package com.mrad.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mrad.project.entities.Order;

public interface OrderRepository  extends JpaRepository<Order, Long>{
	
	
	
}
