package com.zs.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import com.zs.server.AdminServer;
import com.zs.server.AdminServer;


@WebServlet("/admin/login_do")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String adminname=request.getParameter("username");
		String password=request.getParameter("password");
		//AdminServer.adminserver.login(adminname, password);
	//	System.out.println(adminname+":"+password);
		if(AdminServer.adminserver.login(adminname, password)){
			HttpSession session=request.getSession();
			session.setAttribute("admin", adminname);
			request.getRequestDispatcher("/admin/msg_show.jsp").forward(request, response);
		}else{
			request.setAttribute("msg", "<font color=\"red\">用户名或密码错误</font>");
			request.getRequestDispatcher("/admin/index.jsp").forward(request, response);
		}
		
	}

}
