
package web;

import java.io.IOException;

import com.service.ServiceLocalAuthentification;
import com.users.Administrateur;
import com.users.Etudiant;
import com.users.Personne;

import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/supprimer")
public class supprimer extends HttpServlet {
	@EJB
	private ServiceLocalAuthentification metier;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("supprimer.jsp").forward(request, response);

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String n = request.getParameter("name");
		String p = request.getParameter("prenom");
		
	
		String active = request.getParameter("action");

		if (active.equals("Oui")) {
			String e = request.getParameter("email");
			String pass = request.getParameter("pass");
			Personne personne=metier.authentifier("d", "d");
			metier.supprimerPersonne(personne);
			response.sendRedirect("/centredfWeb/ListPersonne");
		} 

		response.sendRedirect("/centredfWeb/ListPersonne");
	}
	}
		


		
		
		

	

