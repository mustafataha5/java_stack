package com.mydomain.QueryandJoin.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mydomain.QueryandJoin.models.City;
import com.mydomain.QueryandJoin.repositories.CityRepository;

@Service
public class CityService {
	@Autowired
	CityRepository cityRepository ; 
	
	
	public List<City> allCities(){
		return cityRepository.findAll();
	}
	
	public List<Object []> citiesByCountryName(String countryName){
		return cityRepository.findAllCitiesgreaterThan5byCountry(countryName);
	}
	public List<Object []> allCitiesINCountryDiscrt(String countryNamem,String d){
		return cityRepository.findallCitiesInCountryAndDistrict(countryNamem, d);
	}
}
