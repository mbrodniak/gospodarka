package com.gospodarka.demo.controller;

import com.gospodarka.demo.dto.UserDTO;
import com.gospodarka.demo.entity.User;
import com.gospodarka.demo.repository.UserRepository;
import java.util.List;
import com.gospodarka.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/user")
@CrossOrigin(value = "http://localhost:4200")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserService userService;

    @GetMapping(path = "/all")
    public List<User> findAll(){
        return userRepository.findAll();
    }

    @GetMapping(path = "/user")
    public List<User> findById(@RequestParam int id) { return userRepository.findById(id);  }

    @PostMapping(path = "/add")
    public User addUser(@RequestBody UserDTO userDTO){
        User user = userService.setUser(userDTO);
        return userRepository.save(user);
    }

    @GetMapping(path = "/login")
    public User getUser(@RequestParam String login, @RequestParam String password){
        return userRepository.getUserByLoginAndPassword(login, password);
    }
}
