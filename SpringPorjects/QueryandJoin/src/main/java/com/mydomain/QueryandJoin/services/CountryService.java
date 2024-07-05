package com.mydomain.QueryandJoin.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mydomain.QueryandJoin.models.Country;
import com.mydomain.QueryandJoin.models.Language;
import com.mydomain.QueryandJoin.repositories.ConutryRepository;

@Service
public class CountryService {

	@Autowired
	ConutryRepository countryRepository ; 
	
	
	public List<Country> allCountries(){
		return countryRepository.findAll();
	
	}
	
	public List<Object[]> allCountriesLtAreaAndGtPopulation(Long a,Long p){
		return countryRepository.findAllCountriebySurfaceAndPopulation(a, p);
	}
	
	public List<Object[]> ContriesSpeakLanguage(String l) {
		return countryRepository.findAllCountriesbylanguages(l);
	}
	
	public List<Object[]> ContriesCountCities() {
		return countryRepository.findAllCountryCitiesCount();
	}
	
	public List<Object []> allCountriesConstitutionawithArea(){
		return countryRepository.findAllCountriesConstitutionalMonarchywithSmallArea();
	}
	public List<Object []> countCountriesByRegion(){
		return countryRepository.countAllCountriesInEachRegion();
	}
}
