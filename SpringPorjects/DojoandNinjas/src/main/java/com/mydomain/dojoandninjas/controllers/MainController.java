package com.mydomain.dojoandninjas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mydomain.dojoandninjas.services.DojoSerivce;

@Controller
public class MainController {
	@Autowired
	DojoSerivce dojoSerivce ;
	@RequestMapping("/")
	public String index(Model model){
		model.addAttribute("dojos",dojoSerivce.allDojos() );
		return "index.jsp";
	}
}
