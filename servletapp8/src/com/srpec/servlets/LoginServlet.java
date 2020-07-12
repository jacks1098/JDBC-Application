package com.srpec.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	response.setContentType("text/html");
	PrintWriter out = response.getWriter();
	String uname = request.getParameter("uname");
	String upwd  = request.getParameter("upwd");
	out.println("<html>");
	out.println("<body>");
	out.println("<h1 style='color:red'><u><i><b>Code Blooded Pvt Ltd Solutions</b></i></u></h1>");
	out.println("<h2 style='color:blue'><u>Coder Login Status</u></h2>");
	if(uname.equals("hk") && upwd.equals("hk"))
	{
	out.println("<h1 style='color:green'>Coder Login Success</h1>");
    }else {
    out.println("<h1 style='color:red'>Coder Login Failure</h1>");
    }
    out.println("<h3><a href='./loginform.html'>|Coders Login Form|</a></h3>");
	out.println("</body></html>");
	}
}