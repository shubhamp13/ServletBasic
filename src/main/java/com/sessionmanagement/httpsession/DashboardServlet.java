package com.sessionmanagement.httpsession;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/dash")
public class DashboardServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter writer = resp.getWriter();
		HttpSession session = req.getSession(false);// if session exists then only return the session else return null
		if (session != null && session.getAttribute("email") != null) {
			String emailId = (String) session.getAttribute("email");
			String password = (String) session.getAttribute("password");
			resp.setContentType("text/html");
			writer.println("<h1>Email id:" + emailId + "</h1>");
			writer.println("<h1>Password: " + password + "</h1>");
		} else {
			writer.println("<h1>Invalid Session</h1>");
		}
	}

}
