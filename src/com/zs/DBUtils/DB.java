package com.zs.DBUtils;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.mysql.jdbc.ResultSetMetaData;

public class DB {
	public static DB db =new DB();
	List<Map> list = new ArrayList();
public List<Map> getResult(String sql){
	list.clear();
	ResultSet re=null;
	try {
		Class.forName("com.mysql.jdbc.Driver");
		 String jdbc="jdbc:mysql://localhost:3306/db1?characterEncoding=utf8";
	     java.sql.Connection conn = null;
	     
		try {
			conn = DriverManager.getConnection(jdbc, "root", "123456");
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}//链接到数据库
	     
	     java.sql.Statement state = null;
		try {
			state = conn.createStatement();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}   //容器
	    

	     try {
			if(sql.trim().indexOf(("select"))==0){
				re=state.executeQuery(sql);
			java.sql.ResultSetMetaData md = re.getMetaData();//获取键名
				int columnCount = md.getColumnCount();//获取行的数量
			while (re.next()) {
				Map rowData = new HashMap();//声明Map
				for (int i = 1; i <= columnCount; i++) {
				rowData.put(md.getColumnName(i), re.getObject(i));//获取键名及值
				}
				list.add(rowData);
			}
		}
			else {
				Map rowData = new HashMap();
				rowData.put("number", state.executeUpdate(sql));
				list.add(rowData);
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}         //将sql语句上传至数据库执行
	     
	     try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//关闭通道
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}//加载驱动
	return list;

		}

}
