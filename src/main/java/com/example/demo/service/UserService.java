package com.example.demo.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.example.demo.entites.Equipe;
import com.example.demo.entites.Joueur;
import com.example.demo.entites.Matchs;

public interface UserService {
    
    
	public Joueur findJoueur(String email); 
    public Joueur login(String email,String motDePasses) ;
    
    public Boolean isEmailExist(String email);
   public Equipe consulterEquipe(String motDePasseEquipe);
   public Matchs afficherMatchs(String date);
   
}

