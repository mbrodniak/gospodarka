package com.gospodarka.demo.controller;

import com.gospodarka.demo.dto.FurnitureDTO;
import com.gospodarka.demo.entity.Furniture;
import com.gospodarka.demo.repository.FurnitureRepository;
import com.gospodarka.demo.service.FurnitureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/furniture")
public class FurnitureController {

    @Autowired
    FurnitureRepository furnitureRepository;

    @Autowired
    FurnitureService furnitureService;

    @GetMapping(path = "/all")
    public List<Furniture> findAll() { return furnitureRepository.findAll(); }

    @GetMapping(path = "/fur")
    public List<Furniture> findById(@RequestParam int id){ return furnitureRepository.findById(id); }

    @PostMapping(path = "/add")
    public Furniture addFurniture (@RequestBody FurnitureDTO furnitureDTO)
    {
        Furniture furniture = furnitureService.setFurniture(furnitureDTO);
        return furnitureRepository.save(furniture);
    }



}
