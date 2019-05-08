package com.gospodarka.demo.service;

import com.gospodarka.demo.dto.FurnitureDTO;
import com.gospodarka.demo.entity.Furniture;
import org.springframework.stereotype.Service;

@Service
public class FurnitureService {

    public Furniture setFurniture(FurnitureDTO furnitureDTO){

        Furniture furniture = new Furniture(furnitureDTO);
        return furniture;
    }
}

