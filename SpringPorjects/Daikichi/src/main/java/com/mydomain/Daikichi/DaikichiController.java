package com.mydomain.Daikichi;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@RequestMapping("today")
	public String index2() {
		return "Today you will find luck in all your endeavors!!";
	}
	
	@RequestMapping("tomorrow")
	public String index3() {
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	}

	@RequestMapping("travel/{city}")
	public String travel(@PathVariable("city") String city) {
					return "Congratulations! You will soon travel to "+city+" !";
	}
	
	@RequestMapping(value="/lotto/{number}", method=RequestMethod.GET)
	public String  lottoNum(@PathVariable("number") int number) {
			if (number% 2 == 0) {
				return "You will take a grand journey in the near future, but be weary of tempting offers" ;
			}
		return  "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends";
	}
	
}




