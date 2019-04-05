package com.zs.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zs.module.Student;
import com.zs.server.StudentServer;


@WebServlet("/admin/student_show")
public class studentShowSevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Student> list =StudentServer.studentserver.getallstudent();
		int page=1;
		Object o2=request.getParameter("page");
		if(o2!=null){
			page=Integer.parseInt(((String) o2).trim());
		}

		if(page<1)page=1;
		if(page*10-10>list.size())page=list.size()/10;
		int beginIndex=(page-1)*10;
		int endIndex=page*10-1;
		if(endIndex>list.size())endIndex=list.size();
		request.getSession().setAttribute("page", page);
		request.setAttribute("studentlist", list.subList(beginIndex,endIndex));
		request.setAttribute("studentlistsize",list.size());
		request.getRequestDispatcher("/admin/student_show.jsp").forward(request, response);

    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Student> list =StudentServer.studentserver.getallstudent();
		int page=1;
		Object o1=request.getAttribute("page");
		if(o1!=null)page=Integer.parseInt((String) o1);
		
		request.getSession().setAttribute("page", page);
		request.setAttribute("studentlist", list.subList(0,9));
		request.setAttribute("studentlistsize",list.size());
		request.getRequestDispatcher("/admin/student_show.jsp").forward(request, response);
	}

	

}
