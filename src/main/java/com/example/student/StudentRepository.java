package com.example.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public class StudentRepository {
	@Repository
	public interface studentRepository extends JpaRepository<Student, Integer>   {
		
		//List<Control> findByUsernameContainingOrPasswordContaining(String text, String TextAgain);
		
	}
}
