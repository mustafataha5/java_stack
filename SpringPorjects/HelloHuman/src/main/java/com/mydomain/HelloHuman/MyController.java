package com.mydomain.HelloHuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MyController {

	@RequestMapping("")
	public String index(@RequestParam(value="name",required=false) String firstname
												, @RequestParam(value="last_name",required=false)   String lastname
												, @RequestParam(value="time",required=false)   String  time  ) {
		String str = "" ;
		if(firstname==null) {
			str = "Hello Human" ; 
		}
		else if (lastname == null ) {
			str = "Hello "+firstname ;
		}
		else {
			str = "Hello "+firstname+" "+lastname;
		}
		if (time != null ) {
			try {
				int i = Integer.parseInt(time);
				String str2 =str ; 
				for(int j = 0 ; j<i ; j++) {
					str += " "+str2;  }

			}
			catch (Exception e) {
				// TODO: handle exception
				System.out.println(" Time must be integer data type");
			}
			return str ; 
		}
		return str ; 
	}
	
}
