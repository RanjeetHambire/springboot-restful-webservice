package com.studentManagment.com.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.studentManagment.com.Entity.Student;
import com.studentManagment.com.Service.StudentService;

@RestController
@RequestMapping("api/Students")
public class StudentController {

	private StudentService studentService;
	
	//Create Student RestApi
	
	public ResponseEntity<Student> createStudent(@RequestBody Student student){
		Student savedStudent = studentService.createStudent(student);
		return new ResponseEntity<>(savedStudent, HttpStatus.CREATED);
	}
	
	
	// 
}