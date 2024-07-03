package com.mydomain.bookclub.ProductandCategories.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import com.mydomain.bookclub.ProductandCategories.services.CategoryService;
import com.mydomain.bookclub.ProductandCategories.services.ProductSerivce;


@Controller
public class MainController {
	@Autowired
	CategoryService categoryService;
	@Autowired
	ProductSerivce productSerivce ;
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("categories",categoryService.allCategories());
		model.addAttribute("products", productSerivce.allProducts());
		return "index.jsp";
	}
	

}
