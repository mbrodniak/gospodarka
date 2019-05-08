package com.gospodarka.demo.controller;

import com.gospodarka.demo.dto.TransformDTO;
import com.gospodarka.demo.entity.Transform;
import com.gospodarka.demo.repository.TransformRepository;
import com.gospodarka.demo.service.TransformService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path= "/transform")
public class TransformController {

    @Autowired
    TransformRepository transformRepository;

    @Autowired
    TransformService transformService;

    @GetMapping(path = "/all")
    public List<Transform> findAll (){ return transformRepository.findAll();}

    @GetMapping(path = "/fur")
    public List<Transform> findByFurnitureId(@RequestParam int furnitureId){ return transformRepository.findByFurnitureId(furnitureId); }

    @PostMapping(path = "/add")
    public Transform addTransform (@RequestBody TransformDTO transformDTO)
    {
        Transform transform = transformService.setTransform(transformDTO);
        return transformRepository.save(transform);
    }


}
