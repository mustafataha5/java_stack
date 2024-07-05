package com.mydomain.QueryandJoin.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mydomain.QueryandJoin.models.Language;

@Repository
public interface  LanguageRepository extends CrudRepository<Language, Long> {
	List<Language> findAll();
	
	@Query("select c.name ,l.language,l.percentage "
			+ " from Country c "
			+" join c.languages l "
			+" where l.percentage >= ?1  "
			+" order by l.percentage DESC")
	List<Object[]> findAllLanguageForEachCountryGTThan(Long percentage);
	
	
	
}
