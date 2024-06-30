package com.mydomain.mvc1.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.mydomain.mvc1.models.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

	List<Author> findAll();
	List<Author> findByFirstName(String firstName);
	List<Author> findByLastName(String lastName);
	
	void deleteById(Long Id); 
	
	
	
	
	
}
