package web;

import java.io.IOException;

import com.service.ServiceLocalAuthentification;
import com.users.Etudiant;

import jakarta.ejb.EJB;
import jakarta.persistence.NoResultException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Ajouter")
public class Ajouter extends HttpServlet {
	@EJB
	private ServiceLocalAuthentification metier;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("Ajouter.jsp").forward(request, response);

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		if (action.equals("Ajout")) {
			String nom = (request.getParameter("nom"));
			String prenom = (request.getParameter("prenom"));
			String email = (request.getParameter("email"));
			String pass = (request.getParameter("pass"));
			String etablissement =(request.getParameter("etablissement"));
			
			
				Etudiant et = new Etudiant(nom,prenom,email,pass,etablissement,1);
				metier.ajouterPersonne(et);
			
				response.sendRedirect("/centredfWeb/ListPersonne");
			}
		
	
		request.getRequestDispatcher("Ajouter.jsp").forward(request, response);

	}
}