package com.gospodarka.demo.service;

import com.gospodarka.demo.dto.UserDTO;
import com.gospodarka.demo.entity.User;
import org.springframework.stereotype.Service;


@Service
public class UserService {



    public User setUser(UserDTO userDTO){
        userDTO.setEnabled(1);
        userDTO.setUserRole("ROLE_USER");
        User user = new User(userDTO);

//        user.setPassword(passwordEncoder().encode(userDTO.getPassword()));
        return user;
    }

}
