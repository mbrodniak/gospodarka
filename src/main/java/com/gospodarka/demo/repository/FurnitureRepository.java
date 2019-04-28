package com.gospodarka.demo.repository;

import com.gospodarka.demo.entity.Furniture;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FurnitureRepository extends JpaRepository<Furniture,Integer>{

    List<Furniture> findAll();

}
