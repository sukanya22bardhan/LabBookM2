package com.cg.iter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ValidatorServlet extends HttpServlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("test/html");
		
		PrintWriter out = response.getWriter();
		
		String username=request.getParameter("username");  
	    String password=request.getParameter("pwd");
	    
	    //username = sachiket
	    //password = iter123
	    
	    if(username.equals("sachiket") && password.equals("iter123")){  
	        RequestDispatcher rd=request.getRequestDispatcher("success");  
	        rd.forward(request, response);  
	    } 
	    else {
	    	RequestDispatcher rd=request.getRequestDispatcher("failure");  
	        rd.forward(request, response);
	    }
	    
		
	}

}
