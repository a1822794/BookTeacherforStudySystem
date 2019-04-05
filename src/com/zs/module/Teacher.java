package com.zs.module;

public class Teacher {
private String teacherno;
private String teachername;
private String depart;
private String title;
private String officeLocl;
public Teacher(String teacherno, String teachername, String depart, String title, String officeLocl,
		String researchDirection) {
	super();
	this.teacherno = teacherno;
	this.teachername = teachername;
	this.depart = depart;
	this.title = title;
	this.officeLocl = officeLocl;
	this.researchDirection = researchDirection;
}
public String getTeacherno() {
	return teacherno;
}
public void setTeacherno(String teacherno) {
	this.teacherno = teacherno;
}
public String getTeachername() {
	return teachername;
}
public void setTeachername(String teachername) {
	this.teachername = teachername;
}
public String getDepart() {
	return depart;
}
public void setDepart(String depart) {
	this.depart = depart;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getOfficeLocl() {
	return officeLocl;
}
public void setOfficeLocl(String officeLocl) {
	this.officeLocl = officeLocl;
}
public String getResearchDirection() {
	return researchDirection;
}
public void setResearchDirection(String researchDirection) {
	this.researchDirection = researchDirection;
}
private String researchDirection;
}
