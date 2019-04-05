package com.zs.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.zs.DBUtils.DB;
import com.zs.module.Student;
import com.zs.module.Teacher;

public class TeacherDao {
public static TeacherDao teacherdao=new TeacherDao();

public List<Teacher> selectallteacher() {
	List<Teacher> list=new ArrayList<Teacher>();
	String sql="select teacherno,teachername,depart,title,officeLocl,researchDirection from teacher";   //SQLÓï¾ä
	List<Map> l=DB.db.getResult(sql);
	for(int i=0;i<l.size();i++){
		list.add(new Teacher((String)l.get(i).get("teacherno"),(String)l.get(i).get("teachername"),(String)l.get(i).get("depart"),(String)l.get(i).get("title"),(String)l.get(i).get("officeLocl"),(String)l.get(i).get("researchDirection")));
	}
return list;
}

public boolean updateTeacher(String teacherno, String teachername, String depart, String title, String officeLocl,
		String researchDirection) {
	String sql="update teacher set teachername='"+teachername+"' , depart= '"+depart+"', title='"+title+"' ,officeLocl='"+officeLocl+"',researchDirection='"+researchDirection+"'where teacherno='"+teacherno+"'";
	if((Integer)(DB.db.getResult(sql).get(0).get("number"))>0)return true;
	return false;
}

public boolean deletTeacher(String teacherno) {
	String sql="delete from teacher where teacherno='"+teacherno+"'";
	if((Integer)(DB.db.getResult(sql).get(0).get("number"))>0)return true;
	return false;
}

public boolean addTeacher(String teacherno, String teachername, String depart, String title, String officeLocl,
		String researchDirection) {
	String sql="insert into teacher(teacherno,teachername,depart,title,officeLocl,researchDirection) values('"+teacherno+"','"+teachername+"' ,'"+depart+"', '"+title+"','"+officeLocl+"','"+researchDirection+"')";

	if((Integer)(DB.db.getResult(sql).get(0).get("number"))>0){
		return true;
	}
	return false;
}

public boolean selectTheTeacher(String user, String password) {
	String sql="select * from teacher where teacherno='"+user+"' and password='"+password+"'";
	if((Integer)(DB.db.getResult(sql).size())>0)return true;
	return false;	
}

}
