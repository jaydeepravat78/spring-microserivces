package com.example.userserive.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.userserive.entity.User;

public interface UserRepo extends JpaRepository<User, Long>{

}
