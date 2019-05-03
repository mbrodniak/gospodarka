package com.gospodarka.demo.repository;

import com.gospodarka.demo.entity.Furniture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FurnitureRepository extends JpaRepository<Furniture,Integer>{

    List<Furniture> findAll();

}
