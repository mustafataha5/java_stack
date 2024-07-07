package com.mydomain.DojoOverflow.serivces;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.mydomain.DojoOverflow.Repositories.TagRepository;
import com.mydomain.DojoOverflow.models.Tag;

@Service
public class TagSerivce {

	@Autowired
	TagRepository tagRepository ; 
	
	List<Tag> allTags(){
		return tagRepository.findAll();
	}
	
	Tag	findTag(Long id) {
		Optional<Tag> optional = tagRepository.findById(id);
		if(optional.isPresent()) {
			return optional.get();
		}
		return null;
	}
	
	public String [] validateTags(String tags){
		
		if(tags.equals("")) {
			return  null; 
		}
		
		String [] validTag = tags.split(","); 
		return validTag ; 
		
	}
	public Tag create(Tag t) {
		return tagRepository.save(t);
	}
	public List<Tag> createTags(String [] tags) {
		List<Tag> tagList = new ArrayList<>();
		for(String string : tags) {
			Optional<Tag> optional = tagRepository.findBySubject(string);
			if(optional.isPresent()) {
				tagList.add(optional.get());
			}
			else {
				tagList.add(this.create( new Tag(string) ) );
			}
		}
		return tagList;
		
	}
}
