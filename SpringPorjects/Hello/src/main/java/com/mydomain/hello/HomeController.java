package com.mydomain.hello;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Mustafa")
public class HomeController {
	
	@RequestMapping("")
	public String  index() {
		return "<h1> Hello World</h1>" ; 
	}
	@RequestMapping("/Taha")
	public String helloTaha(@RequestParam(value="q",required =  false)String  sreachQuery) {
		if(sreachQuery == null) {
			return "You search for nothing";
		}
		return "<h2> The search Query is : "+sreachQuery+"</h2>" ;
	}
	@RequestMapping("/{name}/{id}")
	public String dispaly(@PathVariable("name") String name , @PathVariable("id") int id ) {
		return "<h2> Hello "+name+" , your ID :"+id+"</h2>";
	}

}
