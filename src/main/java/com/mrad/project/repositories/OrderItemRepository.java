package com.mrad.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mrad.project.entities.OrderItem;
import com.mrad.project.entities.pk.OrderItemPK;

public interface OrderItemRepository  extends JpaRepository<OrderItem, OrderItemPK>{
	
	
	
}
