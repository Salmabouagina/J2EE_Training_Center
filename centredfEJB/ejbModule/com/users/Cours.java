package com.users;


import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Cours {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String libele;
	private String duree;
	private String type;
	@ManyToOne
	private Etudiant etudiant;
	@ManyToOne
	private Enseignant Enseignant;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	public String getLibele() {
		return libele;
	}

	public void setLibele(String libele) {
		this.libele = libele;
	}

	public String getDuree() {
		return duree;
	}

	public void setDuree(String duree) {
		this.duree = duree;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Etudiant getEtudiant() {
		return etudiant;
	}

	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}

	public Enseignant getEnseignant() {
		return Enseignant;
	}

	public void setEnseignant(Enseignant enseignant) {
		Enseignant = enseignant;
	}

	public Cours( String libele, String duree, String type, Etudiant etudiant,
			com.users.Enseignant enseignant) {
		super();
		
		this.libele = libele;
		this.duree = duree;
		this.type = type;
		this.etudiant = etudiant;
		this.Enseignant = enseignant;
	}

	public Cours() {
		super();
		// TODO Auto-generated constructor stub
	}

}
