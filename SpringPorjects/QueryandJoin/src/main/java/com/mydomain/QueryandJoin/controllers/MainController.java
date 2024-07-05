package com.mydomain.QueryandJoin.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.mydomain.QueryandJoin.services.CityService;
import com.mydomain.QueryandJoin.services.CountryService;
import com.mydomain.QueryandJoin.services.LanguageService;

@Controller
public class MainController {

	@Autowired
	CityService cityService ; 
	
	@Autowired
	CountryService countryService ; 
	 @Autowired 
	 LanguageService languageService ;
	 
	 
	 @GetMapping("/")
	 public String index(Model model) {
		 model.addAttribute("query_1", countryService.ContriesSpeakLanguage("Slovene"));
		 model.addAttribute("query_2", countryService.ContriesCountCities());
		 model.addAttribute("query_3", cityService.citiesByCountryName("Mexico"));
		 model.addAttribute("query_4", languageService.allContryLanguageGt(89));
		 model.addAttribute("query_5", countryService.allCountriesLtAreaAndGtPopulation((long)501,(long)100000));
		 model.addAttribute("query_6", countryService.allCountriesConstitutionawithArea());
		 model.addAttribute("query_7", cityService.allCitiesINCountryDiscrt("Argentina","Buenos Aires"));
		 model.addAttribute("query_8", countryService.countCountriesByRegion());
		 return "index.jsp";
	 }
}
