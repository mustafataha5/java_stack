package com.mydomain.NinjaGold;

import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import org.eclipse.tags.shaded.org.apache.bcel.generic.NEW;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;
import jakarta.websocket.Session;


@Controller
public class MainController {
	@RequestMapping("/")
	public String index(HttpSession session) {
		
		if(session.getAttribute("goldCount") == null) {
			session.setAttribute("goldCount",0);
			session.setAttribute("goldLog",   new ArrayList<String>());
		}
		return "index.jsp";
	}
	@PostMapping("/getRandom")
	public String getRandom(@RequestParam(value="goldFrom") String goldFrom,
							HttpSession session){
		int rand = 0;
		int temp ,max,min; 
		String str ; 
		temp =(int) session.getAttribute("goldCount") ;
		ArrayList<String> myArrayList = ((ArrayList<String>)session.getAttribute("goldLog"));
		
		//System.out.println(goldFrom+"  before >>>"+temp);
		if(goldFrom.equals("farm")) {
			max = 20 ;
			min = 10;
			//System.out.println(rand.nextInt(max - min + 1)+ min);
			rand =(int)ThreadLocalRandom.current().nextInt(min, max+1);
		}
		else if(goldFrom.equals("cave")) {
			max = 10 ;
			min = 5;
			rand=(int)ThreadLocalRandom.current().nextInt(min, max+1);

		}
		else if(goldFrom.equals("house")) {
			max = 5 ;
			min = 2;
			rand=(int)ThreadLocalRandom.current().nextInt(min, max+1);
		}
		else if(goldFrom.equals("quest")) {
			max = 100 ;
			min = -50;
			rand =(int)ThreadLocalRandom.current().nextInt(0, max+1)+min;
		}
		else if(goldFrom.equals("spa")) {
			max = 20 ;
			min = 5;
			rand =(int)ThreadLocalRandom.current().nextInt(min, max+1) *-1;
		}
		
		if(rand >= 0) {
			str = "You entered a "+goldFrom+" and earned "+rand+" gold." ; 
		}
		else {
			str = "You failed a "+goldFrom +" and lost "+rand+" gold.Ouch." ; 
		}
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMMMM dd YYYY hh:mm a");
		str += "   ("+  simpleDateFormat.format(new Date())+" )";
		session.setAttribute("goldCount", temp+rand);
		myArrayList.add(0, str);
		session.setAttribute("goldLog", myArrayList);
		//str.contains(str)
		//System.out.println(goldFrom+">>>>>"+myArrayList);
		if(temp+rand <-100 ) {
			return "redirect:/failed";
		}
		return "redirect:/";
	}
	
	@RequestMapping("/Reset")
	public String setReset(HttpSession session){
		session.removeAttribute("goldCount");
		session.removeAttribute("goldLog");
		return "redirect:/";	
	}
	@RequestMapping("/failed")
	public String showFailed() {
		
		return "failed_template.jsp" ; 
	}
}
