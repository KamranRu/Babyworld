package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Babyserv
 */
@WebServlet("/Babyserv")
public class Babyserv extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			
			request.getRequestDispatcher("header.jsp").include(request, response);
			out.println("<h1>Admin Home</h1>");
			out.print(" <a href='AddBabyNameForm' class='btn btn-primary' role='button'>Add Baby Name</a><br>");
			out.print(" <a href='ViewBabyName' class='btn btn-primary' role='button'>View Baby Names</a><br>");
			out.print(" <a href='Deletebabyname' class='btn btn-primary' role='button'>Deletebabyname</a><br>");
			
			request.getRequestDispatcher("footer.jsp").include(request, response);

}
	}