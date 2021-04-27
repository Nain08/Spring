package com.Main.com.RestAPI;

public class Student {
	private final String rollno;
	private String name;
	public Student(String rollno, String name)
	{
		super();
		this.rollno = rollno;
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRollno() {
		return rollno;
	}
	
}
