package com.mydomain.DojoOverflow.Repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mydomain.DojoOverflow.models.Question;

@Repository
public interface QuestionRepoistory extends CrudRepository<Question,Long> {
	List<Question> findAll();
}
