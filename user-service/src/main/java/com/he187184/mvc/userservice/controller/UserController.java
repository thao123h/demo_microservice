package com.he187184.mvc.userservice.controller;

import com.he187184.mvc.userservice.dto.UserDTO;
import com.he187184.mvc.userservice.entity.User;
import com.he187184.mvc.userservice.mapper.UserMapper;
import com.he187184.mvc.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/users")
@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserMapper userMapper;
    @GetMapping("/get/{id}")
    public UserDTO get(@PathVariable int id) {
        User user = userRepository.findUserById(id);
        UserDTO dto = userMapper.toDto(user);
        return dto;
    }
}
