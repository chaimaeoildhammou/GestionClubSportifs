package com.example.demo.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entites.Equipe;

public interface EquipeRepository extends JpaRepository<Equipe,Long>{
@Query("select e from Equipe e where e.motDePasseEquipe=:x")
	Equipe findOne(@Param("x")String motDePasseEquipe) ;
		

}
