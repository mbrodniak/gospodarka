package com.gospodarka.demo.repository;

import com.gospodarka.demo.entity.User;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

    List<User> findAll();
    List<User> findById(int id);
    User save(User user);
}
