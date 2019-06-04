package com.gospodarka.demo.service;

import com.gospodarka.demo.dto.UserDTO;
import com.gospodarka.demo.entity.User;
import com.gospodarka.demo.model.UserPrincipal;
import com.gospodarka.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class UserService implements UserDetailsService {


    @Autowired
    private UserRepository userRepository;

    public User setUser(UserDTO userDTO){
        userDTO.setEnabled(true);
        userDTO.setUserRole("ROLE_USER");
        User user = new User(userDTO);
        return user;
    }

    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {

        User user = userRepository.findByLogin(login);

        if(user!=null){
            UserPrincipal userPrincipal = new UserPrincipal();
            userPrincipal.setUser(user);
            return userPrincipal;
        }
        else{
            throw new UsernameNotFoundException(login);
        }

    }
}
