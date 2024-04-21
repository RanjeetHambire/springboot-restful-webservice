package com.studentManagment.com.Service;

import java.util.List;

import com.studentManagment.com.Entity.Student;

public interface StudentService {

	
	Student createStudent (Student student);
	
	Student getStudentById(Integer StudentId);
	
	Student updateStudent(Student student);
	
	List<Student> getAllStudent();
	
	void deleteStudent(Integer studentId);
}
