package com.mydomain.DojoOverflow.serivces;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mydomain.DojoOverflow.Repositories.QuestionRepoistory;
import com.mydomain.DojoOverflow.models.Question;

@Service
public class QuestionSerivce {
	@Autowired
	QuestionRepoistory questionRepoistory ;
	
	public List<Question> allQuestions(){
		return questionRepoistory.findAll();
	}
	
	public Question findQuestion(Long id) {
		Optional<Question> optional = questionRepoistory.findById(id);
		if(optional.isPresent()) {
			return optional.get();
		}
		return null ;
	}
	public Question create(Question q) {
		return questionRepoistory.save(q);
	}
	public Question update(Question q) {
		Optional<Question> optional = questionRepoistory.findById(q.getId());
		if(optional.isPresent()) {
			return questionRepoistory.save(q);
		}
		return null ;
	}
}
