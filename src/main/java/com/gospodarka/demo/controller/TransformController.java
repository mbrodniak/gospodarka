package com.gospodarka.demo.controller;

import com.gospodarka.demo.entity.Transform;
import com.gospodarka.demo.repository.TransformRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path= "transform")
public class TransformController {

    @Autowired
    TransformRepository transformRepository;

    @GetMapping(path = "/all")
    public List<Transform> findAll (){ return transformRepository.findAll();}

    @GetMapping(path = "/fur")
    public List<Transform> findByFurnitureId(@RequestParam int furnitureId){ return transformRepository.findByFurnitureId(furnitureId); }

    @PostMapping(path = "/new")
    public List<Transform> addTransform (@RequestBody Transform transform)
    {
        transformRepository.save(transform);
        return transformRepository.findAll();
    }




}
