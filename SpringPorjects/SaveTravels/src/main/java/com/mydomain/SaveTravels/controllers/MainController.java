package com.mydomain.SaveTravels.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mydomain.SaveTravels.models.Expense;
import com.mydomain.SaveTravels.services.ExpenseService;

import jakarta.validation.Valid;

@Controller
public class MainController {
	@Autowired
	ExpenseService expenseService ;
	
	@RequestMapping("/expense")
	public  String index(Model model) {
		model.addAttribute("expenses", expenseService.AllExpense());
		model.addAttribute("newExpense",new Expense());
		return "index.jsp";
	}
	@PostMapping("/expense")
	public String addExpense(@Valid @ModelAttribute("newExpense")Expense expense ,BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("expenses", expenseService.AllExpense());
			return "index.jsp";
		}
		expenseService.createExpense(expense);
		return "redirect:/expense";
	}
	
	
}
