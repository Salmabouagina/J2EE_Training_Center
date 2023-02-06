
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

@WebServlet("/Modifier")
public class Modifier extends HttpServlet {
	@EJB
	private ServiceLocalAuthentification metier;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("Modifier.jsp").forward(request, response);

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String n = request.getParameter("nom");
		String p = request.getParameter("prenom");
		String e = request.getParameter("email");
		String pas = request.getParameter("pass");
		
		String admina = request.getParameter("x");
	    String admina1 = request.getParameter("y");
	    Personne perso=  metier.authentifier(e, pas);
		String action = request.getParameter("action");
		if (action.equals("login")) {
			
			
			
			metier.modifierPersonne(perso, n, p, e, pas);
			response.sendRedirect("/centredfWeb/ListPersonne");
			}
		
		

	}
}
