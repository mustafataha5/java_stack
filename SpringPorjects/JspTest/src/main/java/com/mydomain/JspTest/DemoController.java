package com.mydomain.JspTest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {

	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("fruit", "Apple") ; 
		return "demo.jsp" ;
	}
	
	
	
}
