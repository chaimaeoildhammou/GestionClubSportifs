package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.EquipeRepository;
import com.example.demo.dao.JoueurRepository;
import com.example.demo.dao.ManagerRepository;
import com.example.demo.dao.MatchsRepository;
import com.example.demo.entites.Equipe;
import com.example.demo.entites.Joueur;
import com.example.demo.entites.Manager;
import com.example.demo.entites.Matchs;

@SpringBootApplication
public class ProjetGestionClubsApplication implements CommandLineRunner{
	@Autowired
	private EquipeRepository equipeRepository;
	@Autowired
	private JoueurRepository joueurRepository;
	@Autowired
	private ManagerRepository managerRepository;
	@Autowired
	private MatchsRepository matchsRepository;

	public static void main(String[] args) {
		SpringApplication.run(ProjetGestionClubsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*Manager manager=managerRepository.save(new Manager("admin","1234"));
		Matchs match1=matchsRepository.save(new Matchs("Tanger","24/05/2018","RCA","CRA"));
		Matchs match2=matchsRepository.save(new Matchs("Casa","15/07/2018","MAT","FUS"));
		Equipe equipe1=equipeRepository.save(new Equipe("espoir","tennis","chaimae","laila fatima","laila"));
		Equipe equipe2=equipeRepository.save(new Equipe("Friends","gym","laila","chaimae fatima","chaimae"));
		Joueur joueur1=joueurRepository.save(new Joueur("Chaimae",21,"femme","chaimae@gmail.Com","0602586985","jou1"));
		Joueur joueur2=joueurRepository.save(new Joueur("Laila",21,"femme","laila@gmail.Com","060258658","jou2"));*/
		
	}
}
