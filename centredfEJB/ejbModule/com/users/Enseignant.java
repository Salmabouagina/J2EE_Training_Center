package com.users;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.xml.bind.annotation.XmlTransient;

@Entity
@DiscriminatorValue("Enseignant")
public class Enseignant extends Personne{

	private String specialite;

	

	public Enseignant( String nom, String prenom, String email, String pass, String specialite) {
		super( nom, prenom, email, pass);
		this.specialite = specialite;
	}

	public Enseignant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Enseignant( String nom, String prenom, String email, String pass) {
		super( nom, prenom, email, pass);
		// TODO Auto-generated constructor stub
	}

	public String getSpecialite() {
		return specialite;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}
	
	@OneToMany(mappedBy = "Enseignant", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@XmlTransient
	private List<Cours> Cours = new ArrayList<Cours>();



	public List<Cours> getCours() {
		return Cours;
	}

	public void setCours(List<Cours> cours) {
		Cours = cours;
	}
	
}
