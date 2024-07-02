package com.example.fullStack_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.fullStack_backend.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
