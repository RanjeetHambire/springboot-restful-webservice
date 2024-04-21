package com.studentManagment.com.ServiceImplimentation;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.studentManagment.com.Entity.Student;
import com.studentManagment.com.Repository.Studentrepository;
import com.studentManagment.com.Service.StudentService;

@Service
public class StudentServiceImply implements StudentService{

	private Studentrepository studentRepository;
	
	
	@Override
	public Student createStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student getStudentById(Integer studentId) {
		Optional<Student> optionalStudent = studentRepository.findById(studentId);
		return optionalStudent.get();
	}

	@Override
	public Student updateStudent(Student student) {
		Student existingStudent = studentRepository.findById(student.getId()).get();
		existingStudent.setName(student.getName());
		existingStudent.setDepartment(student.getDepartment());
		existingStudent.setEmailId(student.getEmailId());
		Student updatedStudent = studentRepository.save(existingStudent);
		return updatedStudent;
		
	}

	@Override
	public List<Student> getAllStudent() {
		return studentRepository.findAll();
	}

	@Override
	public void deleteStudent(Integer studentId) {
		studentRepository.deleteById(studentId);
		
	}

}

