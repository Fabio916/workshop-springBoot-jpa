package com.nenhum.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nenhum.demo.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	
}
