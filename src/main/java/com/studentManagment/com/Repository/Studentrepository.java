package com.studentManagment.com.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.studentManagment.com.Entity.Student;

@Repository
public interface Studentrepository extends JpaRepository<Student, Integer>{

}
