package com.mydomain.dojoandninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mydomain.dojoandninjas.models.Dojo;
import com.mydomain.dojoandninjas.repositories.DojoRepsitory;

@Service
public class DojoSerivce {
	@Autowired
	DojoRepsitory dojoRepsitory;

	public List<Dojo> allDojos() {
		return dojoRepsitory.findAll();
	}

	public Dojo findDojo(Long id) {
		Optional<Dojo> dojOptional = dojoRepsitory.findById(id);
		if (dojOptional.isPresent()) {
			return dojOptional.get();
		}
		return null;

	}
	
	public Dojo createDojo(Dojo d) {
		return dojoRepsitory.save(d);
		
	}
}
