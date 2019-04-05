package com.zs.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.zs.server.StudentServer;

@WebServlet("/student/orderApplication")
public class orderApplicationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		Object o;
		String teacherno = null;
		if((o=session.getAttribute("teacherno")) != null)
		teacherno=(String)o;
		String time[]=request.getParameterValues("time");
		if(time==null){
			request.setAttribute("msg", "<font color=\"red\">未选中任何信息</font>");
			request.getRequestDispatcher("/student/stuGetTeaOrder").forward(request, response);;
			return;
		}
		
		String sno = null;
		if((o=session.getAttribute("user")) != null)
			sno=(String)o;
		System.out.println("teacherno="+teacherno);
		StudentServer.studentserver.submitOrder(teacherno,sno,time);
		request.getRequestDispatcher("/student/stuGetTeaOrder").forward(request, response);;
	}

}
