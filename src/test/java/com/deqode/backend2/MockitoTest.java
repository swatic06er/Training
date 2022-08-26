package com.deqode.backend2;

import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import com.deqode.backend2.model.Student;
import com.deqode.backend2.repo.StudentRepository;
import com.deqode.backend2.service.StudentService;

@ExtendWith(MockitoExtension.class)
public class MockitoTest {

	
	@Mock private StudentRepository studentRepository;
	
	
	@InjectMocks
	private StudentService studentService;
	
	@BeforeEach
	public void init() {
		MockitoAnnotations.openMocks(this);
	}
	
	@BeforeEach
	void setup() {
		//this.itemService = new ItemService(this.itemRepository, this.customRepository);
	}
	
	@Test
	void BasicTest2() {
		
		//studentService.deleteById(0);
		
		
		List<Student> list=new ArrayList<>();
		list.add(new Student(1,"Ayushi","Bangalore","BU"));
		list.add(new Student(2,"Biya","Belgaum","KLE"));
		list.add(new Student(3,"Chaitra","Hubli","BVB"));
		list.add(new Student(4,"Diya","Dharwad","DIU"));
		list.add(new Student(5,"Erica","Goa","Gu"));


		when(studentRepository.findById(2)).thenReturn(Optional.of(new Student(2,"Biya","Belgaum","KLE")));
		when(studentRepository.findAll()).thenReturn(list);


		
		
	}
	
	
}
