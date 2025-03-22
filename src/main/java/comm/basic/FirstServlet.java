package comm.basic;

import java.io.IOException;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/first")
public class FirstServlet implements Servlet 
{
	private ServletConfig config;
	public void init(ServletConfig config) throws ServletException
	{
		this.config=config;
		System.out.println(config.getServletName());
		System.out.println("Servlet is initialized");
	}
	public void service(ServletRequest req,ServletResponse resp) throws ServletException,IOException
	{
		System.out.println(config.getServletName());
		System.out.println("Serivice method");
	}
	public ServletConfig getServletConfig()
	{
		return this.config;
	}
	public String getServletInfo()
	{
		return "First Servlet";
	}
	public void destroy()
	{
		System.out.println("Resources are deallocated");
	}
	 
}
