package com.cg.iter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class failureServlet extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
		
		String htmlHead = "<!DOCTYPE html>\r\n" + 
				"<html>\r\n" + 
				"<head>\r\n" + 
				"<meta charset=\"ISO-8859-1\">\r\n" + 
				"<title>failure page</title>\r\n" + 
				" <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n" + 
				"  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\r\n" + 
				"  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\r\n" + 
				"  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\r\n" + 
				"</head>\r\n" + 
				"<body>";
		
		String bodyEnd = "</body>\r\n" + 
				"</html>";
      
        response.setContentType("text/html");  
        PrintWriter out = response.getWriter();  
        out.print(htmlHead);
        out.print("<h1 align=\"center\"> Failed to login <h1>");
        out.print("<h3 align=\"center\">Invalid username or password!<h3>");  
        out.print(bodyEnd);
        }
}
