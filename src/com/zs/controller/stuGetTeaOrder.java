package com.zs.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zs.server.StudentServer;


@WebServlet("/student/stuGetTeaOrder")
public class stuGetTeaOrder extends HttpServlet {
	private static final long serialVersionUID = 1L;
  @Override
protected void doGet(HttpServletRequest request, HttpServletResponse  response) throws ServletException, IOException {
	  request.setCharacterEncoding("utf-8");
		Object o=request.getAttribute("teacherno");
		if(o!=null){
			String teacherno=(String)o;
			List<Map> list=StudentServer.studentserver.getTeacherOrder(teacherno);
			request.setAttribute("list", list);
		}
		request.getRequestDispatcher("/student/teacherOrderShow.jsp").forward(request, response);;
}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String teacherno=request.getParameter("teacherno");
		Object o=null;
		if(teacherno==null&&(o=request.getSession().getAttribute("teacherno"))!=null){
			teacherno=(String)o;
		}
		request.getSession().setAttribute("teacherno", teacherno);
		List<Map> list=StudentServer.studentserver.getTeacherOrder(teacherno);
		request.setAttribute("list", list);
		request.getRequestDispatcher("/student/teacherOrderShow.jsp").forward(request, response);;

	}

}
