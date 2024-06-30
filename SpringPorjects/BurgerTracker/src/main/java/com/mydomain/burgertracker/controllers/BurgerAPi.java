package com.mydomain.burgertracker.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mydomain.burgertracker.models.Burger;
import com.mydomain.burgertracker.services.BurgerService;

@RestController
public class BurgerAPi {
	@Autowired
	BurgerService burgerService ; 
	@RequestMapping("/api/Burgers")
	public List<Burger> getAll(){	
		return burgerService.allBurgers();
	}
	
	@RequestMapping("/api/Burgers/{id}")
	public Burger getBurgers(@PathVariable("id")Long  id){	
		return burgerService.findBurger(id);
	}

	@PostMapping("/api/Burgers")
	public Burger cretaBurger(@RequestParam("burgerName")String bString,
							@RequestParam("restaurantName") String rString,
							@RequestParam("rating") Integer rInteger,
							@RequestParam("note") String note) {
		Burger burger = new Burger(bString,rString,rInteger,note);
		return burgerService.createBurger(burger);
	}
	
	
	
	
	
	
	
	
	
	
}
