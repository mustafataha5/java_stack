package com.mydomain.SaveTravels.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mydomain.SaveTravels.models.Expense;
import com.mydomain.SaveTravels.repositories.ExpenseRepository;

@Service
public class ExpenseService {
	@Autowired
	ExpenseRepository expenseRepository ;
	
	public List<Expense> AllExpense(){
		return expenseRepository.findAll() ; 
	} 
	
	public Expense createExpense(Expense e) {
		return expenseRepository.save(e);
	}
	
	
	public Expense findExpense(Long id) {
		Optional<Expense> exOptional = expenseRepository.findById(id);
		if(exOptional.isPresent()) {
			return exOptional.get() ;
		}
		return null ;
	}
	
}
