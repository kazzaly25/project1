package com.example.student;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int rollno;
	private String name;
	private int phoneno;
	
	public Student() {}
	
	public Student(String name, int phoneno) {
		this.setName(name);
		this.setPhoneno(phoneno);
	}
	
	public Student(int rollno, String name,int phoneno) {
		this.setRollno(rollno);
		this.setName(name);
		this.setPhoneno(phoneno);
	}
	
	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(int phoneno) {
		this.phoneno = phoneno;
	}
	
	@Override
	public String toString() {
		System.out.println("Student{" + "rollno=" + rollno +",name='"+ name +"'" +", phoneno='"+ phoneno + "'"+'}');
		return "Student{" + "rollno=" + rollno +",name='"+ name +"'" +", phoneno='"+ phoneno + "'"+'}';
	}
		
}


