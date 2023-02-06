
package com.essai;

import java.util.List;

import com.service.ServiceLocalCours;
import com.users.Cours;
import com.users.Enseignant;
import com.users.Etudiant;
import jakarta.ejb.EJB;
import jakarta.ejb.Stateless;
import jakarta.jws.WebService;

@Stateless
@WebService
public class essaiCours {
	@EJB
	private ServiceLocalCours metier1;

	public void ajouterCours(Cours c) {
		

		metier1.ajouterCours(c);
	}

	public List<Cours> ListerCoursParEtudiant(Etudiant etd) {
		return metier1.ListerCoursParEtudiant(etd);

	}

	public List<Cours> ListerCoursParEnseignant(Enseignant ens) {
		return metier1.ListerCoursParEnseignant(ens);
	}

	public void SupprimerCours(Cours c) {
		metier1.SupprimerCours(c);

	}

}
