package com.mydomain.QueryandJoin.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mydomain.QueryandJoin.models.Country;


@Repository
public interface ConutryRepository extends CrudRepository<Country, Long> {
	
	List<Country> findAll();
	
	
	@Query("select c.name,l.language,l.percentage from Country c Join c.languages l where l.language = ?1 ORDER BY l.percentage  DESC ")
	List<Object[]>	findAllCountriesbylanguages(String languageName); 

	@Query("select c.name,count(ci.name) from Country c Join c.cities ci GROUP BY c.name ORDER BY count(ci.name)  DESC")
	List<Object[]> findAllCountryCitiesCount();
	
	
	@Query("select c.name ,c.surfaceArea,c.population "
			+ " from Country  c "
			+ " where  c.surfaceArea < ?1 and c.population>= ?2")
	List<Object[]> findAllCountriebySurfaceAndPopulation(Long surfaceArea,Long population);	
	
	@Query("select c.name ,c.surfaceArea,c.lifeExpectancy "
			+ "from Country  c "
			+ "where c.governmentForm='Constitutional Monarchy' and c.surfaceArea>=200 and c.lifeExpectancy>=75")
	List<Object []> findAllCountriesConstitutionalMonarchywithSmallArea();

	@Query("select c.region,count(c.name) "
			+ "from Country as c "
			+ "group by c.region "
			+ "order by count(c.name) desc ")
	List<Object[]> countAllCountriesInEachRegion();



}
