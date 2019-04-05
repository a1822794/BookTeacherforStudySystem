package com.zs.server;

import java.util.List;
import java.util.Map;

import com.zs.dao.OrderDao;
import com.zs.dao.StudentDao;
import com.zs.module.Student;

public class StudentServer {
	public static StudentServer studentserver=new StudentServer();
	public List<Student> getallstudent(){
		return StudentDao.studentdao.selectallstudent();
	}
	public boolean addStudent(Student student){
		boolean f=StudentDao.studentdao.addStudent(student);
		return f;
	}
	public boolean deletStudent(String sno){
		return StudentDao.studentdao.deletStudent(sno);
	}
	public boolean modifyStudent(Student student) {
		return StudentDao.studentdao.updateStudent(student);
		
	}
	public boolean login(String user, String password) {
		
		return StudentDao.studentdao.selectTheStudent(user,password);
	}
	public List<Map> getTeacherOrder(String teacherno) {
		return OrderDao.orderdao.getOrderByTeacherno(teacherno);
	}

	public void submitOrder(String teacherno, String sno, String[] timelist) {
		for(String time:timelist){
			OrderDao.orderdao.updateOrder(teacherno,sno,time.split("&")[0].trim(),time.split("&")[1].trim(),1);
		}
		
	}
}
