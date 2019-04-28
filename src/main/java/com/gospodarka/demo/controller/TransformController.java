package com.gospodarka.demo.controller;

import com.gospodarka.demo.entity.Transform;
import com.gospodarka.demo.repository.TransformRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@RestController
@RequestMapping(path= "transform")
public class TransformController {

    @Autowired
    TransformRepository transformRepository;

    @GetMapping(path = "/all")
    public List<Transform> findAll (){ return transformRepository.findAll();}






}
