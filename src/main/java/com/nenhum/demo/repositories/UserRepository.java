package com.nenhum.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nenhum.demo.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
}
