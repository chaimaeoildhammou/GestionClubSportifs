package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.demo.entites.Joueur;

public interface JoueurRepository extends CrudRepository<Joueur,Long>{
	@Query("select j from Joueur j where j.email=:e")
	public  Joueur findJoueurByEmail(@Param("e") String email);
}
