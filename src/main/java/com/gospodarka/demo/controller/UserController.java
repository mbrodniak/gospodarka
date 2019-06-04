package com.gospodarka.demo.controller;

import com.gospodarka.demo.dto.UserDTO;
import com.gospodarka.demo.entity.User;
import com.gospodarka.demo.model.UserPrincipal;
import com.gospodarka.demo.repository.UserRepository;

import java.security.Principal;
import java.util.List;
import com.gospodarka.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
    public ResponseEntity<User> login(Principal principal){
        User authenticatedUser = userRepository.findByLogin(principal.getName());
        return ResponseEntity.ok().body(authenticatedUser);
    }

    @RequestMapping(value="/logmeout", method = RequestMethod.POST)
    public String logoutPage (HttpServletRequest request, HttpServletResponse response) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth != null){
            new SecurityContextLogoutHandler().logout(request, response, auth);
        }
        return "redirect:/login";
    }
}
