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
public class Matchs implements Serializable{
	@Id @GeneratedValue
	private Long id;
	private String lieu;
	private String date;
	private String equipe;
	private String equipeAdverse;
	@OneToMany(mappedBy="matchs",fetch=FetchType.LAZY)
	private Collection<Equipe> equipes;
	public Matchs() {
		super();
	}
	
	

	public Matchs(String lieu, String date, String equipe, String equipeAdverse) {
		super();
		this.lieu = lieu;
		this.date = date;
		this.equipe = equipe;
		this.equipeAdverse = equipeAdverse;
	}



	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLieu() {
		return lieu;
	}
	public void setLieu(String lieu) {
		this.lieu = lieu;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Collection<Equipe> getEquipes() {
		return equipes;
	}
	public void setEquipes(Collection<Equipe> equipes) {
		this.equipes = equipes;
	}



	public String getEquipe() {
		return equipe;
	}



	public void setEquipe(String equipe) {
		this.equipe = equipe;
	}



	public String getEquipeAdverse() {
		return equipeAdverse;
	}



	public void setEquipeAdverse(String equipeAdverse) {
		this.equipeAdverse = equipeAdverse;
	}
	
	
}