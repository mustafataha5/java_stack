package com.mydomain.JspTest2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

		@RequestMapping("/")
		public String index(Model model) {
			String name = "Taha" ;
			String laString = "Mustafa" ; 
			String age = ""+20 ; 
			model.addAttribute("name", name);
			model.addAttribute("last",laString);
			model.addAttribute("age",age);
			return "index.jsp";
		}
}
