package com.example.demo.web;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/*import com.example.demo.Command.LoginCommand;*/
import com.example.demo.dao.EquipeRepository;
import com.example.demo.dao.JoueurRepository;
import com.example.demo.dao.MatchsRepository;
import com.example.demo.entites.Equipe;
import com.example.demo.entites.Joueur;
import com.example.demo.entites.Matchs;
import com.example.demo.service.UserService;
import com.example.demo.service.UserServiceImpl;

@Controller
public class controlleur {
	@Autowired
	private MatchsRepository matchRepository;
	@Autowired
	private UserService iuserService;
	@Autowired
	private EquipeRepository equipeRepository;
	@Autowired
	private UserServiceImpl userService;
	@Autowired
	JoueurRepository joueurRepository;
@RequestMapping("/index")
	public String index() {
		return "index";
	}
@RequestMapping("/gallery")
public String gallery() {
	return "gallery";
}
@RequestMapping("/admin")
public String admin() {
	return "AdminConnection";
}
@RequestMapping("/lequipe")
public String Lequipes() {
	return "lequipes";
}
@RequestMapping("/ljoueurs")
public String Ljoueurs() {
	return "ljoueurs";
}
@RequestMapping("/lmatches")
public String Lmatches() {
	return "lmatches";
}
@RequestMapping("/logIn")
public String Login() {
	
   return "logIn";
}
@RequestMapping("/signIn")
public String signIn() {
	
   return "signIn";
}
@RequestMapping("/sign")
public String signIn(@RequestParam("nom") String nom,@RequestParam("age") int age,@RequestParam("sexe") String sexe,@RequestParam("email") String email,@RequestParam("telephone") String telephone,@RequestParam("motDePasse1") String motDePasse1,@RequestParam("motDePasse2") String motDePasse2) {
	Joueur joueur1=new Joueur(nom,age,sexe,email,telephone,motDePasse1);
	joueurRepository.save(joueur1);
	return "sign";
}
@RequestMapping("/equipe")
public String listeEquipe() {
	return "equipe";
}
@RequestMapping("/consulterEquipe")
public String consulterEquipe(Model model,String motDePasseEquipe) {
	try {
		Equipe eq=iuserService.consulterEquipe(motDePasseEquipe);
		model.addAttribute("equipe",eq);
	}
	catch(Exception e) {
		model.addAttribute("exception",e);
	}
	return "equipe";
}
@RequestMapping("/afficherMatches")
public String afficherMatch(Model model,String date) {
	try {
		Matchs matchs=iuserService.afficherMatchs(date);
		model.addAttribute("matchs",matchs);
	}
	catch(Exception e) {
		model.addAttribute("exception",e);
	}
	return "matches";
}

@RequestMapping("/log")
    public String handleLogin(@RequestParam  String email,@RequestParam String motDePasse) {
  Joueur joueur=userService.login(email,motDePasse);    
  if(joueur==null) {
	  return "error";
  }
  else {
	  return "connect";
  }
           
}
@RequestMapping("/match")
public String match() {
	
   return "matches";
}
@RequestMapping("/espaceManager")
public String manager() {
	
   return "espaceManager";
}
@RequestMapping("/manager")
public String espacemanager(@RequestParam("nom")String nom,@RequestParam("motDePasse")String motDePasse) {
	if(nom.equals("admin") && motDePasse.equals("1234")) {
		 return "AdminConnection";
	}else {
		return "error";
	}
	
  
}
@RequestMapping("/dispo")
public String disponibilite() {
	
   return "dispo";
}
@RequestMapping("/joueurAjoutee")
public String joueurAjoutee(@RequestParam("nom")String nom,@RequestParam("age")int age,@RequestParam("sexe")String sexe,@RequestParam("email")String email,@RequestParam("telephone")String telephone,@RequestParam("motDePasse")String motDePasse) {
	Joueur joueur=new Joueur(nom,age,sexe,email,telephone,motDePasse);
	joueurRepository.save(joueur);
	
   return "ajouterJoueur";
}
@RequestMapping("/ajouterJoueur")
public String ajouterJoueur() {
	
   return "ajouterJoueur";
}
@RequestMapping("/ajouterEquipe")
public String ajouterEquipe() {
	
   return "ajouterEquipe";
}

@RequestMapping("/supprimerJoueur")
public String supprimerJoueur() {
	
   return "supprimerJoueur";
}
@RequestMapping("/supprimerEquipe")
public String supprimerEquipe() {
	
   return "supprimerEquipe";
}
@RequestMapping("/matchAnnulee")
public String matchAnnulee(Long id) {
	matchRepository.deleteById(id);
   return "lmatches";
}
@RequestMapping("/equipeSupprimee")
public String equipeSupprimee(Long id) {
	equipeRepository.deleteById(id);	
   return "supprimerEquipe";
}
@RequestMapping("/joueurSupprimee")
public String joueurSupprimee(Long id) {
	joueurRepository.deleteById(id);	
   return "supprimerJoueur";
}
@RequestMapping("/nequipe")
public String nouvelleEquipe() {
	
   return "nequipe";
}
@RequestMapping("/calendar")
public String calendrier() {
	
   return "calendar";
}
@RequestMapping("/notification")
public String Notification() {
	
   return "notification";
}
@RequestMapping("/equipeAjoutee")
public String equipe(@RequestParam("nomEquipe") String nomEquipe,@RequestParam("categorieSport") String categorieSport,@RequestParam("coachEquipe") String coachEquipe,@RequestParam("membresEquipe") String membresEquipe,@RequestParam("motDePasseEquipe") String motDePasseEquipe) {
	Equipe equipe=new Equipe(nomEquipe,categorieSport,coachEquipe,membresEquipe,motDePasseEquipe);
	equipeRepository.save(equipe);
   return "equipeAjoutee";
}
@RequestMapping("/eAjoutee")
public String equipeAjou(@RequestParam("nomEquipe") String nomEquipe,@RequestParam("categorieSport") String categorieSport,@RequestParam("coachEquipe") String coachEquipe,@RequestParam("membresEquipe") String membresEquipe,@RequestParam("motDePasseEquipe") String motDePasseEquipe) {
	Equipe equipe=new Equipe(nomEquipe,categorieSport,coachEquipe,membresEquipe,motDePasseEquipe);
	equipeRepository.save(equipe);
   return "lequipes";
}
}

