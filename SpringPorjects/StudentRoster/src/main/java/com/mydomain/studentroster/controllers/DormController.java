package com.mydomain.studentroster.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DormController {
	
	
	@RequestMapping("/dorms/new")
	public String index(){
		return "dorm/add_dorm.jsp";
	}
}
