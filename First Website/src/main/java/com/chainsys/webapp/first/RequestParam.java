package com.chainsys.webapp.first;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class InitParam
 */
public class RequestParam extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RequestParam() {
        super();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost Called");
		response.setContentType("text/html"); // Give ContentType
		PrintWriter out = response.getWriter();
		String str_name = (String) request.getParameter("name"); // Request scope 
		// request.getParameter is similar to scanner.readline 
		out.println("<div>" + str_name + "</div>");
		String str_company = (String) request.getParameter("company"); // It read the key name given in HTML
		out.println("<div>" + str_company + "<div>");
		out.println("Inside");
	}

}
