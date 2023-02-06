package com.service;

import java.util.List;

import com.users.Cours;
import com.users.Enseignant;
import com.users.Etudiant;

public interface ServiceLocalCours {
	public void ajouterCours(Cours c);
	public List<Cours> ListerCoursParEtudiant(Etudiant etd);
	public List<Cours> ListerCoursParEnseignant(Enseignant ens);
	public void SupprimerCours(Cours c);
	

}
