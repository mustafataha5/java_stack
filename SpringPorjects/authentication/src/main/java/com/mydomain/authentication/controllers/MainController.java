package com.mydomain.authentication.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mydomain.authentication.models.LoginUser;
import com.mydomain.authentication.models.User;
import com.mydomain.authentication.services.UserSerivce;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class MainController {
	@Autowired
	UserSerivce userSerivce;

	@RequestMapping("/")
	public String index(HttpSession session,Model model ,RedirectAttributes redirectAttributes) {
		if (session.getAttribute("userId")==null) {
			redirectAttributes.addFlashAttribute("error","need to make registration or login first");
			return "redirect:/login";
		}
		
		model.addAttribute("user", userSerivce.findUser((Long)session.getAttribute("userId")));
		return "main_page.jsp";
	}

	@RequestMapping("/login")
	public String login(Model model) {
		model.addAttribute("newUser", new User());
		model.addAttribute("newLogin", new LoginUser());
		return "login.jsp";
	}

	@PostMapping("/register")
	public String register(@Valid @ModelAttribute("newUser") User newuser, BindingResult result, Model model,
			HttpSession session) {
		User user = userSerivce.register(newuser, result);
		if (user == null) {
			model.addAttribute("newLogin", new LoginUser());
			return "login.jsp";
		}
		System.out.println(">>>>>>"+user.getId());
		session.setAttribute("userId", user.getId());
		return "redirect:/";
	}

	@PostMapping("/login")
	public String login(@Valid @ModelAttribute("newLogin") LoginUser loginUser, BindingResult result, Model model,HttpSession session) {
		System.out.println(">>>>>>"+loginUser.getEmail());
		User user = userSerivce.login(loginUser, result);
		if (user == null) {
			model.addAttribute("newUser", new User());
			return "login.jsp";
		}
		System.out.println(">>>>>>"+user.getId());
		session.setAttribute("userId", user.getId());
		return "redirect:/";
	}
	
	@DeleteMapping("/user/{id}")
	public String logout(@PathVariable("id") Long id , HttpSession session) {
		if(id == (Long)session.getAttribute("userId")) {
		session.removeAttribute("userId");
		}
		return "redirect:/login";
	}
}
