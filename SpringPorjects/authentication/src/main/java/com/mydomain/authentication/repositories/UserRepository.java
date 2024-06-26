package com.mydomain.authentication.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mydomain.authentication.models.User;
@Repository
public interface UserRepository extends CrudRepository<User, Long>{
	
	List<User> findAll(); 

}
