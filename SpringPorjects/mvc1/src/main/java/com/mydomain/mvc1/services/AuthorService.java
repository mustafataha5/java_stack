package com.mydomain.mvc1.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mydomain.mvc1.models.Author;
import com.mydomain.mvc1.repositories.AuthorRepository;

@Service
public class AuthorService {
	@Autowired
    AuthorRepository authorRepository ;
	
	public List<Author> allAuthors(){
		return this.authorRepository.findAll();
	}
	
	public List<Author> findAuthorsbyFirstname(String sreach){
		return authorRepository.findByFirstName(sreach);
	}
	public List<Author> findAuthorsbyLastname(String sreach){
		return authorRepository.findByLastName(sreach);
	}
	
	public void deleteAuthorById(Long id) {
		authorRepository.deleteById(id);
	}
	
	public  Author findAuthor(Long id) {
		Optional<Author> authorOptional = authorRepository.findById(id);
		if(authorOptional.isPresent()) {
			return authorOptional.get();
		}
		
		return null ;
		
	}
	public Author createAuthor(Author a) {
        return authorRepository.save(a);
    }
	public Author updateAuthor(Author a) {
        return authorRepository.save(a);
    }
}
