package com.zs.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zs.module.Student;
import com.zs.server.StudentServer;


@WebServlet("/admin/addStudent")
public class addStudentSevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String sno=request.getParameter("sno");
		String sname=request.getParameter("sname");
		String sex=request.getParameter("sex");
		String grade=request.getParameter("grade");
		String depart=request.getParameter("depart");
		if(sno==null||sname==null||sex==null||sno.trim().length()*sname.trim().length()*sex.trim().length()==0){
			request.setAttribute("msg", "<font color=\"red\">信息不能为空</font>");
			request.getRequestDispatcher("/admin/addstudent.jsp").forward(request, response);;
			return;
		}
		Student student=new Student(sno,sname,sex,grade,depart);
		if(StudentServer.studentserver.addStudent(student)){
			response.sendRedirect(request.getContextPath()+"/admin/student_show");
		}else{
			
		}
	}

}
