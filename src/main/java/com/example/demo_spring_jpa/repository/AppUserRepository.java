package com.example.demo_spring_jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo_spring_jpa.model.AppUser;

public interface AppUserRepository extends JpaRepository<AppUser, Integer> {

}
