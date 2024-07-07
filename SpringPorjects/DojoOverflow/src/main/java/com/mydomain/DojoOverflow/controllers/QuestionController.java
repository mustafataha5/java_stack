package com.mydomain.DojoOverflow.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.mydomain.DojoOverflow.models.Question;
import com.mydomain.DojoOverflow.serivces.QuestionSerivce;

@Controller
public class QuestionController {

	@Autowired
	QuestionSerivce questionSerivce ; 
	
	
	
}
