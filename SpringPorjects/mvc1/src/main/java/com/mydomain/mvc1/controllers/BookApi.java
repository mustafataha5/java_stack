package com.mydomain.mvc1.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mydomain.mvc1.models.Book;
import com.mydomain.mvc1.services.BookService;

@RestController
public class BookApi {
	private final BookService bookService;
    public BookApi(BookService bookService){
        this.bookService = bookService;
    }
    @RequestMapping("/api/books")
    public List<Book> index() {
        return bookService.allBooks();
    }
    
    @RequestMapping(value="/api/books", method=RequestMethod.POST)
    public Book create(@RequestParam(value="title") String title, @RequestParam(value="description") String desc, @RequestParam(value="language") String lang, @RequestParam(value="pages") Integer numOfPages) {
        Book book = new Book(title, desc, lang, numOfPages);
        return bookService.createBook(book);
    }
    
    @RequestMapping("/api/books/{id}")
    public Book show(@PathVariable("id") Long id) {
        Book book = bookService.findBook(id);
        return book;
    }
	
    @PutMapping("/api/books/{id}")
    public Book updateBook(@PathVariable(value="id")Long id,
    					@RequestParam(value="title") String title,
    					@RequestParam(value="description")String desc,
    					@RequestParam(value="pages")Integer pages,
    					@RequestParam(value="language")String lanaguage) {
    	
    	return bookService.updateBook(id,title,desc,pages,lanaguage);
    }
	@DeleteMapping("/api/books/{id}")
    public void destroyBook(@PathVariable(value="id")Long id) {
		this.bookService.deleteBook(id);
	}
}
