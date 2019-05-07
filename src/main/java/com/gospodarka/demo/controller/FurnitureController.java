package com.gospodarka.demo.controller;

import com.gospodarka.demo.entity.Furniture;
import com.gospodarka.demo.repository.FurnitureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/furniture")
public class FurnitureController {

    @Autowired
    FurnitureRepository furnitureRepository;

    @GetMapping(path = "/all")
    public List<Furniture> findAll() { return furnitureRepository.findAll(); }

    @GetMapping(path = "/fur")
    public List<Furniture> findById(@RequestParam int id){ return furnitureRepository.findById(id); }

    @PostMapping(path = "/new")
    public List<Furniture> addFurniture (@RequestBody Furniture furniture)
    {
        furnitureRepository.save(furniture);
        return furnitureRepository.findAll();
    }


}
