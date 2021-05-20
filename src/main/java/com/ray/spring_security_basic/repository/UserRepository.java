package com.ray.spring_security_basic.repository;

import com.ray.spring_security_basic.model.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer>{

   public User findbyUsername(String username);

    
}
