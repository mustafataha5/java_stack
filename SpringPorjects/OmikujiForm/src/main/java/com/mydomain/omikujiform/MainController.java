package com.mydomain.omikujiform;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;
import jakarta.websocket.Session;

@Controller

public class MainController {
	
	@RequestMapping("/")
	public String main() {
		return "redirect:/omikuji" ;
	}
	@GetMapping("/omikuji")
	public String index() {
		return "index.jsp";
	}
	
	@GetMapping("/omikuji/show")
	public String show(HttpSession session) {
		if(session.getAttribute("person") != null ) {
		return "show.jsp";}
		return "redirect:/";
	}
	@PostMapping("/create")
	public String create(@RequestParam(value="pick_num") int pick_num,
						@RequestParam(value="city") String city ,
						@RequestParam(value="person") String person ,
						@RequestParam(value = "hobby") String hobby ,
						@RequestParam(value = "living")String living , 
						@RequestParam(value ="someone") String someone,
						HttpSession session) {
		session.setAttribute("pick_num", pick_num);
		session.setAttribute("city", city);
		session.setAttribute("someone", someone);
		session.setAttribute("hobby", hobby);
		session.setAttribute("living", living);
		session.setAttribute("person", person);
		return "redirect:/omikuji/show";
	}
	@GetMapping("/omikuji/reset")
	public String reset(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
}
