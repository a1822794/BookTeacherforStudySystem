package com.zs.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.zs.server.StudentServer;
import com.zs.server.TeacherServer;

/**
 * Servlet implementation class userLoginSevlet
 */
@WebServlet("/userlogin")
public class userLoginSevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public userLoginSevlet() {
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
		int id=Integer.parseInt(request.getParameter("id"));
		String user=request.getParameter("user");
		String password=request.getParameter("password");
		switch(id){
		case 0:
			if(StudentServer.studentserver.login(user,password)){
				HttpSession session=request.getSession();
				session.setAttribute("user", user);
				request.setAttribute("page", 1);
				response.sendRedirect(request.getContextPath()+"/student/studentIndex_do");
			}else{
				request.setAttribute("msg", "用户或密码不存在");
				request.getRequestDispatcher("/index.jsp").forward(request, response);
			}
			break;
		case 1:
			
			if(TeacherServer.teacherserver.login(user,password)){
				HttpSession session=request.getSession();
				session.setAttribute("user", user);
				response.sendRedirect(request.getContextPath()+"/teacher/tea_index.jsp");
			}
			break;
		}
	}

}
