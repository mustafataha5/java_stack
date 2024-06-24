package com.mydomain.Counter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class CounterController {

	
	@RequestMapping("/")
	public String index(HttpSession session) {
		if(session.getAttribute("counter") == null) {
				session.setAttribute("counter", 1) ;
		}
		else {
			int counter =(int)session.getAttribute("counter");
			counter++ ; 
			session.setAttribute("counter", counter) ;
		}
		return "index.jsp" ;
	}
	
	@RequestMapping("/Main2")
	public String index2(HttpSession session) {
		if(session.getAttribute("counter") == null) {
				session.setAttribute("counter", 2) ;
		}
		else {
			int counter =(int)session.getAttribute("counter");
			counter+=2 ; 
			session.setAttribute("counter", counter) ;
		}
		return "index2.jsp" ;
	}
	
	@RequestMapping("/counter")
	public String showCounter() {
		return "counter_template.jsp" ;
	}
	@RequestMapping("/reset")
	public String resetConter(HttpSession session) {
		session.removeAttribute("counter");
		return  "redirect:/counter" ;
	}
	
	
}
