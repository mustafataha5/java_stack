package com.mydomain.authentication.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mydomain.authentication.models.LoginUser;
import com.mydomain.authentication.models.User;
import com.mydomain.authentication.services.UserSerivce;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class MainController {
	@Autowired
	UserSerivce userSerivce ; 
	
	@RequestMapping("/")
	public String index() {
		return "redirect:/login";
	}
	
	@RequestMapping("/login")
	public String login(Model model) {
		model.addAttribute("newUser", new User());
        model.addAttribute("newLogin", new LoginUser());
		return "login.jsp";
	}
	
	@PostMapping("/register")
	public String register(@Valid @ModelAttribute("newUser") User user ,BindingResult result,Model model,HttpSession session) {
		if(result.hasErrors()) {
			model.addAttribute("newLogin", new LoginUser());
			return "login.jsp" ; 
		}
		
		return "dashboard.jsp";
	}
	
	@PostMapping("/login")
	public String login(@Valid @ModelAttribute("newLogin") LoginUser loginUser , BindingResult result ,Model model,HttpSession session) {
		if(result.hasErrors()) {
			model.addAttribute("newUser", new User());
			return "login.jsp" ; 
		}
		
		return "dashboard.jsp";
	}
}
