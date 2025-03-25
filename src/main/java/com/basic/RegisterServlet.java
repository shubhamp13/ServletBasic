package com.basic;

import java.io.IOException;
import java.util.Enumeration;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
 
public class RegisterServlet extends HttpServlet 
{
 
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletConfig config=getServletConfig();
		String username=config.getInitParameter("UserName");
		System.out.println(username);
//		String userName=req.getParameter("userName");
//		String email=req.getParameter("email");
//		String mobileNo=req.getParameter("mobileno");
//		String gender=req.getParameter("gender");
//		String []languages=req.getParameterValues("languages");
//		for (String lang:languages)
//		{
//			System.out.println(lang);
//		}
//		Enumeration<String>e=req.getParameterNames();
//		while(e.hasMoreElements())
//		{
//			System.out.println(e.nextElement());
//		}
//		System.out.println(req.getServerPort());
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
	
}
