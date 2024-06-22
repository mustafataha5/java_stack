package com.mydomain.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class HomeController2 {
	@RequestMapping("")
	public String test() {
		return "Show Testing ";
	}
	@RequestMapping(value="hello", method=RequestMethod.GET)
	public String test2() {
		return "Hello Testing ";
	}
}
