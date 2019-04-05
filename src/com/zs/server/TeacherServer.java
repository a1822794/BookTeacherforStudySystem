package com.zs.server;

import java.util.List;

import com.zs.dao.StudentDao;
import com.zs.dao.TeacherDao;
import com.zs.module.Teacher;

public class TeacherServer {
public static TeacherServer teacherserver=new TeacherServer();

public List<Teacher> getallteacher() {
	// TODO Auto-generated method stub
	return TeacherDao.teacherdao.selectallteacher();
}

public boolean modifyTeacher(String teacherno, String teachername, String depart, String title, String officeLocl,
		String researchDirection) {
	return TeacherDao.teacherdao.updateTeacher(teacherno,  teachername,  depart,  title,officeLocl,
			 researchDirection);

	
}

public boolean deletTeacher(String teacherno) {
	// TODO Auto-generated method stub
	return TeacherDao.teacherdao.deletTeacher(teacherno);
}

public boolean addTeacher(String teacherno, String teachername, String depart, String title, String officeLocl,
		String researchDirection) {
	return TeacherDao.teacherdao.addTeacher(teacherno,  teachername,  depart,  title,officeLocl,
			 researchDirection);

}

public boolean login(String user, String password) {
	// TODO Auto-generated method stub
	return TeacherDao.teacherdao.selectTheTeacher(user,password);
}

}
