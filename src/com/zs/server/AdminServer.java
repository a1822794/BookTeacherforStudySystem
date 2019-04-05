package com.zs.server;

import java.util.List;

import com.zs.dao.AdminDao;
import com.zs.dao.OrderDao;
import com.zs.module.Admin;
import com.zs.module.Teacher;

public class AdminServer {
	public static AdminServer adminserver=new AdminServer();
	public boolean login(String adminname,String password){
		return AdminDao.admindao.selectadmin(adminname,password);
	}
	public boolean addOrderDay(String date) {
		List<Teacher> teacherList=TeacherServer.teacherserver.getallteacher();
		int[] hlist={8,9,10,11,14,15,16,17,19,20,21};
		String[] mlist={"00","30"};
		String starttime=null;
		String endtime=null;
		for(Teacher teacher : teacherList)
		{
			for(int h :hlist){
				for(int m=0;m<2;m++)
				{
					starttime=date+" "+h+":"+ mlist[m];
					if(m==1)endtime=date+" "+(h+1)+":"+ mlist[(m+1)%2];
					if(m==0)endtime=date+" "+(h)+":"+ mlist[(m+1)%2];
					 OrderDao.orderdao.addOrder(teacher.getTeacherno(),starttime,endtime,0);

				}
			}
		}
		return true;
	}
}
