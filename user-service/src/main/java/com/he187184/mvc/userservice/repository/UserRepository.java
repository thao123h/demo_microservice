package com.he187184.mvc.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.he187184.mvc.userservice.entity.User;
public interface UserRepository extends JpaRepository<User, Integer > {
    User findUserById(Integer id);
}
