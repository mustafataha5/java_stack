package com.mydomain.DisplayDate;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.eclipse.tags.shaded.org.apache.bcel.generic.NEW;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomeController {
	@RequestMapping("")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/date")
	public String showDate(Model model) {
		SimpleDateFormat  dateFormat = new SimpleDateFormat("EEE, MMM d, ''yy"); 
		String  mydate ="" +  dateFormat.format(  new Date()) ;
		model.addAttribute("date",mydate);
		return "date_template.jsp";
	}
	
	
	@RequestMapping("/time")
	public String showTime(Model model) {
		SimpleDateFormat  dateFormat = new SimpleDateFormat("h:mm a"); 
		String  mytime ="" +  dateFormat.format(  new Date()) ;
		model.addAttribute("time",mytime);
		return "time_template.jsp";
	}
	
	
}
