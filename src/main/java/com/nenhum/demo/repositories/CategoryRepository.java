package com.nenhum.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nenhum.demo.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

	
}
