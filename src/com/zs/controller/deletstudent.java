package com.zs.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zs.server.StudentServer;

import jdk.nashorn.internal.ir.RuntimeNode.Request;
@WebServlet("/admin/deletstudent")
public class deletstudent extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String sno=req.getParameter("sno");
	if(StudentServer.studentserver.deletStudent(sno)){
		resp.sendRedirect(req.getContextPath()+"/admin/student_show");
	}else{
		
	}
}
}
