
package web;

import java.io.IOException;

import com.service.ServiceLocalAuthentification;
import com.service.ServiceLocalCours;
import com.users.Etudiant;

import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class TableauxEtd
 */
@WebServlet("/ListPersonne")
public class ListPersonne extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@EJB
	private ServiceLocalAuthentification metier;
	private ServiceLocalCours metier1;

	
		

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//request.setAttribute("comptes", metier.listerEtudiants());
		HttpSession session = request.getSession();
	
		
	
		String admina = (String) session.getAttribute("username1");
	    String admina1 = (String) session.getAttribute("userpass1");
		request.setAttribute("admin", admina);
		request.setAttribute("admin1", admina1);
		request.setAttribute("x", admina);
		request.setAttribute("y", admina1);
		
		request.setAttribute("comptes", metier.AfficherEtudiant());
		request.setAttribute("comptes1", metier.AfficherEnseignant());
		request.getRequestDispatcher("ListPersonne.jsp").forward(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
			
			
		}
	}


