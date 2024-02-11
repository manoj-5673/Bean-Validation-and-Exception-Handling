package com.leraning.validationexample.repository;

import com.leraning.validationexample.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
