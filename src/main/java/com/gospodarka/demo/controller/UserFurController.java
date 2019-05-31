package com.gospodarka.demo.controller;

import com.gospodarka.demo.dto.UserFurnitureDTO;
import com.gospodarka.demo.entity.UserFurniture;
import com.gospodarka.demo.repository.UserFurRepository;
import java.util.List;

import com.gospodarka.demo.service.UserFurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/userFurniture")
public class UserFurController {

    @Autowired
    UserFurRepository userFurRepository;

    @Autowired
    UserFurService userFurService;

    @GetMapping(path = "/all")
    public List<UserFurniture> findAll(){
        return userFurRepository.findAll();
    }

    @GetMapping(path = "/user")
    public List<UserFurniture> findByUserId(@RequestParam int id){ return userFurRepository.findByUserId(id); }

    @PostMapping(path = "/add")
    public UserFurniture addUserFurniture (@RequestBody UserFurnitureDTO userFurnitureDTO)
    {
        UserFurniture userFurniture = userFurService.setFurniture(userFurnitureDTO);
        return userFurRepository.save(userFurniture);
    }
    @PostMapping(path = "/delete")
    public void deleteUserFurniture(@RequestBody UserFurniture userFurniture)
    {
        System.out.println(userFurniture.getFurnitureId() + ", " + userFurniture.getUserId());
        if(userFurniture!=null && userFurRepository.existsByFurnitureIdAndAndUserId(userFurniture.getFurnitureId(), userFurniture.getUserId()) ){
            userFurRepository.delete(userFurniture);
        }
        else{
            System.out.println("Nie można usunąc mebla, który nie istnieje");
        }
    }

}
