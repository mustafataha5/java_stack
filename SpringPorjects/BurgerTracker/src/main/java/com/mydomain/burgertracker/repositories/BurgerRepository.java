package com.mydomain.burgertracker.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mydomain.burgertracker.models.Burger;
@Repository
public interface BurgerRepository extends CrudRepository<Burger,Long> {
	
	
	List<Burger> findAll();
//	Optional<Burger> findById(Long id);
//			
//	List<Burger> findByRating(Integer rating);
//	
//	 void deleteById(Long id);
	
}
