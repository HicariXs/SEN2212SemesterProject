package com.structures.school;

public class Student{

	public String name;
	private String surname;
	private int sid;
	private GPA gpa;

	public Student(){

	}

	public Student(String name,String surname,int sid,GPA gpa){
		this.name=name;
		this.surname=surname;
		this.sid=sid;
		this.gpa=gpa;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public GPA getGpa() {
		return gpa;
	}
	public void setGpa(GPA gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {

		return name+" "+surname+" "+sid+" "+gpa;
	}
}
