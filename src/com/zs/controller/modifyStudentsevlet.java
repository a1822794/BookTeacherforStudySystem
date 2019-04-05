package com.zs.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zs.module.Student;
import com.zs.server.StudentServer;


@WebServlet("/admin/modifystudent")
public class modifyStudentsevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String sno=request.getParameter("sno");
		String sname=request.getParameter("sname");
		String sex=request.getParameter("sex");
		String grade=request.getParameter("grade");
		String depart=request.getParameter("depart");
		Student student=new Student(sno,sname,sex,grade,depart);
		if(StudentServer.studentserver.modifyStudent(student)){
			response.sendRedirect(request.getContextPath()+("/admin/student_show"));
		}
	}

}
