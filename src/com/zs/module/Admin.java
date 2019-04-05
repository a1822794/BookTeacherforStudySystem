package com.zs.module;

public class Admin {
private String adminname;
private String password;
public String getAdminname() {
	return adminname;
}
public void setAdminname(String adminname) {
	this.adminname = adminname;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public Admin(String adminname, String password) {
	super();
	this.adminname = adminname;
	this.password = password;
}

}
