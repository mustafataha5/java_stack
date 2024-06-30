package com.mydomain.mvc1.controllers;

import java.util.List;

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

import com.mydomain.mvc1.models.Book;
import com.mydomain.mvc1.services.BookService;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class BookRender {
	@Autowired
	BookService bookService ;
	
	@RequestMapping("/")
	public String showMain(Model model ) {
		return "redirect:/books" ; 
	}
	
	@RequestMapping("/books")
	public String showBook(Model model ) {
		List<Book> b = bookService.allBooks();
		model.addAttribute("books", b);
		return "index.jsp" ; 
	}
	
	@GetMapping("/books/{id}")
	public String showBook(@PathVariable(value="id")Long id,Model model ) {
		Book b = bookService.findBook(id);
		model.addAttribute("book", b);
		return "show_book.jsp" ; 
	}
	
	@GetMapping("/books/new")
	public String showAddBook(@ModelAttribute("book") Book book ,BindingResult result) {
		return  "show_addBook.jsp";
	}
	
	@PostMapping("/books/new")
	public String addBook(@Valid @ModelAttribute("book") Book book,BindingResult result) {
		if(result.hasErrors()) {
			return  "show_addBook.jsp";//"redirect:/books/new";
		}
		bookService.createBook(book);
		return "redirect:/books";
	}
	
	 @DeleteMapping("/books/{id}")
	    public String destroy(@PathVariable("id") Long id) {
	        bookService.deleteBook(id);
	        return "redirect:/books";
	    }
	
	@GetMapping("/books/{id}/edit")
	public String showUpdate(@PathVariable(value="id") Long id,	Model model) {
		Book book = bookService.findBook(id);
		model.addAttribute("book",book);
		return "show_updateBook.jsp";
	}
	
	
	
	 @RequestMapping(value="/books/{id}", method=RequestMethod.PUT)
	    public String update(@Valid @ModelAttribute("book") Book book, BindingResult result, Model model) {
		 System.out.println("ddddddddddddddddd");
		 if (result.hasErrors()) {
	            model.addAttribute("book", book);
	            return "show_updateBook.jsp";
	        } else {
	            bookService.updateBook(book);
	            return "redirect:/books";
	        }
	    }
	
}
