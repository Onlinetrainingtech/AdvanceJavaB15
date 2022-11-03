

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out=resp.getWriter();
		resp.setContentType("text/html");
		String u1=req.getParameter("uname");
		if(u1.equals("admin"))
		{
			HttpSession s1=req.getSession();
			s1.setAttribute("k1",u1);
			RequestDispatcher rd=req.getRequestDispatcher("Servlet2");
			rd.forward(req, resp);
		}
		else if(u1.equals("azar"))
		{
			Cookie ck=new Cookie("k2", u1);
			resp.addCookie(ck);
			
			RequestDispatcher rd=req.getRequestDispatcher("Servlet3");
			rd.forward(req, resp);
		}
	}

}
