package com.zs.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zs.server.TeacherServer;

/**
 * Servlet implementation class addTeacherServlet
 */
@WebServlet("/admin/addteacher")
public class addTeacherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addTeacherServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

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
		doGet(request, response);
		request.setCharacterEncoding("utf-8");
		String teacherno=request.getParameter("teacherno");
		String teachername=request.getParameter("teachername");
		String depart=request.getParameter("depart");
		String title=request.getParameter("title");
		String officeLocl=request.getParameter("officeLocl");
		String researchDirection=request.getParameter("researchDirection");
		if(TeacherServer.teacherserver.addTeacher(teacherno,teachername,depart,title,officeLocl,researchDirection)){
			response.sendRedirect(request.getContextPath()+("/admin/teacher_show"));
		}		
	}

}
