package comm.basic;

import java.io.IOException;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/second")
public class SecondServlet extends GenericServlet 
{
	public void service(ServletRequest req,ServletResponse resp) throws ServletException,IOException
	{
		System.out.println("Service method called");
	}
}
