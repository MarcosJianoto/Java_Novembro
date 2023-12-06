package com.teste3.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teste3.demo.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
