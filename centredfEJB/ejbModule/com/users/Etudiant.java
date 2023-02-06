package com.users;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlTransient;

@Entity
@DiscriminatorValue("Etudiant")//le discriminitateur pour identifier l'etudiant dans la table utilisateur
@XmlAccessorType(XmlAccessType.FIELD)
public class Etudiant extends Personne {

	
	private String etablissement;
	private int niveau ;
	
	
	
	public Etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getEtablissement() {
		return etablissement;
	}

	public void setEtablissement(String etablissement) {
		this.etablissement = etablissement;
	}

	public int getNiveau() {
		return niveau;
	}

	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}

	public Etudiant( String nom, String prenom, String email, String pass, String etablissement,
			int niveau) {
		super( nom, prenom, email, pass);
		this.etablissement = etablissement;
		this.niveau = niveau;
	}
	

	public List<Cours> getCours() {
		return Cours;
	}

	public void setCours(List<Cours> cours) {
		Cours = cours;
	}


	@OneToMany(mappedBy = "etudiant", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@XmlTransient
	private List<Cours> Cours = new ArrayList<Cours>();
	

}
