package com.mydomain.SaveTravels.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.service.annotation.GetExchange;

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
	
	@RequestMapping("/expense/{id}")
	public  String index(@ModelAttribute("id")Long id,Model model) {
		model.addAttribute("expense", expenseService.findExpense(id));
		return "show_expense.jsp";
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
	
	@GetMapping("/expense/edit/{id}")
	public String editExpense(@PathVariable("id")Long id,Model model){
		Expense expense = expenseService.findExpense(id);
		model.addAttribute("updateExpense", expense);
		return "edit_expense.jsp";
	}
	@PutMapping(value="/expense/edit/{id}")
	public String updateExpense(  @Valid @ModelAttribute("updateExpense")Expense expense ,BindingResult result, Model model) {
		
		if(result.hasErrors()) {
			model.addAttribute("updateExpense",expense);
			return "edit_expense.jsp";
		}
		
		expenseService.updateExpense(expense);
		return "redirect:/expense";
	}
	
	@DeleteMapping("/expense/delete/{id}")
	public String deleteExpense(@PathVariable("id") Long id) {
		expenseService.deleteExpense(id); 
		return "redirect:/expense";
	}
}
