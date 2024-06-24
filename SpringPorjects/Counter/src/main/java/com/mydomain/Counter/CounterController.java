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
	
	@RequestMapping("/counter")
	public String showCounter() {
		return "counter_template.jsp" ;
	}
}
