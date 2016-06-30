package com.mayank.LogIn;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mayank.LogIn.dto.User;
import com.mayank.LogIn.service.LoginService;
import com.mayank.LogIn.service.LoginServiceImpl;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userId=request.getParameter("userName");
		String passWord=request.getParameter("passWord");
		
		LoginService loginservice=new LoginServiceImpl();
		boolean result=loginservice.authenticate(userId, passWord);
		System.out.println(result);
		if(result){
			User user=loginservice.findUserDetails(userId);
		//	request.getSession().setAttribute("user", user);
		 //response.sendRedirect("success.jsp");
		 //another way of doing
			request.setAttribute("user", user);
		 RequestDispatcher requestDispatcher=request.getRequestDispatcher("success.jsp");
		 requestDispatcher.forward(request, response);
		 return;
		}
		else{
		 response.sendRedirect("login.jsp");
		 return;
		}
		
	}
}
