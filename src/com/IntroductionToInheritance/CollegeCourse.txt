package com.IntroductionToInheritance;

public class CollegeCourse{
	String dept;
	int dCode;
	int credits;
	double fees;
	public CollegeCourse(String dpt,int code,int crdt){
	dept=dpt;
	dCode=code;
	credits=crdt;
	fees=120;
	}
	public void display(){
	System.out.println("Department of "+dept+" with 
	"+credits+" credit unit+" pays $"+fees);
	}
}