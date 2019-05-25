package com.gospodarka.demo.controller;

import com.gospodarka.demo.dto.UserDTO;
import com.gospodarka.demo.entity.User;
import com.gospodarka.demo.repository.UserRepository;

import java.security.Principal;
import java.util.List;
import com.gospodarka.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(value = "http://localhost:4200")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserService userService;

    @Autowired
    PasswordEncoder encoder;

    @GetMapping(path = "/all")
    public List<User> findAll(){
        return userRepository.findAll();
    }

    @GetMapping(path = "/userId")
    public List<User> findById(@RequestParam int id) { return userRepository.findById(id);  }

    @PostMapping(path = "/add")
    public User addUser(@RequestBody UserDTO userDTO){
        User user = userService.setUser(userDTO);
        user.setPassword(encoder.encode(userDTO.getPassword()));
        return userRepository.save(user);
    }

    @PostMapping(path = "/login")
    public String login(){
        return "/user";
    }
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    @ResponseBody
    public Principal user(Principal user) {
        return user;

    }
}
