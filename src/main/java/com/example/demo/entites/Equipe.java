package com.example.demo.entites;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Equipe implements Serializable{
@Id @GeneratedValue
private Long Id;
private String motDePasseEquipe;
private String nomEquipe;
private String categorieSport;
private String coachEquipe;
private String membresEquipe;
@ManyToOne
@JoinColumn(name="idMatch")
private Matchs matchs;
@OneToMany(mappedBy="equipe",fetch=FetchType.LAZY)
private Collection<Joueur> joueurs;
@ManyToOne
@JoinColumn(name="idManager")
private Manager manager;


public Equipe(String nomEquipe, String categorieSport, String coachEquipe, String membresEquipe,
		String motDePasseEquipe) {
	super();
	this.nomEquipe = nomEquipe;
	this.categorieSport = categorieSport;
	this.coachEquipe = coachEquipe;
	this.membresEquipe = membresEquipe;
	this.motDePasseEquipe = motDePasseEquipe;
}
public Equipe() {
	super();
}


public Long getId() {
	return Id;
}
public void setId(Long id) {
	Id = id;
}
public Matchs getMatchs() {
	return matchs;
}
public void setMatchs(Matchs matchs) {
	this.matchs = matchs;
}
public Collection<Joueur> getJoueurs() {
	return joueurs;
}
public void setJoueurs(Collection<Joueur> joueurs) {
	this.joueurs = joueurs;
}
public Manager getManager() {
	return manager;
}
public void setManager(Manager manager) {
	this.manager = manager;
}
public String getNomEquipe() {
	return nomEquipe;
}
public void setNomEquipe(String nomEquipe) {
	this.nomEquipe = nomEquipe;
}
public String getCategorieSport() {
	return categorieSport;
}
public void setCategorieSport(String categorieSport) {
	this.categorieSport = categorieSport;
}
public String getCoachEquipe() {
	return coachEquipe;
}
public void setCoachEquipe(String coachEquipe) {
	this.coachEquipe = coachEquipe;
}
public String getMembresEquipe() {
	return membresEquipe;
}
public void setMembresEquipe(String membresEquipe) {
	this.membresEquipe = membresEquipe;
}
public String getMotDePasseEquipe() {
	return motDePasseEquipe;
}
public void setMotDePasseEquipe(String motDePasseEquipe) {
	this.motDePasseEquipe = motDePasseEquipe;
}

}