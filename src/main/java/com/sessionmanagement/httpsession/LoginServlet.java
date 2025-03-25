package com.sessionmanagement.httpsession;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	final String emailId = "shubhampuri8297@gmail.com";
	final String password = "Shubham@144";

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		PrintWriter writer = response.getWriter();
		String email = request.getParameter("email");
		String userPassword = request.getParameter("password");
		if (email.equals(emailId) && userPassword.equals(this.password)) {
			session.setAttribute("email", email);
			session.setAttribute("password", userPassword);
			session.setMaxInactiveInterval(60);
			writer.println("<h1>Login Sucessful and Session is created");
		} else {
			writer.println("<h1>Invalid Credentials</h1>");
		}

	}

}
