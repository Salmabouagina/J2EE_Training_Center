package com.essai;

import java.util.List;

import com.service.ServiceLocalAuthentification;
import com.users.Enseignant;
import com.users.Etudiant;
import com.users.Personne;

import jakarta.ejb.EJB;
import jakarta.ejb.Stateless;
import jakarta.jws.WebService;
import jakarta.persistence.EntityManager;
@Stateless
@WebService
public class essaiauthentification {
	@EJB
	private ServiceLocalAuthentification metier;

	public boolean authentifier(String email, String pass) {
		Personne p = metier.authentifier(email, pass);

		if (p instanceof Etudiant)
			return true;
		else
			return false;
	}

	public void ajoouter(Personne p) {
		Etudiant e = new Etudiant("a", "b", "c", "d", "e",1);
		Enseignant e1 = new Enseignant("a1", "1b", "c1", "d1", "e1");
		metier.ajouterPersonne(e);
		metier.ajouterPersonne(e1);

	}

	public void delete(Personne p) {
		metier.supprimerPersonne(p);
	}

	public void modifier(Personne p, String nom, String prenom, String email, String pass) {
		metier.modifierPersonne(p, nom, prenom, email, pass);
	}

	public List<Personne> listerEtd() {
		
		return metier.AfficherEtudiant();
	}

	public  List<Personne> listerens() {
		return metier.AfficherEnseignant();
	}
}
