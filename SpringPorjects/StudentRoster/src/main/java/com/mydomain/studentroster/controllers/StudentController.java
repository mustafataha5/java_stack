package com.mydomain.studentroster.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

	
	@RequestMapping("/students/new")
	public String index() {
		return "student/add_student.jsp";
	}
}
