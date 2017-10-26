package servlets;

import java.io.PrintWriter;
import java.util.List;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Baby;
import dao.BabyDao;
/**
 * Servlet implementation class ViewByStart
 */
@WebServlet("/ViewByStart")
public class ViewByStart extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String start=request.getParameter("start");
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>View Baby by "+start.toUpperCase()+"</title>");
		out.println("<link rel='stylesheet' href='resources/bootstrap.min.css'/>");
		out.println("</head>");
		out.println("<body>");
		request.getRequestDispatcher("navigation.jsp").include(request, response);
		out.print(" <a href='ViewBabyNameByReligion?religion=hindu' class='btn btn-primary' role='button'>Hindu</a> ");
		out.print(" <a href='ViewBabyNameByReligion?religion=muslim' class='btn btn-primary' role='button'>Muslim</a> ");
		out.print(" <a href='ViewBabyNameByReligion?religion=sikh' class='btn btn-primary' role='button'>Sikh</a> ");
		out.print(" <a href='ViewBabyNameByReligion?religion=christian' class='btn btn-primary' role='button'>Christian</a> ");
		out.print(" <a href='ViewBabyNameByReligion?religion=jews' class='btn btn-primary' role='button'>Jews</a> ");
		out.print(" <a href='ViewBabyNameByReligion?religion=jain' class='btn btn-primary' role='button'>Jain</a> ");
		out.print(" <a href='ViewBabyNameByReligion?religion=buddhist' class='btn btn-primary' role='button'>Buddhist</a> ");
		
		request.getRequestDispatcher("atoz.jsp").include(request, response);
		
		out.println("<h1>View Baby Names by "+start.toUpperCase()+"</h1>");
		List<Baby> list=BabyDao.getRecordsByStart(start);
		
		out.print("<table class='table table-bordered table-striped'>");
		out.println("<tr><th>Name</th><th>Meaning</th><th>Sex</th><th>Religion</th></tr>");
		for(Baby b:list){
			out.println("<tr><td>"+b.getName()+"</td><td>"+b.getMeaning()+"</td><td>"+b.getSex()+"</td><td>"+b.getReligion()+"</td></tr>");
		}
		out.println("</table>");
		request.getRequestDispatcher("footer.jsp").include(request, response);
		out.close();
	}



	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
