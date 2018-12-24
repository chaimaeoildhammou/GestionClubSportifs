package com.example.demo.entites;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Manager implements Serializable{
@Id
private String nom;
private String motDePasse;
@OneToMany(mappedBy="manager",fetch=FetchType.LAZY)
private Collection<Equipe> equipes;

public Manager(String nom, String motDePasse) {
	super();
	this.nom = nom;
	this.motDePasse = motDePasse;
}
public Manager() {
	super();
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public Collection<Equipe> getEquipes() {
	return equipes;
}
public void setEquipes(Collection<Equipe> equipes) {
	this.equipes = equipes;
}
public String getMotDePasse() {
	return motDePasse;
}
public void setMotDePasse(String motDePasse) {
	this.motDePasse = motDePasse;
}




}