package com.users;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
@Entity
@Table(name = "Personne")
@Inheritance(strategy = InheritanceType.JOINED) 										
@DiscriminatorColumn(name = "Personne_type") 
@XmlAccessorType(XmlAccessType.FIELD) 
public class Personne {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE) // generation auto des ID
	@Column(name = "ID")
	private int idPersonne;
	private String Nom;
	private String Prenom;
	private String email;
	private String pass;
	
	

	public Personne( String nom, String prenom, String email, String pass) {
		super();
		
		Nom = nom;
		Prenom = prenom;
		this.email = email;
		this.pass = pass;
	}
	public Personne() {
		// TODO Auto-generated constructor stub
	}
	public int getIdPersonne() {
		return idPersonne;
	}
	public void setIdPersonne(int idPersonne) {
		this.idPersonne = idPersonne;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getPrenom() {
		return Prenom;
	}
	public void setPrenom(String prenom) {
		Prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	
	
	
}
