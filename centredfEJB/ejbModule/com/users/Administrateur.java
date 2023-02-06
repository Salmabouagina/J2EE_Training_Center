package com.users;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("admin")
public class Administrateur extends Personne {

	public Administrateur() {
	super();	
	}
	
	
	
	public Administrateur( String nom, String prenom, String email, String pass) {
		super( nom, prenom, email, pass);
		// TODO Auto-generated constructor stub
	}	
	
	
	
}