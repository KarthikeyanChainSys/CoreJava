package com.chainsys.webapp.first;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionState
 */
public class SessionState extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionState() {
        super();
    }

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
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<html><head><title>Attributes</title></head><body>");
		String submitValue = request.getParameter("submit"); // Request scope
		HttpSession session = request.getSession(true); // true - maintain the session, create session id(token)
		System.out.println(session.getId());
		if(submitValue.equals("result"))
		{
//			response.sendRedirect("Result"); // Navigating from one servlet to another within the same website.
//			response.sendRedirect("http://www.google.com"); // sendRedirect() can also be used to navigate to another website.
			RequestDispatcher rd = request.getRequestDispatcher("Result"); // Navigating from one servlet to another within the same website.
			// cannot be used for navigating to another website.
			rd.forward(request, response);
			// Passing the request and response object received by the current servlet to the forwarded servlet.
		}
		else if (submitValue.equals("set")) {
			String salaryInput = request.getParameter("salary"); 
			session.setAttribute("salary", salaryInput) ; // Storing data in Session scope for each user
			// Session.setAttribute stores the data in a collection using key and value
			// salary is a key, salaryInput is a value.
			out.println("<h1>Value Set</h1>" + salaryInput);
		} else if (submitValue.equals("fetch"))
		{
//			String sessionSalary = session.getAttribute("salary").toString();
			String sessionSalary = (String) session.getAttribute("salary");
			if(sessionSalary == null)
			{
				out.println("<h1>SESSION NOT YET SET!!! </h1>");
			}
			out.println("<h1>Value Fetch</h1>" + sessionSalary); // Returning value from global variable to html
		}
		out.println("</body></html>");
	}

}
