package com.zs.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zs.server.AdminServer;


@WebServlet("/admin/addDayOrder")
public class addDayOrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String date=request.getParameter("date");
		if(AdminServer.adminserver.addOrderDay(date)){
			request.setAttribute("msg", "<font color=\"green\">开放成功</font>");
		}else{
			request.setAttribute("msg", "<font color=\"green\">开放失败</font>");
		}
		request.getRequestDispatcher("/admin/bookManage.jsp").forward(request, response);
	}

}
