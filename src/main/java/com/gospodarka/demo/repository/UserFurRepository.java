package com.gospodarka.demo.repository;

import com.gospodarka.demo.entity.UserFurniture;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserFurRepository extends JpaRepository<UserFurniture, Integer> {

    List<UserFurniture> findAll();

    List<UserFurniture> findByUserId(int userId);
}
