package com.sessionmanagement.hiddenform;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/hidden")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String admin = req.getParameter("admin");
		PrintWriter printWriter = resp.getWriter();

		resp.setContentType("text/html");

		printWriter.println("<form action='transfer'>");

		printWriter.println("""
				<input type='hidden' name='user' value=""" + admin + """
				>
				<input type="submit">
				""");

	}

}
