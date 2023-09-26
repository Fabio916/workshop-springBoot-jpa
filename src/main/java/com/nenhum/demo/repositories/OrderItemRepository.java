package com.nenhum.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nenhum.demo.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

	
}
