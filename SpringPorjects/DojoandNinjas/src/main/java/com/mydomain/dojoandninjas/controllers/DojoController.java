package com.mydomain.dojoandninjas.controllers;

import org.eclipse.tags.shaded.org.apache.bcel.generic.NEW;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.service.annotation.GetExchange;

import com.mydomain.dojoandninjas.models.Dojo;
import com.mydomain.dojoandninjas.services.DojoSerivce;

import jakarta.validation.Valid;
import jakarta.websocket.server.PathParam;

@Controller
public class DojoController {
	@Autowired
	DojoSerivce dojoSerivce;

	@RequestMapping("/dojos/new")
	public String index(Model model) {
		model.addAttribute("dojo", new Dojo());
		return "dojo/index.jsp";
	}

	@PostMapping("/dojos/new")
	public String createNew(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		if (result.hasErrors()) {
			return "dojo/index.jsp";
		}
		dojoSerivce.createDojo(dojo);
		return "redirect:/";
	}

	@RequestMapping("/dojos/{Id}")
	public String showDojo(@PathVariable("Id") Long id,Model model){
		model.addAttribute("dojo",dojoSerivce.findDojo(id));
		return "dojo/show_dojo.jsp";
	}
	
}
