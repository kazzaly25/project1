package com.example.student;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public class StudentsRepository {
	@Repository
	public interface studentRepository extends JpaRepository<Students, Integer>   {
		
		List<Students> findByROllnoContainingOrNmaeContaining(int number, String Text);
		
	}

	


}
