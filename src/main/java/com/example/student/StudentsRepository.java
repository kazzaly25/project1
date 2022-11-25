package com.example.student;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

	@Repository
	public interface StudentsRepository extends JpaRepository<Students, Integer>   {
		
		//List<Students> findByROllnoContainingOrNmaeContaining(int number, String Text);
		
	}

	



