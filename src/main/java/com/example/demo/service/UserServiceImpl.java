package com.example.demo.service;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.example.demo.dao.BaseDAO;
import com.example.demo.dao.EquipeRepository;
import com.example.demo.dao.JoueurRepository;
import com.example.demo.dao.MatchsRepository;
import com.example.demo.entites.Equipe;
import com.example.demo.entites.Joueur;
import com.example.demo.entites.Matchs;


@Service
public class UserServiceImpl extends BaseDAO implements UserService {
	@Autowired
	private MatchsRepository matchsRepository;
	@Autowired
	private EquipeRepository equipeRepository;
    @Autowired
    private JoueurRepository joueurRepository;
    @Override
    public Joueur login(String email,String motDePasse) {
    	Joueur joueur=this.findJoueur(email);
    	if(joueur!=null && joueur.getMotDePasse().equals(motDePasse)) {
    		return joueur;
    	}
    	return null;
    }
    @Override
    public Boolean isEmailExist(String email) {
        String sql = "SELECT count(email) FROM joueur WHERE email=?";
        Integer count = getJdbcTemplate().queryForObject(sql, new String[]{email}, Integer.class);
        if(count==1){
            return true;
        }else{
            return false;
        }
    }
	@Override
	public Joueur findJoueur(String email) {
		return joueurRepository.findJoueurByEmail(email);
		
	}
	@Override
	public Equipe consulterEquipe(String motDePasseEquipe) {
		 return equipeRepository.findOne(motDePasseEquipe);
		
		
	}
	@Override
	public Matchs afficherMatchs(String date) {
		return matchsRepository.findByDate(date);
	}
	

	
	
}