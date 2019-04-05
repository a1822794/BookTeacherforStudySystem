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
		}//���ӵ����ݿ�
	     
	     java.sql.Statement state = null;
		try {
			state = conn.createStatement();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}   //����
	    

	     try {
			if(sql.trim().indexOf(("select"))==0){
				re=state.executeQuery(sql);
			java.sql.ResultSetMetaData md = re.getMetaData();//��ȡ����
				int columnCount = md.getColumnCount();//��ȡ�е�����
			while (re.next()) {
				Map rowData = new HashMap();//����Map
				for (int i = 1; i <= columnCount; i++) {
				rowData.put(md.getColumnName(i), re.getObject(i));//��ȡ������ֵ
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
		}         //��sql����ϴ������ݿ�ִ��
	     
	     try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//�ر�ͨ��
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}//��������
	return list;

		}

}
