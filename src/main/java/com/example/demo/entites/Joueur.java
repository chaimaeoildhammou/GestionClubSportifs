package com.example.demo.entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Joueur implements Serializable{
@Id @GeneratedValue
private long id;
private String nom;
private int age;
private String sexe;
private String email;
private String telephone;
private String motDePasse;
@ManyToOne
@JoinColumn(name="idEquipe")
private Equipe equipe;
public Joueur() {
	super();
}

public Joueur(String nom, int age, String sexe, String email, String telephone, String motDePasse) {
	super();
	this.nom = nom;
	this.age = age;
	this.sexe = sexe;
	this.email = email;
	this.telephone = telephone;
	this.motDePasse = motDePasse;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getSexe() {
	return sexe;
}

public void setSexe(String sexe) {
	this.sexe = sexe;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getTelephone() {
	return telephone;
}

public void setTelephone(String telephone) {
	this.telephone = telephone;
}

public String getMotDePasse() {
	return motDePasse;
}

public void setMotDePasse(String motDePasse) {
	this.motDePasse = motDePasse;
}





}

