package com.cg.iter;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CurrentDate extends HttpServlet {
	 
	   public void doGet(HttpServletRequest request, HttpServletResponse response)
	      throws ServletException, IOException {

	      response.setContentType("text/html");
	 
	      PrintWriter out = response.getWriter();
	      String title = "Display Current Date & Time";
	      Date dNow = new Date( );
	      SimpleDateFormat ft = new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a");
	    
	      out.println("<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n" +
	         "<html>\n" +
	            "<head><title>" + title + "</title></head>\n" +
	            "<body bgcolor = \"#f0f0f0\">\n" +
	               "<h1 align = \"center\">" + title + "</h1>\n" +
	               "<h2 align = \"center\">" + ft.format(dNow) + "</h2>\n" +
	            "</body> </html>"
	      );
	   }
	}