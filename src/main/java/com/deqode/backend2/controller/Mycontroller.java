package com.deqode.backend2.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deqode.backend2.model.Student;
import com.deqode.backend2.service.StudentService;

@RestController
@RequestMapping("/Student")
public class Mycontroller {

	
	
	@Autowired
	private StudentService service;
	
	
	
	@PostMapping("/save")
	public String saveStudent(@RequestBody Student student)	{
		return service.saveStudent(student);
	}
	
	
	
	@GetMapping("/get")
	public List<Student> getStudent(){
		return service.getStudent();
	}
	
	
	@GetMapping("/getbyid/{id}")
	public Optional<Student> getStudentById(@PathVariable int id){
		return service.getStudentById(id);
	}
	
	
	@DeleteMapping("/delete/{id}")
	
		public List<Student> deletebyId(@PathVariable int id){
			return service.deleteById(id);
		}
	
	
}
