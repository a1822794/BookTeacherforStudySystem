package com.zs.module;

public class Student {
	private String sno;
	private String sname;
	private String sex;
	private String grade;
	private String depart;
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getDepart() {
		return depart;
	}
	public void setDepart(String depart) {
		this.depart = depart;
	}
	public Student(String sno, String sname, String sex, String grade, String depart) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.sex = sex;
		this.grade = grade;
		this.depart = depart;
	}

}
