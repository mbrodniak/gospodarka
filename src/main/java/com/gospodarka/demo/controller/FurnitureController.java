package com.gospodarka.demo.controller;

import com.gospodarka.demo.entity.Furniture;
import com.gospodarka.demo.repository.FurnitureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/furniture")
public class FurnitureController {

    @Autowired
    FurnitureRepository furnitureRepository;

    @GetMapping(path = "/all")
    public List<Furniture> findAll() { return furnitureRepository.findAll(); }

}
