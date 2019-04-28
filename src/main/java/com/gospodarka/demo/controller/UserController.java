package com.gospodarka.demo.controller;

import com.gospodarka.demo.entity.User;
import com.gospodarka.demo.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/user")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping(path = "/all")
    public List<User> findAll(){
        return userRepository.findAll();
    }

}
