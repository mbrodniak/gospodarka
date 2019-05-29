package com.gospodarka.demo.repository;

import com.gospodarka.demo.entity.UserFurniture;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserFurRepository extends JpaRepository<UserFurniture, Integer> {

    List<UserFurniture> findAll();

    @Query(value = "select * from user_furniture where userid = ?1", nativeQuery = true)
    List<UserFurniture> findByUserId(int userId);
    UserFurniture save(UserFurniture userFurniture);



}
