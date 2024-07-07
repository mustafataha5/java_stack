package com.mydomain.bookclub.controllers;

import java.util.function.LongFunction;

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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mydomain.bookclub.models.Book;
import com.mydomain.bookclub.models.User;
import com.mydomain.bookclub.services.BookService;
import com.mydomain.bookclub.services.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Positive;
@Controller
public class BookController {
	@Autowired
	BookService bookService ;
	@Autowired
	UserService userService ;
	
	@GetMapping("/books")
	public String index(Model model, HttpSession session,RedirectAttributes redirectAttributes) {
		if(session.getAttribute("userId") ==null) {
			redirectAttributes.addFlashAttribute("mustlogin", "Error:please login or registraion");
			return "redirect:/";
		}
		User user = userService.findUser( (Long) session.getAttribute("userId"));
		model.addAttribute("user",  user);
		model.addAttribute("books",bookService.allBooksNotIn(user.getId()));
		model.addAttribute("borrowBooks",user.getBorrowBooks());
		return "home_page.jsp";
	}
	@GetMapping("/books/new")
	public String showNewBook(@ModelAttribute("newBook")Book newBook , HttpSession session,RedirectAttributes redirectAttributes){
		if(session.getAttribute("userId") ==null) {
			redirectAttributes.addFlashAttribute("mustlogin", "Error:please login or registraion");
			return "redirect:/";
		}
		
		return "book/new_page.jsp";
	}
	
	@PostMapping("/books/new")
	
	public String addNewBook( @Valid @ModelAttribute("newBook")Book newBook, BindingResult result ,Model model , HttpSession session,RedirectAttributes redirectAttributes){
		if(session.getAttribute("userId") ==null) {
			redirectAttributes.addFlashAttribute("mustlogin", "Error:please login or registraion");
			return "redirect:/";
		}
		User user = userService.findUser((Long)session.getAttribute("userId"));
		if(result.hasErrors()) {
			model.addAttribute("user",user);
			return "book/new_page.jsp";
		}
		
		newBook.setUser(user);
		bookService.createBook(newBook);
		return "redirect:/books";
	}
	
	@GetMapping("/books/{id}")
	public String showBook(@PathVariable("id")Long Id ,Model model ,HttpSession session,RedirectAttributes redirectAttributes) {
		if(session.getAttribute("userId") ==null) {
			redirectAttributes.addFlashAttribute("mustlogin", "Error:please login or registraion");
			return "redirect:/";
		}
		model.addAttribute("book",bookService.findBook(Id));
		return "book/show_book.jsp" ;
	}
	
	@GetMapping("/books/{id}/edit")
	public String editBook(@PathVariable("id")Long Id ,Model model ,HttpSession session,RedirectAttributes redirectAttributes) {
		if(session.getAttribute("userId") ==null) {
			redirectAttributes.addFlashAttribute("mustlogin", "Error:please login or registraion");
			return "redirect:/";
		}
		
		model.addAttribute("editBook",bookService.findBook(Id));
		return "book/edit_book.jsp" ;
	}
	@PostMapping("/books/{id}/borrow")
	public String borrowBook(@PathVariable("id")Long Id,HttpSession session,RedirectAttributes redirectAttributes){
		if(session.getAttribute("userId") ==null) {
			redirectAttributes.addFlashAttribute("mustlogin", "Error:please login or registraion");
			return "redirect:/books";
		}
		User user = userService.findUser((long) session.getAttribute("userId"));
		Book book = bookService.findBook(Id);
		book.setBorrower(user);
		bookService.updateBook(book);
		redirectAttributes.addFlashAttribute("success", "Successfully borrow book");
		return "redirect:/books";
	}
	@DeleteMapping("/books/{id}/borrow")
	public String delBorrowBook(@PathVariable("id")Long Id,HttpSession session,RedirectAttributes redirectAttributes){
		if(session.getAttribute("userId") ==null) {
			redirectAttributes.addFlashAttribute("mustlogin", "Error:please login or registraion");
			return "redirect:/";
		}
		Book book = bookService.findBook(Id);
		book.setBorrower(null);
		bookService.updateBook(book);
		redirectAttributes.addFlashAttribute("success", "Successfully: return book ");
		return "redirect:/";
	}
	
	@PutMapping("/books/{id}/edit")
	public String editBook(@PathVariable("id")Long Id,@Valid @ModelAttribute("editBook")Book book ,BindingResult result ,Model model ,HttpSession session,RedirectAttributes redirectAttributes) {
		if(session.getAttribute("userId") ==null) {
			redirectAttributes.addFlashAttribute("mustlogin", "Error:please login or registraion");
			return "redirect:/";
		}
		if(result.hasErrors()) {
			return "book/edit_book.jsp" ;
		}
		model.addAttribute("editBook",bookService.updateBook(book));
		return "redirect:/books/"+Id ;
	}
	@DeleteMapping("/books/{id}/delete")
	public String deleteBook(@PathVariable("id")Long Id ,HttpSession session,RedirectAttributes redirectAttributes) {
		if(session.getAttribute("userId") ==null) {
			redirectAttributes.addFlashAttribute("mustlogin", "Error:please login or registraion");
			return "redirect:/";
		}
		bookService.deleteBook(Id);
		return "redirect:/books" ;
	}
}
