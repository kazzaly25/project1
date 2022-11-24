package com.example.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
@RestController
public class StudentsController {
	@GetMapping("/")
	public ModelAndView login()
	{
		return (new ModelAndView("login.html"));
	}
	@GetMapping("/login")
	public ModelAndView register()
	{
		return (new ModelAndView("register.html"));
	}

}
