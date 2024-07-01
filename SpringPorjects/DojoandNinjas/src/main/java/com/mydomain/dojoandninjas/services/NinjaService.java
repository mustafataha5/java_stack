package com.mydomain.dojoandninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mydomain.dojoandninjas.models.Ninja;
import com.mydomain.dojoandninjas.repositories.NinjaRepository;

@Service
public class NinjaService {
	@Autowired
	NinjaRepository ninjaRepository ;
	
	public List<Ninja> allNinjas(){
		return ninjaRepository.findAll();
	} 
	
	public Ninja findNinja(Long id) {
		Optional<Ninja> ninjaOptional = ninjaRepository.findById(id);
		if(ninjaOptional.isPresent()) {
			return ninjaOptional.get();
		}
		return null ;
	}
	
	public Ninja createNinja(Ninja n) {
		return ninjaRepository.save(n);
	}
	
}
