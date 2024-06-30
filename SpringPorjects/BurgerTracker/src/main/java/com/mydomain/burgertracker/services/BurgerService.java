package com.mydomain.burgertracker.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mydomain.burgertracker.models.Burger;
import com.mydomain.burgertracker.repositories.BurgerRepository;
@Service
public class BurgerService {
	@Autowired
	BurgerRepository burgerRepository ;
	 
	

	public List<Burger> allBurgers(){
		return burgerRepository.findAll();
	}
	public Burger createBurger(Burger b) {
		return burgerRepository.save(b); 
	}
	
	public  Burger findBurger(Long id) {
		Optional<Burger> optional = this.burgerRepository.findById(id);
		if(optional.isPresent()) {
			return optional.get();
		}
		return null ; 
	}
	
	public  Burger update(Burger b) {
		Optional<Burger> optional = burgerRepository.findById(b.getId());
		if(optional.isPresent()) {
			return  burgerRepository.save(b);
		}
		return null ; 
	}
	
	
}
