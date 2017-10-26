package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;
import dao.baby1;
/**
 * Servlet implementation class AdminAuthenticator
 */
@WebServlet("/AdminAuthenticator")
public class AdminAuthenticator extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out=response.getWriter();
		response.setContentType("text/html; charset=UTF-8");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		if(baby1.check(username, password)){
			HttpSession session=request.getSession();
			session.setAttribute("AdminAuthenticator","true");
			request.getRequestDispatcher("header.jsp").forward(request, response);
		
		}else{
			

			RequestDispatcher rs=request.getRequestDispatcher("Adminloginform.jsp");
			rs.include(request, response);
			out.print("your username or password is incorrect! ");
			
		
		}
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
