package com.zs.dao;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import com.zs.DBUtils.DB;
import com.zs.module.Admin;

public class AdminDao {
public static AdminDao admindao =new AdminDao();
	public boolean selectadmin(String adminname,String password){
	     String sql="select * from admin where adminname='"+adminname+"'and password='"+password+"'";   //SQLÓï¾ä
	     List list=DB.db.getResult(sql);
	    if(list.size()>0)return true;
		return false;
}
}
