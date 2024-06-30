package com.mydomain.burgertracker.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mydomain.burgertracker.models.Burger;
import com.mydomain.burgertracker.services.BurgerService;

import jakarta.validation.Valid;
@Controller
public class RenderContoller {
	
	@Autowired
	BurgerService burgerService ; 
	
	@RequestMapping("/")
	public String index( Model model) {
		List<Burger> burgers = burgerService.allBurgers();
		model.addAttribute("burgers", burgers);
		Burger burger = new Burger();
		model.addAttribute("burger",burger);
		return "index.jsp" ; 
	}
	
	@PostMapping("/burger")
	public String createBurger(@Valid @ModelAttribute("burger") Burger burger,BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return "index.jsp" ; 
		}
		else {
			System.out.println(burger.getRestaurantName());
			burgerService.createBurger(burger);
			return "redirect:/";
		}
		
	}
}
