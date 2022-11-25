package com.example.student;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class StudentsController {
	@Autowired
	StudentsRepository studentsRepository;
	@GetMapping("/")
	public ModelAndView login()
	{
		return (new ModelAndView("login.html"));
	}
	@PostMapping("/login")
	public ModelAndView register(WebRequest request)
	{
		String user=request.getParameter("user");
		String pass=request.getParameter("pass");
		if (user.equals(pass)) {
		return (new ModelAndView("register.html"));
	}
		else {
			return(new ModelAndView("login.html"));
		}
	}

	@PostMapping("/students/save")
	 
	public Students create(WebRequest request) {
		
		String rollno=request.getParameter("rollno");
		String name=request.getParameter("name");
		String phoneno=request.getParameter("phoneno");
		int rollno2=Integer.parseInt(rollno);
		int phoneno1=Integer.parseInt(phoneno);
		return studentsRepository.save(new Students(rollno2,name,phoneno1));
}
}
	/*@PostMapping("/students/edit")
	 
	//public Students edit(WebRequest request) {
		
		String rollno=request.getParameter("rollno");
		String name=request.getParameter("name");
		String phoneno=request.getParameter("phoneno");
		int rollno2=Integer.parseInt(rollno);
		int phoneno1=Integer.parseInt(phoneno);
		//return studentsRepository.(new Students(rollno2,name,phoneno1));
}
	//@PostMapping("/students/delete")
	 
	//public Students delete(WebRequest request) {
		
		
}	
}*/
