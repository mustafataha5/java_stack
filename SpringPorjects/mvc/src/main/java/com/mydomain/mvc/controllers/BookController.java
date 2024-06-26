package com.mydomain.mvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.mydomain.mvc.model.Book;
import com.mydomain.mvc.services.BookService;

@Controller
public class BookController {

	@Autowired 
	BookService bookService ; 
	@GetMapping("/books/{id}")
	public String showBook(@PathVariable(value = "id") Long id
						 ,Model model ) {
		Book book = bookService.findBook(id) ; 
		model.addAttribute("book", book) ;
		return "show.jsp" ;
	}
}
