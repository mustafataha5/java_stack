package com.mydomain.DojoOverflow.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mydomain.DojoOverflow.models.Question;
import com.mydomain.DojoOverflow.models.Tag;
import com.mydomain.DojoOverflow.serivces.QuestionSerivce;
import com.mydomain.DojoOverflow.serivces.TagSerivce;

import jakarta.validation.Valid;

@Controller
public class MainController {

	@Autowired
	QuestionSerivce questionSerivce;
	@Autowired
	TagSerivce tagSerivce ;
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("questions",questionSerivce.allQuestions());
		return "index.jsp";
	}

	@GetMapping("/questions/new")
	public String showNewQuestion(@ModelAttribute("newQuestion") Question newQuestion) {

		return "question/new_question.jsp";
	}

	@PostMapping("/questions/new")
	public String createQuestion(@Valid @ModelAttribute("newQuestion") Question newQuestion, BindingResult result,
			@RequestParam("tags") String tags
			,Model model) {
		String [] newtagStrings = tagSerivce.validateTags(tags);
		System.out.println(newtagStrings.length);
		if(result.hasErrors() && newtagStrings == null) {
			if(newtagStrings == null) {
			model.addAttribute("tags_error","There is Error on tags");}
			return "question/new_question.jsp";
		}
		Question question = questionSerivce.create(newQuestion);
		List<Tag> tagObject = tagSerivce.createTags(newtagStrings);
		System.out.println(question.getText());
		System.out.println(tagObject);
		question.setTags(tagObject);
		return "redirect:/";
	}

}
