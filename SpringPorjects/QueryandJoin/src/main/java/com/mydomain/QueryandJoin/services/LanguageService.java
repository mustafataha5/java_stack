package com.mydomain.QueryandJoin.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mydomain.QueryandJoin.models.Language;
import com.mydomain.QueryandJoin.repositories.LanguageRepository;

@Service
public class LanguageService {

	@Autowired
	LanguageRepository languageRepository ; 
	
	
	public List<Language> allLanguages(){
		return languageRepository.findAll();
	}
	
	public List<Object[]> allContryLanguageGt(long percentage) {
		return languageRepository.findAllLanguageForEachCountryGTThan(percentage);
		
	}
	
}
