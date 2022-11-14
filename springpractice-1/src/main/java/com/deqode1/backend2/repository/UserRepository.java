package com.deqode1.backend2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deqode1.backend2.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer>{

	
	 User findByUserName(String username);

}
