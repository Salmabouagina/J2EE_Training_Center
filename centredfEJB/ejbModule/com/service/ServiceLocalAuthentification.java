package com.service;

import java.util.List;

import com.users.Personne;

public interface ServiceLocalAuthentification {
	public Personne authentifier(String email, String pass);

	public boolean existePersonne(Personne p);

	public void ajouterPersonne(Personne p);

	void supprimerPersonne(Personne p);

	void modifierPersonne(Personne p, String nom, String prenom, String email, String pass);

	List<Personne> AfficherEnseignant();

	List<Personne> AfficherEtudiant();
}
