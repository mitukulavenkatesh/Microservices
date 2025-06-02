package com.microservices.microserviceproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservices.microserviceproject.entites.User;
 
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
