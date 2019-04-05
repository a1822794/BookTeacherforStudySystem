package com.zs.dao;

import java.security.Timestamp;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

import com.zs.DBUtils.DB;

public class OrderDao {
public static OrderDao orderdao=new OrderDao();

public List<Map> getOrderByTeacherno(String teacherno) {
	String sql="select * from orderr where teacherno='"+teacherno+"' order by date desc,starttime";
	return DB.db.getResult(sql);
}

public void updateOrder(String teacherno, String sno, String starttime, String endtime, int state) {
	String sql="update orderr set sno='"+sno+"',state="+state+" where teacherno='"+teacherno+"' and starttime='"+
      starttime+"' and endtime='"+endtime+"'";
	DB.db.getResult(sql);
}

public void addOrder(String teacherno, String starttime, String endtime, int i) {
	if(!isExits(teacherno, starttime, endtime,i)){
		String sql="insert into orderr(teacherno,starttime,endtime,state,date)"+
	" values('"+teacherno+"','"+starttime+"','"+endtime+"',"+i+",'"+starttime.split(" ")[0].trim()+"')";
		DB.db.getResult(sql);
	}
	
}

private boolean isExits(String teacherno, String starttime, String endtime, int i) {
	String sql="select * from orderr where teacherno='"+teacherno+"' and starttime='"+
starttime+"' and endtime='"+endtime+"' and state="+i;
	if(DB.db.getResult(sql).size()>0)return true;
	return false;
}

}
