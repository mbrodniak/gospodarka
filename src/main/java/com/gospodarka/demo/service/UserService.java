package com.gospodarka.demo.service;

import com.gospodarka.demo.dto.UserDTO;
import com.gospodarka.demo.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;


@Service
public class UserService {


    @Bean
    public static BCryptPasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    public User setUser(UserDTO userDTO){

        User user = new User(userDTO);
        user.setPassword(passwordEncoder().encode(userDTO.getPassword()));
        return user;
    }

}
