package com.mydomain.mvc1.services;

import java.util.List;
import java.util.Optional;

import javax.swing.border.TitledBorder;

import org.springframework.stereotype.Service;

import com.mydomain.mvc1.models.Book;
import com.mydomain.mvc1.repositories.BookRepository;

@Service
public class BookService {
	
	  // adding the book repository as a dependency
    private final BookRepository bookRepository;
    
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    // returns all the books
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }
    // creates a book
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }
    // retrieves a book
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
     
    }
    public Book updateBook(Long id, String title,String descString ,Integer pages , String lang ) {
       Optional<Book> mybookOptional = bookRepository.findById(id);
       if(mybookOptional.isPresent()) {
    	   Book b = mybookOptional.get();
    	   b.setId(id);
    	   b.setTitle(title);
    	   b.setDescription(descString);
    	   b.setNumberOfPages(pages);
    	   b.setLanguage(lang);
    	return bookRepository.save(b);}
       return null ; 
    }
    public Book updateBook(Book book ) {
        Optional<Book> mybookOptional = bookRepository.findById(book.getId());
        if(mybookOptional.isPresent()) {
     	   Book b = mybookOptional.get();
     	   b.setTitle(book.getTitle());
     	   b.setDescription(book.getDescription());
     	   b.setNumberOfPages(book.getNumberOfPages());
     	   b.setLanguage(book.getLanguage());
     	return bookRepository.save(b);}
        return null ;
     }
    public void deleteBook(Long id) {
    	this.bookRepository.deleteById(id);
		
	}
}
