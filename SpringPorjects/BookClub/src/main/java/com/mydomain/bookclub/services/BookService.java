package com.mydomain.bookclub.services;

import java.util.List;
import java.util.Optional;

import org.apache.tomcat.util.openssl.openssl_h;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mydomain.bookclub.models.Book;
import com.mydomain.bookclub.repositories.BookRepository;

@Service
public class BookService {
	@Autowired
	BookRepository bookRepository ;

	public List<Book> AllBooks(){
		return bookRepository.findAll();
	} 

	public  Book createBook(Book b) {
		return bookRepository.save(b);
	}
	
	public Book findBook(Long id) {
		Optional<Book> optional = bookRepository.findById(id);
		if(optional.isPresent()) {
			return optional.get();
		}
		return null ;
	}
	
	public void deleteBook(Long id) {
		bookRepository.deleteById(id);
	}
	
	public Book updateBook(Book b) {
		Optional<Book> optional = bookRepository.findById(b.getId());
		if(optional.isPresent()) {
			return bookRepository.save(b);
		}
		return null ;
		
		
	}
}

