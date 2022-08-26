package com.deqode.backend2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deqode.backend2.model.Student;
import com.deqode.backend2.repo.StudentRepository;

@Service
public class StudentService {
	
	
	
@Autowired
private StudentRepository repo;


public String saveStudent(Student student) {
	repo.save(student);
	return "Student saved with:"+student.getId();
}

public List<Student> getStudent(){
	
	return repo.findAll();
	
}


public Optional<Student> getStudentById(int studentid){
	return repo.findById(studentid);
}

public List<Student>  deleteById(int studentid){
	 repo.deleteById(studentid);
	 System.out.println("Sucessfully deleted student with ID:"+studentid);
	 return repo.findAll();
	 
}

}
