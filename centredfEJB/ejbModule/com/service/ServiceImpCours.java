package com.service;

import java.util.List;

import com.users.Cours;
import com.users.Enseignant;
import com.users.Etudiant;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Stateless(name = "CO")

public class ServiceImpCours implements ServiceLocalCours{
	@PersistenceContext(unitName = "centredfEJB")
	private EntityManager em;
	@Override
	public void ajouterCours(Cours c) {
		
		em.persist(c);
		
		
	}

	@Override
	public List<Cours> ListerCoursParEtudiant(Etudiant etd) {
		
		return etd.getCours();
	}

	@Override
	public List<Cours> ListerCoursParEnseignant(Enseignant ens) {
		return ens.getCours();
	}

	@Override
	public void SupprimerCours(Cours c) {
		int deletedCount = em.createQuery("DELETE FROM Cours c WHERE c.id=:id").setParameter("id", c.getId())
				.executeUpdate();
		
	}
		
	

}
