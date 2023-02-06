package com.service;

import java.util.List;

import com.users.Personne;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Stateless(name = "AUTH")
public class ServiceImpAuthentification implements ServiceLocalAuthentification {
	@PersistenceContext(unitName = "centredfEJB")
	private EntityManager em;

	@Override
	public Personne authentifier(String email, String pass) {
		Query req = em.createQuery("SELECT u FROM Personne u WHERE  u.email=:login AND u.pass=:pwd")
				.setParameter("login", email).setParameter("pwd", pass);

		return (Personne) req.getSingleResult();
	}

	@Override
	public boolean existePersonne(Personne p) {

		Query query = em.createQuery("SELECT u FROM Personne u WHERE u.ID=:login ").setParameter("login",
				p.getIdPersonne());
		Personne utl = (Personne) query.getSingleResult();
		if (utl != null) {
			return true;
		}
		return false;

	}

	@Override
	public void ajouterPersonne(Personne p) {
		em.persist(p);

	}

	@Override
	public void supprimerPersonne(Personne p) {
		int deletedCount = em.createQuery("DELETE FROM Personne p WHERE p.id=:id").setParameter("id", p.getIdPersonne())
				.executeUpdate();

	}

	@Override
	public void modifierPersonne(Personne p, String nom, String prenom, String email, String pass) {
		Query query = em
				.createQuery("UPDATE Personne p SET Nom =:nom,Prenom =:prenom,email =:email,pass =:pass WHERE p.ID=:id")
				.setParameter("nom", nom).setParameter("prenom", prenom).setParameter("email", email)
				.setParameter("pass", pass).setParameter("id", p.getIdPersonne());
		int updateCount = query.executeUpdate();

	}

	@Override
	public List<Personne> AfficherEtudiant() {
		Query query = em.createQuery("SELECT u FROM Etudiant u");
		return query.getResultList();

	}

	@Override
	public List<Personne> AfficherEnseignant() {
		Query query = em.createQuery("SELECT u FROM Enseignant u");
		return query.getResultList();

	}

}
