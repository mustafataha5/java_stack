package com.mydomain.bookclub.ProductandCategories.controllers;

import java.util.function.LongFunction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mydomain.bookclub.ProductandCategories.models.Category;
import com.mydomain.bookclub.ProductandCategories.models.Product;
import com.mydomain.bookclub.ProductandCategories.services.CategoryService;
import com.mydomain.bookclub.ProductandCategories.services.ProductSerivce;

import jakarta.validation.Valid;

@Controller
public class CategoryController {
	@Autowired
	CategoryService categoryService ;
	@Autowired 
	ProductSerivce productSerivce ; 
	@GetMapping("/categories/new")
	public String showNewCategory(@ModelAttribute("newCategory")Category category){
		return "category/new_category.jsp";
	}
	@PostMapping("/categories/new")
	public String newCategory(@Valid @ModelAttribute("newCategory")Category category,BindingResult result,RedirectAttributes redirectAttributes){
		if(result.hasErrors()) {
			return "new_category.jsp";
		}
		categoryService.createCategory(category);
		redirectAttributes.addFlashAttribute("success","Successfully added new category");	
		return "redirect:/";
	}
	@GetMapping("/categories/{id}")
	public String showCategory(@PathVariable("id")Long id , Model model) {
		
		
		model.addAttribute("ex_products",categoryService.excluderProducts(id));
		model.addAttribute("category",categoryService.findCategory(id));
		return "category/show_category.jsp";
	}
	@PostMapping("/categories/{id}")
	public String showCategory(@PathVariable("id")Long id,@RequestParam("addProduct")Long idProduct,RedirectAttributes redirectAttributes ) {
		
		if(idProduct!=0){
			Category category = categoryService.findCategory(id);
			Product product = productSerivce.findProduct(idProduct);
			category.getProducts().add(product);
			categoryService.updaeCategory(category);
		}
		else {
			redirectAttributes.addFlashAttribute("NotSelect","No items selected");
		}
		
		
		return "redirect:/categories/"+id;
	}
	
}
