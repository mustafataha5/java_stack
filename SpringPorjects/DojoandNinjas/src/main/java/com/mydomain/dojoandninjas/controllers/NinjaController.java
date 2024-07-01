package com.mydomain.dojoandninjas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mydomain.dojoandninjas.models.Ninja;
import com.mydomain.dojoandninjas.services.DojoSerivce;
import com.mydomain.dojoandninjas.services.NinjaService;

import jakarta.validation.Valid;

@Controller
public class NinjaController {
	@Autowired
	NinjaService ninjaService;
	@Autowired
	DojoSerivce dojoSerivce;

	@RequestMapping("/ninjas/new")
	public String index(@ModelAttribute("ninja") Ninja ninja, Model model) {
		model.addAttribute("dojos", dojoSerivce.allDojos());
		return "ninja/index.jsp";
	}

	@PostMapping("/ninjas/new")
	public String createNew(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result, Model model) {
		if (result.hasErrors()) {
			model.addAttribute("dojos", dojoSerivce.allDojos());
			return "ninja/index.jsp";
		}
		ninjaService.createNinja(ninja);
		return "redirect:/";
	}

}
