package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entites.Matchs;

public interface MatchsRepository extends JpaRepository<Matchs, Long>{
	@Query("select m from Matchs m where m.date=:x")
Matchs findByDate(@Param("x")String date);
}
