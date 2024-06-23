package com.mydomain.Daikichi;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/daikichi")
public class DaikichiController {

	@RequestMapping("")
	public String index() {
		return "Welcome!";
	}
	
	@RequestMapping("/today")
	public String index2() {
		return "Today you will find luck in all your endeavors!!";
	}
	
	@RequestMapping("tomorrow")
	public String index3() {
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	}
	
}




