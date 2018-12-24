package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entites.Manager;

public interface ManagerRepository extends JpaRepository<Manager, String>{

}
