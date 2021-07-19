package com.login.web;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.login.dao.Userdao;

/**
 * Servlet implementation class RegisterServlet
 */
@SuppressWarnings("serial")
public class RegisterServlet extends HttpServlet {
       

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		   response.setContentType("text/html;charset=utf-8");
		     String username=request.getParameter("username");
		     String password=request.getParameter("password");
		     String gender=request.getParameter("sex");
		     String email=request.getParameter("email");
		     String phone=request.getParameter("phone");
		     String year=request.getParameter("year");
		     String month=request.getParameter("month");
		     String day=request.getParameter("day");
		     Date birth=new Date();
		     String date=year+"-"+month+"-"+day;
		     DateFormat change=new SimpleDateFormat("yyyy-MM-dd");
		     try {
				birth=change.parse(date);
			} catch (ParseException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		     if(new Userdao().register(username, password, gender, email, phone, birth)) {
		    	 response.sendRedirect("/jows/loginsucess.html");
		     }
		     else {
				System.out.println("注册失败！");
			}
		     
		     
	}

}
