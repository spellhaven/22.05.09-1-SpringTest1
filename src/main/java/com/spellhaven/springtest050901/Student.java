package com.spellhaven.springtest050901;

public class Student {
	
	private String name; // 멤버변수(속성, 필드)
	private int age;
	private int gradeNum;
	
	private Study study; // 멤버객체(속성, 필드)
	private Play play;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getGradeNum() {
		return gradeNum;
	}
	public void setGradeNum(int gradeNum) {
		this.gradeNum = gradeNum;
	}

	
	
	
}
