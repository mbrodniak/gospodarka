package com.gospodarka.demo.service;

import com.gospodarka.demo.dto.UserFurnitureDTO;
import com.gospodarka.demo.entity.UserFurniture;
import org.springframework.stereotype.Service;

@Service
public class UserFurService {

    public UserFurniture setFurniture(UserFurnitureDTO userFurnitureDTO){

        UserFurniture userFurniture = new UserFurniture(userFurnitureDTO);
        return userFurniture;
    }
}

