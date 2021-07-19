package com.login.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.login.pojo.accout;
import com.login.service.UserService;



@SuppressWarnings("serial")
public class LoginServlet extends HttpServlet{
         

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO 自动生成的方法存根
	String username=req.getParameter("username");
	String password=req.getParameter("password");
	    accout act=new UserService().loginService(username);
	    if(act==null) {
	    	resp.sendRedirect("/jows/loginfail.html");
	    }
	    else {
			if (act.getPassword().equals(password)) {
				req.getRequestDispatcher("/loginsucess.html").forward(req, resp);
			}
			else resp.sendRedirect("/jows/loginfail.html");
		}
	}
      
}
