package com.mydomain.dojoandninjas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.mydomain.dojoandninjas.models.Dojo;

public interface DojoRepsitory extends CrudRepository<Dojo, Long>{
	List<Dojo> findAll();

}
