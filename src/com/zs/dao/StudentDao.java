package com.zs.dao;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.zs.DBUtils.DB;
import com.zs.module.*;

public class StudentDao {
	public static StudentDao studentdao=new StudentDao();
	java.sql.Connection conn = null;
	java.sql.Statement state = null;

	public List<Student> selectallstudent(){
			List<Student> list=new ArrayList<Student>();
			String sql="select sno,sname,sex,grade,depart from student";   //SQLÓï¾ä
			List<Map> l=DB.db.getResult(sql);
			for(int i=0;i<l.size();i++){
				list.add(new Student((String)l.get(i).get("sno"),(String)l.get(i).get("sname"),(String)l.get(i).get("sex"),(String)l.get(i).get("grade"),(String)l.get(i).get("depart")));
			}
		return list;
	}
	public boolean addStudent(Student student){
		String sql="insert into student(sno,sname,sex,grade,depart) values('"+student.getSno()+"','"+student.getSname()+"','"+student.getSex()+"','"+student.getGrade()+"','"+student.getDepart()+"')";   //SQLÓï¾ä
		if((Integer)(DB.db.getResult(sql).get(0).get("number"))>0){
			return true;
		}
		return false;
	}
	public boolean deletStudent(String sno){
		String sql="delete from student where sno='"+sno+"'";
		if((Integer)(DB.db.getResult(sql).get(0).get("number"))>0)return true;
		return false;
	}
	private boolean isExist(String sno) {
 		String sql="select * from student where sno='"+sno+"'";   //SQLÓï¾ä
 		List list=DB.db.getResult(sql);
 		    if(list.size()>0)return true;
 			return false;
	}
	public boolean updateStudent(Student student) {
		String sql="update student set sname='"+student.getSname()+"' , sex= '"+student.getSex()+"', grade='"+student.getGrade()+"',depart='"+student.getDepart()+"' where sno='"+student.getSno()+"'";
		if((Integer)(DB.db.getResult(sql).get(0).get("number"))>0)return true;
		return false;
	}
	public boolean selectTheStudent(String user, String password) {
		String sql="select * from student where sno='"+user+"' and password='"+password+"'";
		if((Integer)(DB.db.getResult(sql).size())>0)return true;
		return false;
	}
}
