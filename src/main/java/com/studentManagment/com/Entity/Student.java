package com.studentManagment.com.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Student")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Id;
	
	@Column(nullable = false)
	private String Name;
	
	@Column(nullable = false)
	private String Department;
	
	@Column(nullable = false, unique = true)
	private String EmailId;
	
	@Column(nullable = false)
	private int Age;
	
	@Column(nullable = false)
	private String Course;
	
	
	
	public Student(int id, String name, String department, String emailId, int age, String course) {
		super();
		Id = id;
		Name = name;
		Department = department;
		EmailId = emailId;
		Age = age;
		Course = course;
	}



	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}

	public String getEmailId() {
		return EmailId;
	}

	public void setEmailId(String emailId) {
		EmailId = emailId;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public String getCourse() {
		return Course;
	}

	public void setCourse(String course) {
		Course = course;
	}



	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}



	@Override
	public String toString() {
		return "Student [Id=" + Id + ", Name=" + Name + ", Department=" + Department + ", EmailId=" + EmailId + ", Age="
				+ Age + ", Course=" + Course + "]";
	}
	
	
	
	
}
