package com.nenhum.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nenhum.demo.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
