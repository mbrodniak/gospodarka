package com.gospodarka.demo.repository;

import com.gospodarka.demo.entity.Transform;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface TransformRepository extends JpaRepository<Transform,Integer> {

    List<Transform> findAll();
    List<Transform> findByFurnitureId(int furnitureId);
}
