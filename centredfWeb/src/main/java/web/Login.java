
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

@WebServlet("/Login")
public class Login extends HttpServlet {
	@EJB
	private ServiceLocalAuthentification metier;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("Login.jsp").forward(request, response);

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String n = request.getParameter("username");
		String p = request.getParameter("userpass");
		HttpSession session = request.getSession();
		session.setAttribute("username1", n);
		session.setAttribute("userpass1", p);
		String action = request.getParameter("action");
		if (action.equals("login")) {
			Personne u = metier.authentifier(n, p);
			if (u instanceof Etudiant) {
				response.sendRedirect("/centredfWeb/ListCoursetd");
			} else if (u instanceof Administrateur) {
				response.sendRedirect("/centredfWeb/ListPersonne");
			} else {
				response.sendRedirect("/centredfWeb/ListCoursens");
			}
		}

	}
}
