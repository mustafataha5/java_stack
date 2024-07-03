package com.mydomain.bookclub.ProductandCategories.controllers;

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
public class ProductController {
	@Autowired
	ProductSerivce productSerivce;
	@Autowired
	CategoryService categoryService ;
	@GetMapping("/products/new")
	public String showNewProduct(@ModelAttribute("newProduct")Product product){
		return "product/new_product.jsp";
	}
	
	@PostMapping("/products/new")
	public String newProduct(@Valid @ModelAttribute("newProduct")Product product,BindingResult result,RedirectAttributes redirectAttributes){
		if(result.hasErrors()) {
			return "product/new_product.jsp";
		}
		productSerivce.createProduct(product);
		redirectAttributes.addFlashAttribute("success","Successfully added new product");	
		return "redirect:/";
	}
		
	
	@GetMapping("/products/{id}")
	public String showCategory(@PathVariable("id")Long id , Model model) {
		
		Product product = productSerivce.findProduct(id) ;
		System.out.println(categoryService.excludeCategories(product));
		model.addAttribute("ex_categories",categoryService.excludeCategories(product));
		model.addAttribute("product",product);
		return "product/show_product.jsp";
	}
	@PostMapping("/products/{id}")
	public String showCategory(@PathVariable("id")Long id,@RequestParam("addCategory")Long idCategory,RedirectAttributes redirectAttributes ) {
		
		if(idCategory!=0){
			Category category = categoryService.findCategory(idCategory);
			Product product = productSerivce.findProduct(id);
			product.getCategories().add(category);
			productSerivce.updateProduct(product);
		}
		else {
			redirectAttributes.addFlashAttribute("NotSelect","No items selected");
		}
		
		
		return "redirect:/products/"+id;
	}
	
	
	

}
