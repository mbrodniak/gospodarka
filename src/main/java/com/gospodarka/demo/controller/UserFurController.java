package com.gospodarka.demo.controller;

import com.gospodarka.demo.entity.UserFurniture;
import com.gospodarka.demo.repository.UserFurRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/userFurniture")
public class UserFurController {

    @Autowired
    UserFurRepository userFurRepository;

    @GetMapping(path = "/all")
    public List<UserFurniture> findAll(){
        return userFurRepository.findAll();
    }

    @GetMapping(path = "/user")
    public List<UserFurniture> findByUserId(@RequestParam int id){ return userFurRepository.findByUserId(id); }

}
