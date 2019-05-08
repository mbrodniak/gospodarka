package com.gospodarka.demo.service;

import com.gospodarka.demo.dto.TransformDTO;
import com.gospodarka.demo.entity.Transform;
import org.springframework.stereotype.Service;

@Service
public class TransformService {


    public Transform setTransform(TransformDTO transformDTO){

        Transform transform = new Transform(transformDTO);
        return transform;
    }



}
