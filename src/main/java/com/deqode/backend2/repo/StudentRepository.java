package com.deqode.backend2.repo;
import com.deqode.backend2.*;
import com.deqode.backend2.model.Student;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface StudentRepository extends	 MongoRepository<Student,Integer> {

	
}
